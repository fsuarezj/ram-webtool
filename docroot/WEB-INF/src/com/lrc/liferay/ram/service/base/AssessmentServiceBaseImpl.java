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

package com.lrc.liferay.ram.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.AssessmentService;
import com.lrc.liferay.ram.service.persistence.AssessmentPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the assessment remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lrc.liferay.ram.service.impl.AssessmentServiceImpl}.
 * </p>
 *
 * @author fsuarezj
 * @see com.lrc.liferay.ram.service.impl.AssessmentServiceImpl
 * @see com.lrc.liferay.ram.service.AssessmentServiceUtil
 * @generated
 */
public abstract class AssessmentServiceBaseImpl extends BaseServiceImpl
	implements AssessmentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lrc.liferay.ram.service.AssessmentServiceUtil} to access the assessment remote service.
	 */

	/**
	 * Returns the assessment local service.
	 *
	 * @return the assessment local service
	 */
	public com.lrc.liferay.ram.service.AssessmentLocalService getAssessmentLocalService() {
		return assessmentLocalService;
	}

	/**
	 * Sets the assessment local service.
	 *
	 * @param assessmentLocalService the assessment local service
	 */
	public void setAssessmentLocalService(
		com.lrc.liferay.ram.service.AssessmentLocalService assessmentLocalService) {
		this.assessmentLocalService = assessmentLocalService;
	}

	/**
	 * Returns the assessment remote service.
	 *
	 * @return the assessment remote service
	 */
	public com.lrc.liferay.ram.service.AssessmentService getAssessmentService() {
		return assessmentService;
	}

	/**
	 * Sets the assessment remote service.
	 *
	 * @param assessmentService the assessment remote service
	 */
	public void setAssessmentService(
		com.lrc.liferay.ram.service.AssessmentService assessmentService) {
		this.assessmentService = assessmentService;
	}

	/**
	 * Returns the assessment persistence.
	 *
	 * @return the assessment persistence
	 */
	public AssessmentPersistence getAssessmentPersistence() {
		return assessmentPersistence;
	}

	/**
	 * Sets the assessment persistence.
	 *
	 * @param assessmentPersistence the assessment persistence
	 */
	public void setAssessmentPersistence(
		AssessmentPersistence assessmentPersistence) {
		this.assessmentPersistence = assessmentPersistence;
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
		return Assessment.class;
	}

	protected String getModelClassName() {
		return Assessment.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = assessmentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.lrc.liferay.ram.service.AssessmentLocalService.class)
	protected com.lrc.liferay.ram.service.AssessmentLocalService assessmentLocalService;
	@BeanReference(type = com.lrc.liferay.ram.service.AssessmentService.class)
	protected com.lrc.liferay.ram.service.AssessmentService assessmentService;
	@BeanReference(type = AssessmentPersistence.class)
	protected AssessmentPersistence assessmentPersistence;
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
	private AssessmentServiceClpInvoker _clpInvoker = new AssessmentServiceClpInvoker();
}