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

import org.lrc.liferay.toolbuilder.model.ToolDefDBE;

import java.util.List;

/**
 * The persistence utility for the tool def d b e service. This utility wraps {@link ToolDefDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolDefDBEPersistence
 * @see ToolDefDBEPersistenceImpl
 * @generated
 */
public class ToolDefDBEUtil {
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
	public static void clearCache(ToolDefDBE toolDefDBE) {
		getPersistence().clearCache(toolDefDBE);
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
	public static List<ToolDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ToolDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ToolDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ToolDefDBE update(ToolDefDBE toolDefDBE)
		throws SystemException {
		return getPersistence().update(toolDefDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ToolDefDBE update(ToolDefDBE toolDefDBE,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(toolDefDBE, serviceContext);
	}

	/**
	* Returns all the tool def d b es where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @return the matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolDefDBEId(
		long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToolDefDBEId(toolDefDBEId);
	}

	/**
	* Returns a range of all the tool def d b es where toolDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @return the range of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolDefDBEId(
		long toolDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToolDefDBEId(toolDefDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the tool def d b es where toolDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolDefDBEId(
		long toolDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToolDefDBEId(toolDefDBEId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tool def d b e in the ordered set where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE findByToolDefDBEId_First(
		long toolDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence()
				   .findByToolDefDBEId_First(toolDefDBEId, orderByComparator);
	}

	/**
	* Returns the first tool def d b e in the ordered set where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE fetchByToolDefDBEId_First(
		long toolDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToolDefDBEId_First(toolDefDBEId, orderByComparator);
	}

	/**
	* Returns the last tool def d b e in the ordered set where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE findByToolDefDBEId_Last(
		long toolDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence()
				   .findByToolDefDBEId_Last(toolDefDBEId, orderByComparator);
	}

	/**
	* Returns the last tool def d b e in the ordered set where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE fetchByToolDefDBEId_Last(
		long toolDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToolDefDBEId_Last(toolDefDBEId, orderByComparator);
	}

	/**
	* Removes all the tool def d b es where toolDefDBEId = &#63; from the database.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToolDefDBEId(long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToolDefDBEId(toolDefDBEId);
	}

	/**
	* Returns the number of tool def d b es where toolDefDBEId = &#63;.
	*
	* @param toolDefDBEId the tool def d b e ID
	* @return the number of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToolDefDBEId(long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToolDefDBEId(toolDefDBEId);
	}

	/**
	* Returns all the tool def d b es where toolName = &#63;.
	*
	* @param toolName the tool name
	* @return the matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolName(
		java.lang.String toolName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToolName(toolName);
	}

	/**
	* Returns a range of all the tool def d b es where toolName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolName the tool name
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @return the range of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolName(
		java.lang.String toolName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToolName(toolName, start, end);
	}

	/**
	* Returns an ordered range of all the tool def d b es where toolName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolName the tool name
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findByToolName(
		java.lang.String toolName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToolName(toolName, start, end, orderByComparator);
	}

	/**
	* Returns the first tool def d b e in the ordered set where toolName = &#63;.
	*
	* @param toolName the tool name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE findByToolName_First(
		java.lang.String toolName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence().findByToolName_First(toolName, orderByComparator);
	}

	/**
	* Returns the first tool def d b e in the ordered set where toolName = &#63;.
	*
	* @param toolName the tool name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE fetchByToolName_First(
		java.lang.String toolName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToolName_First(toolName, orderByComparator);
	}

	/**
	* Returns the last tool def d b e in the ordered set where toolName = &#63;.
	*
	* @param toolName the tool name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE findByToolName_Last(
		java.lang.String toolName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence().findByToolName_Last(toolName, orderByComparator);
	}

	/**
	* Returns the last tool def d b e in the ordered set where toolName = &#63;.
	*
	* @param toolName the tool name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE fetchByToolName_Last(
		java.lang.String toolName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByToolName_Last(toolName, orderByComparator);
	}

	/**
	* Returns the tool def d b es before and after the current tool def d b e in the ordered set where toolName = &#63;.
	*
	* @param toolDefDBEId the primary key of the current tool def d b e
	* @param toolName the tool name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE[] findByToolName_PrevAndNext(
		long toolDefDBEId, java.lang.String toolName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence()
				   .findByToolName_PrevAndNext(toolDefDBEId, toolName,
			orderByComparator);
	}

	/**
	* Removes all the tool def d b es where toolName = &#63; from the database.
	*
	* @param toolName the tool name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToolName(java.lang.String toolName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToolName(toolName);
	}

	/**
	* Returns the number of tool def d b es where toolName = &#63;.
	*
	* @param toolName the tool name
	* @return the number of matching tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToolName(java.lang.String toolName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToolName(toolName);
	}

	/**
	* Caches the tool def d b e in the entity cache if it is enabled.
	*
	* @param toolDefDBE the tool def d b e
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.ToolDefDBE toolDefDBE) {
		getPersistence().cacheResult(toolDefDBE);
	}

	/**
	* Caches the tool def d b es in the entity cache if it is enabled.
	*
	* @param toolDefDBEs the tool def d b es
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> toolDefDBEs) {
		getPersistence().cacheResult(toolDefDBEs);
	}

	/**
	* Creates a new tool def d b e with the primary key. Does not add the tool def d b e to the database.
	*
	* @param toolDefDBEId the primary key for the new tool def d b e
	* @return the new tool def d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE create(
		long toolDefDBEId) {
		return getPersistence().create(toolDefDBEId);
	}

	/**
	* Removes the tool def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param toolDefDBEId the primary key of the tool def d b e
	* @return the tool def d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE remove(
		long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence().remove(toolDefDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.ToolDefDBE toolDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(toolDefDBE);
	}

	/**
	* Returns the tool def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException} if it could not be found.
	*
	* @param toolDefDBEId the primary key of the tool def d b e
	* @return the tool def d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE findByPrimaryKey(
		long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return getPersistence().findByPrimaryKey(toolDefDBEId);
	}

	/**
	* Returns the tool def d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param toolDefDBEId the primary key of the tool def d b e
	* @return the tool def d b e, or <code>null</code> if a tool def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolDefDBE fetchByPrimaryKey(
		long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(toolDefDBEId);
	}

	/**
	* Returns all the tool def d b es.
	*
	* @return the tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tool def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @return the range of tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tool def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tool def d b es
	* @param end the upper bound of the range of tool def d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolDefDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tool def d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tool def d b es.
	*
	* @return the number of tool def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ToolDefDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ToolDefDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					ToolDefDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(ToolDefDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ToolDefDBEPersistence persistence) {
	}

	private static ToolDefDBEPersistence _persistence;
}