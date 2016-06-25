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
 * This class is a wrapper for {@link ToolInstanceDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see ToolInstanceDBE
 * @generated
 */
public class ToolInstanceDBEWrapper implements ToolInstanceDBE,
	ModelWrapper<ToolInstanceDBE> {
	public ToolInstanceDBEWrapper(ToolInstanceDBE toolInstanceDBE) {
		_toolInstanceDBE = toolInstanceDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return ToolInstanceDBE.class;
	}

	@Override
	public String getModelClassName() {
		return ToolInstanceDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("toolInstanceDBEId", getToolInstanceDBEId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("toolDefDBEId", getToolDefDBEId());
		attributes.put("compositeStepDBEId", getCompositeStepDBEId());
		attributes.put("toolTitle", getToolTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long toolInstanceDBEId = (Long)attributes.get("toolInstanceDBEId");

		if (toolInstanceDBEId != null) {
			setToolInstanceDBEId(toolInstanceDBEId);
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

		Long toolDefDBEId = (Long)attributes.get("toolDefDBEId");

		if (toolDefDBEId != null) {
			setToolDefDBEId(toolDefDBEId);
		}

		Long compositeStepDBEId = (Long)attributes.get("compositeStepDBEId");

		if (compositeStepDBEId != null) {
			setCompositeStepDBEId(compositeStepDBEId);
		}

		String toolTitle = (String)attributes.get("toolTitle");

		if (toolTitle != null) {
			setToolTitle(toolTitle);
		}
	}

	/**
	* Returns the primary key of this tool instance d b e.
	*
	* @return the primary key of this tool instance d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _toolInstanceDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tool instance d b e.
	*
	* @param primaryKey the primary key of this tool instance d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_toolInstanceDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tool instance d b e ID of this tool instance d b e.
	*
	* @return the tool instance d b e ID of this tool instance d b e
	*/
	@Override
	public long getToolInstanceDBEId() {
		return _toolInstanceDBE.getToolInstanceDBEId();
	}

	/**
	* Sets the tool instance d b e ID of this tool instance d b e.
	*
	* @param toolInstanceDBEId the tool instance d b e ID of this tool instance d b e
	*/
	@Override
	public void setToolInstanceDBEId(long toolInstanceDBEId) {
		_toolInstanceDBE.setToolInstanceDBEId(toolInstanceDBEId);
	}

	/**
	* Returns the group ID of this tool instance d b e.
	*
	* @return the group ID of this tool instance d b e
	*/
	@Override
	public long getGroupId() {
		return _toolInstanceDBE.getGroupId();
	}

	/**
	* Sets the group ID of this tool instance d b e.
	*
	* @param groupId the group ID of this tool instance d b e
	*/
	@Override
	public void setGroupId(long groupId) {
		_toolInstanceDBE.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this tool instance d b e.
	*
	* @return the company ID of this tool instance d b e
	*/
	@Override
	public long getCompanyId() {
		return _toolInstanceDBE.getCompanyId();
	}

	/**
	* Sets the company ID of this tool instance d b e.
	*
	* @param companyId the company ID of this tool instance d b e
	*/
	@Override
	public void setCompanyId(long companyId) {
		_toolInstanceDBE.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tool instance d b e.
	*
	* @return the user ID of this tool instance d b e
	*/
	@Override
	public long getUserId() {
		return _toolInstanceDBE.getUserId();
	}

	/**
	* Sets the user ID of this tool instance d b e.
	*
	* @param userId the user ID of this tool instance d b e
	*/
	@Override
	public void setUserId(long userId) {
		_toolInstanceDBE.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tool instance d b e.
	*
	* @return the user uuid of this tool instance d b e
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _toolInstanceDBE.getUserUuid();
	}

	/**
	* Sets the user uuid of this tool instance d b e.
	*
	* @param userUuid the user uuid of this tool instance d b e
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_toolInstanceDBE.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tool instance d b e.
	*
	* @return the user name of this tool instance d b e
	*/
	@Override
	public java.lang.String getUserName() {
		return _toolInstanceDBE.getUserName();
	}

	/**
	* Sets the user name of this tool instance d b e.
	*
	* @param userName the user name of this tool instance d b e
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_toolInstanceDBE.setUserName(userName);
	}

	/**
	* Returns the create date of this tool instance d b e.
	*
	* @return the create date of this tool instance d b e
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _toolInstanceDBE.getCreateDate();
	}

	/**
	* Sets the create date of this tool instance d b e.
	*
	* @param createDate the create date of this tool instance d b e
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_toolInstanceDBE.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tool instance d b e.
	*
	* @return the modified date of this tool instance d b e
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _toolInstanceDBE.getModifiedDate();
	}

	/**
	* Sets the modified date of this tool instance d b e.
	*
	* @param modifiedDate the modified date of this tool instance d b e
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_toolInstanceDBE.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tool def d b e ID of this tool instance d b e.
	*
	* @return the tool def d b e ID of this tool instance d b e
	*/
	@Override
	public long getToolDefDBEId() {
		return _toolInstanceDBE.getToolDefDBEId();
	}

	/**
	* Sets the tool def d b e ID of this tool instance d b e.
	*
	* @param toolDefDBEId the tool def d b e ID of this tool instance d b e
	*/
	@Override
	public void setToolDefDBEId(long toolDefDBEId) {
		_toolInstanceDBE.setToolDefDBEId(toolDefDBEId);
	}

	/**
	* Returns the composite step d b e ID of this tool instance d b e.
	*
	* @return the composite step d b e ID of this tool instance d b e
	*/
	@Override
	public long getCompositeStepDBEId() {
		return _toolInstanceDBE.getCompositeStepDBEId();
	}

	/**
	* Sets the composite step d b e ID of this tool instance d b e.
	*
	* @param compositeStepDBEId the composite step d b e ID of this tool instance d b e
	*/
	@Override
	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_toolInstanceDBE.setCompositeStepDBEId(compositeStepDBEId);
	}

	/**
	* Returns the tool title of this tool instance d b e.
	*
	* @return the tool title of this tool instance d b e
	*/
	@Override
	public java.lang.String getToolTitle() {
		return _toolInstanceDBE.getToolTitle();
	}

	/**
	* Sets the tool title of this tool instance d b e.
	*
	* @param toolTitle the tool title of this tool instance d b e
	*/
	@Override
	public void setToolTitle(java.lang.String toolTitle) {
		_toolInstanceDBE.setToolTitle(toolTitle);
	}

	@Override
	public boolean isNew() {
		return _toolInstanceDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_toolInstanceDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _toolInstanceDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_toolInstanceDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _toolInstanceDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _toolInstanceDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_toolInstanceDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _toolInstanceDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_toolInstanceDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_toolInstanceDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_toolInstanceDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ToolInstanceDBEWrapper((ToolInstanceDBE)_toolInstanceDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toolInstanceDBE) {
		return _toolInstanceDBE.compareTo(toolInstanceDBE);
	}

	@Override
	public int hashCode() {
		return _toolInstanceDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.ToolInstanceDBE> toCacheModel() {
		return _toolInstanceDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toEscapedModel() {
		return new ToolInstanceDBEWrapper(_toolInstanceDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.ToolInstanceDBE toUnescapedModel() {
		return new ToolInstanceDBEWrapper(_toolInstanceDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _toolInstanceDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _toolInstanceDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_toolInstanceDBE.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ToolInstanceDBEWrapper)) {
			return false;
		}

		ToolInstanceDBEWrapper toolInstanceDBEWrapper = (ToolInstanceDBEWrapper)obj;

		if (Validator.equals(_toolInstanceDBE,
					toolInstanceDBEWrapper._toolInstanceDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ToolInstanceDBE getWrappedToolInstanceDBE() {
		return _toolInstanceDBE;
	}

	@Override
	public ToolInstanceDBE getWrappedModel() {
		return _toolInstanceDBE;
	}

	@Override
	public void resetOriginalValues() {
		_toolInstanceDBE.resetOriginalValues();
	}

	private ToolInstanceDBE _toolInstanceDBE;
}