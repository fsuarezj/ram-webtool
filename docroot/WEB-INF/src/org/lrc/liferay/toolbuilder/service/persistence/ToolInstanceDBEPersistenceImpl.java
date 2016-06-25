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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tool instance d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolInstanceDBEPersistence
 * @see ToolInstanceDBEUtil
 * @generated
 */
public class ToolInstanceDBEPersistenceImpl extends BasePersistenceImpl<ToolInstanceDBE>
	implements ToolInstanceDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ToolInstanceDBEUtil} to access the tool instance d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ToolInstanceDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOOLINSTANCEDBEID =
		new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByToolInstanceDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLINSTANCEDBEID =
		new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByToolInstanceDBEId", new String[] { Long.class.getName() },
			ToolInstanceDBEModelImpl.TOOLINSTANCEDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOOLINSTANCEDBEID = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByToolInstanceDBEId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tool instance d b es where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @return the matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByToolInstanceDBEId(long toolInstanceDBEId)
		throws SystemException {
		return findByToolInstanceDBEId(toolInstanceDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ToolInstanceDBE> findByToolInstanceDBEId(
		long toolInstanceDBEId, int start, int end) throws SystemException {
		return findByToolInstanceDBEId(toolInstanceDBEId, start, end, null);
	}

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
	@Override
	public List<ToolInstanceDBE> findByToolInstanceDBEId(
		long toolInstanceDBEId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLINSTANCEDBEID;
			finderArgs = new Object[] { toolInstanceDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOOLINSTANCEDBEID;
			finderArgs = new Object[] {
					toolInstanceDBEId,
					
					start, end, orderByComparator
				};
		}

		List<ToolInstanceDBE> list = (List<ToolInstanceDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstanceDBE toolInstanceDBE : list) {
				if ((toolInstanceDBEId != toolInstanceDBE.getToolInstanceDBEId())) {
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

			query.append(_SQL_SELECT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_TOOLINSTANCEDBEID_TOOLINSTANCEDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toolInstanceDBEId);

				if (!pagination) {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstanceDBE>(list);
				}
				else {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByToolInstanceDBEId_First(
		long toolInstanceDBEId, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByToolInstanceDBEId_First(toolInstanceDBEId,
				orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolInstanceDBEId=");
		msg.append(toolInstanceDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the first tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByToolInstanceDBEId_First(
		long toolInstanceDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ToolInstanceDBE> list = findByToolInstanceDBEId(toolInstanceDBEId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByToolInstanceDBEId_Last(
		long toolInstanceDBEId, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByToolInstanceDBEId_Last(toolInstanceDBEId,
				orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolInstanceDBEId=");
		msg.append(toolInstanceDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByToolInstanceDBEId_Last(
		long toolInstanceDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByToolInstanceDBEId(toolInstanceDBEId);

		if (count == 0) {
			return null;
		}

		List<ToolInstanceDBE> list = findByToolInstanceDBEId(toolInstanceDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the tool instance d b es where toolInstanceDBEId = &#63; from the database.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToolInstanceDBEId(long toolInstanceDBEId)
		throws SystemException {
		for (ToolInstanceDBE toolInstanceDBE : findByToolInstanceDBEId(
				toolInstanceDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstanceDBE);
		}
	}

	/**
	 * Returns the number of tool instance d b es where toolInstanceDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the tool instance d b e ID
	 * @return the number of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToolInstanceDBEId(long toolInstanceDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOOLINSTANCEDBEID;

		Object[] finderArgs = new Object[] { toolInstanceDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_TOOLINSTANCEDBEID_TOOLINSTANCEDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toolInstanceDBEId);

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

	private static final String _FINDER_COLUMN_TOOLINSTANCEDBEID_TOOLINSTANCEDBEID_2 =
		"toolInstanceDBE.toolInstanceDBEId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOOLDEFDBEID =
		new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByToolDefDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID =
		new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByToolDefDBEId",
			new String[] { Long.class.getName() },
			ToolInstanceDBEModelImpl.TOOLDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOOLDEFDBEID = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByToolDefDBEId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tool instance d b es where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByToolDefDBEId(long toolDefDBEId)
		throws SystemException {
		return findByToolDefDBEId(toolDefDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool instance d b es where toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool instance d b es
	 * @param end the upper bound of the range of tool instance d b es (not inclusive)
	 * @return the range of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByToolDefDBEId(long toolDefDBEId,
		int start, int end) throws SystemException {
		return findByToolDefDBEId(toolDefDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instance d b es where toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool instance d b es
	 * @param end the upper bound of the range of tool instance d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByToolDefDBEId(long toolDefDBEId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID;
			finderArgs = new Object[] { toolDefDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOOLDEFDBEID;
			finderArgs = new Object[] {
					toolDefDBEId,
					
					start, end, orderByComparator
				};
		}

		List<ToolInstanceDBE> list = (List<ToolInstanceDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstanceDBE toolInstanceDBE : list) {
				if ((toolDefDBEId != toolInstanceDBE.getToolDefDBEId())) {
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

			query.append(_SQL_SELECT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toolDefDBEId);

				if (!pagination) {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstanceDBE>(list);
				}
				else {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first tool instance d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByToolDefDBEId_First(long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByToolDefDBEId_First(toolDefDBEId,
				orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the first tool instance d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByToolDefDBEId_First(long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolInstanceDBE> list = findByToolDefDBEId(toolDefDBEId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByToolDefDBEId_Last(long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByToolDefDBEId_Last(toolDefDBEId,
				orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByToolDefDBEId_Last(long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByToolDefDBEId(toolDefDBEId);

		if (count == 0) {
			return null;
		}

		List<ToolInstanceDBE> list = findByToolDefDBEId(toolDefDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tool instance d b es before and after the current tool instance d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the primary key of the current tool instance d b e
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE[] findByToolDefDBEId_PrevAndNext(
		long toolInstanceDBEId, long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = findByPrimaryKey(toolInstanceDBEId);

		Session session = null;

		try {
			session = openSession();

			ToolInstanceDBE[] array = new ToolInstanceDBEImpl[3];

			array[0] = getByToolDefDBEId_PrevAndNext(session, toolInstanceDBE,
					toolDefDBEId, orderByComparator, true);

			array[1] = toolInstanceDBE;

			array[2] = getByToolDefDBEId_PrevAndNext(session, toolInstanceDBE,
					toolDefDBEId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ToolInstanceDBE getByToolDefDBEId_PrevAndNext(Session session,
		ToolInstanceDBE toolInstanceDBE, long toolDefDBEId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOOLINSTANCEDBE_WHERE);

		query.append(_FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2);

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
			query.append(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(toolDefDBEId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(toolInstanceDBE);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ToolInstanceDBE> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tool instance d b es where toolDefDBEId = &#63; from the database.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToolDefDBEId(long toolDefDBEId)
		throws SystemException {
		for (ToolInstanceDBE toolInstanceDBE : findByToolDefDBEId(
				toolDefDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstanceDBE);
		}
	}

	/**
	 * Returns the number of tool instance d b es where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the number of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToolDefDBEId(long toolDefDBEId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOOLDEFDBEID;

		Object[] finderArgs = new Object[] { toolDefDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toolDefDBEId);

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

	private static final String _FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2 = "toolInstanceDBE.toolDefDBEId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByG_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED,
			ToolInstanceDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_T",
			new String[] { Long.class.getName(), Long.class.getName() },
			ToolInstanceDBEModelImpl.GROUPID_COLUMN_BITMASK |
			ToolInstanceDBEModelImpl.TOOLDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tool instance d b es where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByG_T(long groupId, long toolDefDBEId)
		throws SystemException {
		return findByG_T(groupId, toolDefDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool instance d b es where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool instance d b es
	 * @param end the upper bound of the range of tool instance d b es (not inclusive)
	 * @return the range of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByG_T(long groupId, long toolDefDBEId,
		int start, int end) throws SystemException {
		return findByG_T(groupId, toolDefDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool instance d b es where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolInstanceDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool instance d b es
	 * @param end the upper bound of the range of tool instance d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findByG_T(long groupId, long toolDefDBEId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] { groupId, toolDefDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T;
			finderArgs = new Object[] {
					groupId, toolDefDBEId,
					
					start, end, orderByComparator
				};
		}

		List<ToolInstanceDBE> list = (List<ToolInstanceDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolInstanceDBE toolInstanceDBE : list) {
				if ((groupId != toolInstanceDBE.getGroupId()) ||
						(toolDefDBEId != toolInstanceDBE.getToolDefDBEId())) {
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

			query.append(_SQL_SELECT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TOOLDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(toolDefDBEId);

				if (!pagination) {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstanceDBE>(list);
				}
				else {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first tool instance d b e in the ordered set where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByG_T_First(long groupId, long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByG_T_First(groupId,
				toolDefDBEId, orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the first tool instance d b e in the ordered set where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByG_T_First(long groupId, long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolInstanceDBE> list = findByG_T(groupId, toolDefDBEId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByG_T_Last(long groupId, long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByG_T_Last(groupId,
				toolDefDBEId, orderByComparator);

		if (toolInstanceDBE != null) {
			return toolInstanceDBE;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolInstanceDBEException(msg.toString());
	}

	/**
	 * Returns the last tool instance d b e in the ordered set where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool instance d b e, or <code>null</code> if a matching tool instance d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByG_T_Last(long groupId, long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByG_T(groupId, toolDefDBEId);

		if (count == 0) {
			return null;
		}

		List<ToolInstanceDBE> list = findByG_T(groupId, toolDefDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tool instance d b es before and after the current tool instance d b e in the ordered set where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param toolInstanceDBEId the primary key of the current tool instance d b e
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE[] findByG_T_PrevAndNext(long toolInstanceDBEId,
		long groupId, long toolDefDBEId, OrderByComparator orderByComparator)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = findByPrimaryKey(toolInstanceDBEId);

		Session session = null;

		try {
			session = openSession();

			ToolInstanceDBE[] array = new ToolInstanceDBEImpl[3];

			array[0] = getByG_T_PrevAndNext(session, toolInstanceDBE, groupId,
					toolDefDBEId, orderByComparator, true);

			array[1] = toolInstanceDBE;

			array[2] = getByG_T_PrevAndNext(session, toolInstanceDBE, groupId,
					toolDefDBEId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ToolInstanceDBE getByG_T_PrevAndNext(Session session,
		ToolInstanceDBE toolInstanceDBE, long groupId, long toolDefDBEId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOOLINSTANCEDBE_WHERE);

		query.append(_FINDER_COLUMN_G_T_GROUPID_2);

		query.append(_FINDER_COLUMN_G_T_TOOLDEFDBEID_2);

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
			query.append(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(toolDefDBEId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(toolInstanceDBE);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ToolInstanceDBE> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tool instance d b es where groupId = &#63; and toolDefDBEId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByG_T(long groupId, long toolDefDBEId)
		throws SystemException {
		for (ToolInstanceDBE toolInstanceDBE : findByG_T(groupId, toolDefDBEId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolInstanceDBE);
		}
	}

	/**
	 * Returns the number of tool instance d b es where groupId = &#63; and toolDefDBEId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the number of matching tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByG_T(long groupId, long toolDefDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T;

		Object[] finderArgs = new Object[] { groupId, toolDefDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TOOLINSTANCEDBE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TOOLDEFDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(toolDefDBEId);

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

	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "toolInstanceDBE.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_TOOLDEFDBEID_2 = "toolInstanceDBE.toolDefDBEId = ?";

	public ToolInstanceDBEPersistenceImpl() {
		setModelClass(ToolInstanceDBE.class);
	}

	/**
	 * Caches the tool instance d b e in the entity cache if it is enabled.
	 *
	 * @param toolInstanceDBE the tool instance d b e
	 */
	@Override
	public void cacheResult(ToolInstanceDBE toolInstanceDBE) {
		EntityCacheUtil.putResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, toolInstanceDBE.getPrimaryKey(),
			toolInstanceDBE);

		toolInstanceDBE.resetOriginalValues();
	}

	/**
	 * Caches the tool instance d b es in the entity cache if it is enabled.
	 *
	 * @param toolInstanceDBEs the tool instance d b es
	 */
	@Override
	public void cacheResult(List<ToolInstanceDBE> toolInstanceDBEs) {
		for (ToolInstanceDBE toolInstanceDBE : toolInstanceDBEs) {
			if (EntityCacheUtil.getResult(
						ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
						ToolInstanceDBEImpl.class,
						toolInstanceDBE.getPrimaryKey()) == null) {
				cacheResult(toolInstanceDBE);
			}
			else {
				toolInstanceDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tool instance d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ToolInstanceDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ToolInstanceDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tool instance d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ToolInstanceDBE toolInstanceDBE) {
		EntityCacheUtil.removeResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, toolInstanceDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ToolInstanceDBE> toolInstanceDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ToolInstanceDBE toolInstanceDBE : toolInstanceDBEs) {
			EntityCacheUtil.removeResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
				ToolInstanceDBEImpl.class, toolInstanceDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tool instance d b e with the primary key. Does not add the tool instance d b e to the database.
	 *
	 * @param toolInstanceDBEId the primary key for the new tool instance d b e
	 * @return the new tool instance d b e
	 */
	@Override
	public ToolInstanceDBE create(long toolInstanceDBEId) {
		ToolInstanceDBE toolInstanceDBE = new ToolInstanceDBEImpl();

		toolInstanceDBE.setNew(true);
		toolInstanceDBE.setPrimaryKey(toolInstanceDBEId);

		return toolInstanceDBE;
	}

	/**
	 * Removes the tool instance d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param toolInstanceDBEId the primary key of the tool instance d b e
	 * @return the tool instance d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE remove(long toolInstanceDBEId)
		throws NoSuchToolInstanceDBEException, SystemException {
		return remove((Serializable)toolInstanceDBEId);
	}

	/**
	 * Removes the tool instance d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tool instance d b e
	 * @return the tool instance d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE remove(Serializable primaryKey)
		throws NoSuchToolInstanceDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ToolInstanceDBE toolInstanceDBE = (ToolInstanceDBE)session.get(ToolInstanceDBEImpl.class,
					primaryKey);

			if (toolInstanceDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchToolInstanceDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(toolInstanceDBE);
		}
		catch (NoSuchToolInstanceDBEException nsee) {
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
	protected ToolInstanceDBE removeImpl(ToolInstanceDBE toolInstanceDBE)
		throws SystemException {
		toolInstanceDBE = toUnwrappedModel(toolInstanceDBE);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(toolInstanceDBE)) {
				toolInstanceDBE = (ToolInstanceDBE)session.get(ToolInstanceDBEImpl.class,
						toolInstanceDBE.getPrimaryKeyObj());
			}

			if (toolInstanceDBE != null) {
				session.delete(toolInstanceDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (toolInstanceDBE != null) {
			clearCache(toolInstanceDBE);
		}

		return toolInstanceDBE;
	}

	@Override
	public ToolInstanceDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE)
		throws SystemException {
		toolInstanceDBE = toUnwrappedModel(toolInstanceDBE);

		boolean isNew = toolInstanceDBE.isNew();

		ToolInstanceDBEModelImpl toolInstanceDBEModelImpl = (ToolInstanceDBEModelImpl)toolInstanceDBE;

		Session session = null;

		try {
			session = openSession();

			if (toolInstanceDBE.isNew()) {
				session.save(toolInstanceDBE);

				toolInstanceDBE.setNew(false);
			}
			else {
				session.merge(toolInstanceDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ToolInstanceDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((toolInstanceDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLINSTANCEDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceDBEModelImpl.getOriginalToolInstanceDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLINSTANCEDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLINSTANCEDBEID,
					args);

				args = new Object[] {
						toolInstanceDBEModelImpl.getToolInstanceDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLINSTANCEDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLINSTANCEDBEID,
					args);
			}

			if ((toolInstanceDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceDBEModelImpl.getOriginalToolDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID,
					args);

				args = new Object[] { toolInstanceDBEModelImpl.getToolDefDBEId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID,
					args);
			}

			if ((toolInstanceDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolInstanceDBEModelImpl.getOriginalGroupId(),
						toolInstanceDBEModelImpl.getOriginalToolDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);

				args = new Object[] {
						toolInstanceDBEModelImpl.getGroupId(),
						toolInstanceDBEModelImpl.getToolDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
					args);
			}
		}

		EntityCacheUtil.putResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolInstanceDBEImpl.class, toolInstanceDBE.getPrimaryKey(),
			toolInstanceDBE);

		return toolInstanceDBE;
	}

	protected ToolInstanceDBE toUnwrappedModel(ToolInstanceDBE toolInstanceDBE) {
		if (toolInstanceDBE instanceof ToolInstanceDBEImpl) {
			return toolInstanceDBE;
		}

		ToolInstanceDBEImpl toolInstanceDBEImpl = new ToolInstanceDBEImpl();

		toolInstanceDBEImpl.setNew(toolInstanceDBE.isNew());
		toolInstanceDBEImpl.setPrimaryKey(toolInstanceDBE.getPrimaryKey());

		toolInstanceDBEImpl.setToolInstanceDBEId(toolInstanceDBE.getToolInstanceDBEId());
		toolInstanceDBEImpl.setGroupId(toolInstanceDBE.getGroupId());
		toolInstanceDBEImpl.setCompanyId(toolInstanceDBE.getCompanyId());
		toolInstanceDBEImpl.setUserId(toolInstanceDBE.getUserId());
		toolInstanceDBEImpl.setUserName(toolInstanceDBE.getUserName());
		toolInstanceDBEImpl.setCreateDate(toolInstanceDBE.getCreateDate());
		toolInstanceDBEImpl.setModifiedDate(toolInstanceDBE.getModifiedDate());
		toolInstanceDBEImpl.setToolDefDBEId(toolInstanceDBE.getToolDefDBEId());
		toolInstanceDBEImpl.setCompositeStepDBEId(toolInstanceDBE.getCompositeStepDBEId());
		toolInstanceDBEImpl.setToolTitle(toolInstanceDBE.getToolTitle());

		return toolInstanceDBEImpl;
	}

	/**
	 * Returns the tool instance d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool instance d b e
	 * @return the tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchToolInstanceDBEException, SystemException {
		ToolInstanceDBE toolInstanceDBE = fetchByPrimaryKey(primaryKey);

		if (toolInstanceDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchToolInstanceDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return toolInstanceDBE;
	}

	/**
	 * Returns the tool instance d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException} if it could not be found.
	 *
	 * @param toolInstanceDBEId the primary key of the tool instance d b e
	 * @return the tool instance d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE findByPrimaryKey(long toolInstanceDBEId)
		throws NoSuchToolInstanceDBEException, SystemException {
		return findByPrimaryKey((Serializable)toolInstanceDBEId);
	}

	/**
	 * Returns the tool instance d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool instance d b e
	 * @return the tool instance d b e, or <code>null</code> if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ToolInstanceDBE toolInstanceDBE = (ToolInstanceDBE)EntityCacheUtil.getResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
				ToolInstanceDBEImpl.class, primaryKey);

		if (toolInstanceDBE == _nullToolInstanceDBE) {
			return null;
		}

		if (toolInstanceDBE == null) {
			Session session = null;

			try {
				session = openSession();

				toolInstanceDBE = (ToolInstanceDBE)session.get(ToolInstanceDBEImpl.class,
						primaryKey);

				if (toolInstanceDBE != null) {
					cacheResult(toolInstanceDBE);
				}
				else {
					EntityCacheUtil.putResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
						ToolInstanceDBEImpl.class, primaryKey,
						_nullToolInstanceDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ToolInstanceDBEModelImpl.ENTITY_CACHE_ENABLED,
					ToolInstanceDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return toolInstanceDBE;
	}

	/**
	 * Returns the tool instance d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param toolInstanceDBEId the primary key of the tool instance d b e
	 * @return the tool instance d b e, or <code>null</code> if a tool instance d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolInstanceDBE fetchByPrimaryKey(long toolInstanceDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)toolInstanceDBEId);
	}

	/**
	 * Returns all the tool instance d b es.
	 *
	 * @return the tool instance d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolInstanceDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<ToolInstanceDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ToolInstanceDBE> findAll(int start, int end,
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

		List<ToolInstanceDBE> list = (List<ToolInstanceDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOOLINSTANCEDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOOLINSTANCEDBE;

				if (pagination) {
					sql = sql.concat(ToolInstanceDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolInstanceDBE>(list);
				}
				else {
					list = (List<ToolInstanceDBE>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the tool instance d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ToolInstanceDBE toolInstanceDBE : findAll()) {
			remove(toolInstanceDBE);
		}
	}

	/**
	 * Returns the number of tool instance d b es.
	 *
	 * @return the number of tool instance d b es
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

				Query q = session.createQuery(_SQL_COUNT_TOOLINSTANCEDBE);

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
	 * Initializes the tool instance d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.ToolInstanceDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ToolInstanceDBE>> listenersList = new ArrayList<ModelListener<ToolInstanceDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ToolInstanceDBE>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ToolInstanceDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOOLINSTANCEDBE = "SELECT toolInstanceDBE FROM ToolInstanceDBE toolInstanceDBE";
	private static final String _SQL_SELECT_TOOLINSTANCEDBE_WHERE = "SELECT toolInstanceDBE FROM ToolInstanceDBE toolInstanceDBE WHERE ";
	private static final String _SQL_COUNT_TOOLINSTANCEDBE = "SELECT COUNT(toolInstanceDBE) FROM ToolInstanceDBE toolInstanceDBE";
	private static final String _SQL_COUNT_TOOLINSTANCEDBE_WHERE = "SELECT COUNT(toolInstanceDBE) FROM ToolInstanceDBE toolInstanceDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "toolInstanceDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ToolInstanceDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ToolInstanceDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ToolInstanceDBEPersistenceImpl.class);
	private static ToolInstanceDBE _nullToolInstanceDBE = new ToolInstanceDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ToolInstanceDBE> toCacheModel() {
				return _nullToolInstanceDBECacheModel;
			}
		};

	private static CacheModel<ToolInstanceDBE> _nullToolInstanceDBECacheModel = new CacheModel<ToolInstanceDBE>() {
			@Override
			public ToolInstanceDBE toEntityModel() {
				return _nullToolInstanceDBE;
			}
		};
}