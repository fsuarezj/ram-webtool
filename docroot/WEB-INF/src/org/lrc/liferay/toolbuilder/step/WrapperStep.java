package org.lrc.liferay.toolbuilder.step;

import java.util.ArrayList;
import java.util.List;

public class WrapperStep implements Step {
	static final String view = "wrapperStepView.xhtml";
	
	private boolean isSequential;
	private List<Step> steps = new ArrayList<Step>();
	private int currentStep = 0;
	private int depth = 0;
	
	public WrapperStep(boolean isSequential) {
		this.isSequential = isSequential;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}
	
	public Integer nextStep() {
		if (this.currentStep++ < steps.size())
			return this.currentStep;
		else
			return this.currentStep--;
	}
	
	public Integer setCurrentStep(Integer nextStep) {
		if (this.isSequential)
			return this.nextStep();
		else {
			if (nextStep < this.steps.size()) {
				this.currentStep = nextStep;
				return nextStep;
			} else {
				// TODO: Throw OutOfRangeException
				return null;
			}
		}
	}
	
	@Override
	public String draw() {
		return view;
	}

}
