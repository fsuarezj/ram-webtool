package org.lrc.liferay.toolbuilder;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.ToolDefDBEUtil;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStep;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStepDef;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class ToolDef implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3469229446098569636L;
	private CompositeStepDef compositeStepDef;
	private ToolDefDBE toolDefDBE;
	
	public ToolDef(String toolName) throws NoSuchUserException, NoSuchInstalledStepException, ToolDefDBEException, InstalledStepException, StepDefDBEException, CompositeStepDefDBEException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchToolDefDBEException {
		if (toolName.equals("Test Tool")) {
			this.createTestToolDef(toolName, 5);
		} else if (toolName.equals("Test Tool 2")) {
			this.createTestToolDef(toolName, 3);
		} else {
			//TODO: Create new exception
			throw new NoSuchToolDefDBEException();
		}
	}

	public ToolDef(ToolDefDBE toolDefDBE) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.toolDefDBE = toolDefDBE;
		StepDefDBE stepDefDBE = StepDefDBELocalServiceUtil.getStepDefDBE(this.toolDefDBE.getCompositeStepDefDBEId());
		this.compositeStepDef = new CompositeStepDef(stepDefDBE);
	}

	private void createTestToolDef(String name, int stepsNumber) throws SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchUserException, ToolDefDBEException, InstalledStepException, NoSuchInstalledStepException, StepDefDBEException, CompositeStepDefDBEException {
		// TODO Auto-generated constructor stub
		this.toolDefDBE = ToolDefDBEUtil.create(0L);
		
		System.out.println("Creando Test Tool Def");
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		this.toolDefDBE = ToolDefDBELocalServiceUtil.addToolDefDBE(name, liferayFacesContext);

//		this.compositeStepDef = new CompositeStepDef();
		this.compositeStepDef = (CompositeStepDef) StepFactory.getStepDef("COMPOSITE");

		for (int i = 0; i < stepsNumber; i++) {
			this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		}
		
		this.compositeStepDef.save();
		this.toolDefDBE.setCompositeStepDefDBEId(this.compositeStepDef.getStepDefDBEId());
//		ToolDefDBELocalServiceUtil.addToolDefDBE(this.toolDefDBE);
		ToolDefDBELocalServiceUtil.updateToolDefDBE(this.toolDefDBE);
	}
	
	public long getToolDefDBEId() {
		return this.toolDefDBE.getToolDefDBEId();
	}

	public ToolInstance buildInstance() throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, CompositeStepDBEException, NoSuchToolDefDBEException {
		return new ToolInstance(this, (CompositeStep) this.compositeStepDef.buildStep());
	}

	public void rebuildSteps() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SystemException {
		this.compositeStepDef.buildStepDefs();
	}
}
