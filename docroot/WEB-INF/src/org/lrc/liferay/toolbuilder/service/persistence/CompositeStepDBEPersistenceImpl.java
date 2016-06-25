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

import org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException;
import org.lrc.liferay.toolbuilder.model.CompositeStepDBE;
import org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the composite step d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDBEPersistence
 * @see CompositeStepDBEUtil
 * @generated
 */
public class CompositeStepDBEPersistenceImpl extends BasePersistenceImpl<CompositeStepDBE>
	implements CompositeStepDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CompositeStepDBEUtil} to access the composite step d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CompositeStepDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPOSITESTEPDBEID =
		new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDBEImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompositeStepDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDBEID =
		new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompositeStepDBEId", new String[] { Long.class.getName() },
			CompositeStepDBEModelImpl.COMPOSITESTEPDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPOSITESTEPDBEID = new FinderPath(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompositeStepDBEId", new String[] { Long.class.getName() });

	/**
	 * Returns all the composite step d b es where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @return the matching composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId) throws SystemException {
		return findByCompositeStepDBEId(compositeStepDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the composite step d b es where compositeStepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @return the range of matching composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId, int start, int end) throws SystemException {
		return findByCompositeStepDBEId(compositeStepDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the composite step d b es where compositeStepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findByCompositeStepDBEId(
		long compositeStepDBEId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDBEID;
			finderArgs = new Object[] { compositeStepDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPOSITESTEPDBEID;
			finderArgs = new Object[] {
					compositeStepDBEId,
					
					start, end, orderByComparator
				};
		}

		List<CompositeStepDBE> list = (List<CompositeStepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CompositeStepDBE compositeStepDBE : list) {
				if ((compositeStepDBEId != compositeStepDBE.getCompositeStepDBEId())) {
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

			query.append(_SQL_SELECT_COMPOSITESTEPDBE_WHERE);

			query.append(_FINDER_COLUMN_COMPOSITESTEPDBEID_COMPOSITESTEPDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CompositeStepDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(compositeStepDBEId);

				if (!pagination) {
					list = (List<CompositeStepDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompositeStepDBE>(list);
				}
				else {
					list = (List<CompositeStepDBE>)QueryUtil.list(q,
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
	 * Returns the first composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching composite step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a matching composite step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE findByCompositeStepDBEId_First(
		long compositeStepDBEId, OrderByComparator orderByComparator)
		throws NoSuchCompositeStepDBEException, SystemException {
		CompositeStepDBE compositeStepDBE = fetchByCompositeStepDBEId_First(compositeStepDBEId,
				orderByComparator);

		if (compositeStepDBE != null) {
			return compositeStepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compositeStepDBEId=");
		msg.append(compositeStepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompositeStepDBEException(msg.toString());
	}

	/**
	 * Returns the first composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching composite step d b e, or <code>null</code> if a matching composite step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE fetchByCompositeStepDBEId_First(
		long compositeStepDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CompositeStepDBE> list = findByCompositeStepDBEId(compositeStepDBEId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching composite step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a matching composite step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE findByCompositeStepDBEId_Last(
		long compositeStepDBEId, OrderByComparator orderByComparator)
		throws NoSuchCompositeStepDBEException, SystemException {
		CompositeStepDBE compositeStepDBE = fetchByCompositeStepDBEId_Last(compositeStepDBEId,
				orderByComparator);

		if (compositeStepDBE != null) {
			return compositeStepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compositeStepDBEId=");
		msg.append(compositeStepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompositeStepDBEException(msg.toString());
	}

	/**
	 * Returns the last composite step d b e in the ordered set where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching composite step d b e, or <code>null</code> if a matching composite step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE fetchByCompositeStepDBEId_Last(
		long compositeStepDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompositeStepDBEId(compositeStepDBEId);

		if (count == 0) {
			return null;
		}

		List<CompositeStepDBE> list = findByCompositeStepDBEId(compositeStepDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the composite step d b es where compositeStepDBEId = &#63; from the database.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompositeStepDBEId(long compositeStepDBEId)
		throws SystemException {
		for (CompositeStepDBE compositeStepDBE : findByCompositeStepDBEId(
				compositeStepDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(compositeStepDBE);
		}
	}

	/**
	 * Returns the number of composite step d b es where compositeStepDBEId = &#63;.
	 *
	 * @param compositeStepDBEId the composite step d b e ID
	 * @return the number of matching composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompositeStepDBEId(long compositeStepDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPOSITESTEPDBEID;

		Object[] finderArgs = new Object[] { compositeStepDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPOSITESTEPDBE_WHERE);

			query.append(_FINDER_COLUMN_COMPOSITESTEPDBEID_COMPOSITESTEPDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(compositeStepDBEId);

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

	private static final String _FINDER_COLUMN_COMPOSITESTEPDBEID_COMPOSITESTEPDBEID_2 =
		"compositeStepDBE.compositeStepDBEId = ?";

	public CompositeStepDBEPersistenceImpl() {
		setModelClass(CompositeStepDBE.class);
	}

	/**
	 * Caches the composite step d b e in the entity cache if it is enabled.
	 *
	 * @param compositeStepDBE the composite step d b e
	 */
	@Override
	public void cacheResult(CompositeStepDBE compositeStepDBE) {
		EntityCacheUtil.putResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEImpl.class, compositeStepDBE.getPrimaryKey(),
			compositeStepDBE);

		compositeStepDBE.resetOriginalValues();
	}

	/**
	 * Caches the composite step d b es in the entity cache if it is enabled.
	 *
	 * @param compositeStepDBEs the composite step d b es
	 */
	@Override
	public void cacheResult(List<CompositeStepDBE> compositeStepDBEs) {
		for (CompositeStepDBE compositeStepDBE : compositeStepDBEs) {
			if (EntityCacheUtil.getResult(
						CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
						CompositeStepDBEImpl.class,
						compositeStepDBE.getPrimaryKey()) == null) {
				cacheResult(compositeStepDBE);
			}
			else {
				compositeStepDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all composite step d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CompositeStepDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CompositeStepDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the composite step d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompositeStepDBE compositeStepDBE) {
		EntityCacheUtil.removeResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEImpl.class, compositeStepDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CompositeStepDBE> compositeStepDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CompositeStepDBE compositeStepDBE : compositeStepDBEs) {
			EntityCacheUtil.removeResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
				CompositeStepDBEImpl.class, compositeStepDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new composite step d b e with the primary key. Does not add the composite step d b e to the database.
	 *
	 * @param compositeStepDBEId the primary key for the new composite step d b e
	 * @return the new composite step d b e
	 */
	@Override
	public CompositeStepDBE create(long compositeStepDBEId) {
		CompositeStepDBE compositeStepDBE = new CompositeStepDBEImpl();

		compositeStepDBE.setNew(true);
		compositeStepDBE.setPrimaryKey(compositeStepDBEId);

		return compositeStepDBE;
	}

	/**
	 * Removes the composite step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param compositeStepDBEId the primary key of the composite step d b e
	 * @return the composite step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE remove(long compositeStepDBEId)
		throws NoSuchCompositeStepDBEException, SystemException {
		return remove((Serializable)compositeStepDBEId);
	}

	/**
	 * Removes the composite step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the composite step d b e
	 * @return the composite step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE remove(Serializable primaryKey)
		throws NoSuchCompositeStepDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CompositeStepDBE compositeStepDBE = (CompositeStepDBE)session.get(CompositeStepDBEImpl.class,
					primaryKey);

			if (compositeStepDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompositeStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(compositeStepDBE);
		}
		catch (NoSuchCompositeStepDBEException nsee) {
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
	protected CompositeStepDBE removeImpl(CompositeStepDBE compositeStepDBE)
		throws SystemException {
		compositeStepDBE = toUnwrappedModel(compositeStepDBE);

		compositeStepDBEToStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(compositeStepDBE.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(compositeStepDBE)) {
				compositeStepDBE = (CompositeStepDBE)session.get(CompositeStepDBEImpl.class,
						compositeStepDBE.getPrimaryKeyObj());
			}

			if (compositeStepDBE != null) {
				session.delete(compositeStepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (compositeStepDBE != null) {
			clearCache(compositeStepDBE);
		}

		return compositeStepDBE;
	}

	@Override
	public CompositeStepDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws SystemException {
		compositeStepDBE = toUnwrappedModel(compositeStepDBE);

		boolean isNew = compositeStepDBE.isNew();

		CompositeStepDBEModelImpl compositeStepDBEModelImpl = (CompositeStepDBEModelImpl)compositeStepDBE;

		Session session = null;

		try {
			session = openSession();

			if (compositeStepDBE.isNew()) {
				session.save(compositeStepDBE);

				compositeStepDBE.setNew(false);
			}
			else {
				session.merge(compositeStepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CompositeStepDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((compositeStepDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						compositeStepDBEModelImpl.getOriginalCompositeStepDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITESTEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDBEID,
					args);

				args = new Object[] {
						compositeStepDBEModelImpl.getCompositeStepDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITESTEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDBEImpl.class, compositeStepDBE.getPrimaryKey(),
			compositeStepDBE);

		return compositeStepDBE;
	}

	protected CompositeStepDBE toUnwrappedModel(
		CompositeStepDBE compositeStepDBE) {
		if (compositeStepDBE instanceof CompositeStepDBEImpl) {
			return compositeStepDBE;
		}

		CompositeStepDBEImpl compositeStepDBEImpl = new CompositeStepDBEImpl();

		compositeStepDBEImpl.setNew(compositeStepDBE.isNew());
		compositeStepDBEImpl.setPrimaryKey(compositeStepDBE.getPrimaryKey());

		compositeStepDBEImpl.setCompositeStepDBEId(compositeStepDBE.getCompositeStepDBEId());
		compositeStepDBEImpl.setCurrentStep(compositeStepDBE.getCurrentStep());
		compositeStepDBEImpl.setCompositeStepDefDBEId(compositeStepDBE.getCompositeStepDefDBEId());

		return compositeStepDBEImpl;
	}

	/**
	 * Returns the composite step d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the composite step d b e
	 * @return the composite step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompositeStepDBEException, SystemException {
		CompositeStepDBE compositeStepDBE = fetchByPrimaryKey(primaryKey);

		if (compositeStepDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompositeStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return compositeStepDBE;
	}

	/**
	 * Returns the composite step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException} if it could not be found.
	 *
	 * @param compositeStepDBEId the primary key of the composite step d b e
	 * @return the composite step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDBEException if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE findByPrimaryKey(long compositeStepDBEId)
		throws NoSuchCompositeStepDBEException, SystemException {
		return findByPrimaryKey((Serializable)compositeStepDBEId);
	}

	/**
	 * Returns the composite step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the composite step d b e
	 * @return the composite step d b e, or <code>null</code> if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CompositeStepDBE compositeStepDBE = (CompositeStepDBE)EntityCacheUtil.getResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
				CompositeStepDBEImpl.class, primaryKey);

		if (compositeStepDBE == _nullCompositeStepDBE) {
			return null;
		}

		if (compositeStepDBE == null) {
			Session session = null;

			try {
				session = openSession();

				compositeStepDBE = (CompositeStepDBE)session.get(CompositeStepDBEImpl.class,
						primaryKey);

				if (compositeStepDBE != null) {
					cacheResult(compositeStepDBE);
				}
				else {
					EntityCacheUtil.putResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
						CompositeStepDBEImpl.class, primaryKey,
						_nullCompositeStepDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CompositeStepDBEModelImpl.ENTITY_CACHE_ENABLED,
					CompositeStepDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return compositeStepDBE;
	}

	/**
	 * Returns the composite step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param compositeStepDBEId the primary key of the composite step d b e
	 * @return the composite step d b e, or <code>null</code> if a composite step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDBE fetchByPrimaryKey(long compositeStepDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)compositeStepDBEId);
	}

	/**
	 * Returns all the composite step d b es.
	 *
	 * @return the composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the composite step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @return the range of composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the composite step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDBE> findAll(int start, int end,
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

		List<CompositeStepDBE> list = (List<CompositeStepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COMPOSITESTEPDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPOSITESTEPDBE;

				if (pagination) {
					sql = sql.concat(CompositeStepDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CompositeStepDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompositeStepDBE>(list);
				}
				else {
					list = (List<CompositeStepDBE>)QueryUtil.list(q,
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
	 * Removes all the composite step d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CompositeStepDBE compositeStepDBE : findAll()) {
			remove(compositeStepDBE);
		}
	}

	/**
	 * Returns the number of composite step d b es.
	 *
	 * @return the number of composite step d b es
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

				Query q = session.createQuery(_SQL_COUNT_COMPOSITESTEPDBE);

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
	 * Returns all the step d b es associated with the composite step d b e.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @return the step d b es associated with the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(long pk)
		throws SystemException {
		return getStepDBEs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the step d b es associated with the composite step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @return the range of step d b es associated with the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end) throws SystemException {
		return getStepDBEs(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the step d b es associated with the composite step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param start the lower bound of the range of composite step d b es
	 * @param end the upper bound of the range of composite step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of step d b es associated with the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return compositeStepDBEToStepDBETableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of step d b es associated with the composite step d b e.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @return the number of step d b es associated with the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStepDBEsSize(long pk) throws SystemException {
		long[] pks = compositeStepDBEToStepDBETableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the step d b e is associated with the composite step d b e.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @return <code>true</code> if the step d b e is associated with the composite step d b e; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDBE(long pk, long stepDBEPK)
		throws SystemException {
		return compositeStepDBEToStepDBETableMapper.containsTableMapping(pk,
			stepDBEPK);
	}

	/**
	 * Returns <code>true</code> if the composite step d b e has any step d b es associated with it.
	 *
	 * @param pk the primary key of the composite step d b e to check for associations with step d b es
	 * @return <code>true</code> if the composite step d b e has any step d b es associated with it; <code>false</code> otherwise
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
	 * Adds an association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBE(long pk, long stepDBEPK) throws SystemException {
		compositeStepDBEToStepDBETableMapper.addTableMapping(pk, stepDBEPK);
	}

	/**
	 * Adds an association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBE the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws SystemException {
		compositeStepDBEToStepDBETableMapper.addTableMapping(pk,
			stepDBE.getPrimaryKey());
	}

	/**
	 * Adds an association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPKs the primary keys of the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		for (long stepDBEPK : stepDBEPKs) {
			compositeStepDBEToStepDBETableMapper.addTableMapping(pk, stepDBEPK);
		}
	}

	/**
	 * Adds an association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEs the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDBE stepDBE : stepDBEs) {
			compositeStepDBEToStepDBETableMapper.addTableMapping(pk,
				stepDBE.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the composite step d b e and its step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e to clear the associated step d b es from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearStepDBEs(long pk) throws SystemException {
		compositeStepDBEToStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPK the primary key of the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBE(long pk, long stepDBEPK)
		throws SystemException {
		compositeStepDBEToStepDBETableMapper.deleteTableMapping(pk, stepDBEPK);
	}

	/**
	 * Removes the association between the composite step d b e and the step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBE the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws SystemException {
		compositeStepDBEToStepDBETableMapper.deleteTableMapping(pk,
			stepDBE.getPrimaryKey());
	}

	/**
	 * Removes the association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPKs the primary keys of the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		for (long stepDBEPK : stepDBEPKs) {
			compositeStepDBEToStepDBETableMapper.deleteTableMapping(pk,
				stepDBEPK);
		}
	}

	/**
	 * Removes the association between the composite step d b e and the step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEs the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDBE> stepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDBE stepDBE : stepDBEs) {
			compositeStepDBEToStepDBETableMapper.deleteTableMapping(pk,
				stepDBE.getPrimaryKey());
		}
	}

	/**
	 * Sets the step d b es associated with the composite step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEPKs the primary keys of the step d b es to be associated with the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDBEs(long pk, long[] stepDBEPKs)
		throws SystemException {
		Set<Long> newStepDBEPKsSet = SetUtil.fromArray(stepDBEPKs);
		Set<Long> oldStepDBEPKsSet = SetUtil.fromArray(compositeStepDBEToStepDBETableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeStepDBEPKsSet = new HashSet<Long>(oldStepDBEPKsSet);

		removeStepDBEPKsSet.removeAll(newStepDBEPKsSet);

		for (long removeStepDBEPK : removeStepDBEPKsSet) {
			compositeStepDBEToStepDBETableMapper.deleteTableMapping(pk,
				removeStepDBEPK);
		}

		newStepDBEPKsSet.removeAll(oldStepDBEPKsSet);

		for (long newStepDBEPK : newStepDBEPKsSet) {
			compositeStepDBEToStepDBETableMapper.addTableMapping(pk,
				newStepDBEPK);
		}
	}

	/**
	 * Sets the step d b es associated with the composite step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step d b e
	 * @param stepDBEs the step d b es to be associated with the composite step d b e
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
			FinderCacheUtil.clearCache(CompositeStepDBEModelImpl.MAPPING_TABLE_LRC_TB_CS_STEP_NAME);
		}
	}

	/**
	 * Initializes the composite step d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.CompositeStepDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CompositeStepDBE>> listenersList = new ArrayList<ModelListener<CompositeStepDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CompositeStepDBE>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		compositeStepDBEToStepDBETableMapper = TableMapperFactory.getTableMapper("lrc_tb_CS_Step",
				"compositeStepDBEId", "stepDBEId", this, stepDBEPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CompositeStepDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("lrc_tb_CS_Step");
	}

	@BeanReference(type = StepDBEPersistence.class)
	protected StepDBEPersistence stepDBEPersistence;
	protected TableMapper<CompositeStepDBE, org.lrc.liferay.toolbuilder.model.StepDBE> compositeStepDBEToStepDBETableMapper;
	private static final String _SQL_SELECT_COMPOSITESTEPDBE = "SELECT compositeStepDBE FROM CompositeStepDBE compositeStepDBE";
	private static final String _SQL_SELECT_COMPOSITESTEPDBE_WHERE = "SELECT compositeStepDBE FROM CompositeStepDBE compositeStepDBE WHERE ";
	private static final String _SQL_COUNT_COMPOSITESTEPDBE = "SELECT COUNT(compositeStepDBE) FROM CompositeStepDBE compositeStepDBE";
	private static final String _SQL_COUNT_COMPOSITESTEPDBE_WHERE = "SELECT COUNT(compositeStepDBE) FROM CompositeStepDBE compositeStepDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "compositeStepDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CompositeStepDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CompositeStepDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CompositeStepDBEPersistenceImpl.class);
	private static CompositeStepDBE _nullCompositeStepDBE = new CompositeStepDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CompositeStepDBE> toCacheModel() {
				return _nullCompositeStepDBECacheModel;
			}
		};

	private static CacheModel<CompositeStepDBE> _nullCompositeStepDBECacheModel = new CacheModel<CompositeStepDBE>() {
			@Override
			public CompositeStepDBE toEntityModel() {
				return _nullCompositeStepDBE;
			}
		};
}