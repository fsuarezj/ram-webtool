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
 * Provides a wrapper for {@link WrapperStepDBELocalService}.
 *
 * @author Fernando Suárez
 * @see WrapperStepDBELocalService
 * @generated
 */
public class WrapperStepDBELocalServiceWrapper
	implements WrapperStepDBELocalService,
		ServiceWrapper<WrapperStepDBELocalService> {
	public WrapperStepDBELocalServiceWrapper(
		WrapperStepDBELocalService wrapperStepDBELocalService) {
		_wrapperStepDBELocalService = wrapperStepDBELocalService;
	}

	/**
	* Adds the wrapper step d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDBE the wrapper step d b e
	* @return the wrapper step d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE addWrapperStepDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.addWrapperStepDBE(wrapperStepDBE);
	}

	/**
	* Creates a new wrapper step d b e with the primary key. Does not add the wrapper step d b e to the database.
	*
	* @param wrapperStepDBEId the primary key for the new wrapper step d b e
	* @return the new wrapper step d b e
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE createWrapperStepDBE(
		long wrapperStepDBEId) {
		return _wrapperStepDBELocalService.createWrapperStepDBE(wrapperStepDBEId);
	}

	/**
	* Deletes the wrapper step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDBEId the primary key of the wrapper step d b e
	* @return the wrapper step d b e that was removed
	* @throws PortalException if a wrapper step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE deleteWrapperStepDBE(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.deleteWrapperStepDBE(wrapperStepDBEId);
	}

	/**
	* Deletes the wrapper step d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDBE the wrapper step d b e
	* @return the wrapper step d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE deleteWrapperStepDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.deleteWrapperStepDBE(wrapperStepDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wrapperStepDBELocalService.dynamicQuery();
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
		return _wrapperStepDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wrapperStepDBELocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _wrapperStepDBELocalService.dynamicQuery(dynamicQuery, start,
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
		return _wrapperStepDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _wrapperStepDBELocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE fetchWrapperStepDBE(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.fetchWrapperStepDBE(wrapperStepDBEId);
	}

	/**
	* Returns the wrapper step d b e with the primary key.
	*
	* @param wrapperStepDBEId the primary key of the wrapper step d b e
	* @return the wrapper step d b e
	* @throws PortalException if a wrapper step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE getWrapperStepDBE(
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getWrapperStepDBE(wrapperStepDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the wrapper step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step d b es
	* @param end the upper bound of the range of wrapper step d b es (not inclusive)
	* @return the range of wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> getWrapperStepDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getWrapperStepDBEs(start, end);
	}

	/**
	* Returns the number of wrapper step d b es.
	*
	* @return the number of wrapper step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getWrapperStepDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getWrapperStepDBEsCount();
	}

	/**
	* Updates the wrapper step d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDBE the wrapper step d b e
	* @return the wrapper step d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE updateWrapperStepDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.updateWrapperStepDBE(wrapperStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBEWrapperStepDBE(long stepDBEId, long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.addStepDBEWrapperStepDBE(stepDBEId,
			wrapperStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBEWrapperStepDBE(long stepDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.addStepDBEWrapperStepDBE(stepDBEId,
			wrapperStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBEWrapperStepDBEs(long stepDBEId,
		long[] wrapperStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.addStepDBEWrapperStepDBEs(stepDBEId,
			wrapperStepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addStepDBEWrapperStepDBEs(long stepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> WrapperStepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.addStepDBEWrapperStepDBEs(stepDBEId,
			WrapperStepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearStepDBEWrapperStepDBEs(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.clearStepDBEWrapperStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBEWrapperStepDBE(long stepDBEId,
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.deleteStepDBEWrapperStepDBE(stepDBEId,
			wrapperStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBEWrapperStepDBE(long stepDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.deleteStepDBEWrapperStepDBE(stepDBEId,
			wrapperStepDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBEWrapperStepDBEs(long stepDBEId,
		long[] wrapperStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.deleteStepDBEWrapperStepDBEs(stepDBEId,
			wrapperStepDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteStepDBEWrapperStepDBEs(long stepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> WrapperStepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.deleteStepDBEWrapperStepDBEs(stepDBEId,
			WrapperStepDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> getStepDBEWrapperStepDBEs(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getStepDBEWrapperStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> getStepDBEWrapperStepDBEs(
		long stepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getStepDBEWrapperStepDBEs(stepDBEId,
			start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> getStepDBEWrapperStepDBEs(
		long stepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getStepDBEWrapperStepDBEs(stepDBEId,
			start, end, orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStepDBEWrapperStepDBEsCount(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.getStepDBEWrapperStepDBEsCount(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDBEWrapperStepDBE(long stepDBEId,
		long wrapperStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.hasStepDBEWrapperStepDBE(stepDBEId,
			wrapperStepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasStepDBEWrapperStepDBEs(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStepDBELocalService.hasStepDBEWrapperStepDBEs(stepDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setStepDBEWrapperStepDBEs(long stepDBEId,
		long[] wrapperStepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBELocalService.setStepDBEWrapperStepDBEs(stepDBEId,
			wrapperStepDBEIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wrapperStepDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wrapperStepDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wrapperStepDBELocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WrapperStepDBELocalService getWrappedWrapperStepDBELocalService() {
		return _wrapperStepDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWrapperStepDBELocalService(
		WrapperStepDBELocalService wrapperStepDBELocalService) {
		_wrapperStepDBELocalService = wrapperStepDBELocalService;
	}

	@Override
	public WrapperStepDBELocalService getWrappedService() {
		return _wrapperStepDBELocalService;
	}

	@Override
	public void setWrappedService(
		WrapperStepDBELocalService wrapperStepDBELocalService) {
		_wrapperStepDBELocalService = wrapperStepDBELocalService;
	}

	private WrapperStepDBELocalService _wrapperStepDBELocalService;
}