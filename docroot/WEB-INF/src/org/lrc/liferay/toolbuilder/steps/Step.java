package org.lrc.liferay.toolbuilder.steps;

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public abstract class Step {
	
	protected StepDBE stepDBE;
	
	public Step(String stepType) throws NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, SystemException {

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		System.out.println("Creating step of type " + stepType);
		this.stepDBE = StepDBELocalServiceUtil.addStepDBE(stepType, liferayFacesContext);
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
	
	public long getStepDBEId() {
		return this.stepDBE.getStepDBEId();
	}
	
	public StepDBE getStepDBE() {
		return this.stepDBE;
	}
	
	public void setStepTypeId(long stepTypeId) {
		this.stepDBE.setStepTypeId(stepTypeId);
	}
}
