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

package org.lrc.liferay.toolbuilder.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.lrc.liferay.toolbuilder.model.StepDBE;

import java.util.List;

/**
 * The persistence utility for the step d b e service. This utility wraps {@link StepDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDBEPersistence
 * @see StepDBEPersistenceImpl
 * @generated
 */
public class StepDBEUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(StepDBE stepDBE) {
		getPersistence().clearCache(stepDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StepDBE> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StepDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StepDBE update(StepDBE stepDBE) throws SystemException {
		return getPersistence().update(stepDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StepDBE update(StepDBE stepDBE, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(stepDBE, serviceContext);
	}

	/**
	* Returns all the step d b es where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @return the matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStepDBEId(stepDBEId);
	}

	/**
	* Returns a range of all the step d b es where stepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDBEId the step d b e ID
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @return the range of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStepDBEId(stepDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the step d b es where stepDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDBEId the step d b e ID
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findByStepDBEId(
		long stepDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStepDBEId(stepDBEId, start, end, orderByComparator);
	}

	/**
	* Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE findByStepDBEId_First(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException {
		return getPersistence()
				   .findByStepDBEId_First(stepDBEId, orderByComparator);
	}

	/**
	* Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching step d b e, or <code>null</code> if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE fetchByStepDBEId_First(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStepDBEId_First(stepDBEId, orderByComparator);
	}

	/**
	* Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE findByStepDBEId_Last(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException {
		return getPersistence()
				   .findByStepDBEId_Last(stepDBEId, orderByComparator);
	}

	/**
	* Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching step d b e, or <code>null</code> if a matching step d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE fetchByStepDBEId_Last(
		long stepDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStepDBEId_Last(stepDBEId, orderByComparator);
	}

	/**
	* Removes all the step d b es where stepDBEId = &#63; from the database.
	*
	* @param stepDBEId the step d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStepDBEId(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStepDBEId(stepDBEId);
	}

	/**
	* Returns the number of step d b es where stepDBEId = &#63;.
	*
	* @param stepDBEId the step d b e ID
	* @return the number of matching step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStepDBEId(long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStepDBEId(stepDBEId);
	}

	/**
	* Caches the step d b e in the entity cache if it is enabled.
	*
	* @param stepDBE the step d b e
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE) {
		getPersistence().cacheResult(stepDBE);
	}

	/**
	* Caches the step d b es in the entity cache if it is enabled.
	*
	* @param stepDBEs the step d b es
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs) {
		getPersistence().cacheResult(stepDBEs);
	}

	/**
	* Creates a new step d b e with the primary key. Does not add the step d b e to the database.
	*
	* @param stepDBEId the primary key for the new step d b e
	* @return the new step d b e
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE create(
		long stepDBEId) {
		return getPersistence().create(stepDBEId);
	}

	/**
	* Removes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE remove(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException {
		return getPersistence().remove(stepDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.StepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(stepDBE);
	}

	/**
	* Returns the step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDBEException} if it could not be found.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE findByPrimaryKey(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDBEException {
		return getPersistence().findByPrimaryKey(stepDBEId);
	}

	/**
	* Returns the step d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stepDBEId the primary key of the step d b e
	* @return the step d b e, or <code>null</code> if a step d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDBE fetchByPrimaryKey(
		long stepDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(stepDBEId);
	}

	/**
	* Returns all the step d b es.
	*
	* @return the step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the step d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of step d b es
	* @param end the upper bound of the range of step d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the step d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of step d b es.
	*
	* @return the number of step d b es
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static StepDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StepDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					StepDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(StepDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StepDBEPersistence persistence) {
	}

	private static StepDBEPersistence _persistence;
}