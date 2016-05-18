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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ToolInstance. This utility wraps
 * {@link org.lrc.liferay.toolbuilder.service.impl.ToolInstanceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Fernando Suárez
 * @see ToolInstanceLocalService
 * @see org.lrc.liferay.toolbuilder.service.base.ToolInstanceLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.ToolInstanceLocalServiceImpl
 * @generated
 */
public class ToolInstanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.ToolInstanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tool instance to the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance addToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addToolInstance(toolInstance);
	}

	/**
	* Creates a new tool instance with the primary key. Does not add the tool instance to the database.
	*
	* @param toolInstanceId the primary key for the new tool instance
	* @return the new tool instance
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance createToolInstance(
		long toolInstanceId) {
		return getService().createToolInstance(toolInstanceId);
	}

	/**
	* Deletes the tool instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceId the primary key of the tool instance
	* @return the tool instance that was removed
	* @throws PortalException if a tool instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance deleteToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteToolInstance(toolInstanceId);
	}

	/**
	* Deletes the tool instance from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance deleteToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteToolInstance(toolInstance);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.lrc.liferay.toolbuilder.model.ToolInstance fetchToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchToolInstance(toolInstanceId);
	}

	/**
	* Returns the tool instance with the primary key.
	*
	* @param toolInstanceId the primary key of the tool instance
	* @return the tool instance
	* @throws PortalException if a tool instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance getToolInstance(
		long toolInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstance(toolInstanceId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstances(start, end);
	}

	/**
	* Returns the number of tool instances.
	*
	* @return the number of tool instances
	* @throws SystemException if a system exception occurred
	*/
	public static int getToolInstancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstancesCount();
	}

	/**
	* Updates the tool instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param toolInstance the tool instance
	* @return the tool instance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.ToolInstance updateToolInstance(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateToolInstance(toolInstance);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstances(groupId);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstances(groupId, start, end);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstances(groupId, name);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstances(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstances(groupId, name, start, end);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstancesByUser(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstancesByUser(userId);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstance> getToolInstancesByUser(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getToolInstancesByUser(userId, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static ToolInstanceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ToolInstanceLocalService.class.getName());

			if (invokableLocalService instanceof ToolInstanceLocalService) {
				_service = (ToolInstanceLocalService)invokableLocalService;
			}
			else {
				_service = new ToolInstanceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ToolInstanceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ToolInstanceLocalService service) {
	}

	private static ToolInstanceLocalService _service;
}