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
 * This class is a wrapper for {@link WrapperStep}.
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStep
 * @generated
 */
public class WrapperStepWrapper implements WrapperStep,
	ModelWrapper<WrapperStep> {
	public WrapperStepWrapper(WrapperStep wrapperStep) {
		_wrapperStep = wrapperStep;
	}

	@Override
	public Class<?> getModelClass() {
		return WrapperStep.class;
	}

	@Override
	public String getModelClassName() {
		return WrapperStep.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wrapperStepId", getWrapperStepId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStep", getCurrentStep());
		attributes.put("sequential", getSequential());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wrapperStepId = (Long)attributes.get("wrapperStepId");

		if (wrapperStepId != null) {
			setWrapperStepId(wrapperStepId);
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

		Integer currentStep = (Integer)attributes.get("currentStep");

		if (currentStep != null) {
			setCurrentStep(currentStep);
		}

		Boolean sequential = (Boolean)attributes.get("sequential");

		if (sequential != null) {
			setSequential(sequential);
		}
	}

	/**
	* Returns the primary key of this wrapper step.
	*
	* @return the primary key of this wrapper step
	*/
	@Override
	public long getPrimaryKey() {
		return _wrapperStep.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wrapper step.
	*
	* @param primaryKey the primary key of this wrapper step
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wrapperStep.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wrapper step ID of this wrapper step.
	*
	* @return the wrapper step ID of this wrapper step
	*/
	@Override
	public long getWrapperStepId() {
		return _wrapperStep.getWrapperStepId();
	}

	/**
	* Sets the wrapper step ID of this wrapper step.
	*
	* @param wrapperStepId the wrapper step ID of this wrapper step
	*/
	@Override
	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStep.setWrapperStepId(wrapperStepId);
	}

	/**
	* Returns the group ID of this wrapper step.
	*
	* @return the group ID of this wrapper step
	*/
	@Override
	public long getGroupId() {
		return _wrapperStep.getGroupId();
	}

	/**
	* Sets the group ID of this wrapper step.
	*
	* @param groupId the group ID of this wrapper step
	*/
	@Override
	public void setGroupId(long groupId) {
		_wrapperStep.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this wrapper step.
	*
	* @return the company ID of this wrapper step
	*/
	@Override
	public long getCompanyId() {
		return _wrapperStep.getCompanyId();
	}

	/**
	* Sets the company ID of this wrapper step.
	*
	* @param companyId the company ID of this wrapper step
	*/
	@Override
	public void setCompanyId(long companyId) {
		_wrapperStep.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this wrapper step.
	*
	* @return the user ID of this wrapper step
	*/
	@Override
	public long getUserId() {
		return _wrapperStep.getUserId();
	}

	/**
	* Sets the user ID of this wrapper step.
	*
	* @param userId the user ID of this wrapper step
	*/
	@Override
	public void setUserId(long userId) {
		_wrapperStep.setUserId(userId);
	}

	/**
	* Returns the user uuid of this wrapper step.
	*
	* @return the user uuid of this wrapper step
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _wrapperStep.getUserUuid();
	}

	/**
	* Sets the user uuid of this wrapper step.
	*
	* @param userUuid the user uuid of this wrapper step
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_wrapperStep.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this wrapper step.
	*
	* @return the user name of this wrapper step
	*/
	@Override
	public java.lang.String getUserName() {
		return _wrapperStep.getUserName();
	}

	/**
	* Sets the user name of this wrapper step.
	*
	* @param userName the user name of this wrapper step
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_wrapperStep.setUserName(userName);
	}

	/**
	* Returns the create date of this wrapper step.
	*
	* @return the create date of this wrapper step
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _wrapperStep.getCreateDate();
	}

	/**
	* Sets the create date of this wrapper step.
	*
	* @param createDate the create date of this wrapper step
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_wrapperStep.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this wrapper step.
	*
	* @return the modified date of this wrapper step
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _wrapperStep.getModifiedDate();
	}

	/**
	* Sets the modified date of this wrapper step.
	*
	* @param modifiedDate the modified date of this wrapper step
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_wrapperStep.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the current step of this wrapper step.
	*
	* @return the current step of this wrapper step
	*/
	@Override
	public int getCurrentStep() {
		return _wrapperStep.getCurrentStep();
	}

	/**
	* Sets the current step of this wrapper step.
	*
	* @param currentStep the current step of this wrapper step
	*/
	@Override
	public void setCurrentStep(int currentStep) {
		_wrapperStep.setCurrentStep(currentStep);
	}

	/**
	* Returns the sequential of this wrapper step.
	*
	* @return the sequential of this wrapper step
	*/
	@Override
	public boolean getSequential() {
		return _wrapperStep.getSequential();
	}

	/**
	* Returns <code>true</code> if this wrapper step is sequential.
	*
	* @return <code>true</code> if this wrapper step is sequential; <code>false</code> otherwise
	*/
	@Override
	public boolean isSequential() {
		return _wrapperStep.isSequential();
	}

	/**
	* Sets whether this wrapper step is sequential.
	*
	* @param sequential the sequential of this wrapper step
	*/
	@Override
	public void setSequential(boolean sequential) {
		_wrapperStep.setSequential(sequential);
	}

	@Override
	public boolean isNew() {
		return _wrapperStep.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_wrapperStep.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _wrapperStep.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wrapperStep.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _wrapperStep.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _wrapperStep.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wrapperStep.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wrapperStep.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_wrapperStep.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_wrapperStep.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wrapperStep.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WrapperStepWrapper((WrapperStep)_wrapperStep.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep) {
		return _wrapperStep.compareTo(wrapperStep);
	}

	@Override
	public int hashCode() {
		return _wrapperStep.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.WrapperStep> toCacheModel() {
		return _wrapperStep.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep toEscapedModel() {
		return new WrapperStepWrapper(_wrapperStep.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStep toUnescapedModel() {
		return new WrapperStepWrapper(_wrapperStep.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wrapperStep.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wrapperStep.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStep.persist();
	}

	@Override
	public void addStep(org.lrc.liferay.toolbuilder.steps.Step step) {
		_wrapperStep.addStep(step);
	}

	/**
	* @return the index of the next step. If it is the final step it returns the current step.
	*/
	@Override
	public java.lang.Integer stepForward() {
		return _wrapperStep.stepForward();
	}

	/**
	* @param newStep the index of the new step
	* @return the index of the new step. If sequential will throw exception if newStep is not the next one
	*/
	@Override
	public java.lang.Integer setCurrentStep(java.lang.Integer newStep) {
		return _wrapperStep.setCurrentStep(newStep);
	}

	@Override
	public java.lang.Integer getCurrentStepNumber() {
		return _wrapperStep.getCurrentStepNumber();
	}

	@Override
	public void save()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStep.save();
	}

	@Override
	public void delete()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_wrapperStep.delete();
	}

	@Override
	public java.lang.String draw() {
		return _wrapperStep.draw();
	}

	@Override
	public java.lang.String getStepName() {
		return _wrapperStep.getStepName();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WrapperStepWrapper)) {
			return false;
		}

		WrapperStepWrapper wrapperStepWrapper = (WrapperStepWrapper)obj;

		if (Validator.equals(_wrapperStep, wrapperStepWrapper._wrapperStep)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WrapperStep getWrappedWrapperStep() {
		return _wrapperStep;
	}

	@Override
	public WrapperStep getWrappedModel() {
		return _wrapperStep;
	}

	@Override
	public void resetOriginalValues() {
		_wrapperStep.resetOriginalValues();
	}

	private WrapperStep _wrapperStep;
}