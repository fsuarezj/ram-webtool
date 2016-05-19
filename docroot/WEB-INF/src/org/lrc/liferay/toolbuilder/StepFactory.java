package org.lrc.liferay.toolbuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.lrc.liferay.toolbuilder.steps.Step;

public class StepFactory {
	private static Map<String, String> stepClasses = new HashMap<String, String>();
	
	public StepFactory() {
		StepFactory.stepClasses.put("WRAPPER_SEQUENTIAL", "WrapperStepInstance");
		StepFactory.stepClasses.put("WRAPPER_NON_SEQUENTIAL", "WrapperStepInstance");
		StepFactory.stepClasses.put("INFO", "InfoStep");
		StepFactory.stepClasses.put("DECISION_TREE", "DecisionTreeStep");
		StepFactory.stepClasses.put("VOID", "VoidStep");
	}
	
	public static Step getStep(String stepType) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> stepClass = Class.forName(stepClasses.get(stepType));
		Constructor<?> stepConstructor = stepClass.getConstructor();
		return (Step) stepConstructor.newInstance();
	}

}
