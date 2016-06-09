package org.lrc.liferay.toolbuilder.steps;

import org.lrc.liferay.toolbuilder.model.InstalledStep;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

public abstract class StepDef {
	
	private StepDefDBE stepDefDBE;
	private InstalledStep installedStep;
	
	public abstract Step buildStep();

	public long save() throws SystemException {
		if (this.stepDefDBE.getStepDefDBEId() == 0) {
			StepDefDBELocalServiceUtil.addStepDefDBE(this.stepDefDBE);
		}
		else {
			StepDefDBELocalServiceUtil.updateStepDefDBE(this.stepDefDBE);
		}
		return this.stepDefDBE.getStepDefDBEId();
	}

	public void setStepDefDBE(StepDefDBE stepDefDBE) {
		this.stepDefDBE = stepDefDBE;
	}

	public String getType() {
		return stepDefDBE.getType();
	}

	public String getNamespace() {
		return this.installedStep.getNamespace();
	}
	
	public String getClassName() {
		return this.installedStep.getClassName();
	}
}
