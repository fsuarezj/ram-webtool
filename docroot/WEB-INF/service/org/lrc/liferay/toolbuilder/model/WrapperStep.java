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

package org.lrc.liferay.toolbuilder.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the WrapperStep service. Represents a row in the &quot;lrc_tb_WrapperStep&quot; database table, with each column mapped to a property of this class.
 *
 * @author Fernando Suárez
 * @see WrapperStepModel
 * @see org.lrc.liferay.toolbuilder.model.impl.WrapperStepImpl
 * @see org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl
 * @generated
 */
public interface WrapperStep extends WrapperStepModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public void createSteps()
		throws java.lang.ClassNotFoundException,
			java.lang.IllegalAccessException, java.lang.IllegalArgumentException,
			java.lang.InstantiationException, java.lang.NoSuchMethodException,
			java.lang.SecurityException,
			java.lang.reflect.InvocationTargetException;

	public void addStep(org.lrc.liferay.toolbuilder.steps.Step step);

	/**
	* @return the index of the next step. If it is the final step it returns the current step.
	*/
	public java.lang.Integer stepForward();

	/**
	* @param newStep the index of the new step
	* @return the index of the new step. If sequential will throw exception if newStep is not the next one
	*/
	public void setCurrentStepAdvanced(java.lang.Integer newStep);

	public java.lang.Integer getCurrentStepNumber();

	public void save()
		throws com.liferay.portal.kernel.exception.SystemException;

	public void delete()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.lang.String draw();

	public java.lang.String getStepName();
}