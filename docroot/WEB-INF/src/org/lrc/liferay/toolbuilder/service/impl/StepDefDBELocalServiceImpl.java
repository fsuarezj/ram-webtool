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
import org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.base.StepDefDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.StepDefDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

/**
 * The implementation of the Step Definition local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.StepDefDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.StepDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil
 */
public class StepDefDBELocalServiceImpl extends StepDefDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil} to access the Step Definition local service.
	 */
	public StepDefDBE getStepDefDBE(long stepDefDBEId) throws NoSuchStepDefDBEException, SystemException {
		return stepDefDBEPersistence.findByPrimaryKey(stepDefDBEId);
	}
	
	private void validate(String stepType) throws StepDefDBEException, NoSuchInstalledStepException, SystemException {
		if (Validator.isNull(stepType)) {
			throw new StepDefDBEException();
		}
		System.out.println("Va a validar " + stepType);
		StepFactory.isInstalledStep(stepType);
	}
	
	public StepDefDBE addStepDefDBE(String stepType, LiferayFacesContext liferayFacesContext) throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDefDBEException {

		validate(stepType);
		
//		Date now = new Date();
		long stepDefDBEId = counterLocalService.increment(StepDefDBE.class.getName());
		
		User user = userPersistence.findByPrimaryKey(liferayFacesContext.getUserId());

		System.out.println("StepDefDBEId is " + stepDefDBEId);
		StepDefDBE stepDefDBE = StepDefDBEUtil.create(stepDefDBEId);
		System.out.println("StepDefDBEId after creating StepDefDBE is " + stepDefDBE.getStepDefDBEId());

		stepDefDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		stepDefDBE.setCompanyId(liferayFacesContext.getCompanyId());
		stepDefDBE.setUserId(liferayFacesContext.getUserId());
		stepDefDBE.setUserName(user.getFullName());
		stepDefDBE.setStepType(stepType);
		
//		stepDefDBEPersistence.update(stepDefDBE);
		
		return stepDefDBE;
}

//	@Override
//	public StepDefDBE addStepDefDBE(StepDefDBE stepDefDBE) throws SystemException {
//		long stepDefDBEId = counterLocalService.increment(StepDefDBE.class.getName());
//		stepDefDBE.setStepDefDBEId(stepDefDBEId);
//		
//		return super.addStepDefDBE(stepDefDBE);
//	}
}