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

package org.lrc.liferay.toolbuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StepDBEService}.
 *
 * @author Fernando Suárez
 * @see StepDBEService
 * @generated
 */
public class StepDBEServiceWrapper implements StepDBEService,
	ServiceWrapper<StepDBEService> {
	public StepDBEServiceWrapper(StepDBEService stepDBEService) {
		_stepDBEService = stepDBEService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stepDBEService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stepDBEService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stepDBEService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StepDBEService getWrappedStepDBEService() {
		return _stepDBEService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStepDBEService(StepDBEService stepDBEService) {
		_stepDBEService = stepDBEService;
	}

	@Override
	public StepDBEService getWrappedService() {
		return _stepDBEService;
	}

	@Override
	public void setWrappedService(StepDBEService stepDBEService) {
		_stepDBEService = stepDBEService;
	}

	private StepDBEService _stepDBEService;
}