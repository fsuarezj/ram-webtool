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
 * This class is a wrapper for {@link ToolInstance}.
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolInstance
 * @generated
 */
public class ToolInstanceWrapper implements ToolInstance,
	ModelWrapper<ToolInstance> {
	public ToolInstanceWrapper(ToolInstance toolInstance) {
		_toolInstance = toolInstance;
	}

	@Override
	public Class<?> getModelClass() {
		return ToolInstance.class;
	}

	@Override
	public String getModelClassName() {
		return ToolInstance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("toolInstanceId", getToolInstanceId());
		attributes.put("wrapperStepId", getWrapperStepId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
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

		Long toolInstanceId = (Long)attributes.get("toolInstanceId");

		if (toolInstanceId != null) {
			setToolInstanceId(toolInstanceId);
		}

		Long wrapperStepId = (Long)attributes.get("wrapperStepId");

		if (wrapperStepId != null) {
			setWrapperStepId(wrapperStepId);
		}
	}

	/**
	* Returns the primary key of this tool instance.
	*
	* @return the primary key of this tool instance
	*/
	@Override
	public long getPrimaryKey() {
		return _toolInstance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tool instance.
	*
	* @param primaryKey the primary key of this tool instance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_toolInstance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the group ID of this tool instance.
	*
	* @return the group ID of this tool instance
	*/
	@Override
	public long getGroupId() {
		return _toolInstance.getGroupId();
	}

	/**
	* Sets the group ID of this tool instance.
	*
	* @param groupId the group ID of this tool instance
	*/
	@Override
	public void setGroupId(long groupId) {
		_toolInstance.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tool instance.
	*
	* @return the company ID of this tool instance
	*/
	@Override
	public long getCompanyId() {
		return _toolInstance.getCompanyId();
	}

	/**
	* Sets the company ID of this tool instance.
	*
	* @param companyId the company ID of this tool instance
	*/
	@Override
	public void setCompanyId(long companyId) {
		_toolInstance.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tool instance.
	*
	* @return the user ID of this tool instance
	*/
	@Override
	public long getUserId() {
		return _toolInstance.getUserId();
	}

	/**
	* Sets the user ID of this tool instance.
	*
	* @param userId the user ID of this tool instance
	*/
	@Override
	public void setUserId(long userId) {
		_toolInstance.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tool instance.
	*
	* @return the user uuid of this tool instance
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstance.getUserUuid();
	}

	/**
	* Sets the user uuid of this tool instance.
	*
	* @param userUuid the user uuid of this tool instance
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_toolInstance.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tool instance.
	*
	* @return the user name of this tool instance
	*/
	@Override
	public java.lang.String getUserName() {
		return _toolInstance.getUserName();
	}

	/**
	* Sets the user name of this tool instance.
	*
	* @param userName the user name of this tool instance
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_toolInstance.setUserName(userName);
	}

	/**
	* Returns the create date of this tool instance.
	*
	* @return the create date of this tool instance
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _toolInstance.getCreateDate();
	}

	/**
	* Sets the create date of this tool instance.
	*
	* @param createDate the create date of this tool instance
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_toolInstance.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tool instance.
	*
	* @return the modified date of this tool instance
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _toolInstance.getModifiedDate();
	}

	/**
	* Sets the modified date of this tool instance.
	*
	* @param modifiedDate the modified date of this tool instance
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_toolInstance.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this tool instance.
	*
	* @return the name of this tool instance
	*/
	@Override
	public java.lang.String getName() {
		return _toolInstance.getName();
	}

	/**
	* Sets the name of this tool instance.
	*
	* @param name the name of this tool instance
	*/
	@Override
	public void setName(java.lang.String name) {
		_toolInstance.setName(name);
	}

	/**
	* Returns the tool instance ID of this tool instance.
	*
	* @return the tool instance ID of this tool instance
	*/
	@Override
	public long getToolInstanceId() {
		return _toolInstance.getToolInstanceId();
	}

	/**
	* Sets the tool instance ID of this tool instance.
	*
	* @param toolInstanceId the tool instance ID of this tool instance
	*/
	@Override
	public void setToolInstanceId(long toolInstanceId) {
		_toolInstance.setToolInstanceId(toolInstanceId);
	}

	/**
	* Returns the wrapper step ID of this tool instance.
	*
	* @return the wrapper step ID of this tool instance
	*/
	@Override
	public long getWrapperStepId() {
		return _toolInstance.getWrapperStepId();
	}

	/**
	* Sets the wrapper step ID of this tool instance.
	*
	* @param wrapperStepId the wrapper step ID of this tool instance
	*/
	@Override
	public void setWrapperStepId(long wrapperStepId) {
		_toolInstance.setWrapperStepId(wrapperStepId);
	}

	@Override
	public boolean isNew() {
		return _toolInstance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_toolInstance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _toolInstance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_toolInstance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _toolInstance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _toolInstance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_toolInstance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _toolInstance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_toolInstance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_toolInstance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_toolInstance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ToolInstanceWrapper((ToolInstance)_toolInstance.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.ToolInstance toolInstance) {
		return _toolInstance.compareTo(toolInstance);
	}

	@Override
	public int hashCode() {
		return _toolInstance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.ToolInstance> toCacheModel() {
		return _toolInstance.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance toEscapedModel() {
		return new ToolInstanceWrapper(_toolInstance.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstance toUnescapedModel() {
		return new ToolInstanceWrapper(_toolInstance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _toolInstance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _toolInstance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_toolInstance.persist();
	}

	@Override
	public void save()
		throws com.liferay.portal.kernel.exception.SystemException {
		_toolInstance.save();
	}

	@Override
	public void delete()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_toolInstance.delete();
	}

	@Override
	public java.lang.String getStepName() {
		return _toolInstance.getStepName();
	}

	@Override
	public java.lang.String draw() {
		return _toolInstance.draw();
	}

	@Override
	public java.lang.Integer stepForward() {
		return _toolInstance.stepForward();
	}

	@Override
	public int getCurrentStepNumber() {
		return _toolInstance.getCurrentStepNumber();
	}

	@Override
	public void setWrapperStep(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep) {
		_toolInstance.setWrapperStep(wrapperStep);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ToolInstanceWrapper)) {
			return false;
		}

		ToolInstanceWrapper toolInstanceWrapper = (ToolInstanceWrapper)obj;

		if (Validator.equals(_toolInstance, toolInstanceWrapper._toolInstance)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ToolInstance getWrappedToolInstance() {
		return _toolInstance;
	}

	@Override
	public ToolInstance getWrappedModel() {
		return _toolInstance;
	}

	@Override
	public void resetOriginalValues() {
		_toolInstance.resetOriginalValues();
	}

	private ToolInstance _toolInstance;
}