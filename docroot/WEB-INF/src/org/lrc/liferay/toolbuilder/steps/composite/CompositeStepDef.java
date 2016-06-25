package org.lrc.liferay.toolbuilder.steps.composite;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.CompositeStepDefDBEUtil;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class CompositeStepDef extends StepDef {
	
	private CompositeStepDefDBE compositeStepDefDBE;
	private List<StepDef> stepDefs;

	/* CONSTRUCTORS */
	public CompositeStepDef() {
		super("COMPOSITE");
		this.compositeStepDefDBE = CompositeStepDefDBEUtil.create(this.stepDefDBE.getStepDefDBEId());
		this.stepDefs = new ArrayList<StepDef>();
		this.setStepsNumber();
		this.compositeStepDefDBE.setSequential(true);
		this.compositeStepDefDBE.setDepth(0);
	}

	public CompositeStepDef(StepDefDBE stepDefDBE) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		super(stepDefDBE);
		this.compositeStepDefDBE = CompositeStepDefDBELocalServiceUtil.getCompositeStepDefDBE(stepDefDBE.getStepDefDBEId());
	}
	
//	public CompositeStepDef(CompositeStepDefDBE compositeStepDefDBE) {
//		int a = 1;
//		super(compositeStepDefDBE);
//		this.compositeStepDefDBE = compositeStepDefDBE;
//	}

	/* GETTERS AND SETTERS */
	public void setStepsNumber() {
		this.compositeStepDefDBE.setStepsNumber(this.stepDefs.size());
	}
	
	public int getStepsNumber() {
		return this.compositeStepDefDBE.getStepsNumber();
	}

	public void setSequential(boolean sequential) {
		this.compositeStepDefDBE.setSequential(sequential);
	}
	
	public boolean isSequential() {
		return this.compositeStepDefDBE.getSequential();
	}
	
	public void setDepth(int depth) {
		this.compositeStepDefDBE.setDepth(depth);
	}
	
	public int getDepth() {
		return this.compositeStepDefDBE.getDepth();
	}
	
	public long getCompositeStepDefDBEId() {
		return this.compositeStepDefDBE.getCompositeStepDefDBEId();
	}
	
	// VER CÓMO get y set los StepDefs
	public StepDef getStepDef(int index) {
		return this.stepDefs.get(index);
	}
	
	public void addStepDef(StepDef stepDef) throws SystemException {
		try {
			// Includes new StepDef in the tables
			this.save();
			stepDef.save();
			this.compositeStepDefDBE.addStepDefDBEToList(this.stepDefDBE);
			this.stepDefs.add(stepDef);
			// Increments stepNumber
			this.setStepsNumber();
		} catch (SystemException e) {
			throw e;
		}
	}
	
	public void save() throws SystemException {
		super.save();
		if (this.compositeStepDefDBE.getCompositeStepDefDBEId() == 0) {
			this.compositeStepDefDBE.setCompositeStepDefDBEId(this.stepDefDBE.getStepDefDBEId());
			CompositeStepDefDBELocalServiceUtil.addCompositeStepDefDBE(this.compositeStepDefDBE);
			StepDefDBELocalServiceUtil.addCompositeStepDefDBEStepDefDBEs
				(this.compositeStepDefDBE.getCompositeStepDefDBEId(), this.compositeStepDefDBE.getStepDefDBEs());
		}
		else {
			CompositeStepDefDBELocalServiceUtil.updateCompositeStepDefDBE(this.compositeStepDefDBE);
			StepDefDBELocalServiceUtil.addCompositeStepDefDBEStepDefDBEs
				(this.compositeStepDefDBE.getCompositeStepDefDBEId(), this.compositeStepDefDBE.getStepDefDBEs());
		}
	}
	
	@Override
	public Step buildStep() throws SystemException {
		CompositeStep builtStep = new CompositeStep(this);
		for (StepDef stepDef: this.stepDefs) {
			builtStep.addStep(stepDef.buildStep());
		}
		return builtStep;
	}

	public void rebuildStepDefs() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SystemException {
		List<StepDefDBE> stepDefDBEs = StepDefDBELocalServiceUtil.getCompositeStepDefDBEStepDefDBEs(this.getCompositeStepDefDBEId());
		this.stepDefs = new ArrayList<StepDef>();
		for (StepDefDBE stepDefDBE: stepDefDBEs) {
			this.stepDefs.add(StepFactory.getStepDef(stepDefDBE.getStepType(), stepDefDBE));
		}
	}
}
