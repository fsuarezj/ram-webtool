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

package com.lrc.liferay.ram.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Assessment}.
 * </p>
 *
 * @author fsuarezj
 * @see Assessment
 * @generated
 */
public class AssessmentWrapper implements Assessment, ModelWrapper<Assessment> {
	public AssessmentWrapper(Assessment assessment) {
		_assessment = assessment;
	}

	@Override
	public Class<?> getModelClass() {
		return Assessment.class;
	}

	@Override
	public String getModelClassName() {
		return Assessment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessmentId", getAssessmentId());
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
		Long assessmentId = (Long)attributes.get("assessmentId");

		if (assessmentId != null) {
			setAssessmentId(assessmentId);
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
	* Returns the primary key of this assessment.
	*
	* @return the primary key of this assessment
	*/
	@Override
	public long getPrimaryKey() {
		return _assessment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assessment.
	*
	* @param primaryKey the primary key of this assessment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assessment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the assessment ID of this assessment.
	*
	* @return the assessment ID of this assessment
	*/
	@Override
	public long getAssessmentId() {
		return _assessment.getAssessmentId();
	}

	/**
	* Sets the assessment ID of this assessment.
	*
	* @param assessmentId the assessment ID of this assessment
	*/
	@Override
	public void setAssessmentId(long assessmentId) {
		_assessment.setAssessmentId(assessmentId);
	}

	/**
	* Returns the group ID of this assessment.
	*
	* @return the group ID of this assessment
	*/
	@Override
	public long getGroupId() {
		return _assessment.getGroupId();
	}

	/**
	* Sets the group ID of this assessment.
	*
	* @param groupId the group ID of this assessment
	*/
	@Override
	public void setGroupId(long groupId) {
		_assessment.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this assessment.
	*
	* @return the company ID of this assessment
	*/
	@Override
	public long getCompanyId() {
		return _assessment.getCompanyId();
	}

	/**
	* Sets the company ID of this assessment.
	*
	* @param companyId the company ID of this assessment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assessment.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this assessment.
	*
	* @return the user ID of this assessment
	*/
	@Override
	public long getUserId() {
		return _assessment.getUserId();
	}

	/**
	* Sets the user ID of this assessment.
	*
	* @param userId the user ID of this assessment
	*/
	@Override
	public void setUserId(long userId) {
		_assessment.setUserId(userId);
	}

	/**
	* Returns the user uuid of this assessment.
	*
	* @return the user uuid of this assessment
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessment.getUserUuid();
	}

	/**
	* Sets the user uuid of this assessment.
	*
	* @param userUuid the user uuid of this assessment
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assessment.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this assessment.
	*
	* @return the user name of this assessment
	*/
	@Override
	public java.lang.String getUserName() {
		return _assessment.getUserName();
	}

	/**
	* Sets the user name of this assessment.
	*
	* @param userName the user name of this assessment
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assessment.setUserName(userName);
	}

	/**
	* Returns the create date of this assessment.
	*
	* @return the create date of this assessment
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assessment.getCreateDate();
	}

	/**
	* Sets the create date of this assessment.
	*
	* @param createDate the create date of this assessment
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assessment.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this assessment.
	*
	* @return the modified date of this assessment
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _assessment.getModifiedDate();
	}

	/**
	* Sets the modified date of this assessment.
	*
	* @param modifiedDate the modified date of this assessment
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_assessment.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this assessment.
	*
	* @return the name of this assessment
	*/
	@Override
	public java.lang.String getName() {
		return _assessment.getName();
	}

	/**
	* Sets the name of this assessment.
	*
	* @param name the name of this assessment
	*/
	@Override
	public void setName(java.lang.String name) {
		_assessment.setName(name);
	}

	/**
	* Returns the step of this assessment.
	*
	* @return the step of this assessment
	*/
	@Override
	public int getStep() {
		return _assessment.getStep();
	}

	/**
	* Sets the step of this assessment.
	*
	* @param step the step of this assessment
	*/
	@Override
	public void setStep(int step) {
		_assessment.setStep(step);
	}

	@Override
	public boolean isNew() {
		return _assessment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assessment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assessment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assessment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assessment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assessment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assessment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assessment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assessment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assessment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assessment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessmentWrapper((Assessment)_assessment.clone());
	}

	@Override
	public int compareTo(com.lrc.liferay.ram.model.Assessment assessment) {
		return _assessment.compareTo(assessment);
	}

	@Override
	public int hashCode() {
		return _assessment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.lrc.liferay.ram.model.Assessment> toCacheModel() {
		return _assessment.toCacheModel();
	}

	@Override
	public com.lrc.liferay.ram.model.Assessment toEscapedModel() {
		return new AssessmentWrapper(_assessment.toEscapedModel());
	}

	@Override
	public com.lrc.liferay.ram.model.Assessment toUnescapedModel() {
		return new AssessmentWrapper(_assessment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assessment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assessment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assessment.persist();
	}

	@Override
	public int stepForward() {
		return _assessment.stepForward();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessmentWrapper)) {
			return false;
		}

		AssessmentWrapper assessmentWrapper = (AssessmentWrapper)obj;

		if (Validator.equals(_assessment, assessmentWrapper._assessment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Assessment getWrappedAssessment() {
		return _assessment;
	}

	@Override
	public Assessment getWrappedModel() {
		return _assessment;
	}

	@Override
	public void resetOriginalValues() {
		_assessment.resetOriginalValues();
	}

	private Assessment _assessment;
}