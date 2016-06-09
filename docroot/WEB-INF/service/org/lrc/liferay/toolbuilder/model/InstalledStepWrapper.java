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

package org.lrc.liferay.toolbuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link InstalledStep}.
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledStep
 * @generated
 */
public class InstalledStepWrapper implements InstalledStep,
	ModelWrapper<InstalledStep> {
	public InstalledStepWrapper(InstalledStep installedStep) {
		_installedStep = installedStep;
	}

	@Override
	public Class<?> getModelClass() {
		return InstalledStep.class;
	}

	@Override
	public String getModelClassName() {
		return InstalledStep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepType", getStepType());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("namespace", getNamespace());
		attributes.put("className", getClassName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String stepType = (String)attributes.get("stepType");

		if (stepType != null) {
			setStepType(stepType);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String namespace = (String)attributes.get("namespace");

		if (namespace != null) {
			setNamespace(namespace);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}
	}

	/**
	* Returns the primary key of this installed step.
	*
	* @return the primary key of this installed step
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _installedStep.getPrimaryKey();
	}

	/**
	* Sets the primary key of this installed step.
	*
	* @param primaryKey the primary key of this installed step
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_installedStep.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the step type of this installed step.
	*
	* @return the step type of this installed step
	*/
	@Override
	public java.lang.String getStepType() {
		return _installedStep.getStepType();
	}

	/**
	* Sets the step type of this installed step.
	*
	* @param stepType the step type of this installed step
	*/
	@Override
	public void setStepType(java.lang.String stepType) {
		_installedStep.setStepType(stepType);
	}

	/**
	* Returns the group ID of this installed step.
	*
	* @return the group ID of this installed step
	*/
	@Override
	public long getGroupId() {
		return _installedStep.getGroupId();
	}

	/**
	* Sets the group ID of this installed step.
	*
	* @param groupId the group ID of this installed step
	*/
	@Override
	public void setGroupId(long groupId) {
		_installedStep.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this installed step.
	*
	* @return the company ID of this installed step
	*/
	@Override
	public long getCompanyId() {
		return _installedStep.getCompanyId();
	}

	/**
	* Sets the company ID of this installed step.
	*
	* @param companyId the company ID of this installed step
	*/
	@Override
	public void setCompanyId(long companyId) {
		_installedStep.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this installed step.
	*
	* @return the user ID of this installed step
	*/
	@Override
	public long getUserId() {
		return _installedStep.getUserId();
	}

	/**
	* Sets the user ID of this installed step.
	*
	* @param userId the user ID of this installed step
	*/
	@Override
	public void setUserId(long userId) {
		_installedStep.setUserId(userId);
	}

	/**
	* Returns the user uuid of this installed step.
	*
	* @return the user uuid of this installed step
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedStep.getUserUuid();
	}

	/**
	* Sets the user uuid of this installed step.
	*
	* @param userUuid the user uuid of this installed step
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_installedStep.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this installed step.
	*
	* @return the user name of this installed step
	*/
	@Override
	public java.lang.String getUserName() {
		return _installedStep.getUserName();
	}

	/**
	* Sets the user name of this installed step.
	*
	* @param userName the user name of this installed step
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_installedStep.setUserName(userName);
	}

	/**
	* Returns the create date of this installed step.
	*
	* @return the create date of this installed step
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _installedStep.getCreateDate();
	}

	/**
	* Sets the create date of this installed step.
	*
	* @param createDate the create date of this installed step
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_installedStep.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this installed step.
	*
	* @return the modified date of this installed step
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _installedStep.getModifiedDate();
	}

	/**
	* Sets the modified date of this installed step.
	*
	* @param modifiedDate the modified date of this installed step
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_installedStep.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the namespace of this installed step.
	*
	* @return the namespace of this installed step
	*/
	@Override
	public java.lang.String getNamespace() {
		return _installedStep.getNamespace();
	}

	/**
	* Sets the namespace of this installed step.
	*
	* @param namespace the namespace of this installed step
	*/
	@Override
	public void setNamespace(java.lang.String namespace) {
		_installedStep.setNamespace(namespace);
	}

	/**
	* Returns the class name of this installed step.
	*
	* @return the class name of this installed step
	*/
	@Override
	public java.lang.String getClassName() {
		return _installedStep.getClassName();
	}

	/**
	* Sets the class name of this installed step.
	*
	* @param className the class name of this installed step
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_installedStep.setClassName(className);
	}

	@Override
	public boolean isNew() {
		return _installedStep.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_installedStep.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _installedStep.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_installedStep.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _installedStep.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _installedStep.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_installedStep.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _installedStep.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_installedStep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_installedStep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_installedStep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InstalledStepWrapper((InstalledStep)_installedStep.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.InstalledStep installedStep) {
		return _installedStep.compareTo(installedStep);
	}

	@Override
	public int hashCode() {
		return _installedStep.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.InstalledStep> toCacheModel() {
		return _installedStep.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep toEscapedModel() {
		return new InstalledStepWrapper(_installedStep.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledStep toUnescapedModel() {
		return new InstalledStepWrapper(_installedStep.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _installedStep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _installedStep.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_installedStep.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstalledStepWrapper)) {
			return false;
		}

		InstalledStepWrapper installedStepWrapper = (InstalledStepWrapper)obj;

		if (Validator.equals(_installedStep, installedStepWrapper._installedStep)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InstalledStep getWrappedInstalledStep() {
		return _installedStep;
	}

	@Override
	public InstalledStep getWrappedModel() {
		return _installedStep;
	}

	@Override
	public void resetOriginalValues() {
		_installedStep.resetOriginalValues();
	}

	private InstalledStep _installedStep;
}