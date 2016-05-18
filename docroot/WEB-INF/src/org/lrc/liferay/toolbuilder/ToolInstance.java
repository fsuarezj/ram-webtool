package org.lrc.liferay.toolbuilder;

import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.VoidStep;
import org.lrc.liferay.toolbuilder.steps.wrapper.WrapperStepInstance;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class ToolInstance extends WrapperStepInstance {
	final String view = "instanceView.xhtml";

	private org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance;

	public ToolInstance(WrapperStep wrapperStep, org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance) {

		super(wrapperStep);
		this.toolInstance = toolInstance;
		
		//TODO: Delete when wrapperStep will populate from Persistent layer (in WrapperStepInstance)
		for (int i = 0; i < 5; i++)
			this.addStep(new VoidStep());
	}
	
	@Override
	public void save() throws SystemException {
	
		// Persistence connection
		super.save();
		this.toolInstance.setWrapperStepId(this.wrapperStep.getWrapperStepId());
		if (this.toolInstance.getToolInstanceId() == 0) {
			this.toolInstance = ToolInstanceLocalServiceUtil.addToolInstance(this.toolInstance);
		}
		else {
			this.toolInstance = ToolInstanceLocalServiceUtil.updateToolInstance(this.toolInstance);
		}
	}
	
	@Override
	public void delete() throws PortalException, SystemException {
		ToolInstanceLocalServiceUtil.deleteToolInstance(this.toolInstance.getToolInstanceId());
		super.delete();
	}
	
	public long getToolInstanceId() {
		return this.toolInstance.getToolInstanceId();
	}

	public org.lrc.liferay.toolbuilder.model.ToolInstance getToolInstance() {
		return this.toolInstance;
	}

	public String getName() {
		return this.toolInstance.getName();
	}

	public void setName(String name) {
		this.toolInstance.setName(name);
	}

	@Override
	public boolean equals(Object toolInstance) {
		return this.toolInstance.getToolInstanceId() == ((org.lrc.liferay.toolbuilder.ToolInstance) toolInstance).getToolInstanceId();
	}
}
