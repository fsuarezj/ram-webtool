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
 * Provides the local service utility for CompositeStepDefDBE. This utility wraps
 * {@link org.lrc.liferay.toolbuilder.service.impl.CompositeStepDefDBELocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBELocalService
 * @see org.lrc.liferay.toolbuilder.service.base.CompositeStepDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.CompositeStepDefDBELocalServiceImpl
 * @generated
 */
public class CompositeStepDefDBELocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.CompositeStepDefDBELocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the composite step def d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE addCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCompositeStepDefDBE(compositeStepDefDBE);
	}

	/**
	* Creates a new composite step def d b e with the primary key. Does not add the composite step def d b e to the database.
	*
	* @param compositeStepDefDBEId the primary key for the new composite step def d b e
	* @return the new composite step def d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE createCompositeStepDefDBE(
		long compositeStepDefDBEId) {
		return getService().createCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Deletes the composite step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e that was removed
	* @throws PortalException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE deleteCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Deletes the composite step def d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE deleteCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCompositeStepDefDBE(compositeStepDefDBE);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE fetchCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCompositeStepDefDBE(compositeStepDefDBEId);
	}

	/**
	* Returns the composite step def d b e with the primary key.
	*
	* @param compositeStepDefDBEId the primary key of the composite step def d b e
	* @return the composite step def d b e
	* @throws PortalException if a composite step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE getCompositeStepDefDBE(
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompositeStepDefDBE(compositeStepDefDBEId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getCompositeStepDefDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompositeStepDefDBEs(start, end);
	}

	/**
	* Returns the number of composite step def d b es.
	*
	* @return the number of composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int getCompositeStepDefDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompositeStepDefDBEsCount();
	}

	/**
	* Updates the composite step def d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compositeStepDefDBE the composite step def d b e
	* @return the composite step def d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE updateCompositeStepDefDBE(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCompositeStepDefDBE(compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBECompositeStepDefDBE(stepDefDBEId, compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void addStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> CompositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			CompositeStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void clearStepDefDBECompositeStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().clearStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBE);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> CompositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.deleteStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			CompositeStepDefDBEs);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStepDefDBECompositeStepDefDBEs(stepDefDBEId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getStepDefDBECompositeStepDefDBEs(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getStepDefDBECompositeStepDefDBEs(stepDefDBEId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static int getStepDefDBECompositeStepDefDBEsCount(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getStepDefDBECompositeStepDefDBEsCount(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStepDefDBECompositeStepDefDBE(long stepDefDBEId,
		long compositeStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .hasStepDefDBECompositeStepDefDBE(stepDefDBEId,
			compositeStepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static boolean hasStepDefDBECompositeStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().hasStepDefDBECompositeStepDefDBEs(stepDefDBEId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	public static void setStepDefDBECompositeStepDefDBEs(long stepDefDBEId,
		long[] compositeStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService()
			.setStepDefDBECompositeStepDefDBEs(stepDefDBEId,
			compositeStepDefDBEIds);
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

	public static CompositeStepDefDBELocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CompositeStepDefDBELocalService.class.getName());

			if (invokableLocalService instanceof CompositeStepDefDBELocalService) {
				_service = (CompositeStepDefDBELocalService)invokableLocalService;
			}
			else {
				_service = new CompositeStepDefDBELocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CompositeStepDefDBELocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CompositeStepDefDBELocalService service) {
	}

	private static CompositeStepDefDBELocalService _service;
}