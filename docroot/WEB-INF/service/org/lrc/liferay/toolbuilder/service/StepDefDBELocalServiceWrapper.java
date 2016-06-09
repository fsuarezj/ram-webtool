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
 * Provides a wrapper for {@link StepDefDBELocalService}.
 *
 * @author Fernando Suárez
 * @see StepDefDBELocalService
 * @generated
 */
public class StepDefDBELocalServiceWrapper implements StepDefDBELocalService,
	ServiceWrapper<StepDefDBELocalService> {
	public StepDefDBELocalServiceWrapper(
		StepDefDBELocalService stepDefDBELocalService) {
		_stepDefDBELocalService = stepDefDBELocalService;
	}

	/**
	* Adds the Step Definition to the database. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBE the Step Definition
	* @return the Step Definition that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE addStepDefDBE(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.addStepDefDBE(stepDefDBE);
	}

	/**
	* Creates a new Step Definition with the primary key. Does not add the Step Definition to the database.
	*
	* @param stepDefDBEId the primary key for the new Step Definition
	* @return the new Step Definition
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE createStepDefDBE(
		long stepDefDBEId) {
		return _stepDefDBELocalService.createStepDefDBE(stepDefDBEId);
	}

	/**
	* Deletes the Step Definition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition that was removed
	* @throws PortalException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE deleteStepDefDBE(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.deleteStepDefDBE(stepDefDBEId);
	}

	/**
	* Deletes the Step Definition from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBE the Step Definition
	* @return the Step Definition that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE deleteStepDefDBE(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.deleteStepDefDBE(stepDefDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stepDefDBELocalService.dynamicQuery();
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
		return _stepDefDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepDefDBELocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepDefDBELocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _stepDefDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _stepDefDBELocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE fetchStepDefDBE(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.fetchStepDefDBE(stepDefDBEId);
	}

	/**
	* Returns the Step Definition with the primary key.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition
	* @throws PortalException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE getStepDefDBE(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.getStepDefDBE(stepDefDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Step Definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.getStepDefDBEs(start, end);
	}

	/**
	* Returns the number of Step Definitions.
	*
	* @return the number of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepDefDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.getStepDefDBEsCount();
	}

	/**
	* Updates the Step Definition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBE the Step Definition
	* @return the Step Definition that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDefDBE updateStepDefDBE(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDefDBELocalService.updateStepDefDBE(stepDefDBE);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stepDefDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stepDefDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stepDefDBELocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StepDefDBELocalService getWrappedStepDefDBELocalService() {
		return _stepDefDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStepDefDBELocalService(
		StepDefDBELocalService stepDefDBELocalService) {
		_stepDefDBELocalService = stepDefDBELocalService;
	}

	@Override
	public StepDefDBELocalService getWrappedService() {
		return _stepDefDBELocalService;
	}

	@Override
	public void setWrappedService(StepDefDBELocalService stepDefDBELocalService) {
		_stepDefDBELocalService = stepDefDBELocalService;
	}

	private StepDefDBELocalService _stepDefDBELocalService;
}