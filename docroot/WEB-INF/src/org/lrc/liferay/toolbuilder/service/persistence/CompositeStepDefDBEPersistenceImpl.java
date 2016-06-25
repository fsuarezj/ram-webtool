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

import org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException;
import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;
import org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the composite step def d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBEPersistence
 * @see CompositeStepDefDBEUtil
 * @generated
 */
public class CompositeStepDefDBEPersistenceImpl extends BasePersistenceImpl<CompositeStepDefDBE>
	implements CompositeStepDefDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CompositeStepDefDBEUtil} to access the composite step def d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CompositeStepDefDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID =
		new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCompositeStepDefDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID =
		new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCompositeStepDefDBEId",
			new String[] { Long.class.getName() },
			CompositeStepDefDBEModelImpl.COMPOSITESTEPDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPOSITESTEPDEFDBEID = new FinderPath(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCompositeStepDefDBEId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the composite step def d b es where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @return the matching composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId) throws SystemException {
		return findByCompositeStepDefDBEId(compositeStepDefDBEId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the composite step def d b es where compositeStepDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @return the range of matching composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId, int start, int end)
		throws SystemException {
		return findByCompositeStepDefDBEId(compositeStepDefDBEId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the composite step def d b es where compositeStepDefDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findByCompositeStepDefDBEId(
		long compositeStepDefDBEId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID;
			finderArgs = new Object[] { compositeStepDefDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID;
			finderArgs = new Object[] {
					compositeStepDefDBEId,
					
					start, end, orderByComparator
				};
		}

		List<CompositeStepDefDBE> list = (List<CompositeStepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CompositeStepDefDBE compositeStepDefDBE : list) {
				if ((compositeStepDefDBEId != compositeStepDefDBE.getCompositeStepDefDBEId())) {
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

			query.append(_SQL_SELECT_COMPOSITESTEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_COMPOSITESTEPDEFDBEID_COMPOSITESTEPDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CompositeStepDefDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(compositeStepDefDBEId);

				if (!pagination) {
					list = (List<CompositeStepDefDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompositeStepDefDBE>(list);
				}
				else {
					list = (List<CompositeStepDefDBE>)QueryUtil.list(q,
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
	 * Returns the first composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching composite step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a matching composite step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE findByCompositeStepDefDBEId_First(
		long compositeStepDefDBEId, OrderByComparator orderByComparator)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		CompositeStepDefDBE compositeStepDefDBE = fetchByCompositeStepDefDBEId_First(compositeStepDefDBEId,
				orderByComparator);

		if (compositeStepDefDBE != null) {
			return compositeStepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compositeStepDefDBEId=");
		msg.append(compositeStepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompositeStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the first composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching composite step def d b e, or <code>null</code> if a matching composite step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE fetchByCompositeStepDefDBEId_First(
		long compositeStepDefDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CompositeStepDefDBE> list = findByCompositeStepDefDBEId(compositeStepDefDBEId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching composite step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a matching composite step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE findByCompositeStepDefDBEId_Last(
		long compositeStepDefDBEId, OrderByComparator orderByComparator)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		CompositeStepDefDBE compositeStepDefDBE = fetchByCompositeStepDefDBEId_Last(compositeStepDefDBEId,
				orderByComparator);

		if (compositeStepDefDBE != null) {
			return compositeStepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("compositeStepDefDBEId=");
		msg.append(compositeStepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCompositeStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the last composite step def d b e in the ordered set where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching composite step def d b e, or <code>null</code> if a matching composite step def d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE fetchByCompositeStepDefDBEId_Last(
		long compositeStepDefDBEId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCompositeStepDefDBEId(compositeStepDefDBEId);

		if (count == 0) {
			return null;
		}

		List<CompositeStepDefDBE> list = findByCompositeStepDefDBEId(compositeStepDefDBEId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the composite step def d b es where compositeStepDefDBEId = &#63; from the database.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCompositeStepDefDBEId(long compositeStepDefDBEId)
		throws SystemException {
		for (CompositeStepDefDBE compositeStepDefDBE : findByCompositeStepDefDBEId(
				compositeStepDefDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(compositeStepDefDBE);
		}
	}

	/**
	 * Returns the number of composite step def d b es where compositeStepDefDBEId = &#63;.
	 *
	 * @param compositeStepDefDBEId the composite step def d b e ID
	 * @return the number of matching composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCompositeStepDefDBEId(long compositeStepDefDBEId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPOSITESTEPDEFDBEID;

		Object[] finderArgs = new Object[] { compositeStepDefDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMPOSITESTEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_COMPOSITESTEPDEFDBEID_COMPOSITESTEPDEFDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(compositeStepDefDBEId);

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

	private static final String _FINDER_COLUMN_COMPOSITESTEPDEFDBEID_COMPOSITESTEPDEFDBEID_2 =
		"compositeStepDefDBE.compositeStepDefDBEId = ?";

	public CompositeStepDefDBEPersistenceImpl() {
		setModelClass(CompositeStepDefDBE.class);
	}

	/**
	 * Caches the composite step def d b e in the entity cache if it is enabled.
	 *
	 * @param compositeStepDefDBE the composite step def d b e
	 */
	@Override
	public void cacheResult(CompositeStepDefDBE compositeStepDefDBE) {
		EntityCacheUtil.putResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class, compositeStepDefDBE.getPrimaryKey(),
			compositeStepDefDBE);

		compositeStepDefDBE.resetOriginalValues();
	}

	/**
	 * Caches the composite step def d b es in the entity cache if it is enabled.
	 *
	 * @param compositeStepDefDBEs the composite step def d b es
	 */
	@Override
	public void cacheResult(List<CompositeStepDefDBE> compositeStepDefDBEs) {
		for (CompositeStepDefDBE compositeStepDefDBE : compositeStepDefDBEs) {
			if (EntityCacheUtil.getResult(
						CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						CompositeStepDefDBEImpl.class,
						compositeStepDefDBE.getPrimaryKey()) == null) {
				cacheResult(compositeStepDefDBE);
			}
			else {
				compositeStepDefDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all composite step def d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CompositeStepDefDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CompositeStepDefDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the composite step def d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CompositeStepDefDBE compositeStepDefDBE) {
		EntityCacheUtil.removeResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class, compositeStepDefDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CompositeStepDefDBE> compositeStepDefDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CompositeStepDefDBE compositeStepDefDBE : compositeStepDefDBEs) {
			EntityCacheUtil.removeResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				CompositeStepDefDBEImpl.class,
				compositeStepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new composite step def d b e with the primary key. Does not add the composite step def d b e to the database.
	 *
	 * @param compositeStepDefDBEId the primary key for the new composite step def d b e
	 * @return the new composite step def d b e
	 */
	@Override
	public CompositeStepDefDBE create(long compositeStepDefDBEId) {
		CompositeStepDefDBE compositeStepDefDBE = new CompositeStepDefDBEImpl();

		compositeStepDefDBE.setNew(true);
		compositeStepDefDBE.setPrimaryKey(compositeStepDefDBEId);

		return compositeStepDefDBE;
	}

	/**
	 * Removes the composite step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param compositeStepDefDBEId the primary key of the composite step def d b e
	 * @return the composite step def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE remove(long compositeStepDefDBEId)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		return remove((Serializable)compositeStepDefDBEId);
	}

	/**
	 * Removes the composite step def d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the composite step def d b e
	 * @return the composite step def d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE remove(Serializable primaryKey)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CompositeStepDefDBE compositeStepDefDBE = (CompositeStepDefDBE)session.get(CompositeStepDefDBEImpl.class,
					primaryKey);

			if (compositeStepDefDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCompositeStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(compositeStepDefDBE);
		}
		catch (NoSuchCompositeStepDefDBEException nsee) {
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
	protected CompositeStepDefDBE removeImpl(
		CompositeStepDefDBE compositeStepDefDBE) throws SystemException {
		compositeStepDefDBE = toUnwrappedModel(compositeStepDefDBE);

		compositeStepDefDBEToStepDefDBETableMapper.deleteLeftPrimaryKeyTableMappings(compositeStepDefDBE.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(compositeStepDefDBE)) {
				compositeStepDefDBE = (CompositeStepDefDBE)session.get(CompositeStepDefDBEImpl.class,
						compositeStepDefDBE.getPrimaryKeyObj());
			}

			if (compositeStepDefDBE != null) {
				session.delete(compositeStepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (compositeStepDefDBE != null) {
			clearCache(compositeStepDefDBE);
		}

		return compositeStepDefDBE;
	}

	@Override
	public CompositeStepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE)
		throws SystemException {
		compositeStepDefDBE = toUnwrappedModel(compositeStepDefDBE);

		boolean isNew = compositeStepDefDBE.isNew();

		CompositeStepDefDBEModelImpl compositeStepDefDBEModelImpl = (CompositeStepDefDBEModelImpl)compositeStepDefDBE;

		Session session = null;

		try {
			session = openSession();

			if (compositeStepDefDBE.isNew()) {
				session.save(compositeStepDefDBE);

				compositeStepDefDBE.setNew(false);
			}
			else {
				session.merge(compositeStepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CompositeStepDefDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((compositeStepDefDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						compositeStepDefDBEModelImpl.getOriginalCompositeStepDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITESTEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID,
					args);

				args = new Object[] {
						compositeStepDefDBEModelImpl.getCompositeStepDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITESTEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPOSITESTEPDEFDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			CompositeStepDefDBEImpl.class, compositeStepDefDBE.getPrimaryKey(),
			compositeStepDefDBE);

		return compositeStepDefDBE;
	}

	protected CompositeStepDefDBE toUnwrappedModel(
		CompositeStepDefDBE compositeStepDefDBE) {
		if (compositeStepDefDBE instanceof CompositeStepDefDBEImpl) {
			return compositeStepDefDBE;
		}

		CompositeStepDefDBEImpl compositeStepDefDBEImpl = new CompositeStepDefDBEImpl();

		compositeStepDefDBEImpl.setNew(compositeStepDefDBE.isNew());
		compositeStepDefDBEImpl.setPrimaryKey(compositeStepDefDBE.getPrimaryKey());

		compositeStepDefDBEImpl.setCompositeStepDefDBEId(compositeStepDefDBE.getCompositeStepDefDBEId());
		compositeStepDefDBEImpl.setStepsNumber(compositeStepDefDBE.getStepsNumber());
		compositeStepDefDBEImpl.setSequential(compositeStepDefDBE.isSequential());
		compositeStepDefDBEImpl.setDepth(compositeStepDefDBE.getDepth());

		return compositeStepDefDBEImpl;
	}

	/**
	 * Returns the composite step def d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the composite step def d b e
	 * @return the composite step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		CompositeStepDefDBE compositeStepDefDBE = fetchByPrimaryKey(primaryKey);

		if (compositeStepDefDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCompositeStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return compositeStepDefDBE;
	}

	/**
	 * Returns the composite step def d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException} if it could not be found.
	 *
	 * @param compositeStepDefDBEId the primary key of the composite step def d b e
	 * @return the composite step def d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchCompositeStepDefDBEException if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE findByPrimaryKey(long compositeStepDefDBEId)
		throws NoSuchCompositeStepDefDBEException, SystemException {
		return findByPrimaryKey((Serializable)compositeStepDefDBEId);
	}

	/**
	 * Returns the composite step def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the composite step def d b e
	 * @return the composite step def d b e, or <code>null</code> if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CompositeStepDefDBE compositeStepDefDBE = (CompositeStepDefDBE)EntityCacheUtil.getResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				CompositeStepDefDBEImpl.class, primaryKey);

		if (compositeStepDefDBE == _nullCompositeStepDefDBE) {
			return null;
		}

		if (compositeStepDefDBE == null) {
			Session session = null;

			try {
				session = openSession();

				compositeStepDefDBE = (CompositeStepDefDBE)session.get(CompositeStepDefDBEImpl.class,
						primaryKey);

				if (compositeStepDefDBE != null) {
					cacheResult(compositeStepDefDBE);
				}
				else {
					EntityCacheUtil.putResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						CompositeStepDefDBEImpl.class, primaryKey,
						_nullCompositeStepDefDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CompositeStepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
					CompositeStepDefDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return compositeStepDefDBE;
	}

	/**
	 * Returns the composite step def d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param compositeStepDefDBEId the primary key of the composite step def d b e
	 * @return the composite step def d b e, or <code>null</code> if a composite step def d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CompositeStepDefDBE fetchByPrimaryKey(long compositeStepDefDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)compositeStepDefDBEId);
	}

	/**
	 * Returns all the composite step def d b es.
	 *
	 * @return the composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the composite step def d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @return the range of composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the composite step def d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of composite step def d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CompositeStepDefDBE> findAll(int start, int end,
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

		List<CompositeStepDefDBE> list = (List<CompositeStepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COMPOSITESTEPDEFDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMPOSITESTEPDEFDBE;

				if (pagination) {
					sql = sql.concat(CompositeStepDefDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CompositeStepDefDBE>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CompositeStepDefDBE>(list);
				}
				else {
					list = (List<CompositeStepDefDBE>)QueryUtil.list(q,
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
	 * Removes all the composite step def d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CompositeStepDefDBE compositeStepDefDBE : findAll()) {
			remove(compositeStepDefDBE);
		}
	}

	/**
	 * Returns the number of composite step def d b es.
	 *
	 * @return the number of composite step def d b es
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

				Query q = session.createQuery(_SQL_COUNT_COMPOSITESTEPDEFDBE);

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
	 * Returns all the Step Definitions associated with the composite step def d b e.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @return the Step Definitions associated with the composite step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk) throws SystemException {
		return getStepDefDBEs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the Step Definitions associated with the composite step def d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @return the range of Step Definitions associated with the composite step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end) throws SystemException {
		return getStepDefDBEs(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Step Definitions associated with the composite step def d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.CompositeStepDefDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param start the lower bound of the range of composite step def d b es
	 * @param end the upper bound of the range of composite step def d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Step Definitions associated with the composite step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return compositeStepDefDBEToStepDefDBETableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of Step Definitions associated with the composite step def d b e.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @return the number of Step Definitions associated with the composite step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getStepDefDBEsSize(long pk) throws SystemException {
		long[] pks = compositeStepDefDBEToStepDefDBETableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the Step Definition is associated with the composite step def d b e.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @return <code>true</code> if the Step Definition is associated with the composite step def d b e; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		return compositeStepDefDBEToStepDefDBETableMapper.containsTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Returns <code>true</code> if the composite step def d b e has any Step Definitions associated with it.
	 *
	 * @param pk the primary key of the composite step def d b e to check for associations with Step Definitions
	 * @return <code>true</code> if the composite step def d b e has any Step Definitions associated with it; <code>false</code> otherwise
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
	 * Adds an association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		compositeStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Adds an association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBE the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws SystemException {
		compositeStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
			stepDefDBE.getPrimaryKey());
	}

	/**
	 * Adds an association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		for (long stepDefDBEPK : stepDefDBEPKs) {
			compositeStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				stepDefDBEPK);
		}
	}

	/**
	 * Adds an association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEs the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addStepDefDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE : stepDefDBEs) {
			compositeStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				stepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the composite step def d b e and its Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e to clear the associated Step Definitions from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearStepDefDBEs(long pk) throws SystemException {
		compositeStepDefDBEToStepDefDBETableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPK the primary key of the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBE(long pk, long stepDefDBEPK)
		throws SystemException {
		compositeStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
			stepDefDBEPK);
	}

	/**
	 * Removes the association between the composite step def d b e and the Step Definition. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBE the Step Definition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBE(long pk,
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws SystemException {
		compositeStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
			stepDefDBE.getPrimaryKey());
	}

	/**
	 * Removes the association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		for (long stepDefDBEPK : stepDefDBEPKs) {
			compositeStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				stepDefDBEPK);
		}
	}

	/**
	 * Removes the association between the composite step def d b e and the Step Definitions. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEs the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeStepDefDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.StepDefDBE> stepDefDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE : stepDefDBEs) {
			compositeStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				stepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Sets the Step Definitions associated with the composite step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEPKs the primary keys of the Step Definitions to be associated with the composite step def d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setStepDefDBEs(long pk, long[] stepDefDBEPKs)
		throws SystemException {
		Set<Long> newStepDefDBEPKsSet = SetUtil.fromArray(stepDefDBEPKs);
		Set<Long> oldStepDefDBEPKsSet = SetUtil.fromArray(compositeStepDefDBEToStepDefDBETableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeStepDefDBEPKsSet = new HashSet<Long>(oldStepDefDBEPKsSet);

		removeStepDefDBEPKsSet.removeAll(newStepDefDBEPKsSet);

		for (long removeStepDefDBEPK : removeStepDefDBEPKsSet) {
			compositeStepDefDBEToStepDefDBETableMapper.deleteTableMapping(pk,
				removeStepDefDBEPK);
		}

		newStepDefDBEPKsSet.removeAll(oldStepDefDBEPKsSet);

		for (long newStepDefDBEPK : newStepDefDBEPKsSet) {
			compositeStepDefDBEToStepDefDBETableMapper.addTableMapping(pk,
				newStepDefDBEPK);
		}
	}

	/**
	 * Sets the Step Definitions associated with the composite step def d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the composite step def d b e
	 * @param stepDefDBEs the Step Definitions to be associated with the composite step def d b e
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
			FinderCacheUtil.clearCache(CompositeStepDefDBEModelImpl.MAPPING_TABLE_LRC_TB_CSDEF_STEPDEF_NAME);
		}
	}

	/**
	 * Initializes the composite step def d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CompositeStepDefDBE>> listenersList = new ArrayList<ModelListener<CompositeStepDefDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CompositeStepDefDBE>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		compositeStepDefDBEToStepDefDBETableMapper = TableMapperFactory.getTableMapper("lrc_tb_CSDef_StepDef",
				"compositeStepDefDBEId", "stepDefDBEId", this,
				stepDefDBEPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CompositeStepDefDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("lrc_tb_CSDef_StepDef");
	}

	@BeanReference(type = StepDefDBEPersistence.class)
	protected StepDefDBEPersistence stepDefDBEPersistence;
	protected TableMapper<CompositeStepDefDBE, org.lrc.liferay.toolbuilder.model.StepDefDBE> compositeStepDefDBEToStepDefDBETableMapper;
	private static final String _SQL_SELECT_COMPOSITESTEPDEFDBE = "SELECT compositeStepDefDBE FROM CompositeStepDefDBE compositeStepDefDBE";
	private static final String _SQL_SELECT_COMPOSITESTEPDEFDBE_WHERE = "SELECT compositeStepDefDBE FROM CompositeStepDefDBE compositeStepDefDBE WHERE ";
	private static final String _SQL_COUNT_COMPOSITESTEPDEFDBE = "SELECT COUNT(compositeStepDefDBE) FROM CompositeStepDefDBE compositeStepDefDBE";
	private static final String _SQL_COUNT_COMPOSITESTEPDEFDBE_WHERE = "SELECT COUNT(compositeStepDefDBE) FROM CompositeStepDefDBE compositeStepDefDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "compositeStepDefDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CompositeStepDefDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CompositeStepDefDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CompositeStepDefDBEPersistenceImpl.class);
	private static CompositeStepDefDBE _nullCompositeStepDefDBE = new CompositeStepDefDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CompositeStepDefDBE> toCacheModel() {
				return _nullCompositeStepDefDBECacheModel;
			}
		};

	private static CacheModel<CompositeStepDefDBE> _nullCompositeStepDefDBECacheModel =
		new CacheModel<CompositeStepDefDBE>() {
			@Override
			public CompositeStepDefDBE toEntityModel() {
				return _nullCompositeStepDefDBE;
			}
		};
}