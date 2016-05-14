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
 * This class is a wrapper for {@link Instance}.
 * </p>
 *
 * @author Fernando Suárez
 * @see Instance
 * @generated
 */
public class InstanceWrapper implements Instance, ModelWrapper<Instance> {
	public InstanceWrapper(Instance instance) {
		_instance = instance;
	}

	@Override
	public Class<?> getModelClass() {
		return Instance.class;
	}

	@Override
	public String getModelClassName() {
		return Instance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("instanceId", getInstanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("step", getStep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long instanceId = (Long)attributes.get("instanceId");

		if (instanceId != null) {
			setInstanceId(instanceId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer step = (Integer)attributes.get("step");

		if (step != null) {
			setStep(step);
		}
	}

	/**
	* Returns the primary key of this instance.
	*
	* @return the primary key of this instance
	*/
	@Override
	public long getPrimaryKey() {
		return _instance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this instance.
	*
	* @param primaryKey the primary key of this instance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_instance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the instance ID of this instance.
	*
	* @return the instance ID of this instance
	*/
	@Override
	public long getInstanceId() {
		return _instance.getInstanceId();
	}

	/**
	* Sets the instance ID of this instance.
	*
	* @param instanceId the instance ID of this instance
	*/
	@Override
	public void setInstanceId(long instanceId) {
		_instance.setInstanceId(instanceId);
	}

	/**
	* Returns the group ID of this instance.
	*
	* @return the group ID of this instance
	*/
	@Override
	public long getGroupId() {
		return _instance.getGroupId();
	}

	/**
	* Sets the group ID of this instance.
	*
	* @param groupId the group ID of this instance
	*/
	@Override
	public void setGroupId(long groupId) {
		_instance.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this instance.
	*
	* @return the company ID of this instance
	*/
	@Override
	public long getCompanyId() {
		return _instance.getCompanyId();
	}

	/**
	* Sets the company ID of this instance.
	*
	* @param companyId the company ID of this instance
	*/
	@Override
	public void setCompanyId(long companyId) {
		_instance.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this instance.
	*
	* @return the user ID of this instance
	*/
	@Override
	public long getUserId() {
		return _instance.getUserId();
	}

	/**
	* Sets the user ID of this instance.
	*
	* @param userId the user ID of this instance
	*/
	@Override
	public void setUserId(long userId) {
		_instance.setUserId(userId);
	}

	/**
	* Returns the user uuid of this instance.
	*
	* @return the user uuid of this instance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _instance.getUserUuid();
	}

	/**
	* Sets the user uuid of this instance.
	*
	* @param userUuid the user uuid of this instance
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_instance.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this instance.
	*
	* @return the user name of this instance
	*/
	@Override
	public java.lang.String getUserName() {
		return _instance.getUserName();
	}

	/**
	* Sets the user name of this instance.
	*
	* @param userName the user name of this instance
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_instance.setUserName(userName);
	}

	/**
	* Returns the create date of this instance.
	*
	* @return the create date of this instance
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _instance.getCreateDate();
	}

	/**
	* Sets the create date of this instance.
	*
	* @param createDate the create date of this instance
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_instance.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this instance.
	*
	* @return the modified date of this instance
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _instance.getModifiedDate();
	}

	/**
	* Sets the modified date of this instance.
	*
	* @param modifiedDate the modified date of this instance
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_instance.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this instance.
	*
	* @return the name of this instance
	*/
	@Override
	public java.lang.String getName() {
		return _instance.getName();
	}

	/**
	* Sets the name of this instance.
	*
	* @param name the name of this instance
	*/
	@Override
	public void setName(java.lang.String name) {
		_instance.setName(name);
	}

	/**
	* Returns the step of this instance.
	*
	* @return the step of this instance
	*/
	@Override
	public int getStep() {
		return _instance.getStep();
	}

	/**
	* Sets the step of this instance.
	*
	* @param step the step of this instance
	*/
	@Override
	public void setStep(int step) {
		_instance.setStep(step);
	}

	@Override
	public boolean isNew() {
		return _instance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_instance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _instance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_instance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _instance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _instance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_instance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _instance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_instance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_instance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_instance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InstanceWrapper((Instance)_instance.clone());
	}

	@Override
	public int compareTo(org.lrc.liferay.toolbuilder.model.Instance instance) {
		return _instance.compareTo(instance);
	}

	@Override
	public int hashCode() {
		return _instance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.Instance> toCacheModel() {
		return _instance.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.Instance toEscapedModel() {
		return new InstanceWrapper(_instance.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.Instance toUnescapedModel() {
		return new InstanceWrapper(_instance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _instance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _instance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_instance.persist();
	}

	@Override
	public int stepForward() {
		return _instance.stepForward();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstanceWrapper)) {
			return false;
		}

		InstanceWrapper instanceWrapper = (InstanceWrapper)obj;

		if (Validator.equals(_instance, instanceWrapper._instance)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Instance getWrappedInstance() {
		return _instance;
	}

	@Override
	public Instance getWrappedModel() {
		return _instance;
	}

	@Override
	public void resetOriginalValues() {
		_instance.resetOriginalValues();
	}

	private Instance _instance;
}