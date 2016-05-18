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
 * Provides a wrapper for {@link WrapperStepService}.
 *
 * @author Fernando Suárez
 * @see WrapperStepService
 * @generated
 */
public class WrapperStepServiceWrapper implements WrapperStepService,
	ServiceWrapper<WrapperStepService> {
	public WrapperStepServiceWrapper(WrapperStepService wrapperStepService) {
		_wrapperStepService = wrapperStepService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wrapperStepService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wrapperStepService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wrapperStepService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WrapperStepService getWrappedWrapperStepService() {
		return _wrapperStepService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWrapperStepService(
		WrapperStepService wrapperStepService) {
		_wrapperStepService = wrapperStepService;
	}

	@Override
	public WrapperStepService getWrappedService() {
		return _wrapperStepService;
	}

	@Override
	public void setWrappedService(WrapperStepService wrapperStepService) {
		_wrapperStepService = wrapperStepService;
	}

	private WrapperStepService _wrapperStepService;
}