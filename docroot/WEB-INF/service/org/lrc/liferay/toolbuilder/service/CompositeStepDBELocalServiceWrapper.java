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
 * Provides a wrapper for {@link CompositeStepDBELocalService}.
 *
 * @author Fernando Suárez
 * @see CompositeStepDBELocalService
 * @generated
 */
public class CompositeStepDBELocalServiceWrapper
	implements CompositeStepDBELocalService,
		ServiceWrapper<CompositeStepDBELocalService> {
	public CompositeStepDBELocalServiceWrapper(
		CompositeStepDBELocalService compositeStepDBELocalService) {
		_compositeStepDBELocalService = compositeStepDBELocalService;
	}

	/**
	* Adds the composite step d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDBE the composite step d b e
	* @return the composite step d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE addCompositeStepDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.addCompositeStepDBE(compositeStepDBE);
	}

	/**
	* Creates a new composite step d b e with the primary key. Does not add the composite step d b e to the database.
	*
	* @param compositeStepDBEId the primary key for the new composite step d b e
	* @return the new composite step d b e
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE createCompositeStepDBE(
		long compositeStepDBEId) {
		return _compositeStepDBELocalService.createCompositeStepDBE(compositeStepDBEId);
	}

	/**
	* Deletes the composite step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDBEId the primary key of the composite step d b e
	* @return the composite step d b e that was removed
	* @throws PortalException if a composite step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE deleteCompositeStepDBE(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.deleteCompositeStepDBE(compositeStepDBEId);
	}

	/**
	* Deletes the composite step d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDBE the composite step d b e
	* @return the composite step d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE deleteCompositeStepDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.deleteCompositeStepDBE(compositeStepDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _compositeStepDBELocalService.dynamicQuery();
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
		return _compositeStepDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compositeStepDBELocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compositeStepDBELocalService.dynamicQuery(dynamicQuery, start,
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
		return _compositeStepDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _compositeStepDBELocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE fetchCompositeStepDBE(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.fetchCompositeStepDBE(compositeStepDBEId);
	}

	/**
	* Returns the composite step d b e with the primary key.
	*
	* @param compositeStepDBEId the primary key of the composite step d b e
	* @return the composite step d b e
	* @throws PortalException if a composite step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE getCompositeStepDBE(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException {
		return _compositeStepDBELocalService.getCompositeStepDBE(compositeStepDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the composite step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step d b es
	* @param end the upper bound of the range of composite step d b es (not inclusive)
	* @return the range of composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getCompositeStepDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getCompositeStepDBEs(start, end);
	}

	/**
	* Returns the number of composite step d b es.
	*
	* @return the number of composite step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompositeStepDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getCompositeStepDBEsCount();
	}

	/**
	* Updates the composite step d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDBE the composite step d b e
	* @return the composite step d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE updateCompositeStepDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.updateCompositeStepDBE(compositeStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBECompositeStepDBE(long stepDBEId,
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.addStepDBECompositeStepDBE(stepDBEId,
			compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBECompositeStepDBE(long stepDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.addStepDBECompositeStepDBE(stepDBEId,
			compositeStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBECompositeStepDBEs(long stepDBEId,
		long[] compositeStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.addStepDBECompositeStepDBEs(stepDBEId,
			compositeStepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBECompositeStepDBEs(long stepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> CompositeStepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.addStepDBECompositeStepDBEs(stepDBEId,
			CompositeStepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearStepDBECompositeStepDBEs(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.clearStepDBECompositeStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBECompositeStepDBE(long stepDBEId,
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.deleteStepDBECompositeStepDBE(stepDBEId,
			compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBECompositeStepDBE(long stepDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.deleteStepDBECompositeStepDBE(stepDBEId,
			compositeStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBECompositeStepDBEs(long stepDBEId,
		long[] compositeStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.deleteStepDBECompositeStepDBEs(stepDBEId,
			compositeStepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBECompositeStepDBEs(long stepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> CompositeStepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.deleteStepDBECompositeStepDBEs(stepDBEId,
			CompositeStepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getStepDBECompositeStepDBEs(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getStepDBECompositeStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getStepDBECompositeStepDBEs(
		long stepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getStepDBECompositeStepDBEs(stepDBEId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getStepDBECompositeStepDBEs(
		long stepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getStepDBECompositeStepDBEs(stepDBEId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepDBECompositeStepDBEsCount(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.getStepDBECompositeStepDBEsCount(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDBECompositeStepDBE(long stepDBEId,
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.hasStepDBECompositeStepDBE(stepDBEId,
			compositeStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDBECompositeStepDBEs(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDBELocalService.hasStepDBECompositeStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setStepDBECompositeStepDBEs(long stepDBEId,
		long[] compositeStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBELocalService.setStepDBECompositeStepDBEs(stepDBEId,
			compositeStepDBEIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _compositeStepDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_compositeStepDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _compositeStepDBELocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE addCompositeStepDBE(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.CompositeStepDBEException {
		return _compositeStepDBELocalService.addCompositeStepDBE(stepDefDBEId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CompositeStepDBELocalService getWrappedCompositeStepDBELocalService() {
		return _compositeStepDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCompositeStepDBELocalService(
		CompositeStepDBELocalService compositeStepDBELocalService) {
		_compositeStepDBELocalService = compositeStepDBELocalService;
	}

	@Override
	public CompositeStepDBELocalService getWrappedService() {
		return _compositeStepDBELocalService;
	}

	@Override
	public void setWrappedService(
		CompositeStepDBELocalService compositeStepDBELocalService) {
		_compositeStepDBELocalService = compositeStepDBELocalService;
	}

	private CompositeStepDBELocalService _compositeStepDBELocalService;
}