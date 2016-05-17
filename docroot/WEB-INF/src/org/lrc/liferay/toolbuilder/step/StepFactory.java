package org.lrc.liferay.toolbuilder.step;

import org.lrc.liferay.toolbuilder.step.decisionTree.DecisionTreeStep;

public class StepFactory {
	
	public Step getStep(String stepType) {
		if (stepType == null)
			return null;
		if (stepType.equalsIgnoreCase("WRAPPER_SEQUENTIAL")) {
			return new WrapperStep(true);
		} else if (stepType.equalsIgnoreCase("WRAPPER_NON_SEQUENTIAL")) {
			return new WrapperStep(false);
		} else if (stepType.equalsIgnoreCase("INFO")) {
			return new InfoStep();
		} else if (stepType.equalsIgnoreCase("DECISION_TREE")) {
			return new DecisionTreeStep();
		} else {
			return null;
		}
	}

}
