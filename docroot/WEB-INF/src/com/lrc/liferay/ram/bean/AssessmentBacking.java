package com.lrc.liferay.ram.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.persistence.AssessmentUtil;

@ManagedBean
@RequestScoped
public class AssessmentBacking extends AbstractBaseBean {

	@ManagedProperty(name = "ramSession", value = "#{ramSession}")
	protected RamSession ramSession;
	
	public String add() {
		Assessment assessment = AssessmentUtil.create(0L);
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		assessment.setGroupId(liferayFacesContext.getScopeGroupId());
		assessment.setCompanyId(liferayFacesContext.getCompanyId());
		assessment.setUserId(liferayFacesContext.getUserId());
		assessment.setStep(0);
		
		return ramSession.selectAssessment(assessment);
	}
	
	public int getStep() {
		return ramSession.getSelectedAssessment().getStep();
	}
	
	public void stepForward() {
		ramSession.getSelectedAssessment().stepForward();
		ramSession.saveAssessment();
	}
	
	public void setRamSession(RamSession ramSession) {
		this.ramSession = ramSession;
	}

}
