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
 * Provides the local service utility for Instance. This utility wraps
 * {@link org.lrc.liferay.toolbuilder.service.impl.InstanceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Fernando Suárez
 * @see InstanceLocalService
 * @see org.lrc.liferay.toolbuilder.service.base.InstanceLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.InstanceLocalServiceImpl
 * @generated
 */
public class InstanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.InstanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the instance to the database. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance addInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addInstance(instance);
	}

	/**
	* Creates a new instance with the primary key. Does not add the instance to the database.
	*
	* @param instanceId the primary key for the new instance
	* @return the new instance
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance createInstance(
		long instanceId) {
		return getService().createInstance(instanceId);
	}

	/**
	* Deletes the instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the instance
	* @return the instance that was removed
	* @throws PortalException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance deleteInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteInstance(instanceId);
	}

	/**
	* Deletes the instance from the database. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance deleteInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteInstance(instance);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.lrc.liferay.toolbuilder.model.Instance fetchInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchInstance(instanceId);
	}

	/**
	* Returns the instance with the primary key.
	*
	* @param instanceId the primary key of the instance
	* @return the instance
	* @throws PortalException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance getInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstance(instanceId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstances(start, end);
	}

	/**
	* Returns the number of instances.
	*
	* @return the number of instances
	* @throws SystemException if a system exception occurred
	*/
	public static int getInstancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstancesCount();
	}

	/**
	* Updates the instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param instance the instance
	* @return the instance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.Instance updateInstance(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInstance(instance);
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

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstances(groupId);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstances(groupId, start, end);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstances(groupId, name);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstances(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstances(groupId, name, start, end);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstancesByUser(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstancesByUser(userId);
	}

	public static java.util.List<org.lrc.liferay.toolbuilder.model.Instance> getInstancesByUser(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstancesByUser(userId, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static InstanceLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					InstanceLocalService.class.getName());

			if (invokableLocalService instanceof InstanceLocalService) {
				_service = (InstanceLocalService)invokableLocalService;
			}
			else {
				_service = new InstanceLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(InstanceLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(InstanceLocalService service) {
	}

	private static InstanceLocalService _service;
}