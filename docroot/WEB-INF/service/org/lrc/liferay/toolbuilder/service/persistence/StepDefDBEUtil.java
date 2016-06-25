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

import org.lrc.liferay.toolbuilder.model.StepDefDBE;

import java.util.List;

/**
 * The persistence utility for the Step Definition service. This utility wraps {@link StepDefDBEPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDefDBEPersistence
 * @see StepDefDBEPersistenceImpl
 * @generated
 */
public class StepDefDBEUtil {
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
	public static void clearCache(StepDefDBE stepDefDBE) {
		getPersistence().clearCache(stepDefDBE);
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
	public static List<StepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StepDefDBE> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static StepDefDBE update(StepDefDBE stepDefDBE)
		throws SystemException {
		return getPersistence().update(stepDefDBE);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static StepDefDBE update(StepDefDBE stepDefDBE,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(stepDefDBE, serviceContext);
	}

	/**
	* Returns all the Step Definitions where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @return the matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStepDefDBEId(stepDefDBEId);
	}

	/**
	* Returns a range of all the Step Definitions where stepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDefDBEId the step def d b e ID
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStepDefDBEId(stepDefDBEId, start, end);
	}

	/**
	* Returns an ordered range of all the Step Definitions where stepDefDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stepDefDBEId the step def d b e ID
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findByStepDefDBEId(
		long stepDefDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStepDefDBEId(stepDefDBEId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE findByStepDefDBEId_First(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException {
		return getPersistence()
				   .findByStepDefDBEId_First(stepDefDBEId, orderByComparator);
	}

	/**
	* Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByStepDefDBEId_First(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStepDefDBEId_First(stepDefDBEId, orderByComparator);
	}

	/**
	* Returns the last Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE findByStepDefDBEId_Last(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException {
		return getPersistence()
				   .findByStepDefDBEId_Last(stepDefDBEId, orderByComparator);
	}

	/**
	* Returns the last Step Definition in the ordered set where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByStepDefDBEId_Last(
		long stepDefDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStepDefDBEId_Last(stepDefDBEId, orderByComparator);
	}

	/**
	* Removes all the Step Definitions where stepDefDBEId = &#63; from the database.
	*
	* @param stepDefDBEId the step def d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStepDefDBEId(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStepDefDBEId(stepDefDBEId);
	}

	/**
	* Returns the number of Step Definitions where stepDefDBEId = &#63;.
	*
	* @param stepDefDBEId the step def d b e ID
	* @return the number of matching Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStepDefDBEId(long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStepDefDBEId(stepDefDBEId);
	}

	/**
	* Caches the Step Definition in the entity cache if it is enabled.
	*
	* @param stepDefDBE the Step Definition
	*/
	public static void cacheResult(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE) {
		getPersistence().cacheResult(stepDefDBE);
	}

	/**
	* Caches the Step Definitions in the entity cache if it is enabled.
	*
	* @param stepDefDBEs the Step Definitions
	*/
	public static void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs) {
		getPersistence().cacheResult(stepDefDBEs);
	}

	/**
	* Creates a new Step Definition with the primary key. Does not add the Step Definition to the database.
	*
	* @param stepDefDBEId the primary key for the new Step Definition
	* @return the new Step Definition
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE create(
		long stepDefDBEId) {
		return getPersistence().create(stepDefDBEId);
	}

	/**
	* Removes the Step Definition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE remove(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException {
		return getPersistence().remove(stepDefDBEId);
	}

	public static org.lrc.liferay.toolbuilder.model.StepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(stepDefDBE);
	}

	/**
	* Returns the Step Definition with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException} if it could not be found.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition
	* @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE findByPrimaryKey(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException {
		return getPersistence().findByPrimaryKey(stepDefDBEId);
	}

	/**
	* Returns the Step Definition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stepDefDBEId the primary key of the Step Definition
	* @return the Step Definition, or <code>null</code> if a Step Definition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.lrc.liferay.toolbuilder.model.StepDefDBE fetchByPrimaryKey(
		long stepDefDBEId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(stepDefDBEId);
	}

	/**
	* Returns all the Step Definitions.
	*
	* @return the Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Step Definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Step Definitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Step Definitions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Step Definitions.
	*
	* @return the number of Step Definitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the composite step def d b es associated with the Step Definition.
	*
	* @param pk the primary key of the Step Definition
	* @return the composite step def d b es associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getCompositeStepDefDBEs(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCompositeStepDefDBEs(pk);
	}

	/**
	* Returns a range of all the composite step def d b es associated with the Step Definition.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the Step Definition
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @return the range of composite step def d b es associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getCompositeStepDefDBEs(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCompositeStepDefDBEs(pk, start, end);
	}

	/**
	* Returns an ordered range of all the composite step def d b es associated with the Step Definition.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the Step Definition
	* @param start the lower bound of the range of Step Definitions
	* @param end the upper bound of the range of Step Definitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of composite step def d b es associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> getCompositeStepDefDBEs(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getCompositeStepDefDBEs(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of composite step def d b es associated with the Step Definition.
	*
	* @param pk the primary key of the Step Definition
	* @return the number of composite step def d b es associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static int getCompositeStepDefDBEsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getCompositeStepDefDBEsSize(pk);
	}

	/**
	* Returns <code>true</code> if the composite step def d b e is associated with the Step Definition.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPK the primary key of the composite step def d b e
	* @return <code>true</code> if the composite step def d b e is associated with the Step Definition; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCompositeStepDefDBE(long pk,
		long compositeStepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsCompositeStepDefDBE(pk, compositeStepDefDBEPK);
	}

	/**
	* Returns <code>true</code> if the Step Definition has any composite step def d b es associated with it.
	*
	* @param pk the primary key of the Step Definition to check for associations with composite step def d b es
	* @return <code>true</code> if the Step Definition has any composite step def d b es associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsCompositeStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsCompositeStepDefDBEs(pk);
	}

	/**
	* Adds an association between the Step Definition and the composite step def d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPK the primary key of the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addCompositeStepDefDBE(long pk,
		long compositeStepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCompositeStepDefDBE(pk, compositeStepDefDBEPK);
	}

	/**
	* Adds an association between the Step Definition and the composite step def d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBE the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void addCompositeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCompositeStepDefDBE(pk, compositeStepDefDBE);
	}

	/**
	* Adds an association between the Step Definition and the composite step def d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPKs the primary keys of the composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addCompositeStepDefDBEs(long pk,
		long[] compositeStepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCompositeStepDefDBEs(pk, compositeStepDefDBEPKs);
	}

	/**
	* Adds an association between the Step Definition and the composite step def d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEs the composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void addCompositeStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> compositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addCompositeStepDefDBEs(pk, compositeStepDefDBEs);
	}

	/**
	* Clears all associations between the Step Definition and its composite step def d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition to clear the associated composite step def d b es from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearCompositeStepDefDBEs(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearCompositeStepDefDBEs(pk);
	}

	/**
	* Removes the association between the Step Definition and the composite step def d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPK the primary key of the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCompositeStepDefDBE(long pk,
		long compositeStepDefDBEPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCompositeStepDefDBE(pk, compositeStepDefDBEPK);
	}

	/**
	* Removes the association between the Step Definition and the composite step def d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBE the composite step def d b e
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCompositeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCompositeStepDefDBE(pk, compositeStepDefDBE);
	}

	/**
	* Removes the association between the Step Definition and the composite step def d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPKs the primary keys of the composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCompositeStepDefDBEs(long pk,
		long[] compositeStepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCompositeStepDefDBEs(pk, compositeStepDefDBEPKs);
	}

	/**
	* Removes the association between the Step Definition and the composite step def d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEs the composite step def d b es
	* @throws SystemException if a system exception occurred
	*/
	public static void removeCompositeStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> compositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeCompositeStepDefDBEs(pk, compositeStepDefDBEs);
	}

	/**
	* Sets the composite step def d b es associated with the Step Definition, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEPKs the primary keys of the composite step def d b es to be associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void setCompositeStepDefDBEs(long pk,
		long[] compositeStepDefDBEPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCompositeStepDefDBEs(pk, compositeStepDefDBEPKs);
	}

	/**
	* Sets the composite step def d b es associated with the Step Definition, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the Step Definition
	* @param compositeStepDefDBEs the composite step def d b es to be associated with the Step Definition
	* @throws SystemException if a system exception occurred
	*/
	public static void setCompositeStepDefDBEs(long pk,
		java.util.List<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> compositeStepDefDBEs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setCompositeStepDefDBEs(pk, compositeStepDefDBEs);
	}

	public static StepDefDBEPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (StepDefDBEPersistence)PortletBeanLocatorUtil.locate(org.lrc.liferay.toolbuilder.service.ClpSerializer.getServletContextName(),
					StepDefDBEPersistence.class.getName());

			ReferenceRegistry.registerReference(StepDefDBEUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(StepDefDBEPersistence persistence) {
	}

	private static StepDefDBEPersistence _persistence;
}