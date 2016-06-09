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
 * This class is a wrapper for {@link StepDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see StepDBE
 * @generated
 */
public class StepDBEWrapper implements StepDBE, ModelWrapper<StepDBE> {
	public StepDBEWrapper(StepDBE stepDBE) {
		_stepDBE = stepDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return StepDBE.class;
	}

	@Override
	public String getModelClassName() {
		return StepDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepDBEId", getStepDBEId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("StepDefDBEId", getStepDefDBEId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepDBEId = (Long)attributes.get("stepDBEId");

		if (stepDBEId != null) {
			setStepDBEId(stepDBEId);
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

		Long StepDefDBEId = (Long)attributes.get("StepDefDBEId");

		if (StepDefDBEId != null) {
			setStepDefDBEId(StepDefDBEId);
		}
	}

	/**
	* Returns the primary key of this step d b e.
	*
	* @return the primary key of this step d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _stepDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this step d b e.
	*
	* @param primaryKey the primary key of this step d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_stepDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the step d b e ID of this step d b e.
	*
	* @return the step d b e ID of this step d b e
	*/
	@Override
	public long getStepDBEId() {
		return _stepDBE.getStepDBEId();
	}

	/**
	* Sets the step d b e ID of this step d b e.
	*
	* @param stepDBEId the step d b e ID of this step d b e
	*/
	@Override
	public void setStepDBEId(long stepDBEId) {
		_stepDBE.setStepDBEId(stepDBEId);
	}

	/**
	* Returns the group ID of this step d b e.
	*
	* @return the group ID of this step d b e
	*/
	@Override
	public long getGroupId() {
		return _stepDBE.getGroupId();
	}

	/**
	* Sets the group ID of this step d b e.
	*
	* @param groupId the group ID of this step d b e
	*/
	@Override
	public void setGroupId(long groupId) {
		_stepDBE.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this step d b e.
	*
	* @return the company ID of this step d b e
	*/
	@Override
	public long getCompanyId() {
		return _stepDBE.getCompanyId();
	}

	/**
	* Sets the company ID of this step d b e.
	*
	* @param companyId the company ID of this step d b e
	*/
	@Override
	public void setCompanyId(long companyId) {
		_stepDBE.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this step d b e.
	*
	* @return the user ID of this step d b e
	*/
	@Override
	public long getUserId() {
		return _stepDBE.getUserId();
	}

	/**
	* Sets the user ID of this step d b e.
	*
	* @param userId the user ID of this step d b e
	*/
	@Override
	public void setUserId(long userId) {
		_stepDBE.setUserId(userId);
	}

	/**
	* Returns the user uuid of this step d b e.
	*
	* @return the user uuid of this step d b e
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stepDBE.getUserUuid();
	}

	/**
	* Sets the user uuid of this step d b e.
	*
	* @param userUuid the user uuid of this step d b e
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_stepDBE.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this step d b e.
	*
	* @return the user name of this step d b e
	*/
	@Override
	public java.lang.String getUserName() {
		return _stepDBE.getUserName();
	}

	/**
	* Sets the user name of this step d b e.
	*
	* @param userName the user name of this step d b e
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_stepDBE.setUserName(userName);
	}

	/**
	* Returns the create date of this step d b e.
	*
	* @return the create date of this step d b e
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _stepDBE.getCreateDate();
	}

	/**
	* Sets the create date of this step d b e.
	*
	* @param createDate the create date of this step d b e
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_stepDBE.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this step d b e.
	*
	* @return the modified date of this step d b e
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _stepDBE.getModifiedDate();
	}

	/**
	* Sets the modified date of this step d b e.
	*
	* @param modifiedDate the modified date of this step d b e
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_stepDBE.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the step def d b e ID of this step d b e.
	*
	* @return the step def d b e ID of this step d b e
	*/
	@Override
	public long getStepDefDBEId() {
		return _stepDBE.getStepDefDBEId();
	}

	/**
	* Sets the step def d b e ID of this step d b e.
	*
	* @param StepDefDBEId the step def d b e ID of this step d b e
	*/
	@Override
	public void setStepDefDBEId(long StepDefDBEId) {
		_stepDBE.setStepDefDBEId(StepDefDBEId);
	}

	@Override
	public boolean isNew() {
		return _stepDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_stepDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _stepDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_stepDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _stepDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _stepDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_stepDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _stepDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_stepDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_stepDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_stepDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StepDBEWrapper((StepDBE)_stepDBE.clone());
	}

	@Override
	public int compareTo(org.lrc.liferay.toolbuilder.model.StepDBE stepDBE) {
		return _stepDBE.compareTo(stepDBE);
	}

	@Override
	public int hashCode() {
		return _stepDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.StepDBE> toCacheModel() {
		return _stepDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE toEscapedModel() {
		return new StepDBEWrapper(_stepDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.StepDBE toUnescapedModel() {
		return new StepDBEWrapper(_stepDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _stepDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _stepDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_stepDBE.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StepDBEWrapper)) {
			return false;
		}

		StepDBEWrapper stepDBEWrapper = (StepDBEWrapper)obj;

		if (Validator.equals(_stepDBE, stepDBEWrapper._stepDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StepDBE getWrappedStepDBE() {
		return _stepDBE;
	}

	@Override
	public StepDBE getWrappedModel() {
		return _stepDBE;
	}

	@Override
	public void resetOriginalValues() {
		_stepDBE.resetOriginalValues();
	}

	private StepDBE _stepDBE;
}