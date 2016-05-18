package org.lrc.liferay.toolbuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.persistence.ToolInstanceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.WrapperStepUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@RequestScoped
public class InstanceBacking extends AbstractBaseBean {

	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	protected ToolSession toolSession;
	
	public String add() {
		System.out.println("Hola hola");
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance = ToolInstanceUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		toolInstance.setGroupId(liferayFacesContext.getScopeGroupId());
		toolInstance.setCompanyId(liferayFacesContext.getCompanyId());
		toolInstance.setUserId(liferayFacesContext.getUserId());
		
		WrapperStep wrapperStep = WrapperStepUtil.create(0L);
		wrapperStep.setSequential(true);
		wrapperStep.setGroupId(liferayFacesContext.getScopeGroupId());
		wrapperStep.setCompanyId(liferayFacesContext.getCompanyId());
		wrapperStep.setUserId(liferayFacesContext.getUserId());
		wrapperStep.setCurrentStep(0);
		
		this.toolSession.setConfiguringInstance();
		return this.toolSession.selectToolInstance(new ToolInstance(wrapperStep, toolInstance));
	}
	
	public int getStep() {
		return toolSession.getSelectedToolInstance().getCurrentStepNumber();
	}
	
	public void stepForward() throws SystemException {
		toolSession.getSelectedToolInstance().stepForward();
		toolSession.saveToolInstance();
	}

	public ToolSession getToolSession() {
		return this.toolSession;
	}
	
	public void setToolSession(ToolSession toolSession) {
		this.toolSession = toolSession;
	}
}
