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

import org.lrc.liferay.toolbuilder.model.StepDefDBE;

/**
 * The persistence interface for the Step Definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDefDBEPersistenceImpl
 * @see StepDefDBEUtil
 * @generated
 */
public interface StepDefDBEPersistence extends BasePersistence<StepDefDBE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StepDefDBEUtil} to access the Step Definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Step Definitions where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @return the matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Step Definitions where stepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDefDBEId the step def d b e ID
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Step Definitions where stepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDefDBEId the step def d b e ID
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE findByStepDefDBEId_First(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;

	/**
	* Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByStepDefDBEId_First(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE findByStepDefDBEId_Last(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;

	/**
	* Returns the last Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByStepDefDBEId_Last(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Step Definitions where stepDefDBEId = &#63; from the database.
	*
	* @param stepDefDBEId the step def d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStepDefDBEId(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Step Definitions where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @return the number of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public int countByStepDefDBEId(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the Step Definition in the entity cache if it is enabled.
	*
	* @param stepDefDBE the Step Definition
	*/
	public void cacheResult(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE);

	/**
	* Caches the Step Definitions in the entity cache if it is enabled.
	*
	* @param stepDefDBEs the Step Definitions
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs);

	/**
	* Creates a new Step Definition with the primary key. Does not add the Step Definition to the database.
	*
	* @param stepDefDBEId the primary key for the new Step Definition
	* @return the new Step Definition
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE create(
		long stepDefDBEId);

	/**
	* Removes the Step Definition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE remove(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;

	public org.lrc.liferay.toolbuilder.model.StepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Step Definition with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException} if it could not be found.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE findByPrimaryKey(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;

	/**
	* Returns the Step Definition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition, or <code>null</code> if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByPrimaryKey(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Step Definitions.
	*
	* @return the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Step Definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Step Definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the Step Definitions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Step Definitions.
	*
	* @return the number of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}