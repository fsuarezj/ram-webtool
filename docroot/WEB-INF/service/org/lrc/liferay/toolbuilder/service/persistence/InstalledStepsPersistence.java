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

import org.lrc.liferay.toolbuilder.model.InstalledSteps;

/**
 * The persistence interface for the installed steps service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledStepsPersistenceImpl
 * @see InstalledStepsUtil
 * @generated
 */
public interface InstalledStepsPersistence extends BasePersistence<InstalledSteps> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstalledStepsUtil} to access the installed steps persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the installed steps where type = &#63; or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	*
	* @param type the type
	* @return the matching installed steps
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps findByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException;

	/**
	* Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param type the type
	* @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param type the type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByType(
		java.lang.String type, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the installed steps where type = &#63; from the database.
	*
	* @param type the type
	* @return the installed steps that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps removeByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException;

	/**
	* Returns the number of installed stepses where type = &#63;.
	*
	* @param type the type
	* @return the number of matching installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public int countByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the installed steps in the entity cache if it is enabled.
	*
	* @param installedSteps the installed steps
	*/
	public void cacheResult(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps);

	/**
	* Caches the installed stepses in the entity cache if it is enabled.
	*
	* @param installedStepses the installed stepses
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> installedStepses);

	/**
	* Creates a new installed steps with the primary key. Does not add the installed steps to the database.
	*
	* @param type the primary key for the new installed steps
	* @return the new installed steps
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps create(
		java.lang.String type);

	/**
	* Removes the installed steps with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps remove(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException;

	public org.lrc.liferay.toolbuilder.model.InstalledSteps updateImpl(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the installed steps with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps findByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException;

	/**
	* Returns the installed steps with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps, or <code>null</code> if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.InstalledSteps fetchByPrimaryKey(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the installed stepses.
	*
	* @return the installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the installed stepses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of installed stepses.
	*
	* @return the number of installed stepses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}