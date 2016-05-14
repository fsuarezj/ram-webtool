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

import com.liferay.portal.service.persistence.BasePersistence;

import org.lrc.liferay.toolbuilder.model.Instance;

/**
 * The persistence interface for the instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see InstancePersistenceImpl
 * @see InstanceUtil
 * @generated
 */
public interface InstancePersistence extends BasePersistence<Instance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstanceUtil} to access the instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the instances where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the instances where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @return the range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the instances where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first instance in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the first instance in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last instance in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the last instance in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the instances before and after the current instance in the ordered set where groupId = &#63;.
	*
	* @param instanceId the primary key of the current instance
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance[] findByGroupId_PrevAndNext(
		long instanceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Removes all the instances where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of instances where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the instances where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByG_N(
		long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the instances where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @return the range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByG_N(
		long groupId, java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the instances where groupId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param name the name
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByG_N(
		long groupId, java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first instance in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByG_N_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the first instance in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByG_N_First(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last instance in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByG_N_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the last instance in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByG_N_Last(
		long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the instances before and after the current instance in the ordered set where groupId = &#63; and name = &#63;.
	*
	* @param instanceId the primary key of the current instance
	* @param groupId the group ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance[] findByG_N_PrevAndNext(
		long instanceId, long groupId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Removes all the instances where groupId = &#63; and name = &#63; from the database.
	*
	* @param groupId the group ID
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of instances where groupId = &#63; and name = &#63;.
	*
	* @param groupId the group ID
	* @param name the name
	* @return the number of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_N(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the instances where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the instances where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @return the range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the instances where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first instance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the first instance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last instance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the last instance in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching instance, or <code>null</code> if a matching instance could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the instances before and after the current instance in the ordered set where userId = &#63;.
	*
	* @param instanceId the primary key of the current instance
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance[] findByUserId_PrevAndNext(
		long instanceId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Removes all the instances where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of instances where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching instances
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the instance in the entity cache if it is enabled.
	*
	* @param instance the instance
	*/
	public void cacheResult(org.lrc.liferay.toolbuilder.model.Instance instance);

	/**
	* Caches the instances in the entity cache if it is enabled.
	*
	* @param instances the instances
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.Instance> instances);

	/**
	* Creates a new instance with the primary key. Does not add the instance to the database.
	*
	* @param instanceId the primary key for the new instance
	* @return the new instance
	*/
	public org.lrc.liferay.toolbuilder.model.Instance create(long instanceId);

	/**
	* Removes the instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the instance
	* @return the instance that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance remove(long instanceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	public org.lrc.liferay.toolbuilder.model.Instance updateImpl(
		org.lrc.liferay.toolbuilder.model.Instance instance)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the instance with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstanceException} if it could not be found.
	*
	* @param instanceId the primary key of the instance
	* @return the instance
	* @throws org.lrc.liferay.toolbuilder.NoSuchInstanceException if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance findByPrimaryKey(
		long instanceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchInstanceException;

	/**
	* Returns the instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param instanceId the primary key of the instance
	* @return the instance, or <code>null</code> if a instance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.Instance fetchByPrimaryKey(
		long instanceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the instances.
	*
	* @return the instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of instances
	* @param end the upper bound of the range of instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of instances
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.Instance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the instances from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of instances.
	*
	* @return the number of instances
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}