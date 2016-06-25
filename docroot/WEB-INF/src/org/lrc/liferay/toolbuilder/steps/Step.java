package org.lrc.liferay.toolbuilder.steps;

import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.StepDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public abstract class Step {
	
	protected StepDBE stepDBE;
	
	public Step(String StepType) {

		stepDBE = StepDBEUtil.create(0L);

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		stepDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		stepDBE.setCompanyId(liferayFacesContext.getCompanyId());
		stepDBE.setUserId(liferayFacesContext.getUserId());
		stepDBE.setStepType(StepType);
	}
	
	public Step(StepDBE stepDBE) {
		this.stepDBE = stepDBE;
	}

	public abstract String draw();
	
	public void save() throws SystemException {
		if (this.stepDBE.getStepDBEId() == 0) {
			StepDBELocalServiceUtil.addStepDBE(this.stepDBE);
		}
		else {
			StepDBELocalServiceUtil.updateStepDBE(this.stepDBE);
		}
	}

	public void delete() throws PortalException, SystemException {
		StepDBELocalServiceUtil.deleteStepDBE(this.stepDBE.getStepDBEId());
	}
}
