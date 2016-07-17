package org.lrc.liferay.toolbuilder.steps.composite;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.CompositeStepDBEException;
import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.model.CompositeStepDBE;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class CompositeStep extends Step {
	
	private CompositeStepDef compositeStepDef;
	private CompositeStepDBE compositeStepDBE;
	private List<Step> steps = null;

	/* CONSTRUCTORS */
//	public CompositeStep() throws NoSuchUserException, NoSuchInstalledStepException, StepDefDBEException, SystemException, CompositeStepDBEException, StepDBEException {
//		super("COMPOSITE");
//		this.compositeStepDBE = CompositeStepDBELocalServiceUtil.addCompositeStepDBE(this.getStepDBEId());
//		System.out.println("Va a setear el StepTypeId del composite en Step a " + this.compositeStepDBE.getCompositeStepDBEId());
//		this.setStepTypeId(this.compositeStepDBE.getCompositeStepDBEId());
//		this.steps = new ArrayList<Step>();
//	}
//
	public CompositeStep(CompositeStepDef compositeStepDef) throws NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, SystemException, CompositeStepDBEException {
		super("COMPOSITE");
		this.compositeStepDBE = CompositeStepDBELocalServiceUtil.addCompositeStepDBE(compositeStepDef.getStepDefDBEId());
		this.compositeStepDef = compositeStepDef;
		System.out.println("Va a setear el StepTypeId del composite en Step a " + this.compositeStepDBE.getCompositeStepDBEId());
		this.setStepTypeId(this.compositeStepDBE.getCompositeStepDBEId());
		this.steps = new ArrayList<Step>();
	}
	
	public CompositeStep(StepDBE stepDBE) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		super(stepDBE);
		this.compositeStepDBE = CompositeStepDBELocalServiceUtil.getCompositeStepDBE(stepDBE.getStepTypeId());
		this.compositeStepDef = new CompositeStepDef(StepDefDBELocalServiceUtil.getStepDefDBE(this.compositeStepDBE.getCompositeStepDefDBEId()));
	}

//	public CompositeStep(CompositeStepDBE compositeStepDBE) throws PortalException, SystemException {
//		super(StepDBELocalServiceUtil.getStepDBE(compositeStepDBE.getCompositeStepDBEId()));
//		this.compositeStepDBE = compositeStepDBE;
//	}
//
	public void addStep(Step step) throws SystemException {
		try {
			// Includes new Step in the tables
//			step.save();
			this.compositeStepDBE.addStepDBE(step.getStepDBE());
			this.steps.add(step);
		} catch (SystemException e) {
			throw e;
		}
	}

	public void save() throws SystemException {
		super.save();
		if (this.compositeStepDBE.getCompositeStepDBEId() == 0) {
			this.compositeStepDBE.setCompositeStepDBEId(this.stepDBE.getStepDBEId());
			CompositeStepDBELocalServiceUtil.addCompositeStepDBE(this.compositeStepDBE);
			StepDBELocalServiceUtil.addCompositeStepDBEStepDBEs
				(this.compositeStepDBE.getCompositeStepDBEId(), this.compositeStepDBE.getStepDBEs());
		}
		else {
			CompositeStepDBELocalServiceUtil.updateCompositeStepDBE(this.compositeStepDBE);
			StepDBELocalServiceUtil.addCompositeStepDBEStepDBEs
				(this.compositeStepDBE.getCompositeStepDBEId(), this.compositeStepDBE.getStepDBEs());
		}
		for (Step step: this.steps) {
			step.save();
		}
	}

	public void delete() throws PortalException, SystemException {
		super.delete();
		CompositeStepDBELocalServiceUtil.deleteCompositeStepDBE(this.compositeStepDBE.getCompositeStepDBEId());
		for (Step step: this.steps) {
			step.delete();
		}
		// TODO: Delete all contained steps
	}

	/**
	 * @return the index of the next step. If it is the final step it returns the current step.
	 */
	public Integer stepForward() {
		this.goToStep(this.compositeStepDBE.getCurrentStep() + 1);
		return this.compositeStepDBE.getCurrentStep();
	}
	
	/**
	 * @param newStep the index of the new step
	 * @return the index of the new step. If sequential will throw exception if newStep is not the next one
	 */
	public void goToStep(Integer newStep) {
		if (newStep < this.compositeStepDef.getStepsNumber()) {
			if (this.compositeStepDef.isSequential()) {
				if (this.compositeStepDBE.getCurrentStep() + 1 == newStep)
					this.compositeStepDBE.setCurrentStep((int)newStep);
			} else {
				this.compositeStepDBE.setCurrentStep((int)newStep);
			}
		}
	}
	
	public long getCompositeStepDBEId() {
		return this.compositeStepDBE.getCompositeStepDBEId();
	}
	
	public Integer getCurrentStepNumber() {
		return this.compositeStepDBE.getCurrentStep() + 1;
	}
	
	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}

	public void rebuildSteps() throws SystemException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		if (steps == null) {
			steps = new ArrayList<Step>();
		}
		if (this.steps.isEmpty()) {
			List<StepDBE> stepDBEs = StepDBELocalServiceUtil.getCompositeStepDBEStepDBEs(this.getCompositeStepDBEId());
			this.steps = new ArrayList<Step>();
			for (StepDBE stepDBE: stepDBEs) {
				this.steps.add(StepFactory.getStep(stepDBE.getStepType(), stepDBE));
			}
		}
	}

}
