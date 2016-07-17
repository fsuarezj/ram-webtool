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
 * Provides a wrapper for {@link StepDBELocalService}.
 *
 * @author Fernando Suárez
 * @see StepDBELocalService
 * @generated
 */
public class StepDBELocalServiceWrapper implements StepDBELocalService,
	ServiceWrapper<StepDBELocalService> {
	public StepDBELocalServiceWrapper(StepDBELocalService stepDBELocalService) {
		_stepDBELocalService = stepDBELocalService;
	}

	/**
	* Adds the step d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE addStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.addStepDBE(stepDBE);
	}

	/**
	* Creates a new step d b e with the primary key. Does not add the step d b e to the database.
	*
	* @param stepDBEId the primary key for the new step d b e
	* @return the new step d b e
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE createStepDBE(
		long stepDBEId) {
		return _stepDBELocalService.createStepDBE(stepDBEId);
	}

	/**
	* Deletes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e that was removed
	* @throws PortalException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE deleteStepDBE(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.deleteStepDBE(stepDBEId);
	}

	/**
	* Deletes the step d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE deleteStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.deleteStepDBE(stepDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stepDBELocalService.dynamicQuery();
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
		return _stepDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepDBELocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _stepDBELocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _stepDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _stepDBELocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE fetchStepDBE(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.fetchStepDBE(stepDBEId);
	}

	/**
	* Returns the step d b e with the primary key.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e
	* @throws PortalException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE getStepDBE(long stepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException {
		return _stepDBELocalService.getStepDBE(stepDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @return the range of step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getStepDBEs(start, end);
	}

	/**
	* Returns the number of step d b es.
	*
	* @return the number of step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getStepDBEsCount();
	}

	/**
	* Updates the step d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE updateStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.updateStepDBE(stepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.addCompositeStepDBEStepDBE(compositeStepDBEId,
			stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCompositeStepDBEStepDBE(long compositeStepDBEId,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.addCompositeStepDBEStepDBE(compositeStepDBEId,
			stepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.addCompositeStepDBEStepDBEs(compositeStepDBEId,
			stepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addCompositeStepDBEStepDBEs(long compositeStepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> StepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.addCompositeStepDBEStepDBEs(compositeStepDBEId,
			StepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearCompositeStepDBEStepDBEs(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.clearCompositeStepDBEStepDBEs(compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.deleteCompositeStepDBEStepDBE(compositeStepDBEId,
			stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCompositeStepDBEStepDBE(long compositeStepDBEId,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.deleteCompositeStepDBEStepDBE(compositeStepDBEId,
			stepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.deleteCompositeStepDBEStepDBEs(compositeStepDBEId,
			stepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteCompositeStepDBEStepDBEs(long compositeStepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> StepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.deleteCompositeStepDBEStepDBEs(compositeStepDBEId,
			StepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getCompositeStepDBEStepDBEs(compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getCompositeStepDBEStepDBEs(compositeStepDBEId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getCompositeStepDBEStepDBEs(compositeStepDBEId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompositeStepDBEStepDBEsCount(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.getCompositeStepDBEStepDBEsCount(compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.hasCompositeStepDBEStepDBE(compositeStepDBEId,
			stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasCompositeStepDBEStepDBEs(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBELocalService.hasCompositeStepDBEStepDBEs(compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBELocalService.setCompositeStepDBEStepDBEs(compositeStepDBEId,
			stepDBEIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stepDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stepDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stepDBELocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE addStepDBE(
		java.lang.String stepType,
		com.liferay.faces.portal.context.LiferayFacesContext liferayFacesContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepException,
			org.lrc.liferay.toolbuilder.StepDBEException,
			org.lrc.liferay.toolbuilder.StepDefDBEException {
		return _stepDBELocalService.addStepDBE(stepType, liferayFacesContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StepDBELocalService getWrappedStepDBELocalService() {
		return _stepDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStepDBELocalService(
		StepDBELocalService stepDBELocalService) {
		_stepDBELocalService = stepDBELocalService;
	}

	@Override
	public StepDBELocalService getWrappedService() {
		return _stepDBELocalService;
	}

	@Override
	public void setWrappedService(StepDBELocalService stepDBELocalService) {
		_stepDBELocalService = stepDBELocalService;
	}

	private StepDBELocalService _stepDBELocalService;
}