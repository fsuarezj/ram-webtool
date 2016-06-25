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

import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;

/**
 * The persistence interface for the composite step def d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBEPersistenceImpl
 * @see CompositeStepDefDBEUtil
 * @generated
 */
public interface CompositeStepDefDBEPersistence extends BasePersistence<CompositeStepDefDBE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompositeStepDefDBEUtil} to access the composite step def d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the composite step def d b es where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @return the matching composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the composite step def d b es where compositeStepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @return the range of matching composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the composite step def d b es where compositeStepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching composite step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a matching composite step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE findByCompositeStepDefDBEId_First(
		long compositeStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;

	/**
	* Returns the first composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching composite step def d b e, or <code>null</code> if a matching composite step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE fetchByCompositeStepDefDBEId_First(
		long compositeStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching composite step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a matching composite step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE findByCompositeStepDefDBEId_Last(
		long compositeStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;

	/**
	* Returns the last composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching composite step def d b e, or <code>null</code> if a matching composite step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE fetchByCompositeStepDefDBEId_Last(
		long compositeStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the composite step def d b es where compositeStepDefDBEId = &#63; from the database.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompositeStepDefDBEId(long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of composite step def d b es where compositeStepDefDBEId = &#63;.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID
	* @return the number of matching composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompositeStepDefDBEId(long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the composite step def d b e in the entity cache if it is enabled.
	*
	* @param compositeStepDefDBE the composite step def d b e
	*/
	public void cacheResult(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE);

	/**
	* Caches the composite step def d b es in the entity cache if it is enabled.
	*
	* @param compositeStepDefDBEs the composite step def d b es
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> compositeStepDefDBEs);

	/**
	* Creates a new composite step def d b e with the primary key. Does not add the composite step def d b e to the database.
	*
	* @param compositeStepDefDBEId the primary key for the new composite step def d b e
	* @return the new composite step def d b e
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE create(
		long compositeStepDefDBEId);

	/**
	* Removes the composite step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE remove(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;

	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the composite step def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException} if it could not be found.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE findByPrimaryKey(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;

	/**
	* Returns the composite step def d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e, or <code>null</code> if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE fetchByPrimaryKey(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the composite step def d b es.
	*
	* @return the composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the composite step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @return the range of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the composite step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the composite step def d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of composite step def d b es.
	*
	* @return the number of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the Step Definitions associated with the composite step def d b e.
	*
	* @param pk the primary key of the composite step def d b e
	* @return the Step Definitions associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Step Definitions associated with the composite step def d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the composite step def d b e
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @return the range of Step Definitions associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the Step Definitions associated with the composite step def d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the composite step def d b e
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Step Definitions associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Step Definitions associated with the composite step def d b e.
	*
	* @param pk the primary key of the composite step def d b e
	* @return the number of Step Definitions associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public int getStepDefDBEsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the Step Definition is associated with the composite step def d b e.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @return <code>true</code> if the Step Definition is associated with the composite step def d b e; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the composite step def d b e has any Step Definitions associated with it.
	*
	* @param pk the primary key of the composite step def d b e to check for associations with Step Definitions
	* @return <code>true</code> if the composite step def d b e has any Step Definitions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBE the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEs the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the composite step def d b e and its Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e to clear the associated Step Definitions from
	* @throws SystemException if a system exception occurred
	*/
	public void clearStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public void removeStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBE the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public void removeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public void removeStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEs the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public void removeStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the Step Definitions associated with the composite step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions to be associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public void setStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the Step Definitions associated with the composite step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step def d b e
	* @param stepDefDBEs the Step Definitions to be associated with the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public void setStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;
}