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
 * This class is a wrapper for {@link CompositeStepDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDBE
 * @generated
 */
public class CompositeStepDBEWrapper implements CompositeStepDBE,
	ModelWrapper<CompositeStepDBE> {
	public CompositeStepDBEWrapper(CompositeStepDBE compositeStepDBE) {
		_compositeStepDBE = compositeStepDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return CompositeStepDBE.class;
	}

	@Override
	public String getModelClassName() {
		return CompositeStepDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("compositeStepDBEId", getCompositeStepDBEId());
		attributes.put("currentStep", getCurrentStep());
		attributes.put("compositeStepDefDBEId", getCompositeStepDefDBEId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long compositeStepDBEId = (Long)attributes.get("compositeStepDBEId");

		if (compositeStepDBEId != null) {
			setCompositeStepDBEId(compositeStepDBEId);
		}

		Integer currentStep = (Integer)attributes.get("currentStep");

		if (currentStep != null) {
			setCurrentStep(currentStep);
		}

		Long compositeStepDefDBEId = (Long)attributes.get(
				"compositeStepDefDBEId");

		if (compositeStepDefDBEId != null) {
			setCompositeStepDefDBEId(compositeStepDefDBEId);
		}
	}

	/**
	* Returns the primary key of this composite step d b e.
	*
	* @return the primary key of this composite step d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _compositeStepDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this composite step d b e.
	*
	* @param primaryKey the primary key of this composite step d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compositeStepDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the composite step d b e ID of this composite step d b e.
	*
	* @return the composite step d b e ID of this composite step d b e
	*/
	@Override
	public long getCompositeStepDBEId() {
		return _compositeStepDBE.getCompositeStepDBEId();
	}

	/**
	* Sets the composite step d b e ID of this composite step d b e.
	*
	* @param compositeStepDBEId the composite step d b e ID of this composite step d b e
	*/
	@Override
	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_compositeStepDBE.setCompositeStepDBEId(compositeStepDBEId);
	}

	/**
	* Returns the current step of this composite step d b e.
	*
	* @return the current step of this composite step d b e
	*/
	@Override
	public int getCurrentStep() {
		return _compositeStepDBE.getCurrentStep();
	}

	/**
	* Sets the current step of this composite step d b e.
	*
	* @param currentStep the current step of this composite step d b e
	*/
	@Override
	public void setCurrentStep(int currentStep) {
		_compositeStepDBE.setCurrentStep(currentStep);
	}

	/**
	* Returns the composite step def d b e ID of this composite step d b e.
	*
	* @return the composite step def d b e ID of this composite step d b e
	*/
	@Override
	public long getCompositeStepDefDBEId() {
		return _compositeStepDBE.getCompositeStepDefDBEId();
	}

	/**
	* Sets the composite step def d b e ID of this composite step d b e.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID of this composite step d b e
	*/
	@Override
	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDBE.setCompositeStepDefDBEId(compositeStepDefDBEId);
	}

	@Override
	public boolean isNew() {
		return _compositeStepDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_compositeStepDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _compositeStepDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compositeStepDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _compositeStepDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _compositeStepDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_compositeStepDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _compositeStepDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_compositeStepDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_compositeStepDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_compositeStepDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CompositeStepDBEWrapper((CompositeStepDBE)_compositeStepDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.CompositeStepDBE compositeStepDBE) {
		return _compositeStepDBE.compareTo(compositeStepDBE);
	}

	@Override
	public int hashCode() {
		return _compositeStepDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.CompositeStepDBE> toCacheModel() {
		return _compositeStepDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE toEscapedModel() {
		return new CompositeStepDBEWrapper(_compositeStepDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDBE toUnescapedModel() {
		return new CompositeStepDBEWrapper(_compositeStepDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _compositeStepDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _compositeStepDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDBE.persist();
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs() {
		return _compositeStepDBE.getStepDBEs();
	}

	@Override
	public void addStepDBEToList(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE) {
		_compositeStepDBE.addStepDBEToList(stepDBE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompositeStepDBEWrapper)) {
			return false;
		}

		CompositeStepDBEWrapper compositeStepDBEWrapper = (CompositeStepDBEWrapper)obj;

		if (Validator.equals(_compositeStepDBE,
					compositeStepDBEWrapper._compositeStepDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CompositeStepDBE getWrappedCompositeStepDBE() {
		return _compositeStepDBE;
	}

	@Override
	public CompositeStepDBE getWrappedModel() {
		return _compositeStepDBE;
	}

	@Override
	public void resetOriginalValues() {
		_compositeStepDBE.resetOriginalValues();
	}

	private CompositeStepDBE _compositeStepDBE;
}