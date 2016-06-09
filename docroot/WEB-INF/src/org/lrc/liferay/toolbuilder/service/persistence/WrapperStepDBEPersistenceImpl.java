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

import org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException;
import org.lrc.liferay.toolbuilder.model.WrapperStepDBE;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the wrapper step d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDBEPersistence
 * @see WrapperStepDBEUtil
 * @generated
 */
public class WrapperStepDBEPersistenceImpl extends BasePersistenceImpl<WrapperStepDBE>
	implements WrapperStepDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WrapperStepDBEUtil} to access the wrapper step d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WrapperStepDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WRAPPERSTEPDBEID =
		new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByWrapperStepDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDBEID =
		new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED,
			WrapperStepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByWrapperStepDBEId", new String[] { Long.class.getName() },
			WrapperStepDBEModelImpl.WRAPPERSTEPDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WRAPPERSTEPDBEID = new FinderPath(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByWrapperStepDBEId", new String[] { Long.class.getName() });

	/**
	 * Returns all the wrapper step d b es where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @return the matching wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findByWrapperStepDBEId(long wrapperStepDBEId)
		throws SystemException {
		return findByWrapperStepDBEId(wrapperStepDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wrapper step d b es where wrapperStepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @return the range of matching wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findByWrapperStepDBEId(long wrapperStepDBEId,
		int start, int end) throws SystemException {
		return findByWrapperStepDBEId(wrapperStepDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wrapper step d b es where wrapperStepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findByWrapperStepDBEId(long wrapperStepDBEId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDBEID;
			finderArgs = new Object[] { wrapperStepDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WRAPPERSTEPDBEID;
			finderArgs = new Object[] {
					wrapperStepDBEId,
					
					start, end, orderByComparator
				};
		}

		List<WrapperStepDBE> list = (List<WrapperStepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (WrapperStepDBE wrapperStepDBE : list) {
				if ((wrapperStepDBEId != wrapperStepDBE.getWrapperStepDBEId())) {
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

			query.append(_SQL_SELECT_WRAPPERSTEPDBE_WHERE);

			query.append(_FINDER_COLUMN_WRAPPERSTEPDBEID_WRAPPERSTEPDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(WrapperStepDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wrapperStepDBEId);

				if (!pagination) {
					list = (List<WrapperStepDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WrapperStepDBE>(list);
				}
				else {
					list = (List<WrapperStepDBE>)QueryUtil.list(q,
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
	 * Returns the first wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wrapper step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a matching wrapper step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE findByWrapperStepDBEId_First(long wrapperStepDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchWrapperStepDBEException, SystemException {
		WrapperStepDBE wrapperStepDBE = fetchByWrapperStepDBEId_First(wrapperStepDBEId,
				orderByComparator);

		if (wrapperStepDBE != null) {
			return wrapperStepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wrapperStepDBEId=");
		msg.append(wrapperStepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWrapperStepDBEException(msg.toString());
	}

	/**
	 * Returns the first wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wrapper step d b e, or <code>null</code> if a matching wrapper step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE fetchByWrapperStepDBEId_First(long wrapperStepDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<WrapperStepDBE> list = findByWrapperStepDBEId(wrapperStepDBEId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wrapper step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a matching wrapper step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE findByWrapperStepDBEId_Last(long wrapperStepDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchWrapperStepDBEException, SystemException {
		WrapperStepDBE wrapperStepDBE = fetchByWrapperStepDBEId_Last(wrapperStepDBEId,
				orderByComparator);

		if (wrapperStepDBE != null) {
			return wrapperStepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wrapperStepDBEId=");
		msg.append(wrapperStepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchWrapperStepDBEException(msg.toString());
	}

	/**
	 * Returns the last wrapper step d b e in the ordered set where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wrapper step d b e, or <code>null</code> if a matching wrapper step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE fetchByWrapperStepDBEId_Last(long wrapperStepDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWrapperStepDBEId(wrapperStepDBEId);

		if (count == 0) {
			return null;
		}

		List<WrapperStepDBE> list = findByWrapperStepDBEId(wrapperStepDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the wrapper step d b es where wrapperStepDBEId = &#63; from the database.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWrapperStepDBEId(long wrapperStepDBEId)
		throws SystemException {
		for (WrapperStepDBE wrapperStepDBE : findByWrapperStepDBEId(
				wrapperStepDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(wrapperStepDBE);
		}
	}

	/**
	 * Returns the number of wrapper step d b es where wrapperStepDBEId = &#63;.
	 *
	 * @param wrapperStepDBEId the wrapper step d b e ID
	 * @return the number of matching wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWrapperStepDBEId(long wrapperStepDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WRAPPERSTEPDBEID;

		Object[] finderArgs = new Object[] { wrapperStepDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_WRAPPERSTEPDBE_WHERE);

			query.append(_FINDER_COLUMN_WRAPPERSTEPDBEID_WRAPPERSTEPDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wrapperStepDBEId);

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

	private static final String _FINDER_COLUMN_WRAPPERSTEPDBEID_WRAPPERSTEPDBEID_2 =
		"wrapperStepDBE.wrapperStepDBEId = ?";

	public WrapperStepDBEPersistenceImpl() {
		setModelClass(WrapperStepDBE.class);
	}

	/**
	 * Caches the wrapper step d b e in the entity cache if it is enabled.
	 *
	 * @param wrapperStepDBE the wrapper step d b e
	 */
	@Override
	public void cacheResult(WrapperStepDBE wrapperStepDBE) {
		EntityCacheUtil.putResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEImpl.class, wrapperStepDBE.getPrimaryKey(),
			wrapperStepDBE);

		wrapperStepDBE.resetOriginalValues();
	}

	/**
	 * Caches the wrapper step d b es in the entity cache if it is enabled.
	 *
	 * @param wrapperStepDBEs the wrapper step d b es
	 */
	@Override
	public void cacheResult(List<WrapperStepDBE> wrapperStepDBEs) {
		for (WrapperStepDBE wrapperStepDBE : wrapperStepDBEs) {
			if (EntityCacheUtil.getResult(
						WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepDBEImpl.class, wrapperStepDBE.getPrimaryKey()) == null) {
				cacheResult(wrapperStepDBE);
			}
			else {
				wrapperStepDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wrapper step d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WrapperStepDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WrapperStepDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wrapper step d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WrapperStepDBE wrapperStepDBE) {
		EntityCacheUtil.removeResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEImpl.class, wrapperStepDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WrapperStepDBE> wrapperStepDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WrapperStepDBE wrapperStepDBE : wrapperStepDBEs) {
			EntityCacheUtil.removeResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepDBEImpl.class, wrapperStepDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wrapper step d b e with the primary key. Does not add the wrapper step d b e to the database.
	 *
	 * @param wrapperStepDBEId the primary key for the new wrapper step d b e
	 * @return the new wrapper step d b e
	 */
	@Override
	public WrapperStepDBE create(long wrapperStepDBEId) {
		WrapperStepDBE wrapperStepDBE = new WrapperStepDBEImpl();

		wrapperStepDBE.setNew(true);
		wrapperStepDBE.setPrimaryKey(wrapperStepDBEId);

		return wrapperStepDBE;
	}

	/**
	 * Removes the wrapper step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wrapperStepDBEId the primary key of the wrapper step d b e
	 * @return the wrapper step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE remove(long wrapperStepDBEId)
		throws NoSuchWrapperStepDBEException, SystemException {
		return remove((Serializable)wrapperStepDBEId);
	}

	/**
	 * Removes the wrapper step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wrapper step d b e
	 * @return the wrapper step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE remove(Serializable primaryKey)
		throws NoSuchWrapperStepDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WrapperStepDBE wrapperStepDBE = (WrapperStepDBE)session.get(WrapperStepDBEImpl.class,
					primaryKey);

			if (wrapperStepDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWrapperStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wrapperStepDBE);
		}
		catch (NoSuchWrapperStepDBEException nsee) {
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
	protected WrapperStepDBE removeImpl(WrapperStepDBE wrapperStepDBE)
		throws SystemException {
		wrapperStepDBE = toUnwrappedModel(wrapperStepDBE);

		wrapperStepDBEToStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(wrapperStepDBE.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wrapperStepDBE)) {
				wrapperStepDBE = (WrapperStepDBE)session.get(WrapperStepDBEImpl.class,
						wrapperStepDBE.getPrimaryKeyObj());
			}

			if (wrapperStepDBE != null) {
				session.delete(wrapperStepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wrapperStepDBE != null) {
			clearCache(wrapperStepDBE);
		}

		return wrapperStepDBE;
	}

	@Override
	public WrapperStepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE)
		throws SystemException {
		wrapperStepDBE = toUnwrappedModel(wrapperStepDBE);

		boolean isNew = wrapperStepDBE.isNew();

		WrapperStepDBEModelImpl wrapperStepDBEModelImpl = (WrapperStepDBEModelImpl)wrapperStepDBE;

		Session session = null;

		try {
			session = openSession();

			if (wrapperStepDBE.isNew()) {
				session.save(wrapperStepDBE);

				wrapperStepDBE.setNew(false);
			}
			else {
				session.merge(wrapperStepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !WrapperStepDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((wrapperStepDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						wrapperStepDBEModelImpl.getOriginalWrapperStepDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WRAPPERSTEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDBEID,
					args);

				args = new Object[] {
						wrapperStepDBEModelImpl.getWrapperStepDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WRAPPERSTEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WRAPPERSTEPDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepDBEImpl.class, wrapperStepDBE.getPrimaryKey(),
			wrapperStepDBE);

		return wrapperStepDBE;
	}

	protected WrapperStepDBE toUnwrappedModel(WrapperStepDBE wrapperStepDBE) {
		if (wrapperStepDBE instanceof WrapperStepDBEImpl) {
			return wrapperStepDBE;
		}

		WrapperStepDBEImpl wrapperStepDBEImpl = new WrapperStepDBEImpl();

		wrapperStepDBEImpl.setNew(wrapperStepDBE.isNew());
		wrapperStepDBEImpl.setPrimaryKey(wrapperStepDBE.getPrimaryKey());

		wrapperStepDBEImpl.setWrapperStepDBEId(wrapperStepDBE.getWrapperStepDBEId());
		wrapperStepDBEImpl.setCurrentStep(wrapperStepDBE.getCurrentStep());

		return wrapperStepDBEImpl;
	}

	/**
	 * Returns the wrapper step d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step d b e
	 * @return the wrapper step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWrapperStepDBEException, SystemException {
		WrapperStepDBE wrapperStepDBE = fetchByPrimaryKey(primaryKey);

		if (wrapperStepDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWrapperStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wrapperStepDBE;
	}

	/**
	 * Returns the wrapper step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException} if it could not be found.
	 *
	 * @param wrapperStepDBEId the primary key of the wrapper step d b e
	 * @return the wrapper step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepDBEException if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE findByPrimaryKey(long wrapperStepDBEId)
		throws NoSuchWrapperStepDBEException, SystemException {
		return findByPrimaryKey((Serializable)wrapperStepDBEId);
	}

	/**
	 * Returns the wrapper step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step d b e
	 * @return the wrapper step d b e, or <code>null</code> if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WrapperStepDBE wrapperStepDBE = (WrapperStepDBE)EntityCacheUtil.getResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepDBEImpl.class, primaryKey);

		if (wrapperStepDBE == _nullWrapperStepDBE) {
			return null;
		}

		if (wrapperStepDBE == null) {
			Session session = null;

			try {
				session = openSession();

				wrapperStepDBE = (WrapperStepDBE)session.get(WrapperStepDBEImpl.class,
						primaryKey);

				if (wrapperStepDBE != null) {
					cacheResult(wrapperStepDBE);
				}
				else {
					EntityCacheUtil.putResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepDBEImpl.class, primaryKey,
						_nullWrapperStepDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WrapperStepDBEModelImpl.ENTITY_CACHE_ENABLED,
					WrapperStepDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wrapperStepDBE;
	}

	/**
	 * Returns the wrapper step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wrapperStepDBEId the primary key of the wrapper step d b e
	 * @return the wrapper step d b e, or <code>null</code> if a wrapper step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStepDBE fetchByPrimaryKey(long wrapperStepDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)wrapperStepDBEId);
	}

	/**
	 * Returns all the wrapper step d b es.
	 *
	 * @return the wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wrapper step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @return the range of wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wrapper step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wrapper step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStepDBE> findAll(int start, int end,
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

		List<WrapperStepDBE> list = (List<WrapperStepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WRAPPERSTEPDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WRAPPERSTEPDBE;

				if (pagination) {
					sql = sql.concat(WrapperStepDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WrapperStepDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WrapperStepDBE>(list);
				}
				else {
					list = (List<WrapperStepDBE>)QueryUtil.list(q,
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
	 * Removes all the wrapper step d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WrapperStepDBE wrapperStepDBE : findAll()) {
			remove(wrapperStepDBE);
		}
	}

	/**
	 * Returns the number of wrapper step d b es.
	 *
	 * @return the number of wrapper step d b es
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

				Query q = session.createQuery(_SQL_COUNT_WRAPPERSTEPDBE);

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
	 * Returns all the step d b es associated with the wrapper step d b e.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @return the step d b es associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(long pk)
		throws SystemException {
		return getStepDBEs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the step d b es associated with the wrapper step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @return the range of step d b es associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end) throws SystemException {
		return getStepDBEs(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the step d b es associated with the wrapper step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param start the lower bound of the range of wrapper step d b es
	 * @param end the upper bound of the range of wrapper step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of step d b es associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return wrapperStepDBEToStepDBETableMapper.getRightBaseModels(pk, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of step d b es associated with the wrapper step d b e.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @return the number of step d b es associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStepDBEsSize(long pk) throws SystemException {
		long[] pks = wrapperStepDBEToStepDBETableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the step d b e is associated with the wrapper step d b e.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @return <code>true</code> if the step d b e is associated with the wrapper step d b e; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDBE(long pk, long stepDBEPK)
		throws SystemException {
		return wrapperStepDBEToStepDBETableMapper.containsTableMapping(pk,
			stepDBEPK);
	}

	/**
	 * Returns <code>true</code> if the wrapper step d b e has any step d b es associated with it.
	 *
	 * @param pk the primary key of the wrapper step d b e to check for associations with step d b es
	 * @return <code>true</code> if the wrapper step d b e has any step d b es associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDBEs(long pk) throws SystemException {
		if (getStepDBEsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBE(long pk, long stepDBEPK) throws SystemException {
		wrapperStepDBEToStepDBETableMapper.addTableMapping(pk, stepDBEPK);
	}

	/**
	 * Adds an association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBE the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws SystemException {
		wrapperStepDBEToStepDBETableMapper.addTableMapping(pk,
			stepDBE.getPrimaryKey());
	}

	/**
	 * Adds an association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPKs the primary keys of the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		for (long stepDBEPK : stepDBEPKs) {
			wrapperStepDBEToStepDBETableMapper.addTableMapping(pk, stepDBEPK);
		}
	}

	/**
	 * Adds an association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEs the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDBE stepDBE : stepDBEs) {
			wrapperStepDBEToStepDBETableMapper.addTableMapping(pk,
				stepDBE.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the wrapper step d b e and its step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e to clear the associated step d b es from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearStepDBEs(long pk) throws SystemException {
		wrapperStepDBEToStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBE(long pk, long stepDBEPK)
		throws SystemException {
		wrapperStepDBEToStepDBETableMapper.deleteTableMapping(pk, stepDBEPK);
	}

	/**
	 * Removes the association between the wrapper step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBE the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws SystemException {
		wrapperStepDBEToStepDBETableMapper.deleteTableMapping(pk,
			stepDBE.getPrimaryKey());
	}

	/**
	 * Removes the association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPKs the primary keys of the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		for (long stepDBEPK : stepDBEPKs) {
			wrapperStepDBEToStepDBETableMapper.deleteTableMapping(pk, stepDBEPK);
		}
	}

	/**
	 * Removes the association between the wrapper step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEs the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDBE stepDBE : stepDBEs) {
			wrapperStepDBEToStepDBETableMapper.deleteTableMapping(pk,
				stepDBE.getPrimaryKey());
		}
	}

	/**
	 * Sets the step d b es associated with the wrapper step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEPKs the primary keys of the step d b es to be associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		Set<Long> newStepDBEPKsSet = SetUtil.fromArray(stepDBEPKs);
		Set<Long> oldStepDBEPKsSet = SetUtil.fromArray(wrapperStepDBEToStepDBETableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeStepDBEPKsSet = new HashSet<Long>(oldStepDBEPKsSet);

		removeStepDBEPKsSet.removeAll(newStepDBEPKsSet);

		for (long removeStepDBEPK : removeStepDBEPKsSet) {
			wrapperStepDBEToStepDBETableMapper.deleteTableMapping(pk,
				removeStepDBEPK);
		}

		newStepDBEPKsSet.removeAll(oldStepDBEPKsSet);

		for (long newStepDBEPK : newStepDBEPKsSet) {
			wrapperStepDBEToStepDBETableMapper.addTableMapping(pk, newStepDBEPK);
		}
	}

	/**
	 * Sets the step d b es associated with the wrapper step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the wrapper step d b e
	 * @param stepDBEs the step d b es to be associated with the wrapper step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws SystemException {
		try {
			long[] stepDBEPKs = new long[stepDBEs.size()];

			for (int i = 0; i < stepDBEs.size(); i++) {
				org.lrc.liferay.toolbuilder.model.StepDBE stepDBE = stepDBEs.get(i);

				stepDBEPKs[i] = stepDBE.getPrimaryKey();
			}

			setStepDBEs(pk, stepDBEPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(WrapperStepDBEModelImpl.MAPPING_TABLE_LRC_TB_WS_STEP_NAME);
		}
	}

	/**
	 * Initializes the wrapper step d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.WrapperStepDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WrapperStepDBE>> listenersList = new ArrayList<ModelListener<WrapperStepDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WrapperStepDBE>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		wrapperStepDBEToStepDBETableMapper = TableMapperFactory.getTableMapper("lrc_tb_WS_Step",
				"wrapperStepDBEId", "stepDBEId", this, stepDBEPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(WrapperStepDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("lrc_tb_WS_Step");
	}

	@BeanReference(type = StepDBEPersistence.class)
	protected StepDBEPersistence stepDBEPersistence;
	protected TableMapper<WrapperStepDBE, org.lrc.liferay.toolbuilder.model.StepDBE> wrapperStepDBEToStepDBETableMapper;
	private static final String _SQL_SELECT_WRAPPERSTEPDBE = "SELECT wrapperStepDBE FROM WrapperStepDBE wrapperStepDBE";
	private static final String _SQL_SELECT_WRAPPERSTEPDBE_WHERE = "SELECT wrapperStepDBE FROM WrapperStepDBE wrapperStepDBE WHERE ";
	private static final String _SQL_COUNT_WRAPPERSTEPDBE = "SELECT COUNT(wrapperStepDBE) FROM WrapperStepDBE wrapperStepDBE";
	private static final String _SQL_COUNT_WRAPPERSTEPDBE_WHERE = "SELECT COUNT(wrapperStepDBE) FROM WrapperStepDBE wrapperStepDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wrapperStepDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WrapperStepDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No WrapperStepDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WrapperStepDBEPersistenceImpl.class);
	private static WrapperStepDBE _nullWrapperStepDBE = new WrapperStepDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WrapperStepDBE> toCacheModel() {
				return _nullWrapperStepDBECacheModel;
			}
		};

	private static CacheModel<WrapperStepDBE> _nullWrapperStepDBECacheModel = new CacheModel<WrapperStepDBE>() {
			@Override
			public WrapperStepDBE toEntityModel() {
				return _nullWrapperStepDBE;
			}
		};
}