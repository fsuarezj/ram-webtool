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

import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tool def d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolDefDBEPersistence
 * @see ToolDefDBEUtil
 * @generated
 */
public class ToolDefDBEPersistenceImpl extends BasePersistenceImpl<ToolDefDBE>
	implements ToolDefDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ToolDefDBEUtil} to access the tool def d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ToolDefDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, ToolDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, ToolDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOOLDEFDBEID =
		new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, ToolDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByToolDefDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID =
		new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, ToolDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByToolDefDBEId",
			new String[] { Long.class.getName() },
			ToolDefDBEModelImpl.TOOLDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOOLDEFDBEID = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByToolDefDBEId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tool def d b es where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the matching tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findByToolDefDBEId(long toolDefDBEId)
		throws SystemException {
		return findByToolDefDBEId(toolDefDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool def d b es where toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool def d b es
	 * @param end the upper bound of the range of tool def d b es (not inclusive)
	 * @return the range of matching tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findByToolDefDBEId(long toolDefDBEId, int start,
		int end) throws SystemException {
		return findByToolDefDBEId(toolDefDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool def d b es where toolDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param start the lower bound of the range of tool def d b es
	 * @param end the upper bound of the range of tool def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findByToolDefDBEId(long toolDefDBEId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<ToolDefDBE> list = (List<ToolDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ToolDefDBE toolDefDBE : list) {
				if ((toolDefDBEId != toolDefDBE.getToolDefDBEId())) {
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

			query.append(_SQL_SELECT_TOOLDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ToolDefDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toolDefDBEId);

				if (!pagination) {
					list = (List<ToolDefDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolDefDBE>(list);
				}
				else {
					list = (List<ToolDefDBE>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first tool def d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE findByToolDefDBEId_First(long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolDefDBEException, SystemException {
		ToolDefDBE toolDefDBE = fetchByToolDefDBEId_First(toolDefDBEId,
				orderByComparator);

		if (toolDefDBE != null) {
			return toolDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolDefDBEException(msg.toString());
	}

	/**
	 * Returns the first tool def d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByToolDefDBEId_First(long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ToolDefDBE> list = findByToolDefDBEId(toolDefDBEId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tool def d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE findByToolDefDBEId_Last(long toolDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchToolDefDBEException, SystemException {
		ToolDefDBE toolDefDBE = fetchByToolDefDBEId_Last(toolDefDBEId,
				orderByComparator);

		if (toolDefDBE != null) {
			return toolDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toolDefDBEId=");
		msg.append(toolDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchToolDefDBEException(msg.toString());
	}

	/**
	 * Returns the last tool def d b e in the ordered set where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByToolDefDBEId_Last(long toolDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByToolDefDBEId(toolDefDBEId);

		if (count == 0) {
			return null;
		}

		List<ToolDefDBE> list = findByToolDefDBEId(toolDefDBEId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the tool def d b es where toolDefDBEId = &#63; from the database.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToolDefDBEId(long toolDefDBEId)
		throws SystemException {
		for (ToolDefDBE toolDefDBE : findByToolDefDBEId(toolDefDBEId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(toolDefDBE);
		}
	}

	/**
	 * Returns the number of tool def d b es where toolDefDBEId = &#63;.
	 *
	 * @param toolDefDBEId the tool def d b e ID
	 * @return the number of matching tool def d b es
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

			query.append(_SQL_COUNT_TOOLDEFDBE_WHERE);

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

	private static final String _FINDER_COLUMN_TOOLDEFDBEID_TOOLDEFDBEID_2 = "toolDefDBE.toolDefDBEId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TOOLNAME = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, ToolDefDBEImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByToolName",
			new String[] { String.class.getName() },
			ToolDefDBEModelImpl.TOOLNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOOLNAME = new FinderPath(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByToolName",
			new String[] { String.class.getName() });

	/**
	 * Returns the tool def d b e where toolName = &#63; or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException} if it could not be found.
	 *
	 * @param toolName the tool name
	 * @return the matching tool def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE findByToolName(String toolName)
		throws NoSuchToolDefDBEException, SystemException {
		ToolDefDBE toolDefDBE = fetchByToolName(toolName);

		if (toolDefDBE == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("toolName=");
			msg.append(toolName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchToolDefDBEException(msg.toString());
		}

		return toolDefDBE;
	}

	/**
	 * Returns the tool def d b e where toolName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param toolName the tool name
	 * @return the matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByToolName(String toolName)
		throws SystemException {
		return fetchByToolName(toolName, true);
	}

	/**
	 * Returns the tool def d b e where toolName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param toolName the tool name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tool def d b e, or <code>null</code> if a matching tool def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByToolName(String toolName, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { toolName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TOOLNAME,
					finderArgs, this);
		}

		if (result instanceof ToolDefDBE) {
			ToolDefDBE toolDefDBE = (ToolDefDBE)result;

			if (!Validator.equals(toolName, toolDefDBE.getToolName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TOOLDEFDBE_WHERE);

			boolean bindToolName = false;

			if (toolName == null) {
				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_1);
			}
			else if (toolName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_3);
			}
			else {
				bindToolName = true;

				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindToolName) {
					qPos.add(toolName);
				}

				List<ToolDefDBE> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TOOLNAME,
						finderArgs, list);
				}
				else {
					ToolDefDBE toolDefDBE = list.get(0);

					result = toolDefDBE;

					cacheResult(toolDefDBE);

					if ((toolDefDBE.getToolName() == null) ||
							!toolDefDBE.getToolName().equals(toolName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TOOLNAME,
							finderArgs, toolDefDBE);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TOOLNAME,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ToolDefDBE)result;
		}
	}

	/**
	 * Removes the tool def d b e where toolName = &#63; from the database.
	 *
	 * @param toolName the tool name
	 * @return the tool def d b e that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE removeByToolName(String toolName)
		throws NoSuchToolDefDBEException, SystemException {
		ToolDefDBE toolDefDBE = findByToolName(toolName);

		return remove(toolDefDBE);
	}

	/**
	 * Returns the number of tool def d b es where toolName = &#63;.
	 *
	 * @param toolName the tool name
	 * @return the number of matching tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToolName(String toolName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOOLNAME;

		Object[] finderArgs = new Object[] { toolName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOOLDEFDBE_WHERE);

			boolean bindToolName = false;

			if (toolName == null) {
				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_1);
			}
			else if (toolName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_3);
			}
			else {
				bindToolName = true;

				query.append(_FINDER_COLUMN_TOOLNAME_TOOLNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindToolName) {
					qPos.add(toolName);
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

	private static final String _FINDER_COLUMN_TOOLNAME_TOOLNAME_1 = "toolDefDBE.toolName IS NULL";
	private static final String _FINDER_COLUMN_TOOLNAME_TOOLNAME_2 = "toolDefDBE.toolName = ?";
	private static final String _FINDER_COLUMN_TOOLNAME_TOOLNAME_3 = "(toolDefDBE.toolName IS NULL OR toolDefDBE.toolName = '')";

	public ToolDefDBEPersistenceImpl() {
		setModelClass(ToolDefDBE.class);
	}

	/**
	 * Caches the tool def d b e in the entity cache if it is enabled.
	 *
	 * @param toolDefDBE the tool def d b e
	 */
	@Override
	public void cacheResult(ToolDefDBE toolDefDBE) {
		EntityCacheUtil.putResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEImpl.class, toolDefDBE.getPrimaryKey(), toolDefDBE);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TOOLNAME,
			new Object[] { toolDefDBE.getToolName() }, toolDefDBE);

		toolDefDBE.resetOriginalValues();
	}

	/**
	 * Caches the tool def d b es in the entity cache if it is enabled.
	 *
	 * @param toolDefDBEs the tool def d b es
	 */
	@Override
	public void cacheResult(List<ToolDefDBE> toolDefDBEs) {
		for (ToolDefDBE toolDefDBE : toolDefDBEs) {
			if (EntityCacheUtil.getResult(
						ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						ToolDefDBEImpl.class, toolDefDBE.getPrimaryKey()) == null) {
				cacheResult(toolDefDBE);
			}
			else {
				toolDefDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tool def d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ToolDefDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ToolDefDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tool def d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ToolDefDBE toolDefDBE) {
		EntityCacheUtil.removeResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEImpl.class, toolDefDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(toolDefDBE);
	}

	@Override
	public void clearCache(List<ToolDefDBE> toolDefDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ToolDefDBE toolDefDBE : toolDefDBEs) {
			EntityCacheUtil.removeResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				ToolDefDBEImpl.class, toolDefDBE.getPrimaryKey());

			clearUniqueFindersCache(toolDefDBE);
		}
	}

	protected void cacheUniqueFindersCache(ToolDefDBE toolDefDBE) {
		if (toolDefDBE.isNew()) {
			Object[] args = new Object[] { toolDefDBE.getToolName() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TOOLNAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TOOLNAME, args,
				toolDefDBE);
		}
		else {
			ToolDefDBEModelImpl toolDefDBEModelImpl = (ToolDefDBEModelImpl)toolDefDBE;

			if ((toolDefDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TOOLNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { toolDefDBE.getToolName() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TOOLNAME, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TOOLNAME, args,
					toolDefDBE);
			}
		}
	}

	protected void clearUniqueFindersCache(ToolDefDBE toolDefDBE) {
		ToolDefDBEModelImpl toolDefDBEModelImpl = (ToolDefDBEModelImpl)toolDefDBE;

		Object[] args = new Object[] { toolDefDBE.getToolName() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLNAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TOOLNAME, args);

		if ((toolDefDBEModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TOOLNAME.getColumnBitmask()) != 0) {
			args = new Object[] { toolDefDBEModelImpl.getOriginalToolName() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLNAME, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TOOLNAME, args);
		}
	}

	/**
	 * Creates a new tool def d b e with the primary key. Does not add the tool def d b e to the database.
	 *
	 * @param toolDefDBEId the primary key for the new tool def d b e
	 * @return the new tool def d b e
	 */
	@Override
	public ToolDefDBE create(long toolDefDBEId) {
		ToolDefDBE toolDefDBE = new ToolDefDBEImpl();

		toolDefDBE.setNew(true);
		toolDefDBE.setPrimaryKey(toolDefDBEId);

		return toolDefDBE;
	}

	/**
	 * Removes the tool def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param toolDefDBEId the primary key of the tool def d b e
	 * @return the tool def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE remove(long toolDefDBEId)
		throws NoSuchToolDefDBEException, SystemException {
		return remove((Serializable)toolDefDBEId);
	}

	/**
	 * Removes the tool def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tool def d b e
	 * @return the tool def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE remove(Serializable primaryKey)
		throws NoSuchToolDefDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ToolDefDBE toolDefDBE = (ToolDefDBE)session.get(ToolDefDBEImpl.class,
					primaryKey);

			if (toolDefDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchToolDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(toolDefDBE);
		}
		catch (NoSuchToolDefDBEException nsee) {
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
	protected ToolDefDBE removeImpl(ToolDefDBE toolDefDBE)
		throws SystemException {
		toolDefDBE = toUnwrappedModel(toolDefDBE);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(toolDefDBE)) {
				toolDefDBE = (ToolDefDBE)session.get(ToolDefDBEImpl.class,
						toolDefDBE.getPrimaryKeyObj());
			}

			if (toolDefDBE != null) {
				session.delete(toolDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (toolDefDBE != null) {
			clearCache(toolDefDBE);
		}

		return toolDefDBE;
	}

	@Override
	public ToolDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.ToolDefDBE toolDefDBE)
		throws SystemException {
		toolDefDBE = toUnwrappedModel(toolDefDBE);

		boolean isNew = toolDefDBE.isNew();

		ToolDefDBEModelImpl toolDefDBEModelImpl = (ToolDefDBEModelImpl)toolDefDBE;

		Session session = null;

		try {
			session = openSession();

			if (toolDefDBE.isNew()) {
				session.save(toolDefDBE);

				toolDefDBE.setNew(false);
			}
			else {
				session.merge(toolDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ToolDefDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((toolDefDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						toolDefDBEModelImpl.getOriginalToolDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID,
					args);

				args = new Object[] { toolDefDBEModelImpl.getToolDefDBEId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOOLDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOOLDEFDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			ToolDefDBEImpl.class, toolDefDBE.getPrimaryKey(), toolDefDBE);

		clearUniqueFindersCache(toolDefDBE);
		cacheUniqueFindersCache(toolDefDBE);

		return toolDefDBE;
	}

	protected ToolDefDBE toUnwrappedModel(ToolDefDBE toolDefDBE) {
		if (toolDefDBE instanceof ToolDefDBEImpl) {
			return toolDefDBE;
		}

		ToolDefDBEImpl toolDefDBEImpl = new ToolDefDBEImpl();

		toolDefDBEImpl.setNew(toolDefDBE.isNew());
		toolDefDBEImpl.setPrimaryKey(toolDefDBE.getPrimaryKey());

		toolDefDBEImpl.setToolDefDBEId(toolDefDBE.getToolDefDBEId());
		toolDefDBEImpl.setGroupId(toolDefDBE.getGroupId());
		toolDefDBEImpl.setCompanyId(toolDefDBE.getCompanyId());
		toolDefDBEImpl.setUserId(toolDefDBE.getUserId());
		toolDefDBEImpl.setUserName(toolDefDBE.getUserName());
		toolDefDBEImpl.setCreateDate(toolDefDBE.getCreateDate());
		toolDefDBEImpl.setModifiedDate(toolDefDBE.getModifiedDate());
		toolDefDBEImpl.setToolName(toolDefDBE.getToolName());
		toolDefDBEImpl.setCompositeStepDefDBEId(toolDefDBE.getCompositeStepDefDBEId());

		return toolDefDBEImpl;
	}

	/**
	 * Returns the tool def d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool def d b e
	 * @return the tool def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchToolDefDBEException, SystemException {
		ToolDefDBE toolDefDBE = fetchByPrimaryKey(primaryKey);

		if (toolDefDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchToolDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return toolDefDBE;
	}

	/**
	 * Returns the tool def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException} if it could not be found.
	 *
	 * @param toolDefDBEId the primary key of the tool def d b e
	 * @return the tool def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE findByPrimaryKey(long toolDefDBEId)
		throws NoSuchToolDefDBEException, SystemException {
		return findByPrimaryKey((Serializable)toolDefDBEId);
	}

	/**
	 * Returns the tool def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tool def d b e
	 * @return the tool def d b e, or <code>null</code> if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ToolDefDBE toolDefDBE = (ToolDefDBE)EntityCacheUtil.getResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				ToolDefDBEImpl.class, primaryKey);

		if (toolDefDBE == _nullToolDefDBE) {
			return null;
		}

		if (toolDefDBE == null) {
			Session session = null;

			try {
				session = openSession();

				toolDefDBE = (ToolDefDBE)session.get(ToolDefDBEImpl.class,
						primaryKey);

				if (toolDefDBE != null) {
					cacheResult(toolDefDBE);
				}
				else {
					EntityCacheUtil.putResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						ToolDefDBEImpl.class, primaryKey, _nullToolDefDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ToolDefDBEModelImpl.ENTITY_CACHE_ENABLED,
					ToolDefDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return toolDefDBE;
	}

	/**
	 * Returns the tool def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param toolDefDBEId the primary key of the tool def d b e
	 * @return the tool def d b e, or <code>null</code> if a tool def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ToolDefDBE fetchByPrimaryKey(long toolDefDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)toolDefDBEId);
	}

	/**
	 * Returns all the tool def d b es.
	 *
	 * @return the tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tool def d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tool def d b es
	 * @param end the upper bound of the range of tool def d b es (not inclusive)
	 * @return the range of tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tool def d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.ToolDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tool def d b es
	 * @param end the upper bound of the range of tool def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tool def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ToolDefDBE> findAll(int start, int end,
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

		List<ToolDefDBE> list = (List<ToolDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TOOLDEFDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOOLDEFDBE;

				if (pagination) {
					sql = sql.concat(ToolDefDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ToolDefDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ToolDefDBE>(list);
				}
				else {
					list = (List<ToolDefDBE>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the tool def d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ToolDefDBE toolDefDBE : findAll()) {
			remove(toolDefDBE);
		}
	}

	/**
	 * Returns the number of tool def d b es.
	 *
	 * @return the number of tool def d b es
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

				Query q = session.createQuery(_SQL_COUNT_TOOLDEFDBE);

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
	 * Initializes the tool def d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.ToolDefDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ToolDefDBE>> listenersList = new ArrayList<ModelListener<ToolDefDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ToolDefDBE>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ToolDefDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TOOLDEFDBE = "SELECT toolDefDBE FROM ToolDefDBE toolDefDBE";
	private static final String _SQL_SELECT_TOOLDEFDBE_WHERE = "SELECT toolDefDBE FROM ToolDefDBE toolDefDBE WHERE ";
	private static final String _SQL_COUNT_TOOLDEFDBE = "SELECT COUNT(toolDefDBE) FROM ToolDefDBE toolDefDBE";
	private static final String _SQL_COUNT_TOOLDEFDBE_WHERE = "SELECT COUNT(toolDefDBE) FROM ToolDefDBE toolDefDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "toolDefDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ToolDefDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ToolDefDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ToolDefDBEPersistenceImpl.class);
	private static ToolDefDBE _nullToolDefDBE = new ToolDefDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ToolDefDBE> toCacheModel() {
				return _nullToolDefDBECacheModel;
			}
		};

	private static CacheModel<ToolDefDBE> _nullToolDefDBECacheModel = new CacheModel<ToolDefDBE>() {
			@Override
			public ToolDefDBE toEntityModel() {
				return _nullToolDefDBE;
			}
		};
}