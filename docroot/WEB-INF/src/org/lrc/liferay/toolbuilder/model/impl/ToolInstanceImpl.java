/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.lrc.liferay.toolbuilder.model.impl;

import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the ToolInstance service. Represents a row in the &quot;lrc_tb_ToolInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.model.ToolInstance} interface.
 * </p>
 *
 * @author Fernando Suárez
 */
public class ToolInstanceImpl extends ToolInstanceBaseImpl implements Step {

	private static final long serialVersionUID = -4480073195704693014L;

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a tool instance model instance should use the {@link org.lrc.liferay.toolbuilder.model.ToolInstance} interface instead.
	 */
	final String view = "instanceView.xhtml";

	private WrapperStep wrapperStep;

	public ToolInstanceImpl() {
	}
	
	@Override
	public void save() throws SystemException {
	
		// Persistence connection
		System.out.println("Saving wrapperStep with step " + this.wrapperStep.getCurrentStepNumber());
		this.wrapperStep.save();
		System.out.println("Saving ToolInstance");
		this.setWrapperStepId(this.wrapperStep.getWrapperStepId());
		if (this.getToolInstanceId() == 0) {
			ToolInstanceLocalServiceUtil.addToolInstance(this);
		}
		else {
			ToolInstanceLocalServiceUtil.updateToolInstance(this);
		}
	}
	
	@Override
	public void delete() throws PortalException, SystemException {
		ToolInstanceLocalServiceUtil.deleteToolInstance(this.getToolInstanceId());
		this.wrapperStep.delete();
	}
	
//	@Override
//	public boolean equals(Object toolInstance) {
//		return this.getToolInstanceId() == ((org.lrc.liferay.toolbuilder.ToolInstance) toolInstance).getToolInstanceId();
//	}

	@Override
	public String draw() {
		return view;
	}
	
	public Integer stepForward() {
		return this.wrapperStep.stepForward();
	}
	
	public int getCurrentStepNumber() {
		return this.wrapperStep.getCurrentStepNumber();
	}
	
	public void setWrapperStep(WrapperStep wrapperStep) {
		this.wrapperStep = wrapperStep;
	}
}