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
 * Provides the local service utility for WrapperStepDefDBE. This utility wraps
 * {@link org.lrc.liferay.toolbuilder.service.impl.WrapperStepDefDBELocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Fernando Suárez
 * @see WrapperStepDefDBELocalService
 * @see org.lrc.liferay.toolbuilder.service.base.WrapperStepDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.WrapperStepDefDBELocalServiceImpl
 * @generated
 */
public class WrapperStepDefDBELocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.WrapperStepDefDBELocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the wrapper step def d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE addWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addWrapperStepDefDBE(wrapperStepDefDBE);
	}

	/**
	* Creates a new wrapper step def d b e with the primary key. Does not add the wrapper step def d b e to the database.
	*
	* @param wrapperStepDefDBEId the primary key for the new wrapper step def d b e
	* @return the new wrapper step def d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE createWrapperStepDefDBE(
		long wrapperStepDefDBEId) {
		return getService().createWrapperStepDefDBE(wrapperStepDefDBEId);
	}

	/**
	* Deletes the wrapper step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e that was removed
	* @throws PortalException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE deleteWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWrapperStepDefDBE(wrapperStepDefDBEId);
	}

	/**
	* Deletes the wrapper step def d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE deleteWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteWrapperStepDefDBE(wrapperStepDefDBE);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE fetchWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchWrapperStepDefDBE(wrapperStepDefDBEId);
	}

	/**
	* Returns the wrapper step def d b e with the primary key.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e
	* @throws PortalException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE getWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getWrapperStepDefDBE(wrapperStepDefDBEId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the wrapper step def d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of wrapper step def d b es
	* @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	* @return the range of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getWrapperStepDefDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWrapperStepDefDBEs(start, end);
	}

	/**
	* Returns the number of wrapper step def d b es.
	*
	* @return the number of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int getWrapperStepDefDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getWrapperStepDefDBEsCount();
	}

	/**
	* Updates the wrapper step def d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE updateWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateWrapperStepDefDBE(wrapperStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBEWrapperStepDefDBE(stepDefDBEId, wrapperStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBEWrapperStepDefDBE(stepDefDBEId, wrapperStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBEWrapperStepDefDBEs(stepDefDBEId, wrapperStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> WrapperStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBEWrapperStepDefDBEs(stepDefDBEId, WrapperStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStepDefDBEWrapperStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearStepDefDBEWrapperStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBEWrapperStepDefDBE(stepDefDBEId, wrapperStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBEWrapperStepDefDBE(stepDefDBEId, wrapperStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBEWrapperStepDefDBEs(stepDefDBEId,
			wrapperStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> WrapperStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBEWrapperStepDefDBEs(stepDefDBEId, WrapperStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStepDefDBEWrapperStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStepDefDBEWrapperStepDefDBEs(stepDefDBEId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStepDefDBEWrapperStepDefDBEs(stepDefDBEId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getStepDefDBEWrapperStepDefDBEsCount(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStepDefDBEWrapperStepDefDBEsCount(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasStepDefDBEWrapperStepDefDBE(stepDefDBEId,
			wrapperStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStepDefDBEWrapperStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStepDefDBEWrapperStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setStepDefDBEWrapperStepDefDBEs(stepDefDBEId, wrapperStepDefDBEIds);
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

	public static void clearService() {
		_service = null;
	}

	public static WrapperStepDefDBELocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					WrapperStepDefDBELocalService.class.getName());

			if (invokableLocalService instanceof WrapperStepDefDBELocalService) {
				_service = (WrapperStepDefDBELocalService)invokableLocalService;
			}
			else {
				_service = new WrapperStepDefDBELocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(WrapperStepDefDBELocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(WrapperStepDefDBELocalService service) {
	}

	private static WrapperStepDefDBELocalService _service;
}