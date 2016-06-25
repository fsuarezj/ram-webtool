package org.lrc.liferay.toolbuilder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lrc.liferay.toolbuilder.model.InstalledStep;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.InstalledStepLocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.InstalledStepUtil;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

public final class StepFactory {
	private static Map<String, InstalledStep> stepClasses = new HashMap<String, InstalledStep>();
	
	public StepFactory() throws SystemException {
		int numberInstalledSteps = InstalledStepLocalServiceUtil.getInstalledStepsCount();
		if (numberInstalledSteps == 0) {
			StepFactory.installCoreSteps();
		} else {
			List<InstalledStep> installedSteps = InstalledStepLocalServiceUtil.getInstalledSteps(0, numberInstalledSteps);
			for (InstalledStep installedStep: installedSteps) {
				StepFactory.stepClasses.put(installedStep.getStepType(), installedStep);
			}
		}
//		StepFactory.stepClasses.put("COMPOSITE_SEQUENTIAL", "org.lrc.liferay.toolbuilder.steps.CompositeStepDef");
//		StepFactory.stepClasses.put("WRAPPER_NON_SEQUENTIAL", "org.lrc.liferay.toolbuilder.model.WrapperStepInstance");
//		StepFactory.stepClasses.put("INFO", "org.lrc.liferay.toolbuilder.steps.InfoStep");
//		StepFactory.stepClasses.put("DECISION_TREE", "org.lrc.liferay.toolbuilder.steps.DecisionTreeStep");
//		StepFactory.stepClasses.put("VOID", "org.lrc.liferay.toolbuilder.steps.VoidStep");
	}
	
	private static void installCoreSteps() throws SystemException {
		StepFactory.installStep("COMPOSITE", "org.lrc.liferay.toolbuilder.steps", "CompositeStep");
		StepFactory.installStep("MOCK", "org.lrc.liferay.toolbuilder.steps", "MockStep");
	}
	
	public static void installStep(String stepType, String namespace, String className) throws SystemException {
		
		InstalledStep installedStep = InstalledStepUtil.create(stepType);

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		installedStep.setGroupId(liferayFacesContext.getScopeGroupId());
		installedStep.setCompanyId(liferayFacesContext.getCompanyId());
		installedStep.setUserId(liferayFacesContext.getUserId());
		installedStep.setNamespace(namespace);
		installedStep.setClassName(className);
		
		StepFactory.installStep(stepType, installedStep);
	}
	
	private static void installStep(String stepType, InstalledStep installedStep) throws SystemException {
		InstalledStepLocalServiceUtil.addInstalledStep(installedStep);
		StepFactory.stepClasses.put(stepType, installedStep);
	}
	
	public static StepDef getStepDef(String stepType) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		System.out.println("Creating Step " + StepFactory.stepClasses.get(stepType) + " for name " + stepType);
		Class<?> stepClass = Class.forName(stepClasses.get(stepType).getNamespace() +
				"." + stepClasses.get(stepType).getClassName() + "Def");
		Constructor<?> stepConstructor = stepClass.getConstructor();
		return (StepDef) stepConstructor.newInstance();
	}

	public static StepDef getStepDef(String stepType, StepDefDBE stepDefDBE) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		System.out.println("Creating Step " + StepFactory.stepClasses.get(stepType) + " for name " + stepType);
		Class<?> stepClass = Class.forName(stepClasses.get(stepType).getNamespace() +
				"." + stepClasses.get(stepType).getClassName() + "Def");
		Constructor<?> stepConstructor = stepClass.getConstructor();
		return (StepDef) stepConstructor.newInstance(stepDefDBE);
	}

	public static Step getStep(String stepType, StepDBE stepDBE) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class<?> stepClass = Class.forName(stepClasses.get(stepType).getNamespace() +
				"." + stepClasses.get(stepType).getClassName());
		Constructor<?> stepConstructor = stepClass.getConstructor();
		return (Step) stepConstructor.newInstance(stepDBE);
	}

}
