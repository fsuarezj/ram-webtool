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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for WrapperStepDefDBE. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Fernando Suárez
 * @see WrapperStepDefDBELocalServiceUtil
 * @see org.lrc.liferay.toolbuilder.service.base.WrapperStepDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.WrapperStepDefDBELocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface WrapperStepDefDBELocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WrapperStepDefDBELocalServiceUtil} to access the wrapper step def d b e local service. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.WrapperStepDefDBELocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the wrapper step def d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE addWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new wrapper step def d b e with the primary key. Does not add the wrapper step def d b e to the database.
	*
	* @param wrapperStepDefDBEId the primary key for the new wrapper step def d b e
	* @return the new wrapper step def d b e
	*/
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE createWrapperStepDefDBE(
		long wrapperStepDefDBEId);

	/**
	* Deletes the wrapper step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e that was removed
	* @throws PortalException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE deleteWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the wrapper step def d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE deleteWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE fetchWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the wrapper step def d b e with the primary key.
	*
	* @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	* @return the wrapper step def d b e
	* @throws PortalException if a wrapper step def d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE getWrapperStepDefDBE(
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getWrapperStepDefDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of wrapper step def d b es.
	*
	* @return the number of wrapper step def d b es
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getWrapperStepDefDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the wrapper step def d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param wrapperStepDefDBE the wrapper step def d b e
	* @return the wrapper step def d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE updateWrapperStepDefDBE(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> WrapperStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void clearStepDefDBEWrapperStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> WrapperStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> getStepDefDBEWrapperStepDefDBEs(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStepDefDBEWrapperStepDefDBEsCount(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasStepDefDBEWrapperStepDefDBE(long stepDefDBEId,
		long wrapperStepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasStepDefDBEWrapperStepDefDBEs(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void setStepDefDBEWrapperStepDefDBEs(long stepDefDBEId,
		long[] wrapperStepDefDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;
}