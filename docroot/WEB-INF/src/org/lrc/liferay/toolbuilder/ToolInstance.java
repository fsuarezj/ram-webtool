package org.lrc.liferay.toolbuilder;

import java.lang.reflect.InvocationTargetException;

import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.ToolInstanceDBEUtil;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStep;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class ToolInstance {
	
	private ToolInstanceDBE toolInstanceDBE;
	private ToolDef toolDef;
	private CompositeStep compositeStep;

	public ToolInstance(ToolDef toolDef, CompositeStep compositeStep) {
		this.toolDef = toolDef;
		this.compositeStep = compositeStep;
		
		ToolInstanceDBEUtil.create(0L);

		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		this.toolInstanceDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		this.toolInstanceDBE.setCompanyId(liferayFacesContext.getCompanyId());
		this.toolInstanceDBE.setUserId(liferayFacesContext.getUserId());
		this.toolInstanceDBE.setToolDefDBEId(this.toolDef.getToolDefDBEId());
	}
	
	public ToolInstance(ToolInstanceDBE toolInstanceDBE, ToolDef toolDef) throws PortalException, SystemException {
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
		this.toolInstanceDBE.setCompositeStepDBEId(this.compositeStep.getCompositeStepDBEId());
		
		if (this.toolInstanceDBE.getToolInstanceDBEId() == 0) {
			ToolInstanceDBELocalServiceUtil.addToolInstanceDBE(this.toolInstanceDBE);
		} else {
			ToolInstanceDBELocalServiceUtil.updateToolInstanceDBE(this.toolInstanceDBE);
		}
	}
	
	public void delete() {
		// TODO
	}

	public void rebuildSteps() throws SystemException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {
		this.compositeStep.rebuildSteps();
	}
}
