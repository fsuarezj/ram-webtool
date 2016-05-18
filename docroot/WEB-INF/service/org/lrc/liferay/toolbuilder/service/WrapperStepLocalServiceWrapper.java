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
 * Provides a wrapper for {@link WrapperStepLocalService}.
 *
 * @author Fernando Suárez
 * @see WrapperStepLocalService
 * @generated
 */
public class WrapperStepLocalServiceWrapper implements WrapperStepLocalService,
	ServiceWrapper<WrapperStepLocalService> {
	public WrapperStepLocalServiceWrapper(
		WrapperStepLocalService wrapperStepLocalService) {
		_wrapperStepLocalService = wrapperStepLocalService;
	}

	/**
	* Adds the wrapper step to the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStep the wrapper step
	* @return the wrapper step that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep addWrapperStep(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.addWrapperStep(wrapperStep);
	}

	/**
	* Creates a new wrapper step with the primary key. Does not add the wrapper step to the database.
	*
	* @param wrapperStepId the primary key for the new wrapper step
	* @return the new wrapper step
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep createWrapperStep(
		long wrapperStepId) {
		return _wrapperStepLocalService.createWrapperStep(wrapperStepId);
	}

	/**
	* Deletes the wrapper step with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepId the primary key of the wrapper step
	* @return the wrapper step that was removed
	* @throws PortalException if a wrapper step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep deleteWrapperStep(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.deleteWrapperStep(wrapperStepId);
	}

	/**
	* Deletes the wrapper step from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStep the wrapper step
	* @return the wrapper step that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep deleteWrapperStep(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.deleteWrapperStep(wrapperStep);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wrapperStepLocalService.dynamicQuery();
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
		return _wrapperStepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wrapperStepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wrapperStepLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _wrapperStepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _wrapperStepLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep fetchWrapperStep(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.fetchWrapperStep(wrapperStepId);
	}

	/**
	* Returns the wrapper step with the primary key.
	*
	* @param wrapperStepId the primary key of the wrapper step
	* @return the wrapper step
	* @throws PortalException if a wrapper step with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep getWrapperStep(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.getWrapperStep(wrapperStepId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the wrapper steps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper steps
	* @param end the upper bound of the range of wrapper steps (not inclusive)
	* @return the range of wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStep> getWrapperSteps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.getWrapperSteps(start, end);
	}

	/**
	* Returns the number of wrapper steps.
	*
	* @return the number of wrapper steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWrapperStepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.getWrapperStepsCount();
	}

	/**
	* Updates the wrapper step in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wrapperStep the wrapper step
	* @return the wrapper step that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep updateWrapperStep(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepLocalService.updateWrapperStep(wrapperStep);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wrapperStepLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wrapperStepLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wrapperStepLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep getWrapperStepByPrimaryKey(
		long wrapperStepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchWrapperStepException {
		return _wrapperStepLocalService.getWrapperStepByPrimaryKey(wrapperStepId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WrapperStepLocalService getWrappedWrapperStepLocalService() {
		return _wrapperStepLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWrapperStepLocalService(
		WrapperStepLocalService wrapperStepLocalService) {
		_wrapperStepLocalService = wrapperStepLocalService;
	}

	@Override
	public WrapperStepLocalService getWrappedService() {
		return _wrapperStepLocalService;
	}

	@Override
	public void setWrappedService(
		WrapperStepLocalService wrapperStepLocalService) {
		_wrapperStepLocalService = wrapperStepLocalService;
	}

	private WrapperStepLocalService _wrapperStepLocalService;
}