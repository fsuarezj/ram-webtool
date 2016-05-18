package org.lrc.liferay.toolbuilder.steps.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.steps.Step;

public class WrapperStepModel {
	
	private List<Step> steps = new ArrayList<Step>();
	private int depth = 0;
	private WrapperStep wrapperStep;
	
	// BUILDING METHODS //
	public WrapperStepModel(WrapperStep wrapperStep) {
		this.wrapperStep = wrapperStep;
		this.depth = 0;
	}

	public WrapperStepModel(WrapperStep wrapperStep, int depth) {
		this.wrapperStep = wrapperStep;
		this.depth = depth;
	}

	public void setSteps(List<Step> steps) {
		//TODO: Get from persistent layer
		this.steps = steps;
	}
	
	public void addStep(Step step) {
		this.steps.add(step);
	}
	
	// OPERATION METHODS //
	public Integer size() {
		return this.steps.size();
	}
	
	public Step getStep(Integer index) {
		return this.steps.get(index);
	}
	
	public boolean IsSequential() {
		return this.wrapperStep.isSequential();
	}
	
	public int getDepth() {
		return this.depth;
	}
}
