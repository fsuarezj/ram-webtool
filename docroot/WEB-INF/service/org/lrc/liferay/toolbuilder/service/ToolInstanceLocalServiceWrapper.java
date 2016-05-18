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
 * Provides a wrapper for {@link ToolInstanceLocalService}.
 *
 * @author Fernando Suárez
 * @see ToolInstanceLocalService
 * @generated
 */
public class ToolInstanceLocalServiceWrapper implements ToolInstanceLocalService,
	ServiceWrapper<ToolInstanceLocalService> {
	public ToolInstanceLocalServiceWrapper(
		ToolInstanceLocalService toolInstanceLocalService) {
		_toolInstanceLocalService = toolInstanceLocalService;
	}

	/**
	* Adds the tool instance to the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance addToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.addToolInstance(toolInstance);
	}

	/**
	* Creates a new tool instance with the primary key. Does not add the tool instance to the database.
	*
	* @param toolInstanceId the primary key for the new tool instance
	* @return the new tool instance
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance createToolInstance(
		long toolInstanceId) {
		return _toolInstanceLocalService.createToolInstance(toolInstanceId);
	}

	/**
	* Deletes the tool instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceId the primary key of the tool instance
	* @return the tool instance that was removed
	* @throws PortalException if a tool instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance deleteToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.deleteToolInstance(toolInstanceId);
	}

	/**
	* Deletes the tool instance from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance deleteToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.deleteToolInstance(toolInstance);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _toolInstanceLocalService.dynamicQuery();
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
		return _toolInstanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _toolInstanceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _toolInstanceLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _toolInstanceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _toolInstanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance fetchToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.fetchToolInstance(toolInstanceId);
	}

	/**
	* Returns the tool instance with the primary key.
	*
	* @param toolInstanceId the primary key of the tool instance
	* @return the tool instance
	* @throws PortalException if a tool instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance getToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstance(toolInstanceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tool instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tool instances
	* @param end the upper bound of the range of tool instances (not inclusive)
	* @return the range of tool instances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstances(start, end);
	}

	/**
	* Returns the number of tool instances.
	*
	* @return the number of tool instances
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getToolInstancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstancesCount();
	}

	/**
	* Updates the tool instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance updateToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.updateToolInstance(toolInstance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _toolInstanceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_toolInstanceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _toolInstanceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstances(groupId);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstances(groupId, start, end);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstances(groupId, name);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstances(groupId, name, start,
			end);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstancesByUser(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstancesByUser(userId);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstancesByUser(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceLocalService.getToolInstancesByUser(userId, start,
			end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ToolInstanceLocalService getWrappedToolInstanceLocalService() {
		return _toolInstanceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedToolInstanceLocalService(
		ToolInstanceLocalService toolInstanceLocalService) {
		_toolInstanceLocalService = toolInstanceLocalService;
	}

	@Override
	public ToolInstanceLocalService getWrappedService() {
		return _toolInstanceLocalService;
	}

	@Override
	public void setWrappedService(
		ToolInstanceLocalService toolInstanceLocalService) {
		_toolInstanceLocalService = toolInstanceLocalService;
	}

	private ToolInstanceLocalService _toolInstanceLocalService;
}