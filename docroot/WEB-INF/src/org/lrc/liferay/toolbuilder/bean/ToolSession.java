package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.lrc.liferay.toolbuilder.ToolDef;
import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.service.persistence.ToolDefDBEUtil;
import org.lrc.liferay.toolbuilder.service.persistence.ToolInstanceDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@SessionScoped
public class ToolSession extends AbstractBaseBean implements Serializable{
	
	@ManagedProperty(name = "factoryBean", value = "#{factoryBean}")
	private FactoryBean factoryBean;

	public void setFactoryBean(FactoryBean factoryBean) {
		this.factoryBean = factoryBean;
	}

	private static final long serialVersionUID = 8736093122352111506L;
	private static final String mainView = "mainView.xhtml";
	private static final String toolInstanceView = "toolInstanceView.xhtml";
	
	ToolDef selectedToolDef;
	ToolInstance selectedToolInstance;
	List<ToolInstance> toolInstances;
	private boolean workingOnToolInstance;
	private boolean configuringInstance;
	private ToolDef toolDef;

	@PostConstruct
	public void postConstruct() throws PortalException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.workingOnToolInstance = false;
		this.configuringInstance = false;
		try {
			ToolDefDBE toolDefDBE = ToolDefDBEUtil.findByToolName("Test tool");
			this.toolDef = new ToolDef(toolDefDBE);
			this.toolDef.rebuildSteps();
		} catch (SystemException e) {
			logger.error(e);
		}
	}

	public void saveToolInstance() throws SystemException {
		this.configuringInstance = false;
		this.selectedToolInstance.save();
		if (!this.toolInstances.contains(this.selectedToolInstance))
			this.toolInstances.add(this.selectedToolInstance);
	}
	
	public String cancelToolInstance() {
		this.selectedToolInstance = null;
		this.workingOnToolInstance = false;
		this.configuringInstance = false;
		return ToolSession.mainView;
	}
	
	public String deleteToolInstance() {
		try {
			this.selectedToolInstance.delete();
			this.toolInstances.remove(this.selectedToolInstance);
			this.selectedToolInstance = null;
			this.workingOnToolInstance = false;
			this.configuringInstance = false;
		} catch (Exception e) {
			this.addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		return ToolSession.mainView;
	}

	public String selectToolInstance(ToolInstance toolInstance) throws SystemException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		this.workingOnToolInstance = true;
		this.selectedToolInstance = toolInstance;
		this.selectedToolInstance.rebuildSteps();
		return ToolSession.toolInstanceView;
	}

	public boolean isWorkingOnToolInstance() {
		return this.workingOnToolInstance;
	}

	public ToolInstance getSelectedToolInstance() {
		return this.selectedToolInstance;
	}
	
	public List<ToolInstance> getToolInstances() {
		// TODO: Mensajes entre SessionBeans cuando haya modificación del listado disponible para un usuario
		// TODO: Criterios de búsqueda (nombre del RAM, permisos, etc)
		ToolInstance toolInstance;
//		System.out.println("Calling ToolSession.getToolInstances()");
		if (this.toolInstances == null) {
			this.toolInstances = new ArrayList<ToolInstance>();
			long groupId = LiferayFacesContext.getInstance().getScopeGroupId();
			try {
				List<ToolInstanceDBE> list = ToolInstanceDBEUtil.findByG_T(groupId, this.toolDef.getToolDefDBEId());
				for (ToolInstanceDBE toolInstanceDBE : list) {
					toolInstance = new ToolInstance(toolInstanceDBE, this.toolDef);
					this.toolInstances.add(toolInstance);
				}
			} catch (Exception e) {
				logger.error(e);
			}
		}
		return this.toolInstances;
	}

	public void setConfiguringInstance() {
		this.configuringInstance = true;
	}
	
	public boolean getConfiguringInstance() {
		return this.configuringInstance;
	}

	public ToolInstance createToolInstance() throws SystemException {
		return this.selectedToolDef.buildInstance();
	}
}
