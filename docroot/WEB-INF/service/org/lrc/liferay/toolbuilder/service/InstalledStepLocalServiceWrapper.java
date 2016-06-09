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
 * Provides a wrapper for {@link InstalledStepLocalService}.
 *
 * @author Fernando Suárez
 * @see InstalledStepLocalService
 * @generated
 */
public class InstalledStepLocalServiceWrapper
	implements InstalledStepLocalService,
		ServiceWrapper<InstalledStepLocalService> {
	public InstalledStepLocalServiceWrapper(
		InstalledStepLocalService installedStepLocalService) {
		_installedStepLocalService = installedStepLocalService;
	}

	/**
	* Adds the installed step to the database. Also notifies the appropriate model listeners.
	*
	* @param installedStep the installed step
	* @return the installed step that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep addInstalledStep(
		org.lrc.liferay.toolbuilder.model.InstalledStep installedStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.addInstalledStep(installedStep);
	}

	/**
	* Creates a new installed step with the primary key. Does not add the installed step to the database.
	*
	* @param stepType the primary key for the new installed step
	* @return the new installed step
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep createInstalledStep(
		java.lang.String stepType) {
		return _installedStepLocalService.createInstalledStep(stepType);
	}

	/**
	* Deletes the installed step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepType the primary key of the installed step
	* @return the installed step that was removed
	* @throws PortalException if a installed step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep deleteInstalledStep(
		java.lang.String stepType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.deleteInstalledStep(stepType);
	}

	/**
	* Deletes the installed step from the database. Also notifies the appropriate model listeners.
	*
	* @param installedStep the installed step
	* @return the installed step that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep deleteInstalledStep(
		org.lrc.liferay.toolbuilder.model.InstalledStep installedStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.deleteInstalledStep(installedStep);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _installedStepLocalService.dynamicQuery();
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
		return _installedStepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _installedStepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _installedStepLocalService.dynamicQuery(dynamicQuery, start,
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
		return _installedStepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _installedStepLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep fetchInstalledStep(
		java.lang.String stepType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.fetchInstalledStep(stepType);
	}

	/**
	* Returns the installed step with the primary key.
	*
	* @param stepType the primary key of the installed step
	* @return the installed step
	* @throws PortalException if a installed step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep getInstalledStep(
		java.lang.String stepType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.getInstalledStep(stepType);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the installed steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of installed steps
	* @param end the upper bound of the range of installed steps (not inclusive)
	* @return the range of installed steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.InstalledStep> getInstalledSteps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.getInstalledSteps(start, end);
	}

	/**
	* Returns the number of installed steps.
	*
	* @return the number of installed steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInstalledStepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.getInstalledStepsCount();
	}

	/**
	* Updates the installed step in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param installedStep the installed step
	* @return the installed step that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep updateInstalledStep(
		org.lrc.liferay.toolbuilder.model.InstalledStep installedStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStepLocalService.updateInstalledStep(installedStep);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _installedStepLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_installedStepLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _installedStepLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InstalledStepLocalService getWrappedInstalledStepLocalService() {
		return _installedStepLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInstalledStepLocalService(
		InstalledStepLocalService installedStepLocalService) {
		_installedStepLocalService = installedStepLocalService;
	}

	@Override
	public InstalledStepLocalService getWrappedService() {
		return _installedStepLocalService;
	}

	@Override
	public void setWrappedService(
		InstalledStepLocalService installedStepLocalService) {
		_installedStepLocalService = installedStepLocalService;
	}

	private InstalledStepLocalService _installedStepLocalService;
}