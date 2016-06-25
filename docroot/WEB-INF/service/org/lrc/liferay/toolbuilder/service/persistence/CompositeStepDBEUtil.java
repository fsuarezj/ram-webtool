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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.lrc.liferay.toolbuilder.model.CompositeStepDBE;

import java.util.List;

/**
 * The persistence utility for the composite step d b e service. This utility wraps {@link CompositeStepDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDBEPersistence
 * @see CompositeStepDBEPersistenceImpl
 * @generated
 */
public class CompositeStepDBEUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CompositeStepDBE compositeStepDBE) {
		getPersistence().clearCache(compositeStepDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CompositeStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CompositeStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CompositeStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CompositeStepDBE update(CompositeStepDBE compositeStepDBE)
		throws SystemException {
		return getPersistence().update(compositeStepDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CompositeStepDBE update(CompositeStepDBE compositeStepDBE,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(compositeStepDBE, serviceContext);
	}

	/**
	* Returns all the composite step d b es where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @return the matching composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompositeStepDBEId(compositeStepDBEId);
	}

	/**
	* Returns a range of all the composite step d b es where compositeStepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @return the range of matching composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompositeStepDBEId(compositeStepDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the composite step d b es where compositeStepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompositeStepDBEId(compositeStepDBEId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching composite step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a matching composite step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE findByCompositeStepDBEId_First(
		long compositeStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException {
		return getPersistence()
				   .findByCompositeStepDBEId_First(compositeStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the first composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching composite step d b e, or <code>null</code> if a matching composite step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE fetchByCompositeStepDBEId_First(
		long compositeStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompositeStepDBEId_First(compositeStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the last composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching composite step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a matching composite step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE findByCompositeStepDBEId_Last(
		long compositeStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException {
		return getPersistence()
				   .findByCompositeStepDBEId_Last(compositeStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the last composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching composite step d b e, or <code>null</code> if a matching composite step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE fetchByCompositeStepDBEId_Last(
		long compositeStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompositeStepDBEId_Last(compositeStepDBEId,
			orderByComparator);
	}

	/**
	* Removes all the composite step d b es where compositeStepDBEId = &#63; from the database.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompositeStepDBEId(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompositeStepDBEId(compositeStepDBEId);
	}

	/**
	* Returns the number of composite step d b es where compositeStepDBEId = &#63;.
	*
	* @param compositeStepDBEId the composite step d b e ID
	* @return the number of matching composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompositeStepDBEId(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompositeStepDBEId(compositeStepDBEId);
	}

	/**
	* Caches the composite step d b e in the entity cache if it is enabled.
	*
	* @param compositeStepDBE the composite step d b e
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE) {
		getPersistence().cacheResult(compositeStepDBE);
	}

	/**
	* Caches the composite step d b es in the entity cache if it is enabled.
	*
	* @param compositeStepDBEs the composite step d b es
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> compositeStepDBEs) {
		getPersistence().cacheResult(compositeStepDBEs);
	}

	/**
	* Creates a new composite step d b e with the primary key. Does not add the composite step d b e to the database.
	*
	* @param compositeStepDBEId the primary key for the new composite step d b e
	* @return the new composite step d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE create(
		long compositeStepDBEId) {
		return getPersistence().create(compositeStepDBEId);
	}

	/**
	* Removes the composite step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDBEId the primary key of the composite step d b e
	* @return the composite step d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE remove(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException {
		return getPersistence().remove(compositeStepDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(compositeStepDBE);
	}

	/**
	* Returns the composite step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException} if it could not be found.
	*
	* @param compositeStepDBEId the primary key of the composite step d b e
	* @return the composite step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE findByPrimaryKey(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException {
		return getPersistence().findByPrimaryKey(compositeStepDBEId);
	}

	/**
	* Returns the composite step d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param compositeStepDBEId the primary key of the composite step d b e
	* @return the composite step d b e, or <code>null</code> if a composite step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDBE fetchByPrimaryKey(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(compositeStepDBEId);
	}

	/**
	* Returns all the composite step d b es.
	*
	* @return the composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the composite step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @return the range of composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the composite step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the composite step d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of composite step d b es.
	*
	* @return the number of composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the step d b es associated with the composite step d b e.
	*
	* @param pk the primary key of the composite step d b e
	* @return the step d b es associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk);
	}

	/**
	* Returns a range of all the step d b es associated with the composite step d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the composite step d b e
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @return the range of step d b es associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk, start, end);
	}

	/**
	* Returns an ordered range of all the step d b es associated with the composite step d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the composite step d b e
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of step d b es associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of step d b es associated with the composite step d b e.
	*
	* @param pk the primary key of the composite step d b e
	* @return the number of step d b es associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static int getStepDBEsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEsSize(pk);
	}

	/**
	* Returns <code>true</code> if the step d b e is associated with the composite step d b e.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @return <code>true</code> if the step d b e is associated with the composite step d b e; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDBE(pk, stepDBEPK);
	}

	/**
	* Returns <code>true</code> if the composite step d b e has any step d b es associated with it.
	*
	* @param pk the primary key of the composite step d b e to check for associations with step d b es
	* @return <code>true</code> if the composite step d b e has any step d b es associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDBEs(pk);
	}

	/**
	* Adds an association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBE(pk, stepDBEPK);
	}

	/**
	* Adds an association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBE the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBE(pk, stepDBE);
	}

	/**
	* Adds an association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPKs the primary keys of the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Adds an association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEs the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBEs(pk, stepDBEs);
	}

	/**
	* Clears all associations between the composite step d b e and its step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e to clear the associated step d b es from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStepDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearStepDBEs(pk);
	}

	/**
	* Removes the association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBE(pk, stepDBEPK);
	}

	/**
	* Removes the association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBE the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBE(pk, stepDBE);
	}

	/**
	* Removes the association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPKs the primary keys of the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Removes the association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEs the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBEs(pk, stepDBEs);
	}

	/**
	* Sets the step d b es associated with the composite step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEPKs the primary keys of the step d b es to be associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Sets the step d b es associated with the composite step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the composite step d b e
	* @param stepDBEs the step d b es to be associated with the composite step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDBEs(pk, stepDBEs);
	}

	public static CompositeStepDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CompositeStepDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					CompositeStepDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(CompositeStepDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CompositeStepDBEPersistence persistence) {
	}

	private static CompositeStepDBEPersistence _persistence;
}