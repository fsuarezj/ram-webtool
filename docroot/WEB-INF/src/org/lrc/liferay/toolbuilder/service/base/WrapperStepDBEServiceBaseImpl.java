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

package org.lrc.liferay.toolbuilder.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.lrc.liferay.toolbuilder.model.WrapperStepDBE;
import org.lrc.liferay.toolbuilder.service.WrapperStepDBEService;
import org.lrc.liferay.toolbuilder.service.persistence.InstalledStepPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.StepDBEPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.StepDefDBEPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.ToolDefDBEPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.ToolInstanceDBEPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.WrapperStepDBEPersistence;
import org.lrc.liferay.toolbuilder.service.persistence.WrapperStepDefDBEPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the wrapper step d b e remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.lrc.liferay.toolbuilder.service.impl.WrapperStepDBEServiceImpl}.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.impl.WrapperStepDBEServiceImpl
 * @see org.lrc.liferay.toolbuilder.service.WrapperStepDBEServiceUtil
 * @generated
 */
public abstract class WrapperStepDBEServiceBaseImpl extends BaseServiceImpl
	implements WrapperStepDBEService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.lrc.liferay.toolbuilder.service.WrapperStepDBEServiceUtil} to access the wrapper step d b e remote service.
	 */

	/**
	 * Returns the installed step local service.
	 *
	 * @return the installed step local service
	 */
	public org.lrc.liferay.toolbuilder.service.InstalledStepLocalService getInstalledStepLocalService() {
		return installedStepLocalService;
	}

	/**
	 * Sets the installed step local service.
	 *
	 * @param installedStepLocalService the installed step local service
	 */
	public void setInstalledStepLocalService(
		org.lrc.liferay.toolbuilder.service.InstalledStepLocalService installedStepLocalService) {
		this.installedStepLocalService = installedStepLocalService;
	}

	/**
	 * Returns the installed step remote service.
	 *
	 * @return the installed step remote service
	 */
	public org.lrc.liferay.toolbuilder.service.InstalledStepService getInstalledStepService() {
		return installedStepService;
	}

	/**
	 * Sets the installed step remote service.
	 *
	 * @param installedStepService the installed step remote service
	 */
	public void setInstalledStepService(
		org.lrc.liferay.toolbuilder.service.InstalledStepService installedStepService) {
		this.installedStepService = installedStepService;
	}

	/**
	 * Returns the installed step persistence.
	 *
	 * @return the installed step persistence
	 */
	public InstalledStepPersistence getInstalledStepPersistence() {
		return installedStepPersistence;
	}

	/**
	 * Sets the installed step persistence.
	 *
	 * @param installedStepPersistence the installed step persistence
	 */
	public void setInstalledStepPersistence(
		InstalledStepPersistence installedStepPersistence) {
		this.installedStepPersistence = installedStepPersistence;
	}

	/**
	 * Returns the step d b e local service.
	 *
	 * @return the step d b e local service
	 */
	public org.lrc.liferay.toolbuilder.service.StepDBELocalService getStepDBELocalService() {
		return stepDBELocalService;
	}

	/**
	 * Sets the step d b e local service.
	 *
	 * @param stepDBELocalService the step d b e local service
	 */
	public void setStepDBELocalService(
		org.lrc.liferay.toolbuilder.service.StepDBELocalService stepDBELocalService) {
		this.stepDBELocalService = stepDBELocalService;
	}

	/**
	 * Returns the step d b e remote service.
	 *
	 * @return the step d b e remote service
	 */
	public org.lrc.liferay.toolbuilder.service.StepDBEService getStepDBEService() {
		return stepDBEService;
	}

	/**
	 * Sets the step d b e remote service.
	 *
	 * @param stepDBEService the step d b e remote service
	 */
	public void setStepDBEService(
		org.lrc.liferay.toolbuilder.service.StepDBEService stepDBEService) {
		this.stepDBEService = stepDBEService;
	}

	/**
	 * Returns the step d b e persistence.
	 *
	 * @return the step d b e persistence
	 */
	public StepDBEPersistence getStepDBEPersistence() {
		return stepDBEPersistence;
	}

	/**
	 * Sets the step d b e persistence.
	 *
	 * @param stepDBEPersistence the step d b e persistence
	 */
	public void setStepDBEPersistence(StepDBEPersistence stepDBEPersistence) {
		this.stepDBEPersistence = stepDBEPersistence;
	}

	/**
	 * Returns the Step Definition local service.
	 *
	 * @return the Step Definition local service
	 */
	public org.lrc.liferay.toolbuilder.service.StepDefDBELocalService getStepDefDBELocalService() {
		return stepDefDBELocalService;
	}

	/**
	 * Sets the Step Definition local service.
	 *
	 * @param stepDefDBELocalService the Step Definition local service
	 */
	public void setStepDefDBELocalService(
		org.lrc.liferay.toolbuilder.service.StepDefDBELocalService stepDefDBELocalService) {
		this.stepDefDBELocalService = stepDefDBELocalService;
	}

	/**
	 * Returns the Step Definition remote service.
	 *
	 * @return the Step Definition remote service
	 */
	public org.lrc.liferay.toolbuilder.service.StepDefDBEService getStepDefDBEService() {
		return stepDefDBEService;
	}

	/**
	 * Sets the Step Definition remote service.
	 *
	 * @param stepDefDBEService the Step Definition remote service
	 */
	public void setStepDefDBEService(
		org.lrc.liferay.toolbuilder.service.StepDefDBEService stepDefDBEService) {
		this.stepDefDBEService = stepDefDBEService;
	}

	/**
	 * Returns the Step Definition persistence.
	 *
	 * @return the Step Definition persistence
	 */
	public StepDefDBEPersistence getStepDefDBEPersistence() {
		return stepDefDBEPersistence;
	}

	/**
	 * Sets the Step Definition persistence.
	 *
	 * @param stepDefDBEPersistence the Step Definition persistence
	 */
	public void setStepDefDBEPersistence(
		StepDefDBEPersistence stepDefDBEPersistence) {
		this.stepDefDBEPersistence = stepDefDBEPersistence;
	}

	/**
	 * Returns the tool def d b e remote service.
	 *
	 * @return the tool def d b e remote service
	 */
	public org.lrc.liferay.toolbuilder.service.ToolDefDBEService getToolDefDBEService() {
		return toolDefDBEService;
	}

	/**
	 * Sets the tool def d b e remote service.
	 *
	 * @param toolDefDBEService the tool def d b e remote service
	 */
	public void setToolDefDBEService(
		org.lrc.liferay.toolbuilder.service.ToolDefDBEService toolDefDBEService) {
		this.toolDefDBEService = toolDefDBEService;
	}

	/**
	 * Returns the tool def d b e persistence.
	 *
	 * @return the tool def d b e persistence
	 */
	public ToolDefDBEPersistence getToolDefDBEPersistence() {
		return toolDefDBEPersistence;
	}

	/**
	 * Sets the tool def d b e persistence.
	 *
	 * @param toolDefDBEPersistence the tool def d b e persistence
	 */
	public void setToolDefDBEPersistence(
		ToolDefDBEPersistence toolDefDBEPersistence) {
		this.toolDefDBEPersistence = toolDefDBEPersistence;
	}

	/**
	 * Returns the tool instance d b e local service.
	 *
	 * @return the tool instance d b e local service
	 */
	public org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalService getToolInstanceDBELocalService() {
		return toolInstanceDBELocalService;
	}

	/**
	 * Sets the tool instance d b e local service.
	 *
	 * @param toolInstanceDBELocalService the tool instance d b e local service
	 */
	public void setToolInstanceDBELocalService(
		org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalService toolInstanceDBELocalService) {
		this.toolInstanceDBELocalService = toolInstanceDBELocalService;
	}

	/**
	 * Returns the tool instance d b e remote service.
	 *
	 * @return the tool instance d b e remote service
	 */
	public org.lrc.liferay.toolbuilder.service.ToolInstanceDBEService getToolInstanceDBEService() {
		return toolInstanceDBEService;
	}

	/**
	 * Sets the tool instance d b e remote service.
	 *
	 * @param toolInstanceDBEService the tool instance d b e remote service
	 */
	public void setToolInstanceDBEService(
		org.lrc.liferay.toolbuilder.service.ToolInstanceDBEService toolInstanceDBEService) {
		this.toolInstanceDBEService = toolInstanceDBEService;
	}

	/**
	 * Returns the tool instance d b e persistence.
	 *
	 * @return the tool instance d b e persistence
	 */
	public ToolInstanceDBEPersistence getToolInstanceDBEPersistence() {
		return toolInstanceDBEPersistence;
	}

	/**
	 * Sets the tool instance d b e persistence.
	 *
	 * @param toolInstanceDBEPersistence the tool instance d b e persistence
	 */
	public void setToolInstanceDBEPersistence(
		ToolInstanceDBEPersistence toolInstanceDBEPersistence) {
		this.toolInstanceDBEPersistence = toolInstanceDBEPersistence;
	}

	/**
	 * Returns the wrapper step d b e local service.
	 *
	 * @return the wrapper step d b e local service
	 */
	public org.lrc.liferay.toolbuilder.service.WrapperStepDBELocalService getWrapperStepDBELocalService() {
		return wrapperStepDBELocalService;
	}

	/**
	 * Sets the wrapper step d b e local service.
	 *
	 * @param wrapperStepDBELocalService the wrapper step d b e local service
	 */
	public void setWrapperStepDBELocalService(
		org.lrc.liferay.toolbuilder.service.WrapperStepDBELocalService wrapperStepDBELocalService) {
		this.wrapperStepDBELocalService = wrapperStepDBELocalService;
	}

	/**
	 * Returns the wrapper step d b e remote service.
	 *
	 * @return the wrapper step d b e remote service
	 */
	public org.lrc.liferay.toolbuilder.service.WrapperStepDBEService getWrapperStepDBEService() {
		return wrapperStepDBEService;
	}

	/**
	 * Sets the wrapper step d b e remote service.
	 *
	 * @param wrapperStepDBEService the wrapper step d b e remote service
	 */
	public void setWrapperStepDBEService(
		org.lrc.liferay.toolbuilder.service.WrapperStepDBEService wrapperStepDBEService) {
		this.wrapperStepDBEService = wrapperStepDBEService;
	}

	/**
	 * Returns the wrapper step d b e persistence.
	 *
	 * @return the wrapper step d b e persistence
	 */
	public WrapperStepDBEPersistence getWrapperStepDBEPersistence() {
		return wrapperStepDBEPersistence;
	}

	/**
	 * Sets the wrapper step d b e persistence.
	 *
	 * @param wrapperStepDBEPersistence the wrapper step d b e persistence
	 */
	public void setWrapperStepDBEPersistence(
		WrapperStepDBEPersistence wrapperStepDBEPersistence) {
		this.wrapperStepDBEPersistence = wrapperStepDBEPersistence;
	}

	/**
	 * Returns the wrapper step def d b e local service.
	 *
	 * @return the wrapper step def d b e local service
	 */
	public org.lrc.liferay.toolbuilder.service.WrapperStepDefDBELocalService getWrapperStepDefDBELocalService() {
		return wrapperStepDefDBELocalService;
	}

	/**
	 * Sets the wrapper step def d b e local service.
	 *
	 * @param wrapperStepDefDBELocalService the wrapper step def d b e local service
	 */
	public void setWrapperStepDefDBELocalService(
		org.lrc.liferay.toolbuilder.service.WrapperStepDefDBELocalService wrapperStepDefDBELocalService) {
		this.wrapperStepDefDBELocalService = wrapperStepDefDBELocalService;
	}

	/**
	 * Returns the wrapper step def d b e remote service.
	 *
	 * @return the wrapper step def d b e remote service
	 */
	public org.lrc.liferay.toolbuilder.service.WrapperStepDefDBEService getWrapperStepDefDBEService() {
		return wrapperStepDefDBEService;
	}

	/**
	 * Sets the wrapper step def d b e remote service.
	 *
	 * @param wrapperStepDefDBEService the wrapper step def d b e remote service
	 */
	public void setWrapperStepDefDBEService(
		org.lrc.liferay.toolbuilder.service.WrapperStepDefDBEService wrapperStepDefDBEService) {
		this.wrapperStepDefDBEService = wrapperStepDefDBEService;
	}

	/**
	 * Returns the wrapper step def d b e persistence.
	 *
	 * @return the wrapper step def d b e persistence
	 */
	public WrapperStepDefDBEPersistence getWrapperStepDefDBEPersistence() {
		return wrapperStepDefDBEPersistence;
	}

	/**
	 * Sets the wrapper step def d b e persistence.
	 *
	 * @param wrapperStepDefDBEPersistence the wrapper step def d b e persistence
	 */
	public void setWrapperStepDefDBEPersistence(
		WrapperStepDefDBEPersistence wrapperStepDefDBEPersistence) {
		this.wrapperStepDefDBEPersistence = wrapperStepDefDBEPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return WrapperStepDBE.class;
	}

	protected String getModelClassName() {
		return WrapperStepDBE.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = wrapperStepDBEPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.lrc.liferay.toolbuilder.service.InstalledStepLocalService.class)
	protected org.lrc.liferay.toolbuilder.service.InstalledStepLocalService installedStepLocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.InstalledStepService.class)
	protected org.lrc.liferay.toolbuilder.service.InstalledStepService installedStepService;
	@BeanReference(type = InstalledStepPersistence.class)
	protected InstalledStepPersistence installedStepPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.StepDBELocalService.class)
	protected org.lrc.liferay.toolbuilder.service.StepDBELocalService stepDBELocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.StepDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.StepDBEService stepDBEService;
	@BeanReference(type = StepDBEPersistence.class)
	protected StepDBEPersistence stepDBEPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.StepDefDBELocalService.class)
	protected org.lrc.liferay.toolbuilder.service.StepDefDBELocalService stepDefDBELocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.StepDefDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.StepDefDBEService stepDefDBEService;
	@BeanReference(type = StepDefDBEPersistence.class)
	protected StepDefDBEPersistence stepDefDBEPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.ToolDefDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.ToolDefDBEService toolDefDBEService;
	@BeanReference(type = ToolDefDBEPersistence.class)
	protected ToolDefDBEPersistence toolDefDBEPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalService.class)
	protected org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalService toolInstanceDBELocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.ToolInstanceDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.ToolInstanceDBEService toolInstanceDBEService;
	@BeanReference(type = ToolInstanceDBEPersistence.class)
	protected ToolInstanceDBEPersistence toolInstanceDBEPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.WrapperStepDBELocalService.class)
	protected org.lrc.liferay.toolbuilder.service.WrapperStepDBELocalService wrapperStepDBELocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.WrapperStepDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.WrapperStepDBEService wrapperStepDBEService;
	@BeanReference(type = WrapperStepDBEPersistence.class)
	protected WrapperStepDBEPersistence wrapperStepDBEPersistence;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.WrapperStepDefDBELocalService.class)
	protected org.lrc.liferay.toolbuilder.service.WrapperStepDefDBELocalService wrapperStepDefDBELocalService;
	@BeanReference(type = org.lrc.liferay.toolbuilder.service.WrapperStepDefDBEService.class)
	protected org.lrc.liferay.toolbuilder.service.WrapperStepDefDBEService wrapperStepDefDBEService;
	@BeanReference(type = WrapperStepDefDBEPersistence.class)
	protected WrapperStepDefDBEPersistence wrapperStepDefDBEPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private WrapperStepDBEServiceClpInvoker _clpInvoker = new WrapperStepDBEServiceClpInvoker();
}