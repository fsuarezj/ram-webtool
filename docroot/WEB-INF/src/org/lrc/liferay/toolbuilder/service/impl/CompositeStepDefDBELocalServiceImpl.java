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

import org.lrc.liferay.toolbuilder.CompositeStepDefDBEException;
import org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;
import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;
import org.lrc.liferay.toolbuilder.service.base.CompositeStepDefDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.CompositeStepDefDBEUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the composite step def d b e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.CompositeStepDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil
 */
public class CompositeStepDefDBELocalServiceImpl
	extends CompositeStepDefDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil} to access the composite step def d b e local service.
	 */
	public CompositeStepDefDBE getCompositeStepDefDBE(long compositeStepDefDBEId) throws SystemException, NoSuchCompositeStepDefDBEException {
		return compositeStepDefDBEPersistence.findByPrimaryKey(compositeStepDefDBEId);
	}
	
	private void validate(int depth) throws CompositeStepDefDBEException {
		if (depth < 0) {
			throw new CompositeStepDefDBEException();
		}
	}
	
	public CompositeStepDefDBE addCompositeStepDefDBE(boolean sequential, int depth) throws CompositeStepDefDBEException, SystemException {

		validate(depth);
		
		long compositeStepDefDBEId = counterLocalService.increment(CompositeStepDefDBE.class.getName());
		System.out.println("Creating CompositeStepDef with ID " + compositeStepDefDBEId);
		CompositeStepDefDBE compositeStepDefDBE = CompositeStepDefDBEUtil.create(compositeStepDefDBEId);

		compositeStepDefDBE.setSequential(sequential);
		compositeStepDefDBE.setDepth(depth);
		compositeStepDefDBE.setStepsNumber(0);
		
		// TODO Decidir si grabo cuando construyo o no, en ese caso tendría que borrar cuando cancelo
//		stepDefDBEPersistence.update(stepDefDBE);
		
		return compositeStepDefDBE;
	}
	
//	@Override
//	public CompositeStepDefDBE addCompositeStepDefDBE(CompositeStepDefDBE compositeStepDefDBE) throws SystemException {
//		long compositeStepDefDBEId = counterLocalService.increment(CompositeStepDefDBE.class.getName());
//		compositeStepDefDBE.setCompositeStepDefDBEId(compositeStepDefDBEId);
//		
//		return super.addCompositeStepDefDBE(compositeStepDefDBE);
//	}
}