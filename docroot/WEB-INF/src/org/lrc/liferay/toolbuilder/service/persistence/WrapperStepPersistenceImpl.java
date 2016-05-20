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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.lrc.liferay.toolbuilder.NoSuchWrapperStepException;
import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepImpl;
import org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the wrapper step service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepPersistence
 * @see WrapperStepUtil
 * @generated
 */
public class WrapperStepPersistenceImpl extends BasePersistenceImpl<WrapperStep>
	implements WrapperStepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link WrapperStepUtil} to access the wrapper step persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = WrapperStepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepModelImpl.FINDER_CACHE_ENABLED, WrapperStepImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepModelImpl.FINDER_CACHE_ENABLED, WrapperStepImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public WrapperStepPersistenceImpl() {
		setModelClass(WrapperStep.class);
	}

	/**
	 * Caches the wrapper step in the entity cache if it is enabled.
	 *
	 * @param wrapperStep the wrapper step
	 */
	@Override
	public void cacheResult(WrapperStep wrapperStep) {
		EntityCacheUtil.putResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepImpl.class, wrapperStep.getPrimaryKey(), wrapperStep);

		wrapperStep.resetOriginalValues();
	}

	/**
	 * Caches the wrapper steps in the entity cache if it is enabled.
	 *
	 * @param wrapperSteps the wrapper steps
	 */
	@Override
	public void cacheResult(List<WrapperStep> wrapperSteps) {
		for (WrapperStep wrapperStep : wrapperSteps) {
			if (EntityCacheUtil.getResult(
						WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepImpl.class, wrapperStep.getPrimaryKey()) == null) {
				cacheResult(wrapperStep);
			}
			else {
				wrapperStep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all wrapper steps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(WrapperStepImpl.class.getName());
		}

		EntityCacheUtil.clearCache(WrapperStepImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the wrapper step.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WrapperStep wrapperStep) {
		EntityCacheUtil.removeResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepImpl.class, wrapperStep.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<WrapperStep> wrapperSteps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (WrapperStep wrapperStep : wrapperSteps) {
			EntityCacheUtil.removeResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepImpl.class, wrapperStep.getPrimaryKey());
		}
	}

	/**
	 * Creates a new wrapper step with the primary key. Does not add the wrapper step to the database.
	 *
	 * @param wrapperStepId the primary key for the new wrapper step
	 * @return the new wrapper step
	 */
	@Override
	public WrapperStep create(long wrapperStepId) {
		WrapperStep wrapperStep = new WrapperStepImpl();

		wrapperStep.setNew(true);
		wrapperStep.setPrimaryKey(wrapperStepId);

		return wrapperStep;
	}

	/**
	 * Removes the wrapper step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wrapperStepId the primary key of the wrapper step
	 * @return the wrapper step that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep remove(long wrapperStepId)
		throws NoSuchWrapperStepException, SystemException {
		return remove((Serializable)wrapperStepId);
	}

	/**
	 * Removes the wrapper step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wrapper step
	 * @return the wrapper step that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep remove(Serializable primaryKey)
		throws NoSuchWrapperStepException, SystemException {
		Session session = null;

		try {
			session = openSession();

			WrapperStep wrapperStep = (WrapperStep)session.get(WrapperStepImpl.class,
					primaryKey);

			if (wrapperStep == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWrapperStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(wrapperStep);
		}
		catch (NoSuchWrapperStepException nsee) {
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
	protected WrapperStep removeImpl(WrapperStep wrapperStep)
		throws SystemException {
		wrapperStep = toUnwrappedModel(wrapperStep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wrapperStep)) {
				wrapperStep = (WrapperStep)session.get(WrapperStepImpl.class,
						wrapperStep.getPrimaryKeyObj());
			}

			if (wrapperStep != null) {
				session.delete(wrapperStep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (wrapperStep != null) {
			clearCache(wrapperStep);
		}

		return wrapperStep;
	}

	@Override
	public WrapperStep updateImpl(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep)
		throws SystemException {
		wrapperStep = toUnwrappedModel(wrapperStep);

		boolean isNew = wrapperStep.isNew();

		Session session = null;

		try {
			session = openSession();

			if (wrapperStep.isNew()) {
				session.save(wrapperStep);

				wrapperStep.setNew(false);
			}
			else {
				session.merge(wrapperStep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
			WrapperStepImpl.class, wrapperStep.getPrimaryKey(), wrapperStep);

		return wrapperStep;
	}

	protected WrapperStep toUnwrappedModel(WrapperStep wrapperStep) {
		if (wrapperStep instanceof WrapperStepImpl) {
			return wrapperStep;
		}

		WrapperStepImpl wrapperStepImpl = new WrapperStepImpl();

		wrapperStepImpl.setNew(wrapperStep.isNew());
		wrapperStepImpl.setPrimaryKey(wrapperStep.getPrimaryKey());

		wrapperStepImpl.setWrapperStepId(wrapperStep.getWrapperStepId());
		wrapperStepImpl.setGroupId(wrapperStep.getGroupId());
		wrapperStepImpl.setCompanyId(wrapperStep.getCompanyId());
		wrapperStepImpl.setUserId(wrapperStep.getUserId());
		wrapperStepImpl.setUserName(wrapperStep.getUserName());
		wrapperStepImpl.setCreateDate(wrapperStep.getCreateDate());
		wrapperStepImpl.setModifiedDate(wrapperStep.getModifiedDate());
		wrapperStepImpl.setCurrentStep(wrapperStep.getCurrentStep());
		wrapperStepImpl.setSequential(wrapperStep.isSequential());
		wrapperStepImpl.setStepsNumber(wrapperStep.getStepsNumber());

		return wrapperStepImpl;
	}

	/**
	 * Returns the wrapper step with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step
	 * @return the wrapper step
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWrapperStepException, SystemException {
		WrapperStep wrapperStep = fetchByPrimaryKey(primaryKey);

		if (wrapperStep == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWrapperStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return wrapperStep;
	}

	/**
	 * Returns the wrapper step with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchWrapperStepException} if it could not be found.
	 *
	 * @param wrapperStepId the primary key of the wrapper step
	 * @return the wrapper step
	 * @throws org.lrc.liferay.toolbuilder.NoSuchWrapperStepException if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep findByPrimaryKey(long wrapperStepId)
		throws NoSuchWrapperStepException, SystemException {
		return findByPrimaryKey((Serializable)wrapperStepId);
	}

	/**
	 * Returns the wrapper step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wrapper step
	 * @return the wrapper step, or <code>null</code> if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		WrapperStep wrapperStep = (WrapperStep)EntityCacheUtil.getResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
				WrapperStepImpl.class, primaryKey);

		if (wrapperStep == _nullWrapperStep) {
			return null;
		}

		if (wrapperStep == null) {
			Session session = null;

			try {
				session = openSession();

				wrapperStep = (WrapperStep)session.get(WrapperStepImpl.class,
						primaryKey);

				if (wrapperStep != null) {
					cacheResult(wrapperStep);
				}
				else {
					EntityCacheUtil.putResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
						WrapperStepImpl.class, primaryKey, _nullWrapperStep);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(WrapperStepModelImpl.ENTITY_CACHE_ENABLED,
					WrapperStepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return wrapperStep;
	}

	/**
	 * Returns the wrapper step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wrapperStepId the primary key of the wrapper step
	 * @return the wrapper step, or <code>null</code> if a wrapper step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public WrapperStep fetchByPrimaryKey(long wrapperStepId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)wrapperStepId);
	}

	/**
	 * Returns all the wrapper steps.
	 *
	 * @return the wrapper steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStep> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wrapper steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wrapper steps
	 * @param end the upper bound of the range of wrapper steps (not inclusive)
	 * @return the range of wrapper steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStep> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wrapper steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.WrapperStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of wrapper steps
	 * @param end the upper bound of the range of wrapper steps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wrapper steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<WrapperStep> findAll(int start, int end,
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

		List<WrapperStep> list = (List<WrapperStep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_WRAPPERSTEP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_WRAPPERSTEP;

				if (pagination) {
					sql = sql.concat(WrapperStepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<WrapperStep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<WrapperStep>(list);
				}
				else {
					list = (List<WrapperStep>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the wrapper steps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (WrapperStep wrapperStep : findAll()) {
			remove(wrapperStep);
		}
	}

	/**
	 * Returns the number of wrapper steps.
	 *
	 * @return the number of wrapper steps
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

				Query q = session.createQuery(_SQL_COUNT_WRAPPERSTEP);

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
	 * Initializes the wrapper step persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.WrapperStep")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<WrapperStep>> listenersList = new ArrayList<ModelListener<WrapperStep>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<WrapperStep>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(WrapperStepImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_WRAPPERSTEP = "SELECT wrapperStep FROM WrapperStep wrapperStep";
	private static final String _SQL_COUNT_WRAPPERSTEP = "SELECT COUNT(wrapperStep) FROM WrapperStep wrapperStep";
	private static final String _ORDER_BY_ENTITY_ALIAS = "wrapperStep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No WrapperStep exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(WrapperStepPersistenceImpl.class);
	private static WrapperStep _nullWrapperStep = new WrapperStepImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<WrapperStep> toCacheModel() {
				return _nullWrapperStepCacheModel;
			}
		};

	private static CacheModel<WrapperStep> _nullWrapperStepCacheModel = new CacheModel<WrapperStep>() {
			@Override
			public WrapperStep toEntityModel() {
				return _nullWrapperStep;
			}
		};
}