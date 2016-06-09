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

import org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.model.impl.StepDefDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.StepDefDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the Step Definition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDefDBEPersistence
 * @see StepDefDBEUtil
 * @generated
 */
public class StepDefDBEPersistenceImpl extends BasePersistenceImpl<StepDefDBE>
	implements StepDefDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StepDefDBEUtil} to access the Step Definition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StepDefDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, StepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, StepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STEPDEFDBEID =
		new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, StepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStepDefDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDEFDBEID =
		new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, StepDefDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStepDefDBEId",
			new String[] { Long.class.getName() },
			StepDefDBEModelImpl.STEPDEFDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STEPDEFDBEID = new FinderPath(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStepDefDBEId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the Step Definitions where stepDefDBEId = &#63;.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @return the matching Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDefDBE> findByStepDefDBEId(long stepDefDBEId)
		throws SystemException {
		return findByStepDefDBEId(stepDefDBEId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<StepDefDBE> findByStepDefDBEId(long stepDefDBEId, int start,
		int end) throws SystemException {
		return findByStepDefDBEId(stepDefDBEId, start, end, null);
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
	@Override
	public List<StepDefDBE> findByStepDefDBEId(long stepDefDBEId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDEFDBEID;
			finderArgs = new Object[] { stepDefDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STEPDEFDBEID;
			finderArgs = new Object[] {
					stepDefDBEId,
					
					start, end, orderByComparator
				};
		}

		List<StepDefDBE> list = (List<StepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StepDefDBE stepDefDBE : list) {
				if ((stepDefDBEId != stepDefDBE.getStepDefDBEId())) {
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

			query.append(_SQL_SELECT_STEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_STEPDEFDBEID_STEPDEFDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StepDefDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(stepDefDBEId);

				if (!pagination) {
					list = (List<StepDefDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StepDefDBE>(list);
				}
				else {
					list = (List<StepDefDBE>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Step Definition
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a matching Step Definition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE findByStepDefDBEId_First(long stepDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchStepDefDBEException, SystemException {
		StepDefDBE stepDefDBE = fetchByStepDefDBEId_First(stepDefDBEId,
				orderByComparator);

		if (stepDefDBE != null) {
			return stepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stepDefDBEId=");
		msg.append(stepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the first Step Definition in the ordered set where stepDefDBEId = &#63;.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE fetchByStepDefDBEId_First(long stepDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<StepDefDBE> list = findByStepDefDBEId(stepDefDBEId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StepDefDBE findByStepDefDBEId_Last(long stepDefDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchStepDefDBEException, SystemException {
		StepDefDBE stepDefDBE = fetchByStepDefDBEId_Last(stepDefDBEId,
				orderByComparator);

		if (stepDefDBE != null) {
			return stepDefDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stepDefDBEId=");
		msg.append(stepDefDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStepDefDBEException(msg.toString());
	}

	/**
	 * Returns the last Step Definition in the ordered set where stepDefDBEId = &#63;.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Step Definition, or <code>null</code> if a matching Step Definition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE fetchByStepDefDBEId_Last(long stepDefDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStepDefDBEId(stepDefDBEId);

		if (count == 0) {
			return null;
		}

		List<StepDefDBE> list = findByStepDefDBEId(stepDefDBEId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the Step Definitions where stepDefDBEId = &#63; from the database.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStepDefDBEId(long stepDefDBEId)
		throws SystemException {
		for (StepDefDBE stepDefDBE : findByStepDefDBEId(stepDefDBEId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(stepDefDBE);
		}
	}

	/**
	 * Returns the number of Step Definitions where stepDefDBEId = &#63;.
	 *
	 * @param stepDefDBEId the step def d b e ID
	 * @return the number of matching Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStepDefDBEId(long stepDefDBEId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STEPDEFDBEID;

		Object[] finderArgs = new Object[] { stepDefDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STEPDEFDBE_WHERE);

			query.append(_FINDER_COLUMN_STEPDEFDBEID_STEPDEFDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(stepDefDBEId);

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

	private static final String _FINDER_COLUMN_STEPDEFDBEID_STEPDEFDBEID_2 = "stepDefDBE.stepDefDBEId = ?";

	public StepDefDBEPersistenceImpl() {
		setModelClass(StepDefDBE.class);
	}

	/**
	 * Caches the Step Definition in the entity cache if it is enabled.
	 *
	 * @param stepDefDBE the Step Definition
	 */
	@Override
	public void cacheResult(StepDefDBE stepDefDBE) {
		EntityCacheUtil.putResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEImpl.class, stepDefDBE.getPrimaryKey(), stepDefDBE);

		stepDefDBE.resetOriginalValues();
	}

	/**
	 * Caches the Step Definitions in the entity cache if it is enabled.
	 *
	 * @param stepDefDBEs the Step Definitions
	 */
	@Override
	public void cacheResult(List<StepDefDBE> stepDefDBEs) {
		for (StepDefDBE stepDefDBE : stepDefDBEs) {
			if (EntityCacheUtil.getResult(
						StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						StepDefDBEImpl.class, stepDefDBE.getPrimaryKey()) == null) {
				cacheResult(stepDefDBE);
			}
			else {
				stepDefDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Step Definitions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StepDefDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StepDefDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Step Definition.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StepDefDBE stepDefDBE) {
		EntityCacheUtil.removeResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEImpl.class, stepDefDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StepDefDBE> stepDefDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StepDefDBE stepDefDBE : stepDefDBEs) {
			EntityCacheUtil.removeResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				StepDefDBEImpl.class, stepDefDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Step Definition with the primary key. Does not add the Step Definition to the database.
	 *
	 * @param stepDefDBEId the primary key for the new Step Definition
	 * @return the new Step Definition
	 */
	@Override
	public StepDefDBE create(long stepDefDBEId) {
		StepDefDBE stepDefDBE = new StepDefDBEImpl();

		stepDefDBE.setNew(true);
		stepDefDBE.setPrimaryKey(stepDefDBEId);

		return stepDefDBE;
	}

	/**
	 * Removes the Step Definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stepDefDBEId the primary key of the Step Definition
	 * @return the Step Definition that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE remove(long stepDefDBEId)
		throws NoSuchStepDefDBEException, SystemException {
		return remove((Serializable)stepDefDBEId);
	}

	/**
	 * Removes the Step Definition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Step Definition
	 * @return the Step Definition that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE remove(Serializable primaryKey)
		throws NoSuchStepDefDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StepDefDBE stepDefDBE = (StepDefDBE)session.get(StepDefDBEImpl.class,
					primaryKey);

			if (stepDefDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stepDefDBE);
		}
		catch (NoSuchStepDefDBEException nsee) {
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
	protected StepDefDBE removeImpl(StepDefDBE stepDefDBE)
		throws SystemException {
		stepDefDBE = toUnwrappedModel(stepDefDBE);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stepDefDBE)) {
				stepDefDBE = (StepDefDBE)session.get(StepDefDBEImpl.class,
						stepDefDBE.getPrimaryKeyObj());
			}

			if (stepDefDBE != null) {
				session.delete(stepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stepDefDBE != null) {
			clearCache(stepDefDBE);
		}

		return stepDefDBE;
	}

	@Override
	public StepDefDBE updateImpl(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE)
		throws SystemException {
		stepDefDBE = toUnwrappedModel(stepDefDBE);

		boolean isNew = stepDefDBE.isNew();

		StepDefDBEModelImpl stepDefDBEModelImpl = (StepDefDBEModelImpl)stepDefDBE;

		Session session = null;

		try {
			session = openSession();

			if (stepDefDBE.isNew()) {
				session.save(stepDefDBE);

				stepDefDBE.setNew(false);
			}
			else {
				session.merge(stepDefDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StepDefDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((stepDefDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDEFDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stepDefDBEModelImpl.getOriginalStepDefDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDEFDBEID,
					args);

				args = new Object[] { stepDefDBEModelImpl.getStepDefDBEId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPDEFDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDEFDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDefDBEImpl.class, stepDefDBE.getPrimaryKey(), stepDefDBE);

		return stepDefDBE;
	}

	protected StepDefDBE toUnwrappedModel(StepDefDBE stepDefDBE) {
		if (stepDefDBE instanceof StepDefDBEImpl) {
			return stepDefDBE;
		}

		StepDefDBEImpl stepDefDBEImpl = new StepDefDBEImpl();

		stepDefDBEImpl.setNew(stepDefDBE.isNew());
		stepDefDBEImpl.setPrimaryKey(stepDefDBE.getPrimaryKey());

		stepDefDBEImpl.setStepDefDBEId(stepDefDBE.getStepDefDBEId());
		stepDefDBEImpl.setGroupId(stepDefDBE.getGroupId());
		stepDefDBEImpl.setCompanyId(stepDefDBE.getCompanyId());
		stepDefDBEImpl.setUserId(stepDefDBE.getUserId());
		stepDefDBEImpl.setUserName(stepDefDBE.getUserName());
		stepDefDBEImpl.setCreateDate(stepDefDBE.getCreateDate());
		stepDefDBEImpl.setModifiedDate(stepDefDBE.getModifiedDate());
		stepDefDBEImpl.setStepType(stepDefDBE.getStepType());

		return stepDefDBEImpl;
	}

	/**
	 * Returns the Step Definition with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Step Definition
	 * @return the Step Definition
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStepDefDBEException, SystemException {
		StepDefDBE stepDefDBE = fetchByPrimaryKey(primaryKey);

		if (stepDefDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStepDefDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stepDefDBE;
	}

	/**
	 * Returns the Step Definition with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException} if it could not be found.
	 *
	 * @param stepDefDBEId the primary key of the Step Definition
	 * @return the Step Definition
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDefDBEException if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE findByPrimaryKey(long stepDefDBEId)
		throws NoSuchStepDefDBEException, SystemException {
		return findByPrimaryKey((Serializable)stepDefDBEId);
	}

	/**
	 * Returns the Step Definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Step Definition
	 * @return the Step Definition, or <code>null</code> if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StepDefDBE stepDefDBE = (StepDefDBE)EntityCacheUtil.getResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
				StepDefDBEImpl.class, primaryKey);

		if (stepDefDBE == _nullStepDefDBE) {
			return null;
		}

		if (stepDefDBE == null) {
			Session session = null;

			try {
				session = openSession();

				stepDefDBE = (StepDefDBE)session.get(StepDefDBEImpl.class,
						primaryKey);

				if (stepDefDBE != null) {
					cacheResult(stepDefDBE);
				}
				else {
					EntityCacheUtil.putResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
						StepDefDBEImpl.class, primaryKey, _nullStepDefDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StepDefDBEModelImpl.ENTITY_CACHE_ENABLED,
					StepDefDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stepDefDBE;
	}

	/**
	 * Returns the Step Definition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stepDefDBEId the primary key of the Step Definition
	 * @return the Step Definition, or <code>null</code> if a Step Definition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDefDBE fetchByPrimaryKey(long stepDefDBEId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)stepDefDBEId);
	}

	/**
	 * Returns all the Step Definitions.
	 *
	 * @return the Step Definitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDefDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StepDefDBE> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<StepDefDBE> findAll(int start, int end,
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

		List<StepDefDBE> list = (List<StepDefDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STEPDEFDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STEPDEFDBE;

				if (pagination) {
					sql = sql.concat(StepDefDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StepDefDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StepDefDBE>(list);
				}
				else {
					list = (List<StepDefDBE>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Step Definitions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StepDefDBE stepDefDBE : findAll()) {
			remove(stepDefDBE);
		}
	}

	/**
	 * Returns the number of Step Definitions.
	 *
	 * @return the number of Step Definitions
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

				Query q = session.createQuery(_SQL_COUNT_STEPDEFDBE);

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
	 * Initializes the Step Definition persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.StepDefDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StepDefDBE>> listenersList = new ArrayList<ModelListener<StepDefDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StepDefDBE>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StepDefDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STEPDEFDBE = "SELECT stepDefDBE FROM StepDefDBE stepDefDBE";
	private static final String _SQL_SELECT_STEPDEFDBE_WHERE = "SELECT stepDefDBE FROM StepDefDBE stepDefDBE WHERE ";
	private static final String _SQL_COUNT_STEPDEFDBE = "SELECT COUNT(stepDefDBE) FROM StepDefDBE stepDefDBE";
	private static final String _SQL_COUNT_STEPDEFDBE_WHERE = "SELECT COUNT(stepDefDBE) FROM StepDefDBE stepDefDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stepDefDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StepDefDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StepDefDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StepDefDBEPersistenceImpl.class);
	private static StepDefDBE _nullStepDefDBE = new StepDefDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StepDefDBE> toCacheModel() {
				return _nullStepDefDBECacheModel;
			}
		};

	private static CacheModel<StepDefDBE> _nullStepDefDBECacheModel = new CacheModel<StepDefDBE>() {
			@Override
			public StepDefDBE toEntityModel() {
				return _nullStepDefDBE;
			}
		};
}