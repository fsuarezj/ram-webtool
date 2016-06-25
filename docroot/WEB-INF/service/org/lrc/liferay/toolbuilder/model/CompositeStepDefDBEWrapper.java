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
 * This class is a wrapper for {@link CompositeStepDefDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBE
 * @generated
 */
public class CompositeStepDefDBEWrapper implements CompositeStepDefDBE,
	ModelWrapper<CompositeStepDefDBE> {
	public CompositeStepDefDBEWrapper(CompositeStepDefDBE compositeStepDefDBE) {
		_compositeStepDefDBE = compositeStepDefDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return CompositeStepDefDBE.class;
	}

	@Override
	public String getModelClassName() {
		return CompositeStepDefDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("compositeStepDefDBEId", getCompositeStepDefDBEId());
		attributes.put("stepsNumber", getStepsNumber());
		attributes.put("sequential", getSequential());
		attributes.put("depth", getDepth());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long compositeStepDefDBEId = (Long)attributes.get(
				"compositeStepDefDBEId");

		if (compositeStepDefDBEId != null) {
			setCompositeStepDefDBEId(compositeStepDefDBEId);
		}

		Integer stepsNumber = (Integer)attributes.get("stepsNumber");

		if (stepsNumber != null) {
			setStepsNumber(stepsNumber);
		}

		Boolean sequential = (Boolean)attributes.get("sequential");

		if (sequential != null) {
			setSequential(sequential);
		}

		Integer depth = (Integer)attributes.get("depth");

		if (depth != null) {
			setDepth(depth);
		}
	}

	/**
	* Returns the primary key of this composite step def d b e.
	*
	* @return the primary key of this composite step def d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _compositeStepDefDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this composite step def d b e.
	*
	* @param primaryKey the primary key of this composite step def d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compositeStepDefDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the composite step def d b e ID of this composite step def d b e.
	*
	* @return the composite step def d b e ID of this composite step def d b e
	*/
	@Override
	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBE.getCompositeStepDefDBEId();
	}

	/**
	* Sets the composite step def d b e ID of this composite step def d b e.
	*
	* @param compositeStepDefDBEId the composite step def d b e ID of this composite step def d b e
	*/
	@Override
	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBE.setCompositeStepDefDBEId(compositeStepDefDBEId);
	}

	/**
	* Returns the steps number of this composite step def d b e.
	*
	* @return the steps number of this composite step def d b e
	*/
	@Override
	public int getStepsNumber() {
		return _compositeStepDefDBE.getStepsNumber();
	}

	/**
	* Sets the steps number of this composite step def d b e.
	*
	* @param stepsNumber the steps number of this composite step def d b e
	*/
	@Override
	public void setStepsNumber(int stepsNumber) {
		_compositeStepDefDBE.setStepsNumber(stepsNumber);
	}

	/**
	* Returns the sequential of this composite step def d b e.
	*
	* @return the sequential of this composite step def d b e
	*/
	@Override
	public boolean getSequential() {
		return _compositeStepDefDBE.getSequential();
	}

	/**
	* Returns <code>true</code> if this composite step def d b e is sequential.
	*
	* @return <code>true</code> if this composite step def d b e is sequential; <code>false</code> otherwise
	*/
	@Override
	public boolean isSequential() {
		return _compositeStepDefDBE.isSequential();
	}

	/**
	* Sets whether this composite step def d b e is sequential.
	*
	* @param sequential the sequential of this composite step def d b e
	*/
	@Override
	public void setSequential(boolean sequential) {
		_compositeStepDefDBE.setSequential(sequential);
	}

	/**
	* Returns the depth of this composite step def d b e.
	*
	* @return the depth of this composite step def d b e
	*/
	@Override
	public int getDepth() {
		return _compositeStepDefDBE.getDepth();
	}

	/**
	* Sets the depth of this composite step def d b e.
	*
	* @param depth the depth of this composite step def d b e
	*/
	@Override
	public void setDepth(int depth) {
		_compositeStepDefDBE.setDepth(depth);
	}

	@Override
	public boolean isNew() {
		return _compositeStepDefDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_compositeStepDefDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _compositeStepDefDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compositeStepDefDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _compositeStepDefDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _compositeStepDefDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_compositeStepDefDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _compositeStepDefDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_compositeStepDefDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_compositeStepDefDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_compositeStepDefDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CompositeStepDefDBEWrapper((CompositeStepDefDBE)_compositeStepDefDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE compositeStepDefDBE) {
		return _compositeStepDefDBE.compareTo(compositeStepDefDBE);
	}

	@Override
	public int hashCode() {
		return _compositeStepDefDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE> toCacheModel() {
		return _compositeStepDefDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE toEscapedModel() {
		return new CompositeStepDefDBEWrapper(_compositeStepDefDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE toUnescapedModel() {
		return new CompositeStepDefDBEWrapper(_compositeStepDefDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _compositeStepDefDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _compositeStepDefDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_compositeStepDefDBE.persist();
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs() {
		return _compositeStepDefDBE.getStepDefDBEs();
	}

	@Override
	public void addStepDefDBEToList(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE) {
		_compositeStepDefDBE.addStepDefDBEToList(stepDefDBE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CompositeStepDefDBEWrapper)) {
			return false;
		}

		CompositeStepDefDBEWrapper compositeStepDefDBEWrapper = (CompositeStepDefDBEWrapper)obj;

		if (Validator.equals(_compositeStepDefDBE,
					compositeStepDefDBEWrapper._compositeStepDefDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CompositeStepDefDBE getWrappedCompositeStepDefDBE() {
		return _compositeStepDefDBE;
	}

	@Override
	public CompositeStepDefDBE getWrappedModel() {
		return _compositeStepDefDBE;
	}

	@Override
	public void resetOriginalValues() {
		_compositeStepDefDBE.resetOriginalValues();
	}

	private CompositeStepDefDBE _compositeStepDefDBE;
}