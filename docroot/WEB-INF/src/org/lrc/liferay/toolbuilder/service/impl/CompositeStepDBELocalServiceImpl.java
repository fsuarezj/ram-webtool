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

import org.lrc.liferay.toolbuilder.CompositeStepDBEException;
import org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException;
import org.lrc.liferay.toolbuilder.model.CompositeStepDBE;
import org.lrc.liferay.toolbuilder.service.base.CompositeStepDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.CompositeStepDBEUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the composite step d b e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.CompositeStepDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil
 */
public class CompositeStepDBELocalServiceImpl
	extends CompositeStepDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil} to access the composite step d b e local service.
	 */
	
	public CompositeStepDBE getCompositeStepDBE(long compositeStepDBEId) throws NoSuchCompositeStepDBEException, SystemException {
		return compositeStepDBEPersistence.findByPrimaryKey(compositeStepDBEId);
	}
	
	public CompositeStepDBE addCompositeStepDBE(long stepDefDBEId) throws CompositeStepDBEException, SystemException {

		long compositeStepDBEId = counterLocalService.increment(CompositeStepDBE.class.getName());
		CompositeStepDBE compositeStepDBE = CompositeStepDBEUtil.create(compositeStepDBEId);

		compositeStepDBE.setCurrentStep(0);
		compositeStepDBE.setCompositeStepDefDBEId(stepDefDBEId);
		
		// TODO Decidir si grabo cuando construyo o no, en ese caso tendría que borrar cuando cancelo
//		stepDefDBEPersistence.update(stepDefDBE);
		
		return compositeStepDBE;
	}

//	@Override
//	public CompositeStepDBE addCompositeStepDBE(CompositeStepDBE compositeStepDBE) throws SystemException {
//		long compositeStepDBEId = counterLocalService.increment(CompositeStepDBE.class.getName());
//		compositeStepDBE.setCompositeStepDBEId(compositeStepDBEId);
//		
//		return super.addCompositeStepDBE(compositeStepDBE);
//	}
}