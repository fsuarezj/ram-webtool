package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@SessionScoped
public class ToolSession extends AbstractBaseBean implements Serializable{
	
	private static final long serialVersionUID = 8736093122352111506L;
	private static final String mainView = "mainView.xhtml";
	private static final String instanceView = "instanceView.xhtml";
	
	ToolInstance selectedToolInstance;
	List<ToolInstance> toolInstances;
	private boolean workingOnToolInstance;
	private boolean configuringInstance;

	@PostConstruct
	public void postConstruct() {
		this.workingOnToolInstance = false;
		this.configuringInstance = false;
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

	public String selectToolInstance(ToolInstance toolInstance) {
		this.workingOnToolInstance = true;
		this.selectedToolInstance = toolInstance;
		return ToolSession.instanceView;
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
		WrapperStep wrapperStep;
		System.out.println("Entrando");
		if (this.toolInstances == null) {
			System.out.println("Lista = null");
			this.toolInstances = new ArrayList<ToolInstance>();
			long groupId = LiferayFacesContext.getInstance().getScopeGroupId();
			try {
				List<org.lrc.liferay.toolbuilder.model.ToolInstance> list = ToolInstanceLocalServiceUtil.getToolInstances(groupId);
				System.out.println("Tamaño de la lista: " + list.size());
				for (org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance : list) {
					wrapperStep = WrapperStepLocalServiceUtil.getWrapperStep(toolInstance.getWrapperStepId());
					this.toolInstances.add(new ToolInstance(wrapperStep, toolInstance));
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
}
