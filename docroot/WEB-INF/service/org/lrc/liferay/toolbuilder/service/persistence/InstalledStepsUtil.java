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

import org.lrc.liferay.toolbuilder.model.InstalledSteps;

import java.util.List;

/**
 * The persistence utility for the installed steps service. This utility wraps {@link InstalledStepsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledStepsPersistence
 * @see InstalledStepsPersistenceImpl
 * @generated
 */
public class InstalledStepsUtil {
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
	public static void clearCache(InstalledSteps installedSteps) {
		getPersistence().clearCache(installedSteps);
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
	public static List<InstalledSteps> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InstalledSteps> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InstalledSteps> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InstalledSteps update(InstalledSteps installedSteps)
		throws SystemException {
		return getPersistence().update(installedSteps);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InstalledSteps update(InstalledSteps installedSteps,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(installedSteps, serviceContext);
	}

	/**
	* Returns the installed steps where type = &#63; or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	*
	* @param type the type
	* @return the matching installed steps
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps findByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException {
		return getPersistence().findByType(type);
	}

	/**
	* Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param type the type
	* @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByType(type);
	}

	/**
	* Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param type the type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByType(
		java.lang.String type, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByType(type, retrieveFromCache);
	}

	/**
	* Removes the installed steps where type = &#63; from the database.
	*
	* @param type the type
	* @return the installed steps that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps removeByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException {
		return getPersistence().removeByType(type);
	}

	/**
	* Returns the number of installed stepses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByType(type);
	}

	/**
	* Caches the installed steps in the entity cache if it is enabled.
	*
	* @param installedSteps the installed steps
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps) {
		getPersistence().cacheResult(installedSteps);
	}

	/**
	* Caches the installed stepses in the entity cache if it is enabled.
	*
	* @param installedStepses the installed stepses
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> installedStepses) {
		getPersistence().cacheResult(installedStepses);
	}

	/**
	* Creates a new installed steps with the primary key. Does not add the installed steps to the database.
	*
	* @param type the primary key for the new installed steps
	* @return the new installed steps
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps create(
		java.lang.String type) {
		return getPersistence().create(type);
	}

	/**
	* Removes the installed steps with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps remove(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException {
		return getPersistence().remove(type);
	}

	public static org.lrc.liferay.toolbuilder.model.InstalledSteps updateImpl(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(installedSteps);
	}

	/**
	* Returns the installed steps with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps findByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException {
		return getPersistence().findByPrimaryKey(type);
	}

	/**
	* Returns the installed steps with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps, or <code>null</code> if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(type);
	}

	/**
	* Returns all the installed stepses.
	*
	* @return the installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the installed stepses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of installed stepses
	* @param end the upper bound of the range of installed stepses (not inclusive)
	* @return the range of installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the installed stepses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of installed stepses
	* @param end the upper bound of the range of installed stepses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the installed stepses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of installed stepses.
	*
	* @return the number of installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InstalledStepsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InstalledStepsPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					InstalledStepsPersistence.class.getName());

			ReferenceRegistry.registerReference(InstalledStepsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InstalledStepsPersistence persistence) {
	}

	private static InstalledStepsPersistence _persistence;
}