package org.lrc.liferay.toolbuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.*;

@SuppressWarnings("unused")
public class StepFactory {
	private static Map<String, String> stepClasses = new HashMap<String, String>();
	
	public StepFactory() {
		StepFactory.stepClasses.put("WRAPPER_SEQUENTIAL", "org.lrc.liferay.toolbuilder.model.WrapperStepInstance");
		StepFactory.stepClasses.put("WRAPPER_NON_SEQUENTIAL", "org.lrc.liferay.toolbuilder.model.WrapperStepInstance");
		StepFactory.stepClasses.put("INFO", "org.lrc.liferay.toolbuilder.steps.InfoStep");
		StepFactory.stepClasses.put("DECISION_TREE", "org.lrc.liferay.toolbuilder.steps.DecisionTreeStep");
		StepFactory.stepClasses.put("VOID", "org.lrc.liferay.toolbuilder.steps.VoidStep");
	}
	
	public static Step getStep(String stepType) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		System.out.println("Creating Step " + StepFactory.stepClasses.get(stepType) + " for name " + stepType);
		Class<?> stepClass = Class.forName(StepFactory.stepClasses.get(stepType));
		Constructor<?> stepConstructor = stepClass.getConstructor();
		return (Step) stepConstructor.newInstance();
	}

}
