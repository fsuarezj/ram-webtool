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
 * Provides a wrapper for {@link CompositeStepDefDBELocalService}.
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBELocalService
 * @generated
 */
public class CompositeStepDefDBELocalServiceWrapper
	implements CompositeStepDefDBELocalService,
		ServiceWrapper<CompositeStepDefDBELocalService> {
	public CompositeStepDefDBELocalServiceWrapper(
		CompositeStepDefDBELocalService compositeStepDefDBELocalService) {
		_compositeStepDefDBELocalService = compositeStepDefDBELocalService;
	}

	/**
	* Adds the composite step def d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE addCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.addCompositeStepDefDBE(compositeStepDefDBE);
	}

	/**
	* Creates a new composite step def d b e with the primary key. Does not add the composite step def d b e to the database.
	*
	* @param compositeStepDefDBEId the primary key for the new composite step def d b e
	* @return the new composite step def d b e
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE createCompositeStepDefDBE(
		long compositeStepDefDBEId) {
		return _compositeStepDefDBELocalService.createCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Deletes the composite step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e that was removed
	* @throws PortalException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE deleteCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.deleteCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Deletes the composite step def d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE deleteCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.deleteCompositeStepDefDBE(compositeStepDefDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _compositeStepDefDBELocalService.dynamicQuery();
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
		return _compositeStepDefDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compositeStepDefDBELocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _compositeStepDefDBELocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _compositeStepDefDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _compositeStepDefDBELocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE fetchCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.fetchCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Returns the composite step def d b e with the primary key.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e
	* @throws PortalException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE getCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getCompositeStepDefDBE(compositeStepDefDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the composite step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of composite step def d b es
	* @param end the upper bound of the range of composite step def d b es (not inclusive)
	* @return the range of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getCompositeStepDefDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getCompositeStepDefDBEs(start,
			end);
	}

	/**
	* Returns the number of composite step def d b es.
	*
	* @return the number of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCompositeStepDefDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getCompositeStepDefDBEsCount();
	}

	/**
	* Updates the composite step def d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE updateCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.updateCompositeStepDefDBE(compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.addStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.addStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.addStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> CompositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.addStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			CompositeStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearStepDefDBECompositeStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.clearStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.deleteStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.deleteStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.deleteStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> CompositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.deleteStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			CompositeStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepDefDBECompositeStepDefDBEsCount(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.getStepDefDBECompositeStepDefDBEsCount(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.hasStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDefDBECompositeStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _compositeStepDefDBELocalService.hasStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBELocalService.setStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _compositeStepDefDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_compositeStepDefDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _compositeStepDefDBELocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CompositeStepDefDBELocalService getWrappedCompositeStepDefDBELocalService() {
		return _compositeStepDefDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCompositeStepDefDBELocalService(
		CompositeStepDefDBELocalService compositeStepDefDBELocalService) {
		_compositeStepDefDBELocalService = compositeStepDefDBELocalService;
	}

	@Override
	public CompositeStepDefDBELocalService getWrappedService() {
		return _compositeStepDefDBELocalService;
	}

	@Override
	public void setWrappedService(
		CompositeStepDefDBELocalService compositeStepDefDBELocalService) {
		_compositeStepDefDBELocalService = compositeStepDefDBELocalService;
	}

	private CompositeStepDefDBELocalService _compositeStepDefDBELocalService;
}