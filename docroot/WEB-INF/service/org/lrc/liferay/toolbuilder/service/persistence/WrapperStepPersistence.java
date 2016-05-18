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

package org.lrc.liferay.toolbuilder.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.lrc.liferay.toolbuilder.model.WrapperStep;

/**
 * The persistence interface for the wrapper step service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepPersistenceImpl
 * @see WrapperStepUtil
 * @generated
 */
public interface WrapperStepPersistence extends BasePersistence<WrapperStep> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WrapperStepUtil} to access the wrapper step persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the wrapper step in the entity cache if it is enabled.
	*
	* @param wrapperStep the wrapper step
	*/
	public void cacheResult(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep);

	/**
	* Caches the wrapper steps in the entity cache if it is enabled.
	*
	* @param wrapperSteps the wrapper steps
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStep> wrapperSteps);

	/**
	* Creates a new wrapper step with the primary key. Does not add the wrapper step to the database.
	*
	* @param wrapperStepId the primary key for the new wrapper step
	* @return the new wrapper step
	*/
	public org.lrc.liferay.toolbuilder.model.WrapperStep create(
		long wrapperStepId);

	/**
	* Removes the wrapper step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepId the primary key of the wrapper step
	* @return the wrapper step that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.WrapperStep remove(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepException;

	public org.lrc.liferay.toolbuilder.model.WrapperStep updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wrapper step with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepException} if it could not be found.
	*
	* @param wrapperStepId the primary key of the wrapper step
	* @return the wrapper step
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.WrapperStep findByPrimaryKey(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepException;

	/**
	* Returns the wrapper step with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wrapperStepId the primary key of the wrapper step
	* @return the wrapper step, or <code>null</code> if a wrapper step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.WrapperStep fetchByPrimaryKey(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the wrapper steps.
	*
	* @return the wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStep> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the wrapper steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper steps
	* @param end the upper bound of the range of wrapper steps (not inclusive)
	* @return the range of wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStep> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the wrapper steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper steps
	* @param end the upper bound of the range of wrapper steps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStep> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the wrapper steps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wrapper steps.
	*
	* @return the number of wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}