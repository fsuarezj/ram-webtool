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
 * Provides a wrapper for {@link ToolInstanceDBELocalService}.
 *
 * @author Fernando Suárez
 * @see ToolInstanceDBELocalService
 * @generated
 */
public class ToolInstanceDBELocalServiceWrapper
	implements ToolInstanceDBELocalService,
		ServiceWrapper<ToolInstanceDBELocalService> {
	public ToolInstanceDBELocalServiceWrapper(
		ToolInstanceDBELocalService toolInstanceDBELocalService) {
		_toolInstanceDBELocalService = toolInstanceDBELocalService;
	}

	/**
	* Adds the tool instance d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceDBE the tool instance d b e
	* @return the tool instance d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE addToolInstanceDBE(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.addToolInstanceDBE(toolInstanceDBE);
	}

	/**
	* Creates a new tool instance d b e with the primary key. Does not add the tool instance d b e to the database.
	*
	* @param toolInstanceDBEId the primary key for the new tool instance d b e
	* @return the new tool instance d b e
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE createToolInstanceDBE(
		long toolInstanceDBEId) {
		return _toolInstanceDBELocalService.createToolInstanceDBE(toolInstanceDBEId);
	}

	/**
	* Deletes the tool instance d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceDBEId the primary key of the tool instance d b e
	* @return the tool instance d b e that was removed
	* @throws PortalException if a tool instance d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE deleteToolInstanceDBE(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.deleteToolInstanceDBE(toolInstanceDBEId);
	}

	/**
	* Deletes the tool instance d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceDBE the tool instance d b e
	* @return the tool instance d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE deleteToolInstanceDBE(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.deleteToolInstanceDBE(toolInstanceDBE);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _toolInstanceDBELocalService.dynamicQuery();
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
		return _toolInstanceDBELocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _toolInstanceDBELocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _toolInstanceDBELocalService.dynamicQuery(dynamicQuery, start,
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
		return _toolInstanceDBELocalService.dynamicQueryCount(dynamicQuery);
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
		return _toolInstanceDBELocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE fetchToolInstanceDBE(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.fetchToolInstanceDBE(toolInstanceDBEId);
	}

	/**
	* Returns the tool instance d b e with the primary key.
	*
	* @param toolInstanceDBEId the primary key of the tool instance d b e
	* @return the tool instance d b e
	* @throws PortalException if a tool instance d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE getToolInstanceDBE(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException {
		return _toolInstanceDBELocalService.getToolInstanceDBE(toolInstanceDBEId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tool instance d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tool instance d b es
	* @param end the upper bound of the range of tool instance d b es (not inclusive)
	* @return the range of tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> getToolInstanceDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.getToolInstanceDBEs(start, end);
	}

	/**
	* Returns the number of tool instance d b es.
	*
	* @return the number of tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getToolInstanceDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.getToolInstanceDBEsCount();
	}

	/**
	* Updates the tool instance d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceDBE the tool instance d b e
	* @return the tool instance d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE updateToolInstanceDBE(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.updateToolInstanceDBE(toolInstanceDBE);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _toolInstanceDBELocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_toolInstanceDBELocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _toolInstanceDBELocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE addToolInstanceDBE(
		long toolDefDBEId, long compositeStepDBEId,
		com.liferay.faces.portal.context.LiferayFacesContext liferayFacesContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException {
		return _toolInstanceDBELocalService.addToolInstanceDBE(toolDefDBEId,
			compositeStepDBEId, liferayFacesContext);
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> getToolInstanceDBEs(
		long groupId, long toolDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBELocalService.getToolInstanceDBEs(groupId,
			toolDefDBEId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ToolInstanceDBELocalService getWrappedToolInstanceDBELocalService() {
		return _toolInstanceDBELocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedToolInstanceDBELocalService(
		ToolInstanceDBELocalService toolInstanceDBELocalService) {
		_toolInstanceDBELocalService = toolInstanceDBELocalService;
	}

	@Override
	public ToolInstanceDBELocalService getWrappedService() {
		return _toolInstanceDBELocalService;
	}

	@Override
	public void setWrappedService(
		ToolInstanceDBELocalService toolInstanceDBELocalService) {
		_toolInstanceDBELocalService = toolInstanceDBELocalService;
	}

	private ToolInstanceDBELocalService _toolInstanceDBELocalService;
}