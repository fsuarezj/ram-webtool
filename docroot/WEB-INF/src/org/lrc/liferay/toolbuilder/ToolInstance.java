package org.lrc.liferay.toolbuilder;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStep;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class ToolInstance implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8466712480351355517L;
	private ToolInstanceDBE toolInstanceDBE;
	private ToolDef toolDef;
	private CompositeStep compositeStep;

	public ToolInstance(ToolDef toolDef, CompositeStep compositeStep) throws NoSuchUserException, NoSuchToolDefDBEException, SystemException {
		this.toolDef = toolDef;
		this.compositeStep = compositeStep;
		
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		
		System.out.println("La StepDBEId es " + this.compositeStep.getStepDBEId());
		this.toolInstanceDBE = ToolInstanceDBELocalServiceUtil.addToolInstanceDBE
				(this.toolDef.getToolDefDBEId(), this.compositeStep.getStepDBEId(), liferayFacesContext);
	}
	
	public ToolInstance(ToolInstanceDBE toolInstanceDBE, ToolDef toolDef) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.toolInstanceDBE = toolInstanceDBE;
		this.toolDef = toolDef;
		StepDBE stepDBE = StepDBELocalServiceUtil.getStepDBE(this.toolInstanceDBE.getCompositeStepDBEId());
		this.compositeStep = new CompositeStep(stepDBE);
	}
	
	public void setToolTitle(String toolTitle) {
		this.toolInstanceDBE.setToolTitle(toolTitle);
	}
	
	public String getToolTitle() {
		return this.toolInstanceDBE.getToolTitle();
	}
	
	public int getCurrentStepNumber() {
		return this.compositeStep.getCurrentStepNumber();
	}
	
	public Integer stepForward() {
		return this.compositeStep.stepForward();
	}
	
	public void save() throws SystemException {
		this.compositeStep.save();
		this.toolInstanceDBE.setCompositeStepDBEId(this.compositeStep.getStepDBEId());
		
		if (this.toolInstanceDBE.getToolInstanceDBEId() == 0) {
			ToolInstanceDBELocalServiceUtil.addToolInstanceDBE(this.toolInstanceDBE);
		} else {
			ToolInstanceDBELocalServiceUtil.updateToolInstanceDBE(this.toolInstanceDBE);
		}
	}
	
	@Override
	public boolean equals(Object O) {
		if (this.getToolTitle().equals((((ToolInstance) O).getToolTitle()))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void delete() throws PortalException, SystemException {
		// TODO
		this.compositeStep.delete();
		ToolInstanceDBELocalServiceUtil.deleteToolInstanceDBE(toolInstanceDBE.getToolInstanceDBEId());
	}

	public void rebuildSteps() throws SystemException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		this.compositeStep.rebuildSteps();
	}
}
