package org.lrc.liferay.toolbuilder;

import java.lang.reflect.InvocationTargetException;

import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.persistence.ToolDefDBEUtil;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStep;
import org.lrc.liferay.toolbuilder.steps.composite.CompositeStepDef;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class ToolDef {
	private CompositeStepDef compositeStepDef;
	private ToolDefDBE toolDefDBE;
	
	public ToolDef(String toolName) throws Exception {
//		List<ToolDefDBE> toolsList = ToolDefDBEUtil.findByToolName(toolName);
		ToolDefDBE toolDefDBE = ToolDefDBEUtil.findByToolName(toolName);
		if (toolDefDBE != null) {
			this.toolDefDBE = toolDefDBE;
			this.compositeStepDef = new CompositeStepDef
					(StepDefDBELocalServiceUtil.getStepDefDBE(this.toolDefDBE.getCompositeStepDefDBEId()));
		} else {
			// TODO: Declare Specific Exception
			// throw new Exception("None tool with given name");
			this.createTestToolDef();
		}
//		if (toolsList.size() > 1) {
//			// TODO: Declare Specific Exception
//			throw new Exception("Two tools with the same name");
//		} else if (toolsList.size() == 1) {
//			this.toolDefDBE = toolsList.get(0);
//			this.compositeStepDef = new CompositeStepDef
//					(StepDefDBELocalServiceUtil.getStepDefDBE(this.toolDefDBE.getCompositeStepDefDBEId()));
//		} else if (toolsList.size() == 0) {
//			// TODO: Declare Specific Exception
//			// throw new Exception("None tool with given name");
//			this.createTestToolDef();
//		} else {
//			// TODO: Declare Specific Exception
//			throw new Exception("Unknown behavior");
//		}
	}

	public ToolDef(ToolDefDBE toolDefDBE) throws PortalException, SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.toolDefDBE = toolDefDBE;
		StepDefDBE stepDefDBE = StepDefDBELocalServiceUtil.getStepDefDBE(this.toolDefDBE.getCompositeStepDefDBEId());
		this.compositeStepDef = new CompositeStepDef(stepDefDBE);
	}

	private void createTestToolDef() throws SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated constructor stub
		this.toolDefDBE = ToolDefDBEUtil.create(0L);
		
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		this.toolDefDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		this.toolDefDBE.setCompanyId(liferayFacesContext.getCompanyId());
		this.toolDefDBE.setUserId(liferayFacesContext.getUserId());
		this.toolDefDBE.setToolName("Test Tool");

		this.compositeStepDef = new CompositeStepDef();

		this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		this.compositeStepDef.addStepDef(StepFactory.getStepDef("MOCK"));
		
		this.compositeStepDef.save();
		this.toolDefDBE.setCompositeStepDefDBEId(this.compositeStepDef.getCompositeStepDefDBEId());
		ToolDefDBELocalServiceUtil.addToolDefDBE(this.toolDefDBE);
	}
	
	public long getToolDefDBEId() {
		return this.toolDefDBE.getToolDefDBEId();
	}

	public ToolInstance buildInstance() throws SystemException {
		return new ToolInstance(this, (CompositeStep) this.compositeStepDef.buildStep());
	}

	public void rebuildSteps() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SystemException {
		this.compositeStepDef.rebuildStepDefs();
	}
}
