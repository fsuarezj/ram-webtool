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

import org.lrc.liferay.toolbuilder.model.StepDBE;

/**
 * The persistence interface for the step d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDBEPersistenceImpl
 * @see StepDBEUtil
 * @generated
 */
public interface StepDBEPersistence extends BasePersistence<StepDBE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StepDBEUtil} to access the step d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the step d b es where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @return the matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the step d b es where stepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDBEId the step d b e ID
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @return the range of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the step d b es where stepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDBEId the step d b e ID
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE findByStepDBEId_First(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException;

	/**
	* Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching step d b e, or <code>null</code> if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE fetchByStepDBEId_First(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE findByStepDBEId_Last(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException;

	/**
	* Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching step d b e, or <code>null</code> if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE fetchByStepDBEId_Last(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the step d b es where stepDBEId = &#63; from the database.
	*
	* @param stepDBEId the step d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStepDBEId(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of step d b es where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @return the number of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countByStepDBEId(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the step d b e in the entity cache if it is enabled.
	*
	* @param stepDBE the step d b e
	*/
	public void cacheResult(org.lrc.liferay.toolbuilder.model.StepDBE stepDBE);

	/**
	* Caches the step d b es in the entity cache if it is enabled.
	*
	* @param stepDBEs the step d b es
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs);

	/**
	* Creates a new step d b e with the primary key. Does not add the step d b e to the database.
	*
	* @param stepDBEId the primary key for the new step d b e
	* @return the new step d b e
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE create(long stepDBEId);

	/**
	* Removes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE remove(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException;

	public org.lrc.liferay.toolbuilder.model.StepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDBEException} if it could not be found.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE findByPrimaryKey(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException;

	/**
	* Returns the step d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e, or <code>null</code> if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE fetchByPrimaryKey(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the step d b es.
	*
	* @return the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @return the range of step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of step d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the step d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of step d b es.
	*
	* @return the number of step d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}