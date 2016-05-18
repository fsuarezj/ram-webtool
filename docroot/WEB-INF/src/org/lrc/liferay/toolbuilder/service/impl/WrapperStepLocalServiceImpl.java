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

package org.lrc.liferay.toolbuilder.service.impl;

import org.lrc.liferay.toolbuilder.NoSuchWrapperStepException;
import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.base.WrapperStepLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the wrapper step local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.WrapperStepLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.WrapperStepLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil
 */
public class WrapperStepLocalServiceImpl extends WrapperStepLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil} to access the wrapper step local service.
	 */
	
	public WrapperStep getWrapperStepByPrimaryKey(long wrapperStepId) throws SystemException, NoSuchWrapperStepException {
		return wrapperStepPersistence.findByPrimaryKey(wrapperStepId);
	}

	@Override
	public WrapperStep addWrapperStep(WrapperStep wrapperStep) throws SystemException {
		long wrapperStepId = counterLocalService.increment(WrapperStep.class.getName());
		wrapperStep.setWrapperStepId(wrapperStepId);
		
		return super.addWrapperStep(wrapperStep);
	}
}