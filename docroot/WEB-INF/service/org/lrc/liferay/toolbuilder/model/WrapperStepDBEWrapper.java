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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WrapperStepDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDBE
 * @generated
 */
public class WrapperStepDBEWrapper implements WrapperStepDBE,
	ModelWrapper<WrapperStepDBE> {
	public WrapperStepDBEWrapper(WrapperStepDBE wrapperStepDBE) {
		_wrapperStepDBE = wrapperStepDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return WrapperStepDBE.class;
	}

	@Override
	public String getModelClassName() {
		return WrapperStepDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wrapperStepDBEId", getWrapperStepDBEId());
		attributes.put("currentStep", getCurrentStep());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wrapperStepDBEId = (Long)attributes.get("wrapperStepDBEId");

		if (wrapperStepDBEId != null) {
			setWrapperStepDBEId(wrapperStepDBEId);
		}

		Integer currentStep = (Integer)attributes.get("currentStep");

		if (currentStep != null) {
			setCurrentStep(currentStep);
		}
	}

	/**
	* Returns the primary key of this wrapper step d b e.
	*
	* @return the primary key of this wrapper step d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _wrapperStepDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wrapper step d b e.
	*
	* @param primaryKey the primary key of this wrapper step d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wrapperStepDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wrapper step d b e ID of this wrapper step d b e.
	*
	* @return the wrapper step d b e ID of this wrapper step d b e
	*/
	@Override
	public long getWrapperStepDBEId() {
		return _wrapperStepDBE.getWrapperStepDBEId();
	}

	/**
	* Sets the wrapper step d b e ID of this wrapper step d b e.
	*
	* @param wrapperStepDBEId the wrapper step d b e ID of this wrapper step d b e
	*/
	@Override
	public void setWrapperStepDBEId(long wrapperStepDBEId) {
		_wrapperStepDBE.setWrapperStepDBEId(wrapperStepDBEId);
	}

	/**
	* Returns the current step of this wrapper step d b e.
	*
	* @return the current step of this wrapper step d b e
	*/
	@Override
	public int getCurrentStep() {
		return _wrapperStepDBE.getCurrentStep();
	}

	/**
	* Sets the current step of this wrapper step d b e.
	*
	* @param currentStep the current step of this wrapper step d b e
	*/
	@Override
	public void setCurrentStep(int currentStep) {
		_wrapperStepDBE.setCurrentStep(currentStep);
	}

	@Override
	public boolean isNew() {
		return _wrapperStepDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_wrapperStepDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _wrapperStepDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wrapperStepDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _wrapperStepDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _wrapperStepDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wrapperStepDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wrapperStepDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_wrapperStepDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_wrapperStepDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wrapperStepDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WrapperStepDBEWrapper((WrapperStepDBE)_wrapperStepDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.WrapperStepDBE wrapperStepDBE) {
		return _wrapperStepDBE.compareTo(wrapperStepDBE);
	}

	@Override
	public int hashCode() {
		return _wrapperStepDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.WrapperStepDBE> toCacheModel() {
		return _wrapperStepDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE toEscapedModel() {
		return new WrapperStepDBEWrapper(_wrapperStepDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDBE toUnescapedModel() {
		return new WrapperStepDBEWrapper(_wrapperStepDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wrapperStepDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wrapperStepDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDBE.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WrapperStepDBEWrapper)) {
			return false;
		}

		WrapperStepDBEWrapper wrapperStepDBEWrapper = (WrapperStepDBEWrapper)obj;

		if (Validator.equals(_wrapperStepDBE,
					wrapperStepDBEWrapper._wrapperStepDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WrapperStepDBE getWrappedWrapperStepDBE() {
		return _wrapperStepDBE;
	}

	@Override
	public WrapperStepDBE getWrappedModel() {
		return _wrapperStepDBE;
	}

	@Override
	public void resetOriginalValues() {
		_wrapperStepDBE.resetOriginalValues();
	}

	private WrapperStepDBE _wrapperStepDBE;
}