package org.lrc.liferay.toolbuilder;

import org.lrc.liferay.toolbuilder.steps.InfoStep;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.decisionTree.DecisionTreeStep;
import org.lrc.liferay.toolbuilder.steps.wrapper.WrapperStepInstance;

public class StepFactory {
	
	public Step getStep(String stepType) {
		if (stepType == null)
			return null;
		if (stepType.equalsIgnoreCase("WRAPPER_SEQUENTIAL")) {
			return new WrapperStepInstance();
		} else if (stepType.equalsIgnoreCase("WRAPPER_NON_SEQUENTIAL")) {
			return new WrapperStepInstance();
		} else if (stepType.equalsIgnoreCase("INFO")) {
			return new InfoStep();
		} else if (stepType.equalsIgnoreCase("DECISION_TREE")) {
			return new DecisionTreeStep();
		} else {
			return null;
		}
	}

}
