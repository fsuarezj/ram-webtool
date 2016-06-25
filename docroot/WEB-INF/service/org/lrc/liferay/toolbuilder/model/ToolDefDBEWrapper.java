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
 * This class is a wrapper for {@link ToolDefDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolDefDBE
 * @generated
 */
public class ToolDefDBEWrapper implements ToolDefDBE, ModelWrapper<ToolDefDBE> {
	public ToolDefDBEWrapper(ToolDefDBE toolDefDBE) {
		_toolDefDBE = toolDefDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return ToolDefDBE.class;
	}

	@Override
	public String getModelClassName() {
		return ToolDefDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("toolDefDBEId", getToolDefDBEId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("toolName", getToolName());
		attributes.put("compositeStepDefDBEId", getCompositeStepDefDBEId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long toolDefDBEId = (Long)attributes.get("toolDefDBEId");

		if (toolDefDBEId != null) {
			setToolDefDBEId(toolDefDBEId);
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

		String toolName = (String)attributes.get("toolName");

		if (toolName != null) {
			setToolName(toolName);
		}

		Long compositeStepDefDBEId = (Long)attributes.get(
				"compositeStepDefDBEId");

		if (compositeStepDefDBEId != null) {
			setCompositeStepDefDBEId(compositeStepDefDBEId);
		}
	}

	/**
	* Returns the primary key of this tool def d b e.
	*
	* @return the primary key of this tool def d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _toolDefDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tool def d b e.
	*
	* @param primaryKey the primary key of this tool def d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_toolDefDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tool def d b e ID of this tool def d b e.
	*
	* @return the tool def d b e ID of this tool def d b e
	*/
	@Override
	public long getToolDefDBEId() {
		return _toolDefDBE.getToolDefDBEId();
	}

	/**
	* Sets the tool def d b e ID of this tool def d b e.
	*
	* @param toolDefDBEId the tool def d b e ID of this tool def d b e
	*/
	@Override
	public void setToolDefDBEId(long toolDefDBEId) {
		_toolDefDBE.setToolDefDBEId(toolDefDBEId);
	}

	/**
	* Returns the group ID of this tool def d b e.
	*
	* @return the group ID of this tool def d b e
	*/
	@Override
	public long getGroupId() {
		return _toolDefDBE.getGroupId();
	}

	/**
	* Sets the group ID of this tool def d b e.
	*
	* @param groupId the group ID of this tool def d b e
	*/
	@Override
	public void setGroupId(long groupId) {
		_toolDefDBE.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tool def d b e.
	*
	* @return the company ID of this tool def d b e
	*/
	@Override
	public long getCompanyId() {
		return _toolDefDBE.getCompanyId();
	}

	/**
	* Sets the company ID of this tool def d b e.
	*
	* @param companyId the company ID of this tool def d b e
	*/
	@Override
	public void setCompanyId(long companyId) {
		_toolDefDBE.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tool def d b e.
	*
	* @return the user ID of this tool def d b e
	*/
	@Override
	public long getUserId() {
		return _toolDefDBE.getUserId();
	}

	/**
	* Sets the user ID of this tool def d b e.
	*
	* @param userId the user ID of this tool def d b e
	*/
	@Override
	public void setUserId(long userId) {
		_toolDefDBE.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tool def d b e.
	*
	* @return the user uuid of this tool def d b e
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolDefDBE.getUserUuid();
	}

	/**
	* Sets the user uuid of this tool def d b e.
	*
	* @param userUuid the user uuid of this tool def d b e
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_toolDefDBE.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tool def d b e.
	*
	* @return the user name of this tool def d b e
	*/
	@Override
	public java.lang.String getUserName() {
		return _toolDefDBE.getUserName();
	}

	/**
	* Sets the user name of this tool def d b e.
	*
	* @param userName the user name of this tool def d b e
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_toolDefDBE.setUserName(userName);
	}

	/**
	* Returns the create date of this tool def d b e.
	*
	* @return the create date of this tool def d b e
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _toolDefDBE.getCreateDate();
	}

	/**
	* Sets the create date of this tool def d b e.
	*
	* @param createDate the create date of this tool def d b e
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_toolDefDBE.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tool def d b e.
	*
	* @return the modified date of this tool def d b e
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _toolDefDBE.getModifiedDate();
	}

	/**
	* Sets the modified date of this tool def d b e.
	*
	* @param modifiedDate the modified date of this tool def d b e
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_toolDefDBE.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tool name of this tool def d b e.
	*
	* @return the tool name of this tool def d b e
	*/
	@Override
	public java.lang.String getToolName() {
		return _toolDefDBE.getToolName();
	}

	/**
	* Sets the tool name of this tool def d b e.
	*
	* @param toolName the tool name of this tool def d b e
	*/
	@Override
	public void setToolName(java.lang.String toolName) {
		_toolDefDBE.setToolName(toolName);
	}

	/**
	* Returns the composite step def d b e ID of this tool def d b e.
	*
	* @return the composite step def d b e ID of this tool def d b e
	*/
	@Override
	public long getCompositeStepDefDBEId() {
		return _toolDefDBE.getCompositeStepDefDBEId();
	}

	/**
	* Sets the composite step def d b e ID of this tool def d b e.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID of this tool def d b e
	*/
	@Override
	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_toolDefDBE.setCompositeStepDefDBEId(compositeStepDefDBEId);
	}

	@Override
	public boolean isNew() {
		return _toolDefDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_toolDefDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _toolDefDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_toolDefDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _toolDefDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _toolDefDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_toolDefDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _toolDefDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_toolDefDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_toolDefDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_toolDefDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ToolDefDBEWrapper((ToolDefDBE)_toolDefDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.ToolDefDBE toolDefDBE) {
		return _toolDefDBE.compareTo(toolDefDBE);
	}

	@Override
	public int hashCode() {
		return _toolDefDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.ToolDefDBE> toCacheModel() {
		return _toolDefDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolDefDBE toEscapedModel() {
		return new ToolDefDBEWrapper(_toolDefDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolDefDBE toUnescapedModel() {
		return new ToolDefDBEWrapper(_toolDefDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _toolDefDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _toolDefDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_toolDefDBE.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ToolDefDBEWrapper)) {
			return false;
		}

		ToolDefDBEWrapper toolDefDBEWrapper = (ToolDefDBEWrapper)obj;

		if (Validator.equals(_toolDefDBE, toolDefDBEWrapper._toolDefDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ToolDefDBE getWrappedToolDefDBE() {
		return _toolDefDBE;
	}

	@Override
	public ToolDefDBE getWrappedModel() {
		return _toolDefDBE;
	}

	@Override
	public void resetOriginalValues() {
		_toolDefDBE.resetOriginalValues();
	}

	private ToolDefDBE _toolDefDBE;
}