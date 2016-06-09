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

import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;

/**
 * The persistence interface for the tool instance d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolInstanceDBEPersistenceImpl
 * @see ToolInstanceDBEUtil
 * @generated
 */
public interface ToolInstanceDBEPersistence extends BasePersistence<ToolInstanceDBE> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ToolInstanceDBEUtil} to access the tool instance d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tool instance d b es where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @return the matching tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findByToolInstanceDBEId(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tool instance d b es where toolInstanceDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param start the lower bound of the range of tool instance d b es
	* @param end the upper bound of the range of tool instance d b es (not inclusive)
	* @return the range of matching tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findByToolInstanceDBEId(
		long toolInstanceDBEId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tool instance d b es where toolInstanceDBEId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param start the lower bound of the range of tool instance d b es
	* @param end the upper bound of the range of tool instance d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findByToolInstanceDBEId(
		long toolInstanceDBEId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool instance d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE findByToolInstanceDBEId_First(
		long toolInstanceDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;

	/**
	* Returns the first tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE fetchByToolInstanceDBEId_First(
		long toolInstanceDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool instance d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE findByToolInstanceDBEId_Last(
		long toolInstanceDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;

	/**
	* Returns the last tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE fetchByToolInstanceDBEId_Last(
		long toolInstanceDBEId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tool instance d b es where toolInstanceDBEId = &#63; from the database.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByToolInstanceDBEId(long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tool instance d b es where toolInstanceDBEId = &#63;.
	*
	* @param toolInstanceDBEId the tool instance d b e ID
	* @return the number of matching tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countByToolInstanceDBEId(long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tool instance d b e in the entity cache if it is enabled.
	*
	* @param toolInstanceDBE the tool instance d b e
	*/
	public void cacheResult(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE);

	/**
	* Caches the tool instance d b es in the entity cache if it is enabled.
	*
	* @param toolInstanceDBEs the tool instance d b es
	*/
	public void cacheResult(
		java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> toolInstanceDBEs);

	/**
	* Creates a new tool instance d b e with the primary key. Does not add the tool instance d b e to the database.
	*
	* @param toolInstanceDBEId the primary key for the new tool instance d b e
	* @return the new tool instance d b e
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE create(
		long toolInstanceDBEId);

	/**
	* Removes the tool instance d b e with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param toolInstanceDBEId the primary key of the tool instance d b e
	* @return the tool instance d b e that was removed
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE remove(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;

	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tool instance d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException} if it could not be found.
	*
	* @param toolInstanceDBEId the primary key of the tool instance d b e
	* @return the tool instance d b e
	* @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE findByPrimaryKey(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;

	/**
	* Returns the tool instance d b e with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param toolInstanceDBEId the primary key of the tool instance d b e
	* @return the tool instance d b e, or <code>null</code> if a tool instance d b e with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE fetchByPrimaryKey(
		long toolInstanceDBEId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tool instance d b es.
	*
	* @return the tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tool instance d b es.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tool instance d b es
	* @param end the upper bound of the range of tool instance d b es (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tool instance d b es from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tool instance d b es.
	*
	* @return the number of tool instance d b es
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}