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
 * This class is a wrapper for {@link WrapperStepDefDBE}.
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepDefDBE
 * @generated
 */
public class WrapperStepDefDBEWrapper implements WrapperStepDefDBE,
	ModelWrapper<WrapperStepDefDBE> {
	public WrapperStepDefDBEWrapper(WrapperStepDefDBE wrapperStepDefDBE) {
		_wrapperStepDefDBE = wrapperStepDefDBE;
	}

	@Override
	public Class<?> getModelClass() {
		return WrapperStepDefDBE.class;
	}

	@Override
	public String getModelClassName() {
		return WrapperStepDefDBE.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wrapperStepDefDBEId", getWrapperStepDefDBEId());
		attributes.put("stepsNumber", getStepsNumber());
		attributes.put("sequential", getSequential());
		attributes.put("depth", getDepth());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wrapperStepDefDBEId = (Long)attributes.get("wrapperStepDefDBEId");

		if (wrapperStepDefDBEId != null) {
			setWrapperStepDefDBEId(wrapperStepDefDBEId);
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
	* Returns the primary key of this wrapper step def d b e.
	*
	* @return the primary key of this wrapper step def d b e
	*/
	@Override
	public long getPrimaryKey() {
		return _wrapperStepDefDBE.getPrimaryKey();
	}

	/**
	* Sets the primary key of this wrapper step def d b e.
	*
	* @param primaryKey the primary key of this wrapper step def d b e
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_wrapperStepDefDBE.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the wrapper step def d b e ID of this wrapper step def d b e.
	*
	* @return the wrapper step def d b e ID of this wrapper step def d b e
	*/
	@Override
	public long getWrapperStepDefDBEId() {
		return _wrapperStepDefDBE.getWrapperStepDefDBEId();
	}

	/**
	* Sets the wrapper step def d b e ID of this wrapper step def d b e.
	*
	* @param wrapperStepDefDBEId the wrapper step def d b e ID of this wrapper step def d b e
	*/
	@Override
	public void setWrapperStepDefDBEId(long wrapperStepDefDBEId) {
		_wrapperStepDefDBE.setWrapperStepDefDBEId(wrapperStepDefDBEId);
	}

	/**
	* Returns the steps number of this wrapper step def d b e.
	*
	* @return the steps number of this wrapper step def d b e
	*/
	@Override
	public int getStepsNumber() {
		return _wrapperStepDefDBE.getStepsNumber();
	}

	/**
	* Sets the steps number of this wrapper step def d b e.
	*
	* @param stepsNumber the steps number of this wrapper step def d b e
	*/
	@Override
	public void setStepsNumber(int stepsNumber) {
		_wrapperStepDefDBE.setStepsNumber(stepsNumber);
	}

	/**
	* Returns the sequential of this wrapper step def d b e.
	*
	* @return the sequential of this wrapper step def d b e
	*/
	@Override
	public boolean getSequential() {
		return _wrapperStepDefDBE.getSequential();
	}

	/**
	* Returns <code>true</code> if this wrapper step def d b e is sequential.
	*
	* @return <code>true</code> if this wrapper step def d b e is sequential; <code>false</code> otherwise
	*/
	@Override
	public boolean isSequential() {
		return _wrapperStepDefDBE.isSequential();
	}

	/**
	* Sets whether this wrapper step def d b e is sequential.
	*
	* @param sequential the sequential of this wrapper step def d b e
	*/
	@Override
	public void setSequential(boolean sequential) {
		_wrapperStepDefDBE.setSequential(sequential);
	}

	/**
	* Returns the depth of this wrapper step def d b e.
	*
	* @return the depth of this wrapper step def d b e
	*/
	@Override
	public int getDepth() {
		return _wrapperStepDefDBE.getDepth();
	}

	/**
	* Sets the depth of this wrapper step def d b e.
	*
	* @param depth the depth of this wrapper step def d b e
	*/
	@Override
	public void setDepth(int depth) {
		_wrapperStepDefDBE.setDepth(depth);
	}

	@Override
	public boolean isNew() {
		return _wrapperStepDefDBE.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_wrapperStepDefDBE.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _wrapperStepDefDBE.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_wrapperStepDefDBE.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _wrapperStepDefDBE.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _wrapperStepDefDBE.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_wrapperStepDefDBE.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _wrapperStepDefDBE.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_wrapperStepDefDBE.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_wrapperStepDefDBE.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_wrapperStepDefDBE.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new WrapperStepDefDBEWrapper((WrapperStepDefDBE)_wrapperStepDefDBE.clone());
	}

	@Override
	public int compareTo(
		org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE wrapperStepDefDBE) {
		return _wrapperStepDefDBE.compareTo(wrapperStepDefDBE);
	}

	@Override
	public int hashCode() {
		return _wrapperStepDefDBE.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE> toCacheModel() {
		return _wrapperStepDefDBE.toCacheModel();
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE toEscapedModel() {
		return new WrapperStepDefDBEWrapper(_wrapperStepDefDBE.toEscapedModel());
	}

	@Override
	public org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE toUnescapedModel() {
		return new WrapperStepDefDBEWrapper(_wrapperStepDefDBE.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _wrapperStepDefDBE.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _wrapperStepDefDBE.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_wrapperStepDefDBE.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WrapperStepDefDBEWrapper)) {
			return false;
		}

		WrapperStepDefDBEWrapper wrapperStepDefDBEWrapper = (WrapperStepDefDBEWrapper)obj;

		if (Validator.equals(_wrapperStepDefDBE,
					wrapperStepDefDBEWrapper._wrapperStepDefDBE)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public WrapperStepDefDBE getWrappedWrapperStepDefDBE() {
		return _wrapperStepDefDBE;
	}

	@Override
	public WrapperStepDefDBE getWrappedModel() {
		return _wrapperStepDefDBE;
	}

	@Override
	public void resetOriginalValues() {
		_wrapperStepDefDBE.resetOriginalValues();
	}

	private WrapperStepDefDBE _wrapperStepDefDBE;
}