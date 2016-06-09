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

import org.lrc.liferay.toolbuilder.model.WrapperStepDBE;

import java.util.List;

/**
 * The persistence utility for the wrapper step d b e service. This utility wraps {@link WrapperStepDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDBEPersistence
 * @see WrapperStepDBEPersistenceImpl
 * @generated
 */
public class WrapperStepDBEUtil {
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
	public static void clearCache(WrapperStepDBE wrapperStepDBE) {
		getPersistence().clearCache(wrapperStepDBE);
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
	public static List<WrapperStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WrapperStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WrapperStepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static WrapperStepDBE update(WrapperStepDBE wrapperStepDBE)
		throws SystemException {
		return getPersistence().update(wrapperStepDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static WrapperStepDBE update(WrapperStepDBE wrapperStepDBE,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(wrapperStepDBE, serviceContext);
	}

	/**
	* Returns all the wrapper step d b es where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @return the matching wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findByWrapperStepDBEId(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWrapperStepDBEId(wrapperStepDBEId);
	}

	/**
	* Returns a range of all the wrapper step d b es where wrapperStepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @return the range of matching wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findByWrapperStepDBEId(
		long wrapperStepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWrapperStepDBEId(wrapperStepDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the wrapper step d b es where wrapperStepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findByWrapperStepDBEId(
		long wrapperStepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWrapperStepDBEId(wrapperStepDBEId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wrapper step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a matching wrapper step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE findByWrapperStepDBEId_First(
		long wrapperStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException {
		return getPersistence()
				   .findByWrapperStepDBEId_First(wrapperStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the first wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching wrapper step d b e, or <code>null</code> if a matching wrapper step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE fetchByWrapperStepDBEId_First(
		long wrapperStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWrapperStepDBEId_First(wrapperStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the last wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wrapper step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a matching wrapper step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE findByWrapperStepDBEId_Last(
		long wrapperStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException {
		return getPersistence()
				   .findByWrapperStepDBEId_Last(wrapperStepDBEId,
			orderByComparator);
	}

	/**
	* Returns the last wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching wrapper step d b e, or <code>null</code> if a matching wrapper step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE fetchByWrapperStepDBEId_Last(
		long wrapperStepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWrapperStepDBEId_Last(wrapperStepDBEId,
			orderByComparator);
	}

	/**
	* Removes all the wrapper step d b es where wrapperStepDBEId = &#63; from the database.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWrapperStepDBEId(long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWrapperStepDBEId(wrapperStepDBEId);
	}

	/**
	* Returns the number of wrapper step d b es where wrapperStepDBEId = &#63;.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID
	* @return the number of matching wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWrapperStepDBEId(long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWrapperStepDBEId(wrapperStepDBEId);
	}

	/**
	* Caches the wrapper step d b e in the entity cache if it is enabled.
	*
	* @param wrapperStepDBE the wrapper step d b e
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE) {
		getPersistence().cacheResult(wrapperStepDBE);
	}

	/**
	* Caches the wrapper step d b es in the entity cache if it is enabled.
	*
	* @param wrapperStepDBEs the wrapper step d b es
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> wrapperStepDBEs) {
		getPersistence().cacheResult(wrapperStepDBEs);
	}

	/**
	* Creates a new wrapper step d b e with the primary key. Does not add the wrapper step d b e to the database.
	*
	* @param wrapperStepDBEId the primary key for the new wrapper step d b e
	* @return the new wrapper step d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE create(
		long wrapperStepDBEId) {
		return getPersistence().create(wrapperStepDBEId);
	}

	/**
	* Removes the wrapper step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDBEId the primary key of the wrapper step d b e
	* @return the wrapper step d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE remove(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException {
		return getPersistence().remove(wrapperStepDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(wrapperStepDBE);
	}

	/**
	* Returns the wrapper step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException} if it could not be found.
	*
	* @param wrapperStepDBEId the primary key of the wrapper step d b e
	* @return the wrapper step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE findByPrimaryKey(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException {
		return getPersistence().findByPrimaryKey(wrapperStepDBEId);
	}

	/**
	* Returns the wrapper step d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param wrapperStepDBEId the primary key of the wrapper step d b e
	* @return the wrapper step d b e, or <code>null</code> if a wrapper step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDBE fetchByPrimaryKey(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(wrapperStepDBEId);
	}

	/**
	* Returns all the wrapper step d b es.
	*
	* @return the wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the wrapper step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @return the range of wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the wrapper step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the wrapper step d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of wrapper step d b es.
	*
	* @return the number of wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the step d b es associated with the wrapper step d b e.
	*
	* @param pk the primary key of the wrapper step d b e
	* @return the step d b es associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk);
	}

	/**
	* Returns a range of all the step d b es associated with the wrapper step d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the wrapper step d b e
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @return the range of step d b es associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk, start, end);
	}

	/**
	* Returns an ordered range of all the step d b es associated with the wrapper step d b e.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the wrapper step d b e
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of step d b es associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEs(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of step d b es associated with the wrapper step d b e.
	*
	* @param pk the primary key of the wrapper step d b e
	* @return the number of step d b es associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static int getStepDBEsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getStepDBEsSize(pk);
	}

	/**
	* Returns <code>true</code> if the step d b e is associated with the wrapper step d b e.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @return <code>true</code> if the step d b e is associated with the wrapper step d b e; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDBE(pk, stepDBEPK);
	}

	/**
	* Returns <code>true</code> if the wrapper step d b e has any step d b es associated with it.
	*
	* @param pk the primary key of the wrapper step d b e to check for associations with step d b es
	* @return <code>true</code> if the wrapper step d b e has any step d b es associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsStepDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsStepDBEs(pk);
	}

	/**
	* Adds an association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBE(pk, stepDBEPK);
	}

	/**
	* Adds an association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBE the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBE(pk, stepDBE);
	}

	/**
	* Adds an association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPKs the primary keys of the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Adds an association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEs the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addStepDBEs(pk, stepDBEs);
	}

	/**
	* Clears all associations between the wrapper step d b e and its step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e to clear the associated step d b es from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStepDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearStepDBEs(pk);
	}

	/**
	* Removes the association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPK the primary key of the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBE(long pk, long stepDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBE(pk, stepDBEPK);
	}

	/**
	* Removes the association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBE the step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBE(pk, stepDBE);
	}

	/**
	* Removes the association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPKs the primary keys of the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Removes the association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEs the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeStepDBEs(pk, stepDBEs);
	}

	/**
	* Sets the step d b es associated with the wrapper step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEPKs the primary keys of the step d b es to be associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDBEs(long pk, long[] stepDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDBEs(pk, stepDBEPKs);
	}

	/**
	* Sets the step d b es associated with the wrapper step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the wrapper step d b e
	* @param stepDBEs the step d b es to be associated with the wrapper step d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setStepDBEs(pk, stepDBEs);
	}

	public static WrapperStepDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (WrapperStepDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					WrapperStepDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(WrapperStepDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(WrapperStepDBEPersistence persistence) {
	}

	private static WrapperStepDBEPersistence _persistence;
}