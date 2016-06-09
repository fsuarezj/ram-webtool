package org.lrc.liferay.toolbuilder.steps;

import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public abstract class Step {
	
	private StepDBE stepDBE;
	
	public abstract String draw();
	
	public long save() throws SystemException {
		if (this.stepDBE.getStepDBEId() == 0) {
			StepDBELocalServiceUtil.addStepDBE(this.stepDBE);
		}
		else {
			StepDBELocalServiceUtil.updateStepDBE(this.stepDBE);
		}
		return this.stepDBE.getStepDBEId();
	}

	public void delete() throws PortalException, SystemException {
		StepDBELocalServiceUtil.deleteStepDBE(this.stepDBE.getStepDBEId());
	}
}
