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

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.model.InstalledStep;
import org.lrc.liferay.toolbuilder.model.impl.InstalledStepImpl;
import org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the installed step service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledStepPersistence
 * @see InstalledStepUtil
 * @generated
 */
public class InstalledStepPersistenceImpl extends BasePersistenceImpl<InstalledStep>
	implements InstalledStepPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InstalledStepUtil} to access the installed step persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InstalledStepImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_STEPTYPE = new FinderPath(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByStepType", new String[] { String.class.getName() },
			InstalledStepModelImpl.STEPTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STEPTYPE = new FinderPath(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStepType",
			new String[] { String.class.getName() });

	/**
	 * Returns the installed step where stepType = &#63; or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepException} if it could not be found.
	 *
	 * @param stepType the step type
	 * @return the matching installed step
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepException if a matching installed step could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep findByStepType(String stepType)
		throws NoSuchInstalledStepException, SystemException {
		InstalledStep installedStep = fetchByStepType(stepType);

		if (installedStep == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("stepType=");
			msg.append(stepType);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInstalledStepException(msg.toString());
		}

		return installedStep;
	}

	/**
	 * Returns the installed step where stepType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stepType the step type
	 * @return the matching installed step, or <code>null</code> if a matching installed step could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep fetchByStepType(String stepType)
		throws SystemException {
		return fetchByStepType(stepType, true);
	}

	/**
	 * Returns the installed step where stepType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stepType the step type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching installed step, or <code>null</code> if a matching installed step could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep fetchByStepType(String stepType,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { stepType };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_STEPTYPE,
					finderArgs, this);
		}

		if (result instanceof InstalledStep) {
			InstalledStep installedStep = (InstalledStep)result;

			if (!Validator.equals(stepType, installedStep.getStepType())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INSTALLEDSTEP_WHERE);

			boolean bindStepType = false;

			if (stepType == null) {
				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_1);
			}
			else if (stepType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_3);
			}
			else {
				bindStepType = true;

				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStepType) {
					qPos.add(stepType);
				}

				List<InstalledStep> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STEPTYPE,
						finderArgs, list);
				}
				else {
					InstalledStep installedStep = list.get(0);

					result = installedStep;

					cacheResult(installedStep);

					if ((installedStep.getStepType() == null) ||
							!installedStep.getStepType().equals(stepType)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STEPTYPE,
							finderArgs, installedStep);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STEPTYPE,
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
			return (InstalledStep)result;
		}
	}

	/**
	 * Removes the installed step where stepType = &#63; from the database.
	 *
	 * @param stepType the step type
	 * @return the installed step that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep removeByStepType(String stepType)
		throws NoSuchInstalledStepException, SystemException {
		InstalledStep installedStep = findByStepType(stepType);

		return remove(installedStep);
	}

	/**
	 * Returns the number of installed steps where stepType = &#63;.
	 *
	 * @param stepType the step type
	 * @return the number of matching installed steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStepType(String stepType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STEPTYPE;

		Object[] finderArgs = new Object[] { stepType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSTALLEDSTEP_WHERE);

			boolean bindStepType = false;

			if (stepType == null) {
				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_1);
			}
			else if (stepType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_3);
			}
			else {
				bindStepType = true;

				query.append(_FINDER_COLUMN_STEPTYPE_STEPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStepType) {
					qPos.add(stepType);
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

	private static final String _FINDER_COLUMN_STEPTYPE_STEPTYPE_1 = "installedStep.stepType IS NULL";
	private static final String _FINDER_COLUMN_STEPTYPE_STEPTYPE_2 = "installedStep.stepType = ?";
	private static final String _FINDER_COLUMN_STEPTYPE_STEPTYPE_3 = "(installedStep.stepType IS NULL OR installedStep.stepType = '')";

	public InstalledStepPersistenceImpl() {
		setModelClass(InstalledStep.class);
	}

	/**
	 * Caches the installed step in the entity cache if it is enabled.
	 *
	 * @param installedStep the installed step
	 */
	@Override
	public void cacheResult(InstalledStep installedStep) {
		EntityCacheUtil.putResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepImpl.class, installedStep.getPrimaryKey(),
			installedStep);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STEPTYPE,
			new Object[] { installedStep.getStepType() }, installedStep);

		installedStep.resetOriginalValues();
	}

	/**
	 * Caches the installed steps in the entity cache if it is enabled.
	 *
	 * @param installedSteps the installed steps
	 */
	@Override
	public void cacheResult(List<InstalledStep> installedSteps) {
		for (InstalledStep installedStep : installedSteps) {
			if (EntityCacheUtil.getResult(
						InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
						InstalledStepImpl.class, installedStep.getPrimaryKey()) == null) {
				cacheResult(installedStep);
			}
			else {
				installedStep.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all installed steps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InstalledStepImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InstalledStepImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the installed step.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InstalledStep installedStep) {
		EntityCacheUtil.removeResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepImpl.class, installedStep.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(installedStep);
	}

	@Override
	public void clearCache(List<InstalledStep> installedSteps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InstalledStep installedStep : installedSteps) {
			EntityCacheUtil.removeResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
				InstalledStepImpl.class, installedStep.getPrimaryKey());

			clearUniqueFindersCache(installedStep);
		}
	}

	protected void cacheUniqueFindersCache(InstalledStep installedStep) {
		if (installedStep.isNew()) {
			Object[] args = new Object[] { installedStep.getStepType() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STEPTYPE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STEPTYPE, args,
				installedStep);
		}
		else {
			InstalledStepModelImpl installedStepModelImpl = (InstalledStepModelImpl)installedStep;

			if ((installedStepModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_STEPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { installedStep.getStepType() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STEPTYPE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_STEPTYPE, args,
					installedStep);
			}
		}
	}

	protected void clearUniqueFindersCache(InstalledStep installedStep) {
		InstalledStepModelImpl installedStepModelImpl = (InstalledStepModelImpl)installedStep;

		Object[] args = new Object[] { installedStep.getStepType() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPTYPE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STEPTYPE, args);

		if ((installedStepModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_STEPTYPE.getColumnBitmask()) != 0) {
			args = new Object[] { installedStepModelImpl.getOriginalStepType() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STEPTYPE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_STEPTYPE, args);
		}
	}

	/**
	 * Creates a new installed step with the primary key. Does not add the installed step to the database.
	 *
	 * @param stepType the primary key for the new installed step
	 * @return the new installed step
	 */
	@Override
	public InstalledStep create(String stepType) {
		InstalledStep installedStep = new InstalledStepImpl();

		installedStep.setNew(true);
		installedStep.setPrimaryKey(stepType);

		return installedStep;
	}

	/**
	 * Removes the installed step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stepType the primary key of the installed step
	 * @return the installed step that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepException if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep remove(String stepType)
		throws NoSuchInstalledStepException, SystemException {
		return remove((Serializable)stepType);
	}

	/**
	 * Removes the installed step with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the installed step
	 * @return the installed step that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepException if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep remove(Serializable primaryKey)
		throws NoSuchInstalledStepException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InstalledStep installedStep = (InstalledStep)session.get(InstalledStepImpl.class,
					primaryKey);

			if (installedStep == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstalledStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(installedStep);
		}
		catch (NoSuchInstalledStepException nsee) {
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
	protected InstalledStep removeImpl(InstalledStep installedStep)
		throws SystemException {
		installedStep = toUnwrappedModel(installedStep);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(installedStep)) {
				installedStep = (InstalledStep)session.get(InstalledStepImpl.class,
						installedStep.getPrimaryKeyObj());
			}

			if (installedStep != null) {
				session.delete(installedStep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (installedStep != null) {
			clearCache(installedStep);
		}

		return installedStep;
	}

	@Override
	public InstalledStep updateImpl(
		org.lrc.liferay.toolbuilder.model.InstalledStep installedStep)
		throws SystemException {
		installedStep = toUnwrappedModel(installedStep);

		boolean isNew = installedStep.isNew();

		Session session = null;

		try {
			session = openSession();

			if (installedStep.isNew()) {
				session.save(installedStep);

				installedStep.setNew(false);
			}
			else {
				session.merge(installedStep);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InstalledStepModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepImpl.class, installedStep.getPrimaryKey(),
			installedStep);

		clearUniqueFindersCache(installedStep);
		cacheUniqueFindersCache(installedStep);

		return installedStep;
	}

	protected InstalledStep toUnwrappedModel(InstalledStep installedStep) {
		if (installedStep instanceof InstalledStepImpl) {
			return installedStep;
		}

		InstalledStepImpl installedStepImpl = new InstalledStepImpl();

		installedStepImpl.setNew(installedStep.isNew());
		installedStepImpl.setPrimaryKey(installedStep.getPrimaryKey());

		installedStepImpl.setStepType(installedStep.getStepType());
		installedStepImpl.setGroupId(installedStep.getGroupId());
		installedStepImpl.setCompanyId(installedStep.getCompanyId());
		installedStepImpl.setUserId(installedStep.getUserId());
		installedStepImpl.setUserName(installedStep.getUserName());
		installedStepImpl.setCreateDate(installedStep.getCreateDate());
		installedStepImpl.setModifiedDate(installedStep.getModifiedDate());
		installedStepImpl.setNamespace(installedStep.getNamespace());
		installedStepImpl.setClassName(installedStep.getClassName());

		return installedStepImpl;
	}

	/**
	 * Returns the installed step with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed step
	 * @return the installed step
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepException if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstalledStepException, SystemException {
		InstalledStep installedStep = fetchByPrimaryKey(primaryKey);

		if (installedStep == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstalledStepException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return installedStep;
	}

	/**
	 * Returns the installed step with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepException} if it could not be found.
	 *
	 * @param stepType the primary key of the installed step
	 * @return the installed step
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepException if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep findByPrimaryKey(String stepType)
		throws NoSuchInstalledStepException, SystemException {
		return findByPrimaryKey((Serializable)stepType);
	}

	/**
	 * Returns the installed step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed step
	 * @return the installed step, or <code>null</code> if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InstalledStep installedStep = (InstalledStep)EntityCacheUtil.getResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
				InstalledStepImpl.class, primaryKey);

		if (installedStep == _nullInstalledStep) {
			return null;
		}

		if (installedStep == null) {
			Session session = null;

			try {
				session = openSession();

				installedStep = (InstalledStep)session.get(InstalledStepImpl.class,
						primaryKey);

				if (installedStep != null) {
					cacheResult(installedStep);
				}
				else {
					EntityCacheUtil.putResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
						InstalledStepImpl.class, primaryKey, _nullInstalledStep);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InstalledStepModelImpl.ENTITY_CACHE_ENABLED,
					InstalledStepImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return installedStep;
	}

	/**
	 * Returns the installed step with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stepType the primary key of the installed step
	 * @return the installed step, or <code>null</code> if a installed step with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledStep fetchByPrimaryKey(String stepType)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)stepType);
	}

	/**
	 * Returns all the installed steps.
	 *
	 * @return the installed steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledStep> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the installed steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of installed steps
	 * @param end the upper bound of the range of installed steps (not inclusive)
	 * @return the range of installed steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledStep> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the installed steps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of installed steps
	 * @param end the upper bound of the range of installed steps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installed steps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledStep> findAll(int start, int end,
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

		List<InstalledStep> list = (List<InstalledStep>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSTALLEDSTEP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSTALLEDSTEP;

				if (pagination) {
					sql = sql.concat(InstalledStepModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InstalledStep>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InstalledStep>(list);
				}
				else {
					list = (List<InstalledStep>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the installed steps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InstalledStep installedStep : findAll()) {
			remove(installedStep);
		}
	}

	/**
	 * Returns the number of installed steps.
	 *
	 * @return the number of installed steps
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

				Query q = session.createQuery(_SQL_COUNT_INSTALLEDSTEP);

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
	 * Initializes the installed step persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.InstalledStep")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InstalledStep>> listenersList = new ArrayList<ModelListener<InstalledStep>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InstalledStep>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InstalledStepImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSTALLEDSTEP = "SELECT installedStep FROM InstalledStep installedStep";
	private static final String _SQL_SELECT_INSTALLEDSTEP_WHERE = "SELECT installedStep FROM InstalledStep installedStep WHERE ";
	private static final String _SQL_COUNT_INSTALLEDSTEP = "SELECT COUNT(installedStep) FROM InstalledStep installedStep";
	private static final String _SQL_COUNT_INSTALLEDSTEP_WHERE = "SELECT COUNT(installedStep) FROM InstalledStep installedStep WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "installedStep.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InstalledStep exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InstalledStep exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InstalledStepPersistenceImpl.class);
	private static InstalledStep _nullInstalledStep = new InstalledStepImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InstalledStep> toCacheModel() {
				return _nullInstalledStepCacheModel;
			}
		};

	private static CacheModel<InstalledStep> _nullInstalledStepCacheModel = new CacheModel<InstalledStep>() {
			@Override
			public InstalledStep toEntityModel() {
				return _nullInstalledStep;
			}
		};
}