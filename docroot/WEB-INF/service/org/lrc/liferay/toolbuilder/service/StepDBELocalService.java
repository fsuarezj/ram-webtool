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
 * Provides the local service interface for StepDBE. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Fernando Suárez
 * @see StepDBELocalServiceUtil
 * @see org.lrc.liferay.toolbuilder.service.base.StepDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.impl.StepDBELocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StepDBELocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StepDBELocalServiceUtil} to access the step d b e local service. Add custom service methods to {@link org.lrc.liferay.toolbuilder.service.impl.StepDBELocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the step d b e to the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.lrc.liferay.toolbuilder.model.StepDBE addStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new step d b e with the primary key. Does not add the step d b e to the database.
	*
	* @param stepDBEId the primary key for the new step d b e
	* @return the new step d b e
	*/
	public org.lrc.liferay.toolbuilder.model.StepDBE createStepDBE(
		long stepDBEId);

	/**
	* Deletes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e that was removed
	* @throws PortalException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.lrc.liferay.toolbuilder.model.StepDBE deleteStepDBE(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the step d b e from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public org.lrc.liferay.toolbuilder.model.StepDBE deleteStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public org.lrc.liferay.toolbuilder.model.StepDBE fetchStepDBE(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the step d b e with the primary key.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e
	* @throws PortalException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.lrc.liferay.toolbuilder.model.StepDBE getStepDBE(long stepDBEId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @return the range of step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of step d b es.
	*
	* @return the number of step d b es
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStepDBEsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the step d b e in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stepDBE the step d b e
	* @return the step d b e that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public org.lrc.liferay.toolbuilder.model.StepDBE updateStepDBE(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addCompositeStepDBEStepDBE(long compositeStepDBEId,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void addCompositeStepDBEStepDBEs(long compositeStepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> StepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void clearCompositeStepDBEStepDBEs(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCompositeStepDBEStepDBE(long compositeStepDBEId,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCompositeStepDBEStepDBEs(long compositeStepDBEId,
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> StepDBEs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getCompositeStepDBEStepDBEs(
		long compositeStepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCompositeStepDBEStepDBEsCount(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCompositeStepDBEStepDBE(long compositeStepDBEId,
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasCompositeStepDBEStepDBEs(long compositeStepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* @throws SystemException if a system exception occurred
	*/
	public void setCompositeStepDBEStepDBEs(long compositeStepDBEId,
		long[] stepDBEIds)
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

	public org.lrc.liferay.toolbuilder.model.StepDBE addStepDBE(
		java.lang.String stepType,
		com.liferay.faces.portal.context.LiferayFacesContext liferayFacesContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstalledStepException,
			org.lrc.liferay.toolbuilder.StepDBEException,
			org.lrc.liferay.toolbuilder.StepDefDBEException;
}