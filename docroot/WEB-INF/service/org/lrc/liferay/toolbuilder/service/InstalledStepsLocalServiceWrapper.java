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

package org.lrc.liferay.toolbuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InstalledStepsLocalService}.
 *
 * @author Fernando Suárez
 * @see InstalledStepsLocalService
 * @generated
 */
public class InstalledStepsLocalServiceWrapper
	implements InstalledStepsLocalService,
		ServiceWrapper<InstalledStepsLocalService> {
	public InstalledStepsLocalServiceWrapper(
		InstalledStepsLocalService installedStepsLocalService) {
		_installedStepsLocalService = installedStepsLocalService;
	}

	/**
	* Adds the installed steps to the database. Also notifies the appropriate model listeners.
	*
	* @param installedSteps the installed steps
	* @return the installed steps that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps addInstalledSteps(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.addInstalledSteps(installedSteps);
	}

	/**
	* Creates a new installed steps with the primary key. Does not add the installed steps to the database.
	*
	* @param type the primary key for the new installed steps
	* @return the new installed steps
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps createInstalledSteps(
		java.lang.String type) {
		return _installedStepsLocalService.createInstalledSteps(type);
	}

	/**
	* Deletes the installed steps with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps that was removed
	* @throws PortalException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps deleteInstalledSteps(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.deleteInstalledSteps(type);
	}

	/**
	* Deletes the installed steps from the database. Also notifies the appropriate model listeners.
	*
	* @param installedSteps the installed steps
	* @return the installed steps that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps deleteInstalledSteps(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.deleteInstalledSteps(installedSteps);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _installedStepsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps fetchInstalledSteps(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.fetchInstalledSteps(type);
	}

	/**
	* Returns the installed steps with the primary key.
	*
	* @param type the primary key of the installed steps
	* @return the installed steps
	* @throws PortalException if a installed steps with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps getInstalledSteps(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.getInstalledSteps(type);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.InstalledSteps> getInstalledStepses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.getInstalledStepses(start, end);
	}

	/**
	* Returns the number of installed stepses.
	*
	* @return the number of installed stepses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInstalledStepsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.getInstalledStepsesCount();
	}

	/**
	* Updates the installed steps in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param installedSteps the installed steps
	* @return the installed steps that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps updateInstalledSteps(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepsLocalService.updateInstalledSteps(installedSteps);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _installedStepsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_installedStepsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _installedStepsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InstalledStepsLocalService getWrappedInstalledStepsLocalService() {
		return _installedStepsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInstalledStepsLocalService(
		InstalledStepsLocalService installedStepsLocalService) {
		_installedStepsLocalService = installedStepsLocalService;
	}

	@Override
	public InstalledStepsLocalService getWrappedService() {
		return _installedStepsLocalService;
	}

	@Override
	public void setWrappedService(
		InstalledStepsLocalService installedStepsLocalService) {
		_installedStepsLocalService = installedStepsLocalService;
	}

	private InstalledStepsLocalService _installedStepsLocalService;
}