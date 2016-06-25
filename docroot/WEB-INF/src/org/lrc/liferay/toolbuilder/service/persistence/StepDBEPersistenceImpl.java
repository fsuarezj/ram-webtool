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

import org.lrc.liferay.toolbuilder.NoSuchStepDBEException;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.model.impl.StepDBEImpl;
import org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the step d b e service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDBEPersistence
 * @see StepDBEUtil
 * @generated
 */
public class StepDBEPersistenceImpl extends BasePersistenceImpl<StepDBE>
	implements StepDBEPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StepDBEUtil} to access the step d b e persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StepDBEImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, StepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, StepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STEPDBEID =
		new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, StepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStepDBEId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDBEID =
		new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, StepDBEImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStepDBEId",
			new String[] { Long.class.getName() },
			StepDBEModelImpl.STEPDBEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STEPDBEID = new FinderPath(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStepDBEId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the step d b es where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @return the matching step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findByStepDBEId(long stepDBEId)
		throws SystemException {
		return findByStepDBEId(stepDBEId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the step d b es where stepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param stepDBEId the step d b e ID
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @return the range of matching step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findByStepDBEId(long stepDBEId, int start, int end)
		throws SystemException {
		return findByStepDBEId(stepDBEId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the step d b es where stepDBEId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param stepDBEId the step d b e ID
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findByStepDBEId(long stepDBEId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDBEID;
			finderArgs = new Object[] { stepDBEId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STEPDBEID;
			finderArgs = new Object[] { stepDBEId, start, end, orderByComparator };
		}

		List<StepDBE> list = (List<StepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StepDBE stepDBE : list) {
				if ((stepDBEId != stepDBE.getStepDBEId())) {
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

			query.append(_SQL_SELECT_STEPDBE_WHERE);

			query.append(_FINDER_COLUMN_STEPDBEID_STEPDBEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(StepDBEModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(stepDBEId);

				if (!pagination) {
					list = (List<StepDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StepDBE>(list);
				}
				else {
					list = (List<StepDBE>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE findByStepDBEId_First(long stepDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchStepDBEException, SystemException {
		StepDBE stepDBE = fetchByStepDBEId_First(stepDBEId, orderByComparator);

		if (stepDBE != null) {
			return stepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stepDBEId=");
		msg.append(stepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStepDBEException(msg.toString());
	}

	/**
	 * Returns the first step d b e in the ordered set where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching step d b e, or <code>null</code> if a matching step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE fetchByStepDBEId_First(long stepDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		List<StepDBE> list = findByStepDBEId(stepDBEId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a matching step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE findByStepDBEId_Last(long stepDBEId,
		OrderByComparator orderByComparator)
		throws NoSuchStepDBEException, SystemException {
		StepDBE stepDBE = fetchByStepDBEId_Last(stepDBEId, orderByComparator);

		if (stepDBE != null) {
			return stepDBE;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("stepDBEId=");
		msg.append(stepDBEId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStepDBEException(msg.toString());
	}

	/**
	 * Returns the last step d b e in the ordered set where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching step d b e, or <code>null</code> if a matching step d b e could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE fetchByStepDBEId_Last(long stepDBEId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStepDBEId(stepDBEId);

		if (count == 0) {
			return null;
		}

		List<StepDBE> list = findByStepDBEId(stepDBEId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the step d b es where stepDBEId = &#63; from the database.
	 *
	 * @param stepDBEId the step d b e ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStepDBEId(long stepDBEId) throws SystemException {
		for (StepDBE stepDBE : findByStepDBEId(stepDBEId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(stepDBE);
		}
	}

	/**
	 * Returns the number of step d b es where stepDBEId = &#63;.
	 *
	 * @param stepDBEId the step d b e ID
	 * @return the number of matching step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStepDBEId(long stepDBEId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STEPDBEID;

		Object[] finderArgs = new Object[] { stepDBEId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_STEPDBE_WHERE);

			query.append(_FINDER_COLUMN_STEPDBEID_STEPDBEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(stepDBEId);

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

	private static final String _FINDER_COLUMN_STEPDBEID_STEPDBEID_2 = "stepDBE.stepDBEId = ?";

	public StepDBEPersistenceImpl() {
		setModelClass(StepDBE.class);
	}

	/**
	 * Caches the step d b e in the entity cache if it is enabled.
	 *
	 * @param stepDBE the step d b e
	 */
	@Override
	public void cacheResult(StepDBE stepDBE) {
		EntityCacheUtil.putResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEImpl.class, stepDBE.getPrimaryKey(), stepDBE);

		stepDBE.resetOriginalValues();
	}

	/**
	 * Caches the step d b es in the entity cache if it is enabled.
	 *
	 * @param stepDBEs the step d b es
	 */
	@Override
	public void cacheResult(List<StepDBE> stepDBEs) {
		for (StepDBE stepDBE : stepDBEs) {
			if (EntityCacheUtil.getResult(
						StepDBEModelImpl.ENTITY_CACHE_ENABLED,
						StepDBEImpl.class, stepDBE.getPrimaryKey()) == null) {
				cacheResult(stepDBE);
			}
			else {
				stepDBE.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all step d b es.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StepDBEImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StepDBEImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the step d b e.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StepDBE stepDBE) {
		EntityCacheUtil.removeResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEImpl.class, stepDBE.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<StepDBE> stepDBEs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StepDBE stepDBE : stepDBEs) {
			EntityCacheUtil.removeResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
				StepDBEImpl.class, stepDBE.getPrimaryKey());
		}
	}

	/**
	 * Creates a new step d b e with the primary key. Does not add the step d b e to the database.
	 *
	 * @param stepDBEId the primary key for the new step d b e
	 * @return the new step d b e
	 */
	@Override
	public StepDBE create(long stepDBEId) {
		StepDBE stepDBE = new StepDBEImpl();

		stepDBE.setNew(true);
		stepDBE.setPrimaryKey(stepDBEId);

		return stepDBE;
	}

	/**
	 * Removes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stepDBEId the primary key of the step d b e
	 * @return the step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE remove(long stepDBEId)
		throws NoSuchStepDBEException, SystemException {
		return remove((Serializable)stepDBEId);
	}

	/**
	 * Removes the step d b e with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the step d b e
	 * @return the step d b e that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE remove(Serializable primaryKey)
		throws NoSuchStepDBEException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StepDBE stepDBE = (StepDBE)session.get(StepDBEImpl.class, primaryKey);

			if (stepDBE == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stepDBE);
		}
		catch (NoSuchStepDBEException nsee) {
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
	protected StepDBE removeImpl(StepDBE stepDBE) throws SystemException {
		stepDBE = toUnwrappedModel(stepDBE);

		stepDBEToCompositeStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(stepDBE.getPrimaryKey());

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stepDBE)) {
				stepDBE = (StepDBE)session.get(StepDBEImpl.class,
						stepDBE.getPrimaryKeyObj());
			}

			if (stepDBE != null) {
				session.delete(stepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stepDBE != null) {
			clearCache(stepDBE);
		}

		return stepDBE;
	}

	@Override
	public StepDBE updateImpl(org.lrc.liferay.toolbuilder.model.StepDBE stepDBE)
		throws SystemException {
		stepDBE = toUnwrappedModel(stepDBE);

		boolean isNew = stepDBE.isNew();

		StepDBEModelImpl stepDBEModelImpl = (StepDBEModelImpl)stepDBE;

		Session session = null;

		try {
			session = openSession();

			if (stepDBE.isNew()) {
				session.save(stepDBE);

				stepDBE.setNew(false);
			}
			else {
				session.merge(stepDBE);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StepDBEModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((stepDBEModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDBEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stepDBEModelImpl.getOriginalStepDBEId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDBEID,
					args);

				args = new Object[] { stepDBEModelImpl.getStepDBEId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPDBEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STEPDBEID,
					args);
			}
		}

		EntityCacheUtil.putResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
			StepDBEImpl.class, stepDBE.getPrimaryKey(), stepDBE);

		return stepDBE;
	}

	protected StepDBE toUnwrappedModel(StepDBE stepDBE) {
		if (stepDBE instanceof StepDBEImpl) {
			return stepDBE;
		}

		StepDBEImpl stepDBEImpl = new StepDBEImpl();

		stepDBEImpl.setNew(stepDBE.isNew());
		stepDBEImpl.setPrimaryKey(stepDBE.getPrimaryKey());

		stepDBEImpl.setStepDBEId(stepDBE.getStepDBEId());
		stepDBEImpl.setGroupId(stepDBE.getGroupId());
		stepDBEImpl.setCompanyId(stepDBE.getCompanyId());
		stepDBEImpl.setUserId(stepDBE.getUserId());
		stepDBEImpl.setUserName(stepDBE.getUserName());
		stepDBEImpl.setCreateDate(stepDBE.getCreateDate());
		stepDBEImpl.setModifiedDate(stepDBE.getModifiedDate());
		stepDBEImpl.setStepType(stepDBE.getStepType());

		return stepDBEImpl;
	}

	/**
	 * Returns the step d b e with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the step d b e
	 * @return the step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStepDBEException, SystemException {
		StepDBE stepDBE = fetchByPrimaryKey(primaryKey);

		if (stepDBE == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStepDBEException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stepDBE;
	}

	/**
	 * Returns the step d b e with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchStepDBEException} if it could not be found.
	 *
	 * @param stepDBEId the primary key of the step d b e
	 * @return the step d b e
	 * @throws org.lrc.liferay.toolbuilder.NoSuchStepDBEException if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE findByPrimaryKey(long stepDBEId)
		throws NoSuchStepDBEException, SystemException {
		return findByPrimaryKey((Serializable)stepDBEId);
	}

	/**
	 * Returns the step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the step d b e
	 * @return the step d b e, or <code>null</code> if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StepDBE stepDBE = (StepDBE)EntityCacheUtil.getResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
				StepDBEImpl.class, primaryKey);

		if (stepDBE == _nullStepDBE) {
			return null;
		}

		if (stepDBE == null) {
			Session session = null;

			try {
				session = openSession();

				stepDBE = (StepDBE)session.get(StepDBEImpl.class, primaryKey);

				if (stepDBE != null) {
					cacheResult(stepDBE);
				}
				else {
					EntityCacheUtil.putResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
						StepDBEImpl.class, primaryKey, _nullStepDBE);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StepDBEModelImpl.ENTITY_CACHE_ENABLED,
					StepDBEImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stepDBE;
	}

	/**
	 * Returns the step d b e with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stepDBEId the primary key of the step d b e
	 * @return the step d b e, or <code>null</code> if a step d b e with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StepDBE fetchByPrimaryKey(long stepDBEId) throws SystemException {
		return fetchByPrimaryKey((Serializable)stepDBEId);
	}

	/**
	 * Returns all the step d b es.
	 *
	 * @return the step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @return the range of step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the step d b es.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StepDBE> findAll(int start, int end,
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

		List<StepDBE> list = (List<StepDBE>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STEPDBE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STEPDBE;

				if (pagination) {
					sql = sql.concat(StepDBEModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StepDBE>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StepDBE>(list);
				}
				else {
					list = (List<StepDBE>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the step d b es from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StepDBE stepDBE : findAll()) {
			remove(stepDBE);
		}
	}

	/**
	 * Returns the number of step d b es.
	 *
	 * @return the number of step d b es
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

				Query q = session.createQuery(_SQL_COUNT_STEPDBE);

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
	 * Returns all the composite step d b es associated with the step d b e.
	 *
	 * @param pk the primary key of the step d b e
	 * @return the composite step d b es associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getCompositeStepDBEs(
		long pk) throws SystemException {
		return getCompositeStepDBEs(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	/**
	 * Returns a range of all the composite step d b es associated with the step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the step d b e
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @return the range of composite step d b es associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getCompositeStepDBEs(
		long pk, int start, int end) throws SystemException {
		return getCompositeStepDBEs(pk, start, end, null);
	}

	/**
	 * Returns an ordered range of all the composite step d b es associated with the step d b e.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.StepDBEModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param pk the primary key of the step d b e
	 * @param start the lower bound of the range of step d b es
	 * @param end the upper bound of the range of step d b es (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of composite step d b es associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> getCompositeStepDBEs(
		long pk, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return stepDBEToCompositeStepDBETableMapper.getRightBaseModels(pk,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of composite step d b es associated with the step d b e.
	 *
	 * @param pk the primary key of the step d b e
	 * @return the number of composite step d b es associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCompositeStepDBEsSize(long pk) throws SystemException {
		long[] pks = stepDBEToCompositeStepDBETableMapper.getRightPrimaryKeys(pk);

		return pks.length;
	}

	/**
	 * Returns <code>true</code> if the composite step d b e is associated with the step d b e.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPK the primary key of the composite step d b e
	 * @return <code>true</code> if the composite step d b e is associated with the step d b e; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCompositeStepDBE(long pk, long compositeStepDBEPK)
		throws SystemException {
		return stepDBEToCompositeStepDBETableMapper.containsTableMapping(pk,
			compositeStepDBEPK);
	}

	/**
	 * Returns <code>true</code> if the step d b e has any composite step d b es associated with it.
	 *
	 * @param pk the primary key of the step d b e to check for associations with composite step d b es
	 * @return <code>true</code> if the step d b e has any composite step d b es associated with it; <code>false</code> otherwise
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean containsCompositeStepDBEs(long pk) throws SystemException {
		if (getCompositeStepDBEsSize(pk) > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Adds an association between the step d b e and the composite step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPK the primary key of the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCompositeStepDBE(long pk, long compositeStepDBEPK)
		throws SystemException {
		stepDBEToCompositeStepDBETableMapper.addTableMapping(pk,
			compositeStepDBEPK);
	}

	/**
	 * Adds an association between the step d b e and the composite step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBE the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCompositeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws SystemException {
		stepDBEToCompositeStepDBETableMapper.addTableMapping(pk,
			compositeStepDBE.getPrimaryKey());
	}

	/**
	 * Adds an association between the step d b e and the composite step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPKs the primary keys of the composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCompositeStepDBEs(long pk, long[] compositeStepDBEPKs)
		throws SystemException {
		for (long compositeStepDBEPK : compositeStepDBEPKs) {
			stepDBEToCompositeStepDBETableMapper.addTableMapping(pk,
				compositeStepDBEPK);
		}
	}

	/**
	 * Adds an association between the step d b e and the composite step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEs the composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addCompositeStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> compositeStepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE : compositeStepDBEs) {
			stepDBEToCompositeStepDBETableMapper.addTableMapping(pk,
				compositeStepDBE.getPrimaryKey());
		}
	}

	/**
	 * Clears all associations between the step d b e and its composite step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e to clear the associated composite step d b es from
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearCompositeStepDBEs(long pk) throws SystemException {
		stepDBEToCompositeStepDBETableMapper.deleteLeftPrimaryKeyTableMappings(pk);
	}

	/**
	 * Removes the association between the step d b e and the composite step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPK the primary key of the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCompositeStepDBE(long pk, long compositeStepDBEPK)
		throws SystemException {
		stepDBEToCompositeStepDBETableMapper.deleteTableMapping(pk,
			compositeStepDBEPK);
	}

	/**
	 * Removes the association between the step d b e and the composite step d b e. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBE the composite step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCompositeStepDBE(long pk,
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE)
		throws SystemException {
		stepDBEToCompositeStepDBETableMapper.deleteTableMapping(pk,
			compositeStepDBE.getPrimaryKey());
	}

	/**
	 * Removes the association between the step d b e and the composite step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPKs the primary keys of the composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCompositeStepDBEs(long pk, long[] compositeStepDBEPKs)
		throws SystemException {
		for (long compositeStepDBEPK : compositeStepDBEPKs) {
			stepDBEToCompositeStepDBETableMapper.deleteTableMapping(pk,
				compositeStepDBEPK);
		}
	}

	/**
	 * Removes the association between the step d b e and the composite step d b es. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEs the composite step d b es
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeCompositeStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> compositeStepDBEs)
		throws SystemException {
		for (org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE : compositeStepDBEs) {
			stepDBEToCompositeStepDBETableMapper.deleteTableMapping(pk,
				compositeStepDBE.getPrimaryKey());
		}
	}

	/**
	 * Sets the composite step d b es associated with the step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEPKs the primary keys of the composite step d b es to be associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCompositeStepDBEs(long pk, long[] compositeStepDBEPKs)
		throws SystemException {
		Set<Long> newCompositeStepDBEPKsSet = SetUtil.fromArray(compositeStepDBEPKs);
		Set<Long> oldCompositeStepDBEPKsSet = SetUtil.fromArray(stepDBEToCompositeStepDBETableMapper.getRightPrimaryKeys(
					pk));

		Set<Long> removeCompositeStepDBEPKsSet = new HashSet<Long>(oldCompositeStepDBEPKsSet);

		removeCompositeStepDBEPKsSet.removeAll(newCompositeStepDBEPKsSet);

		for (long removeCompositeStepDBEPK : removeCompositeStepDBEPKsSet) {
			stepDBEToCompositeStepDBETableMapper.deleteTableMapping(pk,
				removeCompositeStepDBEPK);
		}

		newCompositeStepDBEPKsSet.removeAll(oldCompositeStepDBEPKsSet);

		for (long newCompositeStepDBEPK : newCompositeStepDBEPKsSet) {
			stepDBEToCompositeStepDBETableMapper.addTableMapping(pk,
				newCompositeStepDBEPK);
		}
	}

	/**
	 * Sets the composite step d b es associated with the step d b e, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	 *
	 * @param pk the primary key of the step d b e
	 * @param compositeStepDBEs the composite step d b es to be associated with the step d b e
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setCompositeStepDBEs(long pk,
		List<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> compositeStepDBEs)
		throws SystemException {
		try {
			long[] compositeStepDBEPKs = new long[compositeStepDBEs.size()];

			for (int i = 0; i < compositeStepDBEs.size(); i++) {
				org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE =
					compositeStepDBEs.get(i);

				compositeStepDBEPKs[i] = compositeStepDBE.getPrimaryKey();
			}

			setCompositeStepDBEs(pk, compositeStepDBEPKs);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			FinderCacheUtil.clearCache(StepDBEModelImpl.MAPPING_TABLE_LRC_TB_CS_STEP_NAME);
		}
	}

	/**
	 * Initializes the step d b e persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.StepDBE")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StepDBE>> listenersList = new ArrayList<ModelListener<StepDBE>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StepDBE>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}

		stepDBEToCompositeStepDBETableMapper = TableMapperFactory.getTableMapper("lrc_tb_CS_Step",
				"stepDBEId", "compositeStepDBEId", this,
				compositeStepDBEPersistence);
	}

	public void destroy() {
		EntityCacheUtil.removeCache(StepDBEImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		TableMapperFactory.removeTableMapper("lrc_tb_CS_Step");
	}

	@BeanReference(type = CompositeStepDBEPersistence.class)
	protected CompositeStepDBEPersistence compositeStepDBEPersistence;
	protected TableMapper<StepDBE, org.lrc.liferay.toolbuilder.model.CompositeStepDBE> stepDBEToCompositeStepDBETableMapper;
	private static final String _SQL_SELECT_STEPDBE = "SELECT stepDBE FROM StepDBE stepDBE";
	private static final String _SQL_SELECT_STEPDBE_WHERE = "SELECT stepDBE FROM StepDBE stepDBE WHERE ";
	private static final String _SQL_COUNT_STEPDBE = "SELECT COUNT(stepDBE) FROM StepDBE stepDBE";
	private static final String _SQL_COUNT_STEPDBE_WHERE = "SELECT COUNT(stepDBE) FROM StepDBE stepDBE WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stepDBE.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StepDBE exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StepDBE exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StepDBEPersistenceImpl.class);
	private static StepDBE _nullStepDBE = new StepDBEImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StepDBE> toCacheModel() {
				return _nullStepDBECacheModel;
			}
		};

	private static CacheModel<StepDBE> _nullStepDBECacheModel = new CacheModel<StepDBE>() {
			@Override
			public StepDBE toEntityModel() {
				return _nullStepDBE;
			}
		};
}