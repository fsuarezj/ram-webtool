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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException;
import org.lrc.liferay.toolbuilder.model.InstalledSteps;
import org.lrc.liferay.toolbuilder.model.impl.InstalledStepsImpl;
import org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the installed steps service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledStepsPersistence
 * @see InstalledStepsUtil
 * @generated
 */
public class InstalledStepsPersistenceImpl extends BasePersistenceImpl<InstalledSteps>
	implements InstalledStepsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InstalledStepsUtil} to access the installed steps persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InstalledStepsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TYPE = new FinderPath(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsModelImpl.FINDER_CACHE_ENABLED,
			InstalledStepsImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByType",
			new String[] { String.class.getName() },
			InstalledStepsModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { String.class.getName() });

	/**
	 * Returns the installed steps where type = &#63; or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	 *
	 * @param type the type
	 * @return the matching installed steps
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a matching installed steps could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps findByType(String type)
		throws NoSuchInstalledStepsException, SystemException {
		InstalledSteps installedSteps = fetchByType(type);

		if (installedSteps == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("type=");
			msg.append(type);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchInstalledStepsException(msg.toString());
		}

		return installedSteps;
	}

	/**
	 * Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param type the type
	 * @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps fetchByType(String type) throws SystemException {
		return fetchByType(type, true);
	}

	/**
	 * Returns the installed steps where type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param type the type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching installed steps, or <code>null</code> if a matching installed steps could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps fetchByType(String type, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { type };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TYPE,
					finderArgs, this);
		}

		if (result instanceof InstalledSteps) {
			InstalledSteps installedSteps = (InstalledSteps)result;

			if (!Validator.equals(type, installedSteps.getType())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_INSTALLEDSTEPS_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
				}

				List<InstalledSteps> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TYPE,
						finderArgs, list);
				}
				else {
					InstalledSteps installedSteps = list.get(0);

					result = installedSteps;

					cacheResult(installedSteps);

					if ((installedSteps.getType() == null) ||
							!installedSteps.getType().equals(type)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TYPE,
							finderArgs, installedSteps);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TYPE,
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
			return (InstalledSteps)result;
		}
	}

	/**
	 * Removes the installed steps where type = &#63; from the database.
	 *
	 * @param type the type
	 * @return the installed steps that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps removeByType(String type)
		throws NoSuchInstalledStepsException, SystemException {
		InstalledSteps installedSteps = findByType(type);

		return remove(installedSteps);
	}

	/**
	 * Returns the number of installed stepses where type = &#63;.
	 *
	 * @param type the type
	 * @return the number of matching installed stepses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByType(String type) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSTALLEDSTEPS_WHERE);

			boolean bindType = false;

			if (type == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_1);
			}
			else if (type.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPE_3);
			}
			else {
				bindType = true;

				query.append(_FINDER_COLUMN_TYPE_TYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindType) {
					qPos.add(type);
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

	private static final String _FINDER_COLUMN_TYPE_TYPE_1 = "installedSteps.type IS NULL";
	private static final String _FINDER_COLUMN_TYPE_TYPE_2 = "installedSteps.type = ?";
	private static final String _FINDER_COLUMN_TYPE_TYPE_3 = "(installedSteps.type IS NULL OR installedSteps.type = '')";

	public InstalledStepsPersistenceImpl() {
		setModelClass(InstalledSteps.class);
	}

	/**
	 * Caches the installed steps in the entity cache if it is enabled.
	 *
	 * @param installedSteps the installed steps
	 */
	@Override
	public void cacheResult(InstalledSteps installedSteps) {
		EntityCacheUtil.putResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsImpl.class, installedSteps.getPrimaryKey(),
			installedSteps);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TYPE,
			new Object[] { installedSteps.getType() }, installedSteps);

		installedSteps.resetOriginalValues();
	}

	/**
	 * Caches the installed stepses in the entity cache if it is enabled.
	 *
	 * @param installedStepses the installed stepses
	 */
	@Override
	public void cacheResult(List<InstalledSteps> installedStepses) {
		for (InstalledSteps installedSteps : installedStepses) {
			if (EntityCacheUtil.getResult(
						InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
						InstalledStepsImpl.class, installedSteps.getPrimaryKey()) == null) {
				cacheResult(installedSteps);
			}
			else {
				installedSteps.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all installed stepses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InstalledStepsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InstalledStepsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the installed steps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InstalledSteps installedSteps) {
		EntityCacheUtil.removeResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsImpl.class, installedSteps.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(installedSteps);
	}

	@Override
	public void clearCache(List<InstalledSteps> installedStepses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InstalledSteps installedSteps : installedStepses) {
			EntityCacheUtil.removeResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
				InstalledStepsImpl.class, installedSteps.getPrimaryKey());

			clearUniqueFindersCache(installedSteps);
		}
	}

	protected void cacheUniqueFindersCache(InstalledSteps installedSteps) {
		if (installedSteps.isNew()) {
			Object[] args = new Object[] { installedSteps.getType() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TYPE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TYPE, args,
				installedSteps);
		}
		else {
			InstalledStepsModelImpl installedStepsModelImpl = (InstalledStepsModelImpl)installedSteps;

			if ((installedStepsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { installedSteps.getType() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TYPE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TYPE, args,
					installedSteps);
			}
		}
	}

	protected void clearUniqueFindersCache(InstalledSteps installedSteps) {
		InstalledStepsModelImpl installedStepsModelImpl = (InstalledStepsModelImpl)installedSteps;

		Object[] args = new Object[] { installedSteps.getType() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TYPE, args);

		if ((installedStepsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TYPE.getColumnBitmask()) != 0) {
			args = new Object[] { installedStepsModelImpl.getOriginalType() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TYPE, args);
		}
	}

	/**
	 * Creates a new installed steps with the primary key. Does not add the installed steps to the database.
	 *
	 * @param type the primary key for the new installed steps
	 * @return the new installed steps
	 */
	@Override
	public InstalledSteps create(String type) {
		InstalledSteps installedSteps = new InstalledStepsImpl();

		installedSteps.setNew(true);
		installedSteps.setPrimaryKey(type);

		return installedSteps;
	}

	/**
	 * Removes the installed steps with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param type the primary key of the installed steps
	 * @return the installed steps that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps remove(String type)
		throws NoSuchInstalledStepsException, SystemException {
		return remove((Serializable)type);
	}

	/**
	 * Removes the installed steps with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the installed steps
	 * @return the installed steps that was removed
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps remove(Serializable primaryKey)
		throws NoSuchInstalledStepsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			InstalledSteps installedSteps = (InstalledSteps)session.get(InstalledStepsImpl.class,
					primaryKey);

			if (installedSteps == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstalledStepsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(installedSteps);
		}
		catch (NoSuchInstalledStepsException nsee) {
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
	protected InstalledSteps removeImpl(InstalledSteps installedSteps)
		throws SystemException {
		installedSteps = toUnwrappedModel(installedSteps);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(installedSteps)) {
				installedSteps = (InstalledSteps)session.get(InstalledStepsImpl.class,
						installedSteps.getPrimaryKeyObj());
			}

			if (installedSteps != null) {
				session.delete(installedSteps);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (installedSteps != null) {
			clearCache(installedSteps);
		}

		return installedSteps;
	}

	@Override
	public InstalledSteps updateImpl(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps)
		throws SystemException {
		installedSteps = toUnwrappedModel(installedSteps);

		boolean isNew = installedSteps.isNew();

		Session session = null;

		try {
			session = openSession();

			if (installedSteps.isNew()) {
				session.save(installedSteps);

				installedSteps.setNew(false);
			}
			else {
				session.merge(installedSteps);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InstalledStepsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
			InstalledStepsImpl.class, installedSteps.getPrimaryKey(),
			installedSteps);

		clearUniqueFindersCache(installedSteps);
		cacheUniqueFindersCache(installedSteps);

		return installedSteps;
	}

	protected InstalledSteps toUnwrappedModel(InstalledSteps installedSteps) {
		if (installedSteps instanceof InstalledStepsImpl) {
			return installedSteps;
		}

		InstalledStepsImpl installedStepsImpl = new InstalledStepsImpl();

		installedStepsImpl.setNew(installedSteps.isNew());
		installedStepsImpl.setPrimaryKey(installedSteps.getPrimaryKey());

		installedStepsImpl.setType(installedSteps.getType());
		installedStepsImpl.setGroupId(installedSteps.getGroupId());
		installedStepsImpl.setCompanyId(installedSteps.getCompanyId());
		installedStepsImpl.setUserId(installedSteps.getUserId());
		installedStepsImpl.setUserName(installedSteps.getUserName());
		installedStepsImpl.setCreateDate(installedSteps.getCreateDate());
		installedStepsImpl.setModifiedDate(installedSteps.getModifiedDate());
		installedStepsImpl.setNamespace(installedSteps.getNamespace());
		installedStepsImpl.setClassName(installedSteps.getClassName());

		return installedStepsImpl;
	}

	/**
	 * Returns the installed steps with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed steps
	 * @return the installed steps
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstalledStepsException, SystemException {
		InstalledSteps installedSteps = fetchByPrimaryKey(primaryKey);

		if (installedSteps == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstalledStepsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return installedSteps;
	}

	/**
	 * Returns the installed steps with the primary key or throws a {@link org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException} if it could not be found.
	 *
	 * @param type the primary key of the installed steps
	 * @return the installed steps
	 * @throws org.lrc.liferay.toolbuilder.NoSuchInstalledStepsException if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps findByPrimaryKey(String type)
		throws NoSuchInstalledStepsException, SystemException {
		return findByPrimaryKey((Serializable)type);
	}

	/**
	 * Returns the installed steps with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed steps
	 * @return the installed steps, or <code>null</code> if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		InstalledSteps installedSteps = (InstalledSteps)EntityCacheUtil.getResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
				InstalledStepsImpl.class, primaryKey);

		if (installedSteps == _nullInstalledSteps) {
			return null;
		}

		if (installedSteps == null) {
			Session session = null;

			try {
				session = openSession();

				installedSteps = (InstalledSteps)session.get(InstalledStepsImpl.class,
						primaryKey);

				if (installedSteps != null) {
					cacheResult(installedSteps);
				}
				else {
					EntityCacheUtil.putResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
						InstalledStepsImpl.class, primaryKey,
						_nullInstalledSteps);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InstalledStepsModelImpl.ENTITY_CACHE_ENABLED,
					InstalledStepsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return installedSteps;
	}

	/**
	 * Returns the installed steps with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param type the primary key of the installed steps
	 * @return the installed steps, or <code>null</code> if a installed steps with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public InstalledSteps fetchByPrimaryKey(String type)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)type);
	}

	/**
	 * Returns all the installed stepses.
	 *
	 * @return the installed stepses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledSteps> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the installed stepses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of installed stepses
	 * @param end the upper bound of the range of installed stepses (not inclusive)
	 * @return the range of installed stepses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledSteps> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the installed stepses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.lrc.liferay.toolbuilder.model.impl.InstalledStepsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of installed stepses
	 * @param end the upper bound of the range of installed stepses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of installed stepses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<InstalledSteps> findAll(int start, int end,
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

		List<InstalledSteps> list = (List<InstalledSteps>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSTALLEDSTEPS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSTALLEDSTEPS;

				if (pagination) {
					sql = sql.concat(InstalledStepsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InstalledSteps>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<InstalledSteps>(list);
				}
				else {
					list = (List<InstalledSteps>)QueryUtil.list(q,
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
	 * Removes all the installed stepses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (InstalledSteps installedSteps : findAll()) {
			remove(installedSteps);
		}
	}

	/**
	 * Returns the number of installed stepses.
	 *
	 * @return the number of installed stepses
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

				Query q = session.createQuery(_SQL_COUNT_INSTALLEDSTEPS);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the installed steps persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.lrc.liferay.toolbuilder.model.InstalledSteps")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<InstalledSteps>> listenersList = new ArrayList<ModelListener<InstalledSteps>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<InstalledSteps>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InstalledStepsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSTALLEDSTEPS = "SELECT installedSteps FROM InstalledSteps installedSteps";
	private static final String _SQL_SELECT_INSTALLEDSTEPS_WHERE = "SELECT installedSteps FROM InstalledSteps installedSteps WHERE ";
	private static final String _SQL_COUNT_INSTALLEDSTEPS = "SELECT COUNT(installedSteps) FROM InstalledSteps installedSteps";
	private static final String _SQL_COUNT_INSTALLEDSTEPS_WHERE = "SELECT COUNT(installedSteps) FROM InstalledSteps installedSteps WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "installedSteps.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InstalledSteps exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No InstalledSteps exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InstalledStepsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static InstalledSteps _nullInstalledSteps = new InstalledStepsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InstalledSteps> toCacheModel() {
				return _nullInstalledStepsCacheModel;
			}
		};

	private static CacheModel<InstalledSteps> _nullInstalledStepsCacheModel = new CacheModel<InstalledSteps>() {
			@Override
			public InstalledSteps toEntityModel() {
				return _nullInstalledSteps;
			}
		};
}