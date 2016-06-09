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
 * This class is a wrapper for {@link InstalledSteps}.
 * </p>
 *
 * @author Fernando Suárez
 * @see InstalledSteps
 * @generated
 */
public class InstalledStepsWrapper implements InstalledSteps,
	ModelWrapper<InstalledSteps> {
	public InstalledStepsWrapper(InstalledSteps installedSteps) {
		_installedSteps = installedSteps;
	}

	@Override
	public Class<?> getModelClass() {
		return InstalledSteps.class;
	}

	@Override
	public String getModelClassName() {
		return InstalledSteps.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("type", getType());
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
		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
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
	* Returns the primary key of this installed steps.
	*
	* @return the primary key of this installed steps
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _installedSteps.getPrimaryKey();
	}

	/**
	* Sets the primary key of this installed steps.
	*
	* @param primaryKey the primary key of this installed steps
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_installedSteps.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the type of this installed steps.
	*
	* @return the type of this installed steps
	*/
	@Override
	public java.lang.String getType() {
		return _installedSteps.getType();
	}

	/**
	* Sets the type of this installed steps.
	*
	* @param type the type of this installed steps
	*/
	@Override
	public void setType(java.lang.String type) {
		_installedSteps.setType(type);
	}

	/**
	* Returns the group ID of this installed steps.
	*
	* @return the group ID of this installed steps
	*/
	@Override
	public long getGroupId() {
		return _installedSteps.getGroupId();
	}

	/**
	* Sets the group ID of this installed steps.
	*
	* @param groupId the group ID of this installed steps
	*/
	@Override
	public void setGroupId(long groupId) {
		_installedSteps.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this installed steps.
	*
	* @return the company ID of this installed steps
	*/
	@Override
	public long getCompanyId() {
		return _installedSteps.getCompanyId();
	}

	/**
	* Sets the company ID of this installed steps.
	*
	* @param companyId the company ID of this installed steps
	*/
	@Override
	public void setCompanyId(long companyId) {
		_installedSteps.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this installed steps.
	*
	* @return the user ID of this installed steps
	*/
	@Override
	public long getUserId() {
		return _installedSteps.getUserId();
	}

	/**
	* Sets the user ID of this installed steps.
	*
	* @param userId the user ID of this installed steps
	*/
	@Override
	public void setUserId(long userId) {
		_installedSteps.setUserId(userId);
	}

	/**
	* Returns the user uuid of this installed steps.
	*
	* @return the user uuid of this installed steps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedSteps.getUserUuid();
	}

	/**
	* Sets the user uuid of this installed steps.
	*
	* @param userUuid the user uuid of this installed steps
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_installedSteps.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this installed steps.
	*
	* @return the user name of this installed steps
	*/
	@Override
	public java.lang.String getUserName() {
		return _installedSteps.getUserName();
	}

	/**
	* Sets the user name of this installed steps.
	*
	* @param userName the user name of this installed steps
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_installedSteps.setUserName(userName);
	}

	/**
	* Returns the create date of this installed steps.
	*
	* @return the create date of this installed steps
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _installedSteps.getCreateDate();
	}

	/**
	* Sets the create date of this installed steps.
	*
	* @param createDate the create date of this installed steps
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_installedSteps.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this installed steps.
	*
	* @return the modified date of this installed steps
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _installedSteps.getModifiedDate();
	}

	/**
	* Sets the modified date of this installed steps.
	*
	* @param modifiedDate the modified date of this installed steps
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_installedSteps.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the namespace of this installed steps.
	*
	* @return the namespace of this installed steps
	*/
	@Override
	public java.lang.String getNamespace() {
		return _installedSteps.getNamespace();
	}

	/**
	* Sets the namespace of this installed steps.
	*
	* @param namespace the namespace of this installed steps
	*/
	@Override
	public void setNamespace(java.lang.String namespace) {
		_installedSteps.setNamespace(namespace);
	}

	/**
	* Returns the class name of this installed steps.
	*
	* @return the class name of this installed steps
	*/
	@Override
	public java.lang.String getClassName() {
		return _installedSteps.getClassName();
	}

	/**
	* Sets the class name of this installed steps.
	*
	* @param className the class name of this installed steps
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_installedSteps.setClassName(className);
	}

	@Override
	public boolean isNew() {
		return _installedSteps.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_installedSteps.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _installedSteps.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_installedSteps.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _installedSteps.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _installedSteps.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_installedSteps.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _installedSteps.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_installedSteps.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_installedSteps.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_installedSteps.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InstalledStepsWrapper((InstalledSteps)_installedSteps.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.InstalledSteps installedSteps) {
		return _installedSteps.compareTo(installedSteps);
	}

	@Override
	public int hashCode() {
		return _installedSteps.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.InstalledSteps> toCacheModel() {
		return _installedSteps.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps toEscapedModel() {
		return new InstalledStepsWrapper(_installedSteps.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.InstalledSteps toUnescapedModel() {
		return new InstalledStepsWrapper(_installedSteps.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _installedSteps.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _installedSteps.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_installedSteps.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstalledStepsWrapper)) {
			return false;
		}

		InstalledStepsWrapper installedStepsWrapper = (InstalledStepsWrapper)obj;

		if (Validator.equals(_installedSteps,
					installedStepsWrapper._installedSteps)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public InstalledSteps getWrappedInstalledSteps() {
		return _installedSteps;
	}

	@Override
	public InstalledSteps getWrappedModel() {
		return _installedSteps;
	}

	@Override
	public void resetOriginalValues() {
		_installedSteps.resetOriginalValues();
	}

	private InstalledSteps _installedSteps;
}