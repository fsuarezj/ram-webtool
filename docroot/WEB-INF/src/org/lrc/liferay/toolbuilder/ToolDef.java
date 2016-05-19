package org.lrc.liferay.toolbuilder;

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.steps.StepDef;
import org.lrc.liferay.toolbuilder.steps.VoidStep;

public class ToolDef implements StepDef {
	private List<StepDef> steps;
	private int stepsNumber;
	private boolean sequential;

	public ToolDef(int stepsNumber, boolean sequential) {
		// TODO Auto-generated constructor stub
		this.stepsNumber = stepsNumber;
		this.sequential = sequential;
		steps = new ArrayList<StepDef>(stepsNumber);
		
		steps.add(new VoidStep());
		steps.add(new VoidStep());
		steps.add(new VoidStep());
		steps.add(new VoidStep());
		steps.add(new VoidStep());
		
	}

	@Override
	public String getStepName() {
		return "WRAPPER_SEQUENTIAL";
	}

}
