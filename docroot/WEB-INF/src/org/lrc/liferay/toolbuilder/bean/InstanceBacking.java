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

	@ManagedProperty(name = "ramSession", value = "#{ramSession}")
	protected RamSession ramSession;
	
	public String add() {
		Instance instance = InstanceUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		instance.setGroupId(liferayFacesContext.getScopeGroupId());
		instance.setCompanyId(liferayFacesContext.getCompanyId());
		instance.setUserId(liferayFacesContext.getUserId());
		instance.setStep(0);
		
		return ramSession.selectInstance(instance);
	}
	
	public int getStep() {
		return ramSession.getSelectedInstance().getStep();
	}
	
	public void stepForward() {
		ramSession.getSelectedInstance().stepForward();
		ramSession.saveInstance();
	}
	
	public void setRamSession(RamSession ramSession) {
		this.ramSession = ramSession;
	}

}
