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
 * Provides a wrapper for {@link InstanceLocalService}.
 *
 * @author Fernando Suárez
 * @see InstanceLocalService
 * @generated
 */
public class InstanceLocalServiceWrapper implements InstanceLocalService,
	ServiceWrapper<InstanceLocalService> {
	public InstanceLocalServiceWrapper(
		InstanceLocalService instanceLocalService) {
		_instanceLocalService = instanceLocalService;
	}

	/**
	* Adds the instance to the database. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance addInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.addInstance(instance);
	}

	/**
	* Creates a new instance with the primary key. Does not add the instance to the database.
	*
	* @param instanceId the primary key for the new instance
	* @return the new instance
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance createInstance(
		long instanceId) {
		return _instanceLocalService.createInstance(instanceId);
	}

	/**
	* Deletes the instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the instance
	* @return the instance that was removed
	* @throws PortalException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance deleteInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.deleteInstance(instanceId);
	}

	/**
	* Deletes the instance from the database. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance deleteInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.deleteInstance(instance);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _instanceLocalService.dynamicQuery();
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
		return _instanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _instanceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _instanceLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _instanceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _instanceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.Instance fetchInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.fetchInstance(instanceId);
	}

	/**
	* Returns the instance with the primary key.
	*
	* @param instanceId the primary key of the instance
	* @return the instance
	* @throws PortalException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance getInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstance(instanceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @return the range of instances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstances(start, end);
	}

	/**
	* Returns the number of instances.
	*
	* @return the number of instances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInstancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstancesCount();
	}

	/**
	* Updates the instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.Instance updateInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.updateInstance(instance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _instanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_instanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _instanceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstances(groupId);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstances(groupId, start, end);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstances(groupId, name);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstances(groupId, name, start, end);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstancesByUser(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstancesByUser(userId);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstancesByUser(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instanceLocalService.getInstancesByUser(userId, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InstanceLocalService getWrappedInstanceLocalService() {
		return _instanceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInstanceLocalService(
		InstanceLocalService instanceLocalService) {
		_instanceLocalService = instanceLocalService;
	}

	@Override
	public InstanceLocalService getWrappedService() {
		return _instanceLocalService;
	}

	@Override
	public void setWrappedService(InstanceLocalService instanceLocalService) {
		_instanceLocalService = instanceLocalService;
	}

	private InstanceLocalService _instanceLocalService;
}