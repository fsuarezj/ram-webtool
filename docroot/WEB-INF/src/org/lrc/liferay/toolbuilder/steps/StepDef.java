package org.lrc.liferay.toolbuilder.steps;

import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.StepDefDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

public abstract class StepDef {
	
	protected StepDefDBE stepDefDBE;
//	private InstalledStep installedStep;
	
	public StepDef(String stepType) {
		this.stepDefDBE = StepDefDBEUtil.create(0L);

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		this.stepDefDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		this.stepDefDBE.setCompanyId(liferayFacesContext.getCompanyId());
		this.stepDefDBE.setUserId(liferayFacesContext.getUserId());
		this.stepDefDBE.setStepType(stepType);
	}
	
	public StepDef(StepDefDBE stepDefDBE) {
		this.stepDefDBE = stepDefDBE;
	}
	
	public abstract Step buildStep() throws SystemException;
	
	public void save() throws SystemException {
		if (this.stepDefDBE.getStepDefDBEId() == 0) {
			StepDefDBELocalServiceUtil.addStepDefDBE(this.stepDefDBE);
		}
		else {
			StepDefDBELocalServiceUtil.updateStepDefDBE(this.stepDefDBE);
		}
	}

//	public String getStepType() {
//		return stepDefDBE.getStepType();
//	}

//	public String getNamespace() {
//		return this.installedStep.getNamespace();
//	}
//	
//	public String getClassName() {
//		return this.installedStep.getClassName();
//	}
}
