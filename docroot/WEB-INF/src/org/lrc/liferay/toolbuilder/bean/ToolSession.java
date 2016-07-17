package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.lrc.liferay.toolbuilder.CompositeStepDBEException;
import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.ToolDef;
import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@SessionScoped
public class ToolSession extends AbstractBaseBean implements Serializable{
	
	@ManagedProperty(name = "factoryBean", value = "#{factoryBean}")
	private FactoryBean factoryBean;

	private static final long serialVersionUID = 8736093122352111506L;
	private static final String mainView = "mainView.xhtml";
	private static final String toolInstanceView = "toolInstanceView.xhtml";
	
	private ToolInstance selectedToolInstance;
	private List<ToolInstance> toolInstances;
	private boolean workingOnToolInstance;
	private boolean configuringInstance;
	private ToolDef toolDef;
	
	public ToolSession() {
		this.workingOnToolInstance = false;
		this.configuringInstance = false;
		try {
			this.toolDef = FactoryBean.getToolDef("Test Tool");
		} catch (Exception e) {
			logger.error(e);
		}
	}

	@PostConstruct
	public void postConstruct() throws Exception {
	}

	public void saveExistingToolInstance() throws SystemException {
		this.selectedToolInstance.save();
	}

	public String saveNewToolInstance() throws SystemException {
		if (!this.toolInstances.contains(this.selectedToolInstance)) {
			this.selectedToolInstance.save();
			this.configuringInstance = false;
			this.toolInstances.add(this.selectedToolInstance);
		} else {
//			SessionErrors.add(session, key); //logger.error("Existing Tool Instance");
			this.addGlobalErrorMessage("Existing Tool Instance");
		}
		return ToolSession.toolInstanceView;
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
		System.out.println("Calling ToolSession.getToolInstances()");
		if (this.toolInstances == null) {
			System.out.println("Try to bring tool instances");
			this.toolInstances = new ArrayList<ToolInstance>();
			long groupId = LiferayFacesContext.getInstance().getScopeGroupId();
			try {
				List<ToolInstanceDBE> list = ToolInstanceDBELocalServiceUtil.getToolInstanceDBEs(groupId, this.toolDef.getToolDefDBEId());
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

	public void setFactoryBean(FactoryBean factoryBean) {
		this.factoryBean = factoryBean;
	}

	public ToolInstance createToolInstance() throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, CompositeStepDBEException, NoSuchToolDefDBEException {
		return this.toolDef.buildInstance();
	}
}
