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

import org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE;

import java.util.List;

/**
 * The persistence utility for the wrapper step def d b e service. This utility wraps {@link WrapperStepDefDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDefDBEPersistence
 * @see WrapperStepDefDBEPersistenceImpl
 * @generated
 */
public class WrapperStepDefDBEUtil {
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
	public static void clearCache(WrapperStepDefDBE wrapperStepDefDBE) {
		getPersistence().clearCache(wrapperStepDefDBE);
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
	public static List<WrapperStepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WrapperStepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WrapperStepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static WrapperStepDefDBE update(WrapperStepDefDBE wrapperStepDefDBE)
		throws SystemException {
		return getPersistence().update(wrapperStepDefDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static WrapperStepDefDBE update(
		WrapperStepDefDBE wrapperStepDefDBE, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(wrapperStepDefDBE, serviceContext);
	}

	/**
	* Returns all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @return the matching wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWrapperStepDefDBEId(wrapperStepDefDBEId);
	}

	/**
	* Returns a range of all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @return the range of matching wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWrapperStepDefDBEId(wrapperStepDefDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWrapperStepDefDBEId(wrapperStepDefDBEId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wrapper step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a matching wrapper step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE findByWrapperStepDefDBEId_First(
		long wrapperStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException {
		return getPersistence()
				   .findByWrapperStepDefDBEId_First(wrapperStepDefDBEId,
			orderByComparator);
	}

	/**
	* Returns the first wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wrapper step def d b e, or <code>null</code> if a matching wrapper step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE fetchByWrapperStepDefDBEId_First(
		long wrapperStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWrapperStepDefDBEId_First(wrapperStepDefDBEId,
			orderByComparator);
	}

	/**
	* Returns the last wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wrapper step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a matching wrapper step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE findByWrapperStepDefDBEId_Last(
		long wrapperStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException {
		return getPersistence()
				   .findByWrapperStepDefDBEId_Last(wrapperStepDefDBEId,
			orderByComparator);
	}

	/**
	* Returns the last wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wrapper step def d b e, or <code>null</code> if a matching wrapper step def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE fetchByWrapperStepDefDBEId_Last(
		long wrapperStepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWrapperStepDefDBEId_Last(wrapperStepDefDBEId,
			orderByComparator);
	}

	/**
	* Removes all the wrapper step def d b es where wrapperStepDefDBEId = &#63; from the database.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWrapperStepDefDBEId(long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWrapperStepDefDBEId(wrapperStepDefDBEId);
	}

	/**
	* Returns the number of wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID
	* @return the number of matching wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWrapperStepDefDBEId(long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWrapperStepDefDBEId(wrapperStepDefDBEId);
	}

	/**
	* Caches the wrapper step def d b e in the entity cache if it is enabled.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE) {
		getPersistence().cacheResult(wrapperStepDefDBE);
	}

	/**
	* Caches the wrapper step def d b es in the entity cache if it is enabled.
	*
	* @param wrapperStepDefDBEs the wrapper step def d b es
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> wrapperStepDefDBEs) {
		getPersistence().cacheResult(wrapperStepDefDBEs);
	}

	/**
	* Creates a new wrapper step def d b e with the primary key. Does not add the wrapper step def d b e to the database.
	*
	* @param wrapperStepDefDBEId the primary key for the new wrapper step def d b e
	* @return the new wrapper step def d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE create(
		long wrapperStepDefDBEId) {
		return getPersistence().create(wrapperStepDefDBEId);
	}

	/**
	* Removes the wrapper step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE remove(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException {
		return getPersistence().remove(wrapperStepDefDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wrapperStepDefDBE);
	}

	/**
	* Returns the wrapper step def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException} if it could not be found.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE findByPrimaryKey(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException {
		return getPersistence().findByPrimaryKey(wrapperStepDefDBEId);
	}

	/**
	* Returns the wrapper step def d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e, or <code>null</code> if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE fetchByPrimaryKey(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(wrapperStepDefDBEId);
	}

	/**
	* Returns all the wrapper step def d b es.
	*
	* @return the wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the wrapper step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @return the range of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wrapper step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wrapper step def d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wrapper step def d b es.
	*
	* @return the number of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the Step Definitions associated with the wrapper step def d b e.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @return the Step Definitions associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDefDBEs(pk);
	}

	/**
	* Returns a range of all the Step Definitions associated with the wrapper step def d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @return the range of Step Definitions associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDefDBEs(pk, start, end);
	}

	/**
	* Returns an ordered range of all the Step Definitions associated with the wrapper step def d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Step Definitions associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDefDBEs(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of Step Definitions associated with the wrapper step def d b e.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @return the number of Step Definitions associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static int getStepDefDBEsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDefDBEsSize(pk);
	}

	/**
	* Returns <code>true</code> if the Step Definition is associated with the wrapper step def d b e.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @return <code>true</code> if the Step Definition is associated with the wrapper step def d b e; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDefDBE(pk, stepDefDBEPK);
	}

	/**
	* Returns <code>true</code> if the wrapper step def d b e has any Step Definitions associated with it.
	*
	* @param pk the primary key of the wrapper step def d b e to check for associations with Step Definitions
	* @return <code>true</code> if the wrapper step def d b e has any Step Definitions associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDefDBEs(pk);
	}

	/**
	* Adds an association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDefDBE(pk, stepDefDBEPK);
	}

	/**
	* Adds an association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBE the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDefDBE(pk, stepDefDBE);
	}

	/**
	* Adds an association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDefDBEs(pk, stepDefDBEPKs);
	}

	/**
	* Adds an association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEs the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDefDBEs(pk, stepDefDBEs);
	}

	/**
	* Clears all associations between the wrapper step def d b e and its Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e to clear the associated Step Definitions from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearStepDefDBEs(pk);
	}

	/**
	* Removes the association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPK the primary key of the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDefDBE(long pk, long stepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDefDBE(pk, stepDefDBEPK);
	}

	/**
	* Removes the association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBE the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDefDBE(pk, stepDefDBE);
	}

	/**
	* Removes the association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDefDBEs(pk, stepDefDBEPKs);
	}

	/**
	* Removes the association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEs the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDefDBEs(pk, stepDefDBEs);
	}

	/**
	* Sets the Step Definitions associated with the wrapper step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEPKs the primary keys of the Step Definitions to be associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDefDBEs(pk, stepDefDBEPKs);
	}

	/**
	* Sets the Step Definitions associated with the wrapper step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step def d b e
	* @param stepDefDBEs the Step Definitions to be associated with the wrapper step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDefDBEs(pk, stepDefDBEs);
	}

	public static WrapperStepDefDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WrapperStepDefDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					WrapperStepDefDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(WrapperStepDefDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(WrapperStepDefDBEPersistence persistence) {
	}

	private static WrapperStepDefDBEPersistence _persistence;
}