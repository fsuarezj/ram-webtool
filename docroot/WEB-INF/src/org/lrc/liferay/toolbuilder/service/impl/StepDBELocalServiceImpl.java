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

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.NoSuchStepDBEException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.base.StepDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.StepDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

/**
 * The implementation of the step d b e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.StepDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.StepDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil
 */
public class StepDBELocalServiceImpl extends StepDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil} to access the step d b e local service.
	 */
	public StepDBE getStepDBE(long stepDBEId) throws NoSuchStepDBEException, SystemException {
		return stepDBEPersistence.findByPrimaryKey(stepDBEId);
	}
	
	private void validate(String stepType) throws StepDefDBEException, NoSuchInstalledStepException, SystemException {
		if (Validator.isNull(stepType)) {
			throw new StepDefDBEException();
		}
		installedStepPersistence.findByStepType(stepType);
	}
	
	public StepDBE addStepDBE(String stepType, LiferayFacesContext liferayFacesContext) throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException {
		User user = userPersistence.findByPrimaryKey(liferayFacesContext.getUserId());
//		Date now = new Date();
		long stepDBEId = counterLocalService.increment(StepDBE.class.getName());
		
		validate(stepType);
		
		StepDBE stepDBE = StepDBEUtil.create(stepDBEId);

		stepDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		stepDBE.setCompanyId(liferayFacesContext.getCompanyId());
		stepDBE.setUserId(liferayFacesContext.getUserId());
		stepDBE.setUserName(user.getFullName());
		stepDBE.setStepType(stepType);
		
//		stepDBEPersistence.update(stepDBE);
		
		return stepDBE;
}

//	@Override
//	public StepDBE addStepDBE(StepDBE stepDBE) throws SystemException {
//		long stepDBEId = counterLocalService.increment(StepDBE.class.getName());
//		stepDBE.setStepDBEId(stepDBEId);
//		
//		return super.addStepDBE(stepDBE);
//	}
}