package org.lrc.liferay.toolbuilder.steps.composite;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.CompositeStepDBEException;
import org.lrc.liferay.toolbuilder.CompositeStepDefDBEException;
import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class CompositeStepDef extends StepDef {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7733476918496135630L;
	private CompositeStepDefDBE compositeStepDefDBE;
	private List<StepDef> stepDefs;

	/* CONSTRUCTORS */
	public CompositeStepDef() throws NoSuchUserException, NoSuchInstalledStepException, StepDefDBEException, SystemException, CompositeStepDefDBEException {
		super("COMPOSITE");
		System.out.println("It is going to create new Composite Step with ID " + this.stepDefDBE.getStepDefDBEId());
		this.compositeStepDefDBE = CompositeStepDefDBELocalServiceUtil.addCompositeStepDefDBE(true, 0);
		this.setStepTypeId(this.compositeStepDefDBE.getCompositeStepDefDBEId());
		this.stepDefs = new ArrayList<StepDef>();
	}

	public CompositeStepDef(StepDefDBE stepDefDBE) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		super(stepDefDBE);
		this.compositeStepDefDBE = CompositeStepDefDBELocalServiceUtil.getCompositeStepDefDBE(stepDefDBE.getStepTypeId());
		this.buildStepDefs();
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
	
	public List<StepDef> getStepDefsList() {
		List<StepDef> result = new ArrayList<StepDef>();
		for (int i = 0; i < this.getStepsNumber(); i++) {
			result.add(this.getStepDef(i));
		}
		return result;
	}
	
	public void addStepDef(StepDef stepDef) throws SystemException {
		try {
			// Includes new StepDef in the tables
//			this.save();
//			stepDef.save();
			this.compositeStepDefDBE.addStepDefDBE(stepDef.getStepDefDBE());
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
		for (StepDef stepDef: this.stepDefs) {
			stepDef.save();
		}
	}
	
	@Override
	public Step buildStep() throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, CompositeStepDBEException {
		CompositeStep builtStep = new CompositeStep(this);
		System.out.println("Building composite step");
		for (StepDef stepDef: this.stepDefs) {
			System.out.println("Building substep of type " + stepDef.getStepType());
			builtStep.addStep(stepDef.buildStep());
		}
		return builtStep;
	}

	public void buildStepDefs() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SystemException {
		System.out.println("It is going to rebuild steps defs for composite def with ID " + this.getCompositeStepDefDBEId());
		List<StepDefDBE> stepDefDBEs = StepDefDBELocalServiceUtil.getCompositeStepDefDBEStepDefDBEs(this.getCompositeStepDefDBEId());
		this.stepDefs = new ArrayList<StepDef>();
		for (StepDefDBE stepDefDBE: stepDefDBEs) {
			this.stepDefs.add(StepFactory.getStepDef(stepDefDBE.getStepType(), stepDefDBE));
		}
	}
}
