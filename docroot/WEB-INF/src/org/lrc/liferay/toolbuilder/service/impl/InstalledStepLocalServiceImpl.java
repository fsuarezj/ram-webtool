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

import org.lrc.liferay.toolbuilder.InstalledStepException;
import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.model.InstalledStep;
import org.lrc.liferay.toolbuilder.service.base.InstalledStepLocalServiceBaseImpl;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the installed step local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.InstalledStepLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.InstalledStepLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.InstalledStepLocalServiceUtil
 */
public class InstalledStepLocalServiceImpl
	extends InstalledStepLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.InstalledStepLocalServiceUtil} to access the installed step local service.
	 */
	public InstalledStep getInstalledStep(String stepType) throws NoSuchInstalledStepException, SystemException {
		return installedStepPersistence.findByStepType(stepType);
	}
	
	public void validate(String stepType, String namespace, String className) throws InstalledStepException, SystemException {
		if (Validator.isNull(stepType)) {
			try {
				installedStepPersistence.findByStepType(stepType);
				throw new InstalledStepException();
			} catch (NoSuchInstalledStepException e) {
				// If there is not other Step with that name it is installed
			}
		}
		if (Validator.isNull(namespace)) {
			throw new InstalledStepException();
		}
		if (Validator.isNull(className)) {
			throw new InstalledStepException();
		}
	}

	public InstalledStep addInstalledStep(String stepType, String namespace, String className, LiferayFacesContext liferayFacesContext) throws NoSuchUserException, SystemException, InstalledStepException {
//		User user = userPersistence.findByPrimaryKey(liferayFacesContext.getUserId());
//		Date now = new Date();
		
		// TODO Comprobar q no existe ese stepType
		validate(stepType, namespace, className);

		InstalledStep installedStep = installedStepPersistence.create(stepType);

//		installedStep.setGroupId(liferayFacesContext.getScopeGroupId());
//		installedStep.setCompanyId(liferayFacesContext.getCompanyId());
//		installedStep.setUserId(liferayFacesContext.getUserId());
//		installedStep.setUserName(user.getFullName());
		installedStep.setStepType(stepType);
		installedStep.setNamespace(namespace);
		installedStep.setClassName(className);
		
		System.out.println("Está instalando " + stepType);
		
		installedStepPersistence.update(installedStep);
		
		return installedStep;
	}
}