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

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException;
import org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the wrapper step def d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDefDBEPersistence
 * @see WrapperStepDefDBEUtil
 * @generated
 */
public class WrapperStepDefDBEPersistenceImpl extends BasePersistenceImpl<WrapperStepDefDBE>
	implements WrapperStepDefDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WrapperStepDefDBEUtil} to access the wrapper step def d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WrapperStepDefDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID =
		new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByWrapperStepDefDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID =
		new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByWrapperStepDefDBEId", new String[] { Long.class.getName() },
			WrapperStepDefDBEModelImpl.WRAPPERSTEPDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WRAPPERSTEPDEFDBEID = new FinderPath(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByWrapperStepDefDBEId", new String[] { Long.class.getName() });

	/**
	 * Returns all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @return the matching wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId) throws SystemException {
		return findByWrapperStepDefDBEId(wrapperStepDefDBEId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param start the lower bound of the range of wrapper step def d b es
	 * @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	 * @return the range of matching wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId, int start, int end) throws SystemException {
		return findByWrapperStepDefDBEId(wrapperStepDefDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param start the lower bound of the range of wrapper step def d b es
	 * @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDefDBE> findByWrapperStepDefDBEId(
		long wrapperStepDefDBEId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID;
			finderArgs = new Object[] { wrapperStepDefDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID;
			finderArgs = new Object[] {
					wrapperStepDefDBEId,
					
					start, end, orderByComparator
				};
		}

		List<WrapperStepDefDBE> list = (List<WrapperStepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WrapperStepDefDBE wrapperStepDefDBE : list) {
				if ((wrapperStepDefDBEId != wrapperStepDefDBE.getWrapperStepDefDBEId())) {
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

			query.append(_SQL_SELECT_WRAPPERSTEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_WRAPPERSTEPDEFDBEID_WRAPPERSTEPDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WrapperStepDefDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wrapperStepDefDBEId);

				if (!pagination) {
					list = (List<WrapperStepDefDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WrapperStepDefDBE>(list);
				}
				else {
					list = (List<WrapperStepDefDBE>)QueryUtil.list(q,
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
	 * Returns the first wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wrapper step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a matching wrapper step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE findByWrapperStepDefDBEId_First(
		long wrapperStepDefDBEId, OrderByComparator orderByComparator)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		WrapperStepDefDBE wrapperStepDefDBE = fetchByWrapperStepDefDBEId_First(wrapperStepDefDBEId,
				orderByComparator);

		if (wrapperStepDefDBE != null) {
			return wrapperStepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wrapperStepDefDBEId=");
		msg.append(wrapperStepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWrapperStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the first wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wrapper step def d b e, or <code>null</code> if a matching wrapper step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE fetchByWrapperStepDefDBEId_First(
		long wrapperStepDefDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		List<WrapperStepDefDBE> list = findByWrapperStepDefDBEId(wrapperStepDefDBEId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wrapper step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a matching wrapper step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE findByWrapperStepDefDBEId_Last(
		long wrapperStepDefDBEId, OrderByComparator orderByComparator)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		WrapperStepDefDBE wrapperStepDefDBE = fetchByWrapperStepDefDBEId_Last(wrapperStepDefDBEId,
				orderByComparator);

		if (wrapperStepDefDBE != null) {
			return wrapperStepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wrapperStepDefDBEId=");
		msg.append(wrapperStepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWrapperStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the last wrapper step def d b e in the ordered set where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wrapper step def d b e, or <code>null</code> if a matching wrapper step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE fetchByWrapperStepDefDBEId_Last(
		long wrapperStepDefDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByWrapperStepDefDBEId(wrapperStepDefDBEId);

		if (count == 0) {
			return null;
		}

		List<WrapperStepDefDBE> list = findByWrapperStepDefDBEId(wrapperStepDefDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the wrapper step def d b es where wrapperStepDefDBEId = &#63; from the database.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWrapperStepDefDBEId(long wrapperStepDefDBEId)
		throws SystemException {
		for (WrapperStepDefDBE wrapperStepDefDBE : findByWrapperStepDefDBEId(
				wrapperStepDefDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wrapperStepDefDBE);
		}
	}

	/**
	 * Returns the number of wrapper step def d b es where wrapperStepDefDBEId = &#63;.
	 *
	 * @param wrapperStepDefDBEId the wrapper step def d b e ID
	 * @return the number of matching wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWrapperStepDefDBEId(long wrapperStepDefDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WRAPPERSTEPDEFDBEID;

		Object[] finderArgs = new Object[] { wrapperStepDefDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WRAPPERSTEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_WRAPPERSTEPDEFDBEID_WRAPPERSTEPDEFDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wrapperStepDefDBEId);

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

	private static final String _FINDER_COLUMN_WRAPPERSTEPDEFDBEID_WRAPPERSTEPDEFDBEID_2 =
		"wrapperStepDefDBE.wrapperStepDefDBEId = ?";

	public WrapperStepDefDBEPersistenceImpl() {
		setModelClass(WrapperStepDefDBE.class);
	}

	/**
	 * Caches the wrapper step def d b e in the entity cache if it is enabled.
	 *
	 * @param wrapperStepDefDBE the wrapper step def d b e
	 */
	@Override
	public void cacheResult(WrapperStepDefDBE wrapperStepDefDBE) {
		EntityCacheUtil.putResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class, wrapperStepDefDBE.getPrimaryKey(),
			wrapperStepDefDBE);

		wrapperStepDefDBE.resetOriginalValues();
	}

	/**
	 * Caches the wrapper step def d b es in the entity cache if it is enabled.
	 *
	 * @param wrapperStepDefDBEs the wrapper step def d b es
	 */
	@Override
	public void cacheResult(List<WrapperStepDefDBE> wrapperStepDefDBEs) {
		for (WrapperStepDefDBE wrapperStepDefDBE : wrapperStepDefDBEs) {
			if (EntityCacheUtil.getResult(
						WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepDefDBEImpl.class,
						wrapperStepDefDBE.getPrimaryKey()) == null) {
				cacheResult(wrapperStepDefDBE);
			}
			else {
				wrapperStepDefDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wrapper step def d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WrapperStepDefDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WrapperStepDefDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wrapper step def d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WrapperStepDefDBE wrapperStepDefDBE) {
		EntityCacheUtil.removeResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class, wrapperStepDefDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WrapperStepDefDBE> wrapperStepDefDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WrapperStepDefDBE wrapperStepDefDBE : wrapperStepDefDBEs) {
			EntityCacheUtil.removeResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepDefDBEImpl.class, wrapperStepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wrapper step def d b e with the primary key. Does not add the wrapper step def d b e to the database.
	 *
	 * @param wrapperStepDefDBEId the primary key for the new wrapper step def d b e
	 * @return the new wrapper step def d b e
	 */
	@Override
	public WrapperStepDefDBE create(long wrapperStepDefDBEId) {
		WrapperStepDefDBE wrapperStepDefDBE = new WrapperStepDefDBEImpl();

		wrapperStepDefDBE.setNew(true);
		wrapperStepDefDBE.setPrimaryKey(wrapperStepDefDBEId);

		return wrapperStepDefDBE;
	}

	/**
	 * Removes the wrapper step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE remove(long wrapperStepDefDBEId)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		return remove((Serializable)wrapperStepDefDBEId);
	}

	/**
	 * Removes the wrapper step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE remove(Serializable primaryKey)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WrapperStepDefDBE wrapperStepDefDBE = (WrapperStepDefDBE)session.get(WrapperStepDefDBEImpl.class,
					primaryKey);

			if (wrapperStepDefDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWrapperStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wrapperStepDefDBE);
		}
		catch (NoSuchWrapperStepDefDBEException nsee) {
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
	protected WrapperStepDefDBE removeImpl(WrapperStepDefDBE wrapperStepDefDBE)
		throws SystemException {
		wrapperStepDefDBE = toUnwrappedModel(wrapperStepDefDBE);

		wrapperStepDefDBEToStepDefDBETableMapper.deleteLeftPrimaryKeyTableMappings(wrapperStepDefDBE.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wrapperStepDefDBE)) {
				wrapperStepDefDBE = (WrapperStepDefDBE)session.get(WrapperStepDefDBEImpl.class,
						wrapperStepDefDBE.getPrimaryKeyObj());
			}

			if (wrapperStepDefDBE != null) {
				session.delete(wrapperStepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wrapperStepDefDBE != null) {
			clearCache(wrapperStepDefDBE);
		}

		return wrapperStepDefDBE;
	}

	@Override
	public WrapperStepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE)
		throws SystemException {
		wrapperStepDefDBE = toUnwrappedModel(wrapperStepDefDBE);

		boolean isNew = wrapperStepDefDBE.isNew();

		WrapperStepDefDBEModelImpl wrapperStepDefDBEModelImpl = (WrapperStepDefDBEModelImpl)wrapperStepDefDBE;

		Session session = null;

		try {
			session = openSession();

			if (wrapperStepDefDBE.isNew()) {
				session.save(wrapperStepDefDBE);

				wrapperStepDefDBE.setNew(false);
			}
			else {
				session.merge(wrapperStepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WrapperStepDefDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wrapperStepDefDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wrapperStepDefDBEModelImpl.getOriginalWrapperStepDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WRAPPERSTEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID,
					args);

				args = new Object[] {
						wrapperStepDefDBEModelImpl.getWrapperStepDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WRAPPERSTEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDEFDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDefDBEImpl.class, wrapperStepDefDBE.getPrimaryKey(),
			wrapperStepDefDBE);

		return wrapperStepDefDBE;
	}

	protected WrapperStepDefDBE toUnwrappedModel(
		WrapperStepDefDBE wrapperStepDefDBE) {
		if (wrapperStepDefDBE instanceof WrapperStepDefDBEImpl) {
			return wrapperStepDefDBE;
		}

		WrapperStepDefDBEImpl wrapperStepDefDBEImpl = new WrapperStepDefDBEImpl();

		wrapperStepDefDBEImpl.setNew(wrapperStepDefDBE.isNew());
		wrapperStepDefDBEImpl.setPrimaryKey(wrapperStepDefDBE.getPrimaryKey());

		wrapperStepDefDBEImpl.setWrapperStepDefDBEId(wrapperStepDefDBE.getWrapperStepDefDBEId());
		wrapperStepDefDBEImpl.setStepsNumber(wrapperStepDefDBE.getStepsNumber());
		wrapperStepDefDBEImpl.setSequential(wrapperStepDefDBE.isSequential());
		wrapperStepDefDBEImpl.setDepth(wrapperStepDefDBE.getDepth());

		return wrapperStepDefDBEImpl;
	}

	/**
	 * Returns the wrapper step def d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		WrapperStepDefDBE wrapperStepDefDBE = fetchByPrimaryKey(primaryKey);

		if (wrapperStepDefDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWrapperStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wrapperStepDefDBE;
	}

	/**
	 * Returns the wrapper step def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException} if it could not be found.
	 *
	 * @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDefDBEException if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE findByPrimaryKey(long wrapperStepDefDBEId)
		throws NoSuchWrapperStepDefDBEException, SystemException {
		return findByPrimaryKey((Serializable)wrapperStepDefDBEId);
	}

	/**
	 * Returns the wrapper step def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e, or <code>null</code> if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WrapperStepDefDBE wrapperStepDefDBE = (WrapperStepDefDBE)EntityCacheUtil.getResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepDefDBEImpl.class, primaryKey);

		if (wrapperStepDefDBE == _nullWrapperStepDefDBE) {
			return null;
		}

		if (wrapperStepDefDBE == null) {
			Session session = null;

			try {
				session = openSession();

				wrapperStepDefDBE = (WrapperStepDefDBE)session.get(WrapperStepDefDBEImpl.class,
						primaryKey);

				if (wrapperStepDefDBE != null) {
					cacheResult(wrapperStepDefDBE);
				}
				else {
					EntityCacheUtil.putResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepDefDBEImpl.class, primaryKey,
						_nullWrapperStepDefDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WrapperStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
					WrapperStepDefDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wrapperStepDefDBE;
	}

	/**
	 * Returns the wrapper step def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wrapperStepDefDBEId the primary key of the wrapper step def d b e
	 * @return the wrapper step def d b e, or <code>null</code> if a wrapper step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDefDBE fetchByPrimaryKey(long wrapperStepDefDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)wrapperStepDefDBEId);
	}

	/**
	 * Returns all the wrapper step def d b es.
	 *
	 * @return the wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDefDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<WrapperStepDefDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wrapper step def d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wrapper step def d b es
	 * @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wrapper step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDefDBE> findAll(int start, int end,
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

		List<WrapperStepDefDBE> list = (List<WrapperStepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WRAPPERSTEPDEFDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WRAPPERSTEPDEFDBE;

				if (pagination) {
					sql = sql.concat(WrapperStepDefDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WrapperStepDefDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WrapperStepDefDBE>(list);
				}
				else {
					list = (List<WrapperStepDefDBE>)QueryUtil.list(q,
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
	 * Removes all the wrapper step def d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WrapperStepDefDBE wrapperStepDefDBE : findAll()) {
			remove(wrapperStepDefDBE);
		}
	}

	/**
	 * Returns the number of wrapper step def d b es.
	 *
	 * @return the number of wrapper step def d b es
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

				Query q = session.createQuery(_SQL_COUNT_WRAPPERSTEPDEFDBE);

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
	 * Returns all the Step Definitions associated with the wrapper step def d b e.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @return the Step Definitions associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk) throws SystemException {
		return getStepDefDBEs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the Step Definitions associated with the wrapper step def d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param start the lower bound of the range of wrapper step def d b es
	 * @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	 * @return the range of Step Definitions associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end) throws SystemException {
		return getStepDefDBEs(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Step Definitions associated with the wrapper step def d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param start the lower bound of the range of wrapper step def d b es
	 * @param end the upper bound of the range of wrapper step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Step Definitions associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return wrapperStepDefDBEToStepDefDBETableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of Step Definitions associated with the wrapper step def d b e.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @return the number of Step Definitions associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStepDefDBEsSize(long pk) throws SystemException {
		long[] pks = wrapperStepDefDBEToStepDefDBETableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the Step Definition is associated with the wrapper step def d b e.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @return <code>true</code> if the Step Definition is associated with the wrapper step def d b e; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		return wrapperStepDefDBEToStepDefDBETableMapper.containsTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Returns <code>true</code> if the wrapper step def d b e has any Step Definitions associated with it.
	 *
	 * @param pk the primary key of the wrapper step def d b e to check for associations with Step Definitions
	 * @return <code>true</code> if the wrapper step def d b e has any Step Definitions associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDefDBEs(long pk) throws SystemException {
		if (getStepDefDBEsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		wrapperStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Adds an association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBE the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws SystemException {
		wrapperStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
			stepDefDBE.getPrimaryKey());
	}

	/**
	 * Adds an association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		for (long stepDefDBEPK : stepDefDBEPKs) {
			wrapperStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				stepDefDBEPK);
		}
	}

	/**
	 * Adds an association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEs the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE : stepDefDBEs) {
			wrapperStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				stepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the wrapper step def d b e and its Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e to clear the associated Step Definitions from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearStepDefDBEs(long pk) throws SystemException {
		wrapperStepDefDBEToStepDefDBETableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		wrapperStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Removes the association between the wrapper step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBE the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws SystemException {
		wrapperStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
			stepDefDBE.getPrimaryKey());
	}

	/**
	 * Removes the association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		for (long stepDefDBEPK : stepDefDBEPKs) {
			wrapperStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				stepDefDBEPK);
		}
	}

	/**
	 * Removes the association between the wrapper step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEs the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE : stepDefDBEs) {
			wrapperStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				stepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Sets the Step Definitions associated with the wrapper step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions to be associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		Set<Long> newStepDefDBEPKsSet = SetUtil.fromArray(stepDefDBEPKs);
		Set<Long> oldStepDefDBEPKsSet = SetUtil.fromArray(wrapperStepDefDBEToStepDefDBETableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeStepDefDBEPKsSet = new HashSet<Long>(oldStepDefDBEPKsSet);

		removeStepDefDBEPKsSet.removeAll(newStepDefDBEPKsSet);

		for (long removeStepDefDBEPK : removeStepDefDBEPKsSet) {
			wrapperStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				removeStepDefDBEPK);
		}

		newStepDefDBEPKsSet.removeAll(oldStepDefDBEPKsSet);

		for (long newStepDefDBEPK : newStepDefDBEPKsSet) {
			wrapperStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				newStepDefDBEPK);
		}
	}

	/**
	 * Sets the Step Definitions associated with the wrapper step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step def d b e
	 * @param stepDefDBEs the Step Definitions to be associated with the wrapper step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDefDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws SystemException {
		try {
			long[] stepDefDBEPKs = new long[stepDefDBEs.size()];

			for (int i = 0; i < stepDefDBEs.size(); i++) {
				org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE = stepDefDBEs.get(i);

				stepDefDBEPKs[i] = stepDefDBE.getPrimaryKey();
			}

			setStepDefDBEs(pk, stepDefDBEPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(WrapperStepDefDBEModelImpl.MAPPING_TABLE_LRC_TB_WSDEF_STEPDEF_NAME);
		}
	}

	/**
	 * Initializes the wrapper step def d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WrapperStepDefDBE>> listenersList = new ArrayList<ModelListener<WrapperStepDefDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WrapperStepDefDBE>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		wrapperStepDefDBEToStepDefDBETableMapper = TableMapperFactory.getTableMapper("lrc_tb_WSDef_StepDef",
				"wrapperStepDefDBEId", "stepDefDBEId", this,
				stepDefDBEPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(WrapperStepDefDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("lrc_tb_WSDef_StepDef");
	}

	@BeanReference(type = StepDefDBEPersistence.class)
	protected StepDefDBEPersistence stepDefDBEPersistence;
	protected TableMapper<WrapperStepDefDBE, org.lrc.liferay.toolbuilder.model.StepDefDBE> wrapperStepDefDBEToStepDefDBETableMapper;
	private static final String _SQL_SELECT_WRAPPERSTEPDEFDBE = "SELECT wrapperStepDefDBE FROM WrapperStepDefDBE wrapperStepDefDBE";
	private static final String _SQL_SELECT_WRAPPERSTEPDEFDBE_WHERE = "SELECT wrapperStepDefDBE FROM WrapperStepDefDBE wrapperStepDefDBE WHERE ";
	private static final String _SQL_COUNT_WRAPPERSTEPDEFDBE = "SELECT COUNT(wrapperStepDefDBE) FROM WrapperStepDefDBE wrapperStepDefDBE";
	private static final String _SQL_COUNT_WRAPPERSTEPDEFDBE_WHERE = "SELECT COUNT(wrapperStepDefDBE) FROM WrapperStepDefDBE wrapperStepDefDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wrapperStepDefDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WrapperStepDefDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WrapperStepDefDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WrapperStepDefDBEPersistenceImpl.class);
	private static WrapperStepDefDBE _nullWrapperStepDefDBE = new WrapperStepDefDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WrapperStepDefDBE> toCacheModel() {
				return _nullWrapperStepDefDBECacheModel;
			}
		};

	private static CacheModel<WrapperStepDefDBE> _nullWrapperStepDefDBECacheModel =
		new CacheModel<WrapperStepDefDBE>() {
			@Override
			public WrapperStepDefDBE toEntityModel() {
				return _nullWrapperStepDefDBE;
			}
		};
}