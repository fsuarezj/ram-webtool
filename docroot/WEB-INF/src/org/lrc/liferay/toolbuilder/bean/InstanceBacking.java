package org.lrc.liferay.toolbuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lrc.liferay.toolbuilder.model.Instance;
import org.lrc.liferay.toolbuilder.service.persistence.InstanceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;

@ManagedBean
@RequestScoped
public class InstanceBacking extends AbstractBaseBean {

	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	protected ToolSession toolSession;
	
	public String add() {
		Instance instance = InstanceUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		instance.setGroupId(liferayFacesContext.getScopeGroupId());
		instance.setCompanyId(liferayFacesContext.getCompanyId());
		instance.setUserId(liferayFacesContext.getUserId());
		instance.setStep(0);
		
		return toolSession.selectInstance(instance);
	}
	
	public int getStep() {
		return toolSession.getSelectedInstance().getStep();
	}
	
	public void stepForward() {
		toolSession.getSelectedInstance().stepForward();
		toolSession.saveInstance();
	}
	
	public void setToolSession(ToolSession toolSession) {
		this.toolSession = toolSession;
	}

}
