package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.lrc.liferay.toolbuilder.model.Instance;
import org.lrc.liferay.toolbuilder.service.InstanceLocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;

@ManagedBean
@SessionScoped
public class ToolSession extends AbstractBaseBean implements Serializable{
	
	private static final long serialVersionUID = 4205262693196822283L;
	private static final String mainView = "mainView.xhtml";
	private static final String instanceView = "instanceView.xhtml";
	
	Instance selectedInstance;
	List<Instance> instances;
	private boolean workingOnInstance;

	private String auxText;
	
	@PostConstruct
	public void postConstruct() {
		this.workingOnInstance = false;
		this.auxText = "Beginning";
	}
	
	public void saveInstance() {

		try {
			// If the instance is being created goes to Step 1
			if (this.selectedInstance.getStep() == 0)
				this.selectedInstance.stepForward();

			// Persistence connection
			if (this.selectedInstance.getInstanceId() == 0) {
				this.selectedInstance = InstanceLocalServiceUtil.addInstance(this.selectedInstance);
				// Include instance on list
				this.instances.add(this.selectedInstance);
			}
			else
				this.selectedInstance = InstanceLocalServiceUtil.updateInstance(this.selectedInstance);
			

		} catch (Exception e) {
			this.addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
	}
	
	public String cancelInstance() {
		this.selectedInstance = null;
		this.workingOnInstance = false;
		return ToolSession.mainView;
	}
	
	public String deleteInstance() {
		try {
			InstanceLocalServiceUtil.deleteInstance(this.selectedInstance);
			this.instances.remove(this.selectedInstance);
			this.selectedInstance = null;
			this.workingOnInstance = false;
		} catch (Exception e) {
			this.addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		return ToolSession.mainView;
	}
	
	public String selectInstance(Instance instance) {
		this.auxText = "Instance selected";
		this.workingOnInstance = true;
		this.selectedInstance = instance;
		return ToolSession.instanceView;
	}
	
	public boolean isWorkingOnInstance() {
		return this.workingOnInstance;
	}

	public String getAuxText() {
		return this.auxText;
	}
	
	public Instance getSelectedInstance() {
		return this.selectedInstance;
	}
	
	public List<Instance> getInstances() {
		// TODO: Mensajes entre SessionBeans cuando haya modificación del listado disponible para un usuario
		// TODO: Criterios de búsqueda (nombre del RAM, permisos, etc)
		if (this.instances == null) {
			this.instances = new ArrayList<Instance>();
			long groupId = LiferayFacesContext.getInstance().getScopeGroupId();
			
			try {
				List<Instance> list = InstanceLocalServiceUtil.getInstances(groupId);
				for (Instance instance : list)
					this.instances.add(instance);
			} catch (Exception e) {
				logger.error(e);
			}
		}
		return this.instances;
	}
}
