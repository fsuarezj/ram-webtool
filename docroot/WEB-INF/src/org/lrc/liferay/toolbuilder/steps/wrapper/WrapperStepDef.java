package org.lrc.liferay.toolbuilder.steps.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.kernel.exception.SystemException;

public class WrapperStepDef extends StepDef {
	
	private WrapperStepDefDBE wrapperStepDefDBE;

	public WrapperStepDef() {
		// TODO Auto-generated constructor stub
	}
	
	// Getters and Setters
	
	public void setWrapperStepDefDBE(WrapperStepDefDBE wrapperStepDefDBE) {
		this.wrapperStepDefDBE = wrapperStepDefDBE;
	}
	
	public void setStepsNumber(int stepsNumber) {
		this.wrapperStepDefDBE.setStepsNumber(stepsNumber);
	}
	
	public int getStepsNumber() {
		return this.wrapperStepDefDBE.getStepsNumber();
	}

	public void setSequential(boolean sequential) {
		this.wrapperStepDefDBE.setSequential(sequential);
	}
	
	public boolean getSequential() {
		return this.wrapperStepDefDBE.getSequential();
	}
	
	public void setDepth(int depth) {
		this.wrapperStepDefDBE.setDepth(depth);
	}
	
	public int getDepth() {
		return this.wrapperStepDefDBE.getDepth();
	}
	
	// VER CÓMO get y set los StepDefs
	public List<StepDef> getStepDefs() {
		// TODO
		return new ArrayList();
	}
	
	public void addStepDef(StepDef stepDef) throws SystemException {
		try {
			long stepDefDBEId = stepDef.save();
			// TODO: Incluir en la tabla de relación la nueva definición
			this.wrapperStepDefDBE.setStepsNumber(this.wrapperStepDefDBE.getStepsNumber() + 1);
			this.wrapperStepDefDBE

		} catch (SystemException e) {
			throw e;
		}
	}
	
	@Override
	public Step buildStep() {
		// TODO Auto-generated method stub
		return null;
	}
}
