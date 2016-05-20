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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the WrapperStep service. Represents a row in the &quot;lrc_tb_WrapperStep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.model.WrapperStep} interface.
 * </p>
 *
 * @author Fernando Suárez
 */
public class WrapperStepImpl extends WrapperStepBaseImpl implements Step {

	private static final long serialVersionUID = 8701939652024536186L;

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a wrapper step model instance should use the {@link org.lrc.liferay.toolbuilder.model.WrapperStep} interface instead.
	 */
	final String view = "wrapperStepView.xhtml";

	private List<Step> steps;
	//TODO Eliminar cuando meta depth en la base de datos

	// BUILDING METHODS //
	
	public WrapperStepImpl() {
		this.steps = new ArrayList<Step>();
	}
	
	public WrapperStepImpl(int depth) {
		this.steps = new ArrayList<Step>();
		//this.setDepth(depth);
		//TODO: Get steps from persistent layer
	}
	
	public void createSteps() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//TODO: Get steps from persistent layer
		for (int i = 0; i < 5; i++)
			this.addStep(StepFactory.getStep("VOID"));
	}
	
	public void addStep(Step step) {
		this.steps.add(step);
	}
	
	// OPERATION METHODS
	
	/**
	 * @return the index of the next step. If it is the final step it returns the current step.
	 */
	public Integer stepForward() {
		this.goToStep(this.getCurrentStep() + 1);
		return this.getCurrentStep();
	}
	
	/**
	 * @param newStep the index of the new step
	 * @return the index of the new step. If sequential will throw exception if newStep is not the next one
	 */
	public void goToStep(Integer newStep) {
		if (newStep < this.getStepsNumber()) {
			if (this.isSequential()) {
				if (this.getCurrentStep() + 1 == newStep)
					this.setCurrentStep((int)newStep);
			} else {
				this.setCurrentStep((int)newStep);
			}
		}
	}
	
	public Integer getCurrentStepNumber() {
		return this.getCurrentStep() + 1;
	}
	
	@Override
	public void save() throws SystemException {

		// If is not Sequential persistent current step will be always 0 it will never write again persistent layer
		if (this.isSequential()) {
			if (this.getWrapperStepId() == 0) {
				WrapperStepLocalServiceUtil.addWrapperStep(this);
			}
			else {
				WrapperStepLocalServiceUtil.updateWrapperStep(this);
			}
		} else {
			if (this.getWrapperStepId() == 0) {
				WrapperStepLocalServiceUtil.addWrapperStep(this);
			}
		}
//		try {
//			// If the instance is being created goes to Step 1
//			if (this.selectedToolInstance.getCurrentStepIndex() == 0)
//				this.selectedToolInstance.stepForward();
//
//			// Persistence connection
//			if (this.selectedToolInstance.getInstanceId() == 0) {
//				this.selectedToolInstance = InstanceLocalServiceUtil.addInstance(this.selectedToolInstance);
//				// Include instance on list
//				this.instances.add(this.selectedToolInstance);
//			}
//			else
//				this.selectedToolInstance = InstanceLocalServiceUtil.updateInstance(this.selectedToolInstance);
//			
//
//		} catch (Exception e) {
//			this.addGlobalUnexpectedErrorMessage();
//			logger.error(e);
//		}
	}
	
	@Override
	public void delete() throws PortalException, SystemException {
		WrapperStepLocalServiceUtil.deleteWrapperStep(this.getWrapperStepId());
		// TODO: Delete all contained steps
	}

	@Override
	public String draw() {
		return this.view;
	}

	@Override
	public String getStepName() {
		if (this.isSequential())
			return "WRAPPER_SEQUENTIAL";
		else
			return "WRAPPER_NON_SEQUENTIAL";
	}

}