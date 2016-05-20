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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.lrc.liferay.toolbuilder.NoSuchToolInstanceException;
import org.lrc.liferay.toolbuilder.model.ToolInstance;
import org.lrc.liferay.toolbuilder.model.impl.ToolInstanceImpl;
import org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tool instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolInstancePersistence
 * @see ToolInstanceUtil
 * @generated
 */
public class ToolInstancePersistenceImpl extends BasePersistenceImpl<ToolInstance>
	implements ToolInstancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ToolInstanceUtil} to access the tool instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ToolInstanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			ToolInstanceModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tool instances where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool instances where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @return the range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instances where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<ToolInstance> list = (List<ToolInstance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstance toolInstance : list) {
				if ((groupId != toolInstance.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstance>(list);
				}
				else {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first tool instance in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByGroupId_First(groupId,
				orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the first tool instance in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByGroupId_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolInstance> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the last tool instance in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByGroupId_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<ToolInstance> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tool instances before and after the current tool instance in the ordered set where groupId = &#63;.
	 *
	 * @param toolInstanceId the primary key of the current tool instance
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance[] findByGroupId_PrevAndNext(long toolInstanceId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = findByPrimaryKey(toolInstanceId);

		Session session = null;

		try {
			session = openSession();

			ToolInstance[] array = new ToolInstanceImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, toolInstance, groupId,
					orderByComparator, true);

			array[1] = toolInstance;

			array[2] = getByGroupId_PrevAndNext(session, toolInstance, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ToolInstance getByGroupId_PrevAndNext(Session session,
		ToolInstance toolInstance, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(toolInstance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ToolInstance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tool instances where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByGroupId(long groupId) throws SystemException {
		for (ToolInstance toolInstance : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstance);
		}
	}

	/**
	 * Returns the number of tool instances where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByGroupId(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "toolInstance.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_N",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_N",
			new String[] { Long.class.getName(), String.class.getName() },
			ToolInstanceModelImpl.GROUPID_COLUMN_BITMASK |
			ToolInstanceModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_N = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_N",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the tool instances where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByG_N(long groupId, String name)
		throws SystemException {
		return findByG_N(groupId, name, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the tool instances where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @return the range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByG_N(long groupId, String name, int start,
		int end) throws SystemException {
		return findByG_N(groupId, name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instances where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByG_N(long groupId, String name, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N;
			finderArgs = new Object[] { groupId, name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_N;
			finderArgs = new Object[] {
					groupId, name,
					
					start, end, orderByComparator
				};
		}

		List<ToolInstance> list = (List<ToolInstance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstance toolInstance : list) {
				if ((groupId != toolInstance.getGroupId()) ||
						!Validator.equals(name, toolInstance.getName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstance>(list);
				}
				else {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first tool instance in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByG_N_First(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByG_N_First(groupId, name,
				orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the first tool instance in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByG_N_First(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolInstance> list = findByG_N(groupId, name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByG_N_Last(long groupId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByG_N_Last(groupId, name,
				orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the last tool instance in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByG_N_Last(long groupId, String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_N(groupId, name);

		if (count == 0) {
			return null;
		}

		List<ToolInstance> list = findByG_N(groupId, name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tool instances before and after the current tool instance in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param toolInstanceId the primary key of the current tool instance
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance[] findByG_N_PrevAndNext(long toolInstanceId,
		long groupId, String name, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = findByPrimaryKey(toolInstanceId);

		Session session = null;

		try {
			session = openSession();

			ToolInstance[] array = new ToolInstanceImpl[3];

			array[0] = getByG_N_PrevAndNext(session, toolInstance, groupId,
					name, orderByComparator, true);

			array[1] = toolInstance;

			array[2] = getByG_N_PrevAndNext(session, toolInstance, groupId,
					name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ToolInstance getByG_N_PrevAndNext(Session session,
		ToolInstance toolInstance, long groupId, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

		query.append(_FINDER_COLUMN_G_N_GROUPID_2);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_G_N_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_G_N_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_G_N_NAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(toolInstance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ToolInstance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tool instances where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_N(long groupId, String name)
		throws SystemException {
		for (ToolInstance toolInstance : findByG_N(groupId, name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstance);
		}
	}

	/**
	 * Returns the number of tool instances where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_N(long groupId, String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_N;

		Object[] finderArgs = new Object[] { groupId, name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_G_N_GROUPID_2);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_G_N_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_N_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_G_N_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_N_GROUPID_2 = "toolInstance.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_N_NAME_1 = "toolInstance.name IS NULL";
	private static final String _FINDER_COLUMN_G_N_NAME_2 = "toolInstance.name = ?";
	private static final String _FINDER_COLUMN_G_N_NAME_3 = "(toolInstance.name IS NULL OR toolInstance.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, ToolInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserId",
			new String[] { Long.class.getName() },
			ToolInstanceModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tool instances where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByUserId(long userId)
		throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool instances where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @return the range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instances where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<ToolInstance> list = (List<ToolInstance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstance toolInstance : list) {
				if ((userId != toolInstance.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstance>(list);
				}
				else {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first tool instance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByUserId_First(userId,
				orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the first tool instance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByUserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolInstance> list = findByUserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByUserId_Last(userId, orderByComparator);

		if (toolInstance != null) {
			return toolInstance;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceException(msg.toString());
	}

	/**
	 * Returns the last tool instance in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance, or <code>null</code> if a matching tool instance could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByUserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUserId(userId);

		if (count == 0) {
			return null;
		}

		List<ToolInstance> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tool instances before and after the current tool instance in the ordered set where userId = &#63;.
	 *
	 * @param toolInstanceId the primary key of the current tool instance
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance[] findByUserId_PrevAndNext(long toolInstanceId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = findByPrimaryKey(toolInstanceId);

		Session session = null;

		try {
			session = openSession();

			ToolInstance[] array = new ToolInstanceImpl[3];

			array[0] = getByUserId_PrevAndNext(session, toolInstance, userId,
					orderByComparator, true);

			array[1] = toolInstance;

			array[2] = getByUserId_PrevAndNext(session, toolInstance, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ToolInstance getByUserId_PrevAndNext(Session session,
		ToolInstance toolInstance, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOOLINSTANCE_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ToolInstanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(toolInstance);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ToolInstance> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tool instances where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUserId(long userId) throws SystemException {
		for (ToolInstance toolInstance : findByUserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstance);
		}
	}

	/**
	 * Returns the number of tool instances where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOOLINSTANCE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "toolInstance.userId = ?";

	public ToolInstancePersistenceImpl() {
		setModelClass(ToolInstance.class);
	}

	/**
	 * Caches the tool instance in the entity cache if it is enabled.
	 *
	 * @param toolInstance the tool instance
	 */
	@Override
	public void cacheResult(ToolInstance toolInstance) {
		EntityCacheUtil.putResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceImpl.class, toolInstance.getPrimaryKey(), toolInstance);

		toolInstance.resetOriginalValues();
	}

	/**
	 * Caches the tool instances in the entity cache if it is enabled.
	 *
	 * @param toolInstances the tool instances
	 */
	@Override
	public void cacheResult(List<ToolInstance> toolInstances) {
		for (ToolInstance toolInstance : toolInstances) {
			if (EntityCacheUtil.getResult(
						ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
						ToolInstanceImpl.class, toolInstance.getPrimaryKey()) == null) {
				cacheResult(toolInstance);
			}
			else {
				toolInstance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tool instances.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ToolInstanceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ToolInstanceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tool instance.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ToolInstance toolInstance) {
		EntityCacheUtil.removeResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceImpl.class, toolInstance.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ToolInstance> toolInstances) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ToolInstance toolInstance : toolInstances) {
			EntityCacheUtil.removeResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
				ToolInstanceImpl.class, toolInstance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tool instance with the primary key. Does not add the tool instance to the database.
	 *
	 * @param toolInstanceId the primary key for the new tool instance
	 * @return the new tool instance
	 */
	@Override
	public ToolInstance create(long toolInstanceId) {
		ToolInstance toolInstance = new ToolInstanceImpl();

		toolInstance.setNew(true);
		toolInstance.setPrimaryKey(toolInstanceId);

		return toolInstance;
	}

	/**
	 * Removes the tool instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param toolInstanceId the primary key of the tool instance
	 * @return the tool instance that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance remove(long toolInstanceId)
		throws NoSuchToolInstanceException, SystemException {
		return remove((Serializable)toolInstanceId);
	}

	/**
	 * Removes the tool instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tool instance
	 * @return the tool instance that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance remove(Serializable primaryKey)
		throws NoSuchToolInstanceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ToolInstance toolInstance = (ToolInstance)session.get(ToolInstanceImpl.class,
					primaryKey);

			if (toolInstance == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchToolInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(toolInstance);
		}
		catch (NoSuchToolInstanceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ToolInstance removeImpl(ToolInstance toolInstance)
		throws SystemException {
		toolInstance = toUnwrappedModel(toolInstance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(toolInstance)) {
				toolInstance = (ToolInstance)session.get(ToolInstanceImpl.class,
						toolInstance.getPrimaryKeyObj());
			}

			if (toolInstance != null) {
				session.delete(toolInstance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (toolInstance != null) {
			clearCache(toolInstance);
		}

		return toolInstance;
	}

	@Override
	public ToolInstance updateImpl(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance)
		throws SystemException {
		toolInstance = toUnwrappedModel(toolInstance);

		boolean isNew = toolInstance.isNew();

		ToolInstanceModelImpl toolInstanceModelImpl = (ToolInstanceModelImpl)toolInstance;

		Session session = null;

		try {
			session = openSession();

			if (toolInstance.isNew()) {
				session.save(toolInstance);

				toolInstance.setNew(false);
			}
			else {
				session.merge(toolInstance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ToolInstanceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((toolInstanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { toolInstanceModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((toolInstanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceModelImpl.getOriginalGroupId(),
						toolInstanceModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
					args);

				args = new Object[] {
						toolInstanceModelImpl.getGroupId(),
						toolInstanceModelImpl.getName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_N, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_N,
					args);
			}

			if ((toolInstanceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { toolInstanceModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceImpl.class, toolInstance.getPrimaryKey(), toolInstance);

		return toolInstance;
	}

	protected ToolInstance toUnwrappedModel(ToolInstance toolInstance) {
		if (toolInstance instanceof ToolInstanceImpl) {
			return toolInstance;
		}

		ToolInstanceImpl toolInstanceImpl = new ToolInstanceImpl();

		toolInstanceImpl.setNew(toolInstance.isNew());
		toolInstanceImpl.setPrimaryKey(toolInstance.getPrimaryKey());

		toolInstanceImpl.setGroupId(toolInstance.getGroupId());
		toolInstanceImpl.setCompanyId(toolInstance.getCompanyId());
		toolInstanceImpl.setUserId(toolInstance.getUserId());
		toolInstanceImpl.setUserName(toolInstance.getUserName());
		toolInstanceImpl.setCreateDate(toolInstance.getCreateDate());
		toolInstanceImpl.setModifiedDate(toolInstance.getModifiedDate());
		toolInstanceImpl.setName(toolInstance.getName());
		toolInstanceImpl.setToolInstanceId(toolInstance.getToolInstanceId());
		toolInstanceImpl.setWrapperStepId(toolInstance.getWrapperStepId());

		return toolInstanceImpl;
	}

	/**
	 * Returns the tool instance with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool instance
	 * @return the tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchToolInstanceException, SystemException {
		ToolInstance toolInstance = fetchByPrimaryKey(primaryKey);

		if (toolInstance == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchToolInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return toolInstance;
	}

	/**
	 * Returns the tool instance with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolInstanceException} if it could not be found.
	 *
	 * @param toolInstanceId the primary key of the tool instance
	 * @return the tool instance
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceException if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance findByPrimaryKey(long toolInstanceId)
		throws NoSuchToolInstanceException, SystemException {
		return findByPrimaryKey((Serializable)toolInstanceId);
	}

	/**
	 * Returns the tool instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool instance
	 * @return the tool instance, or <code>null</code> if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ToolInstance toolInstance = (ToolInstance)EntityCacheUtil.getResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
				ToolInstanceImpl.class, primaryKey);

		if (toolInstance == _nullToolInstance) {
			return null;
		}

		if (toolInstance == null) {
			Session session = null;

			try {
				session = openSession();

				toolInstance = (ToolInstance)session.get(ToolInstanceImpl.class,
						primaryKey);

				if (toolInstance != null) {
					cacheResult(toolInstance);
				}
				else {
					EntityCacheUtil.putResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
						ToolInstanceImpl.class, primaryKey, _nullToolInstance);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ToolInstanceModelImpl.ENTITY_CACHE_ENABLED,
					ToolInstanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return toolInstance;
	}

	/**
	 * Returns the tool instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param toolInstanceId the primary key of the tool instance
	 * @return the tool instance, or <code>null</code> if a tool instance with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstance fetchByPrimaryKey(long toolInstanceId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)toolInstanceId);
	}

	/**
	 * Returns all the tool instances.
	 *
	 * @return the tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @return the range of tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tool instances
	 * @param end the upper bound of the range of tool instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstance> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ToolInstance> list = (List<ToolInstance>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOOLINSTANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOOLINSTANCE;

				if (pagination) {
					sql = sql.concat(ToolInstanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstance>(list);
				}
				else {
					list = (List<ToolInstance>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tool instances from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ToolInstance toolInstance : findAll()) {
			remove(toolInstance);
		}
	}

	/**
	 * Returns the number of tool instances.
	 *
	 * @return the number of tool instances
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TOOLINSTANCE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the tool instance persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.ToolInstance")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ToolInstance>> listenersList = new ArrayList<ModelListener<ToolInstance>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ToolInstance>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ToolInstanceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOOLINSTANCE = "SELECT toolInstance FROM ToolInstance toolInstance";
	private static final String _SQL_SELECT_TOOLINSTANCE_WHERE = "SELECT toolInstance FROM ToolInstance toolInstance WHERE ";
	private static final String _SQL_COUNT_TOOLINSTANCE = "SELECT COUNT(toolInstance) FROM ToolInstance toolInstance";
	private static final String _SQL_COUNT_TOOLINSTANCE_WHERE = "SELECT COUNT(toolInstance) FROM ToolInstance toolInstance WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "toolInstance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ToolInstance exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ToolInstance exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ToolInstancePersistenceImpl.class);
	private static ToolInstance _nullToolInstance = new ToolInstanceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ToolInstance> toCacheModel() {
				return _nullToolInstanceCacheModel;
			}
		};

	private static CacheModel<ToolInstance> _nullToolInstanceCacheModel = new CacheModel<ToolInstance>() {
			@Override
			public ToolInstance toEntityModel() {
				return _nullToolInstance;
			}
		};
}