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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.lrc.liferay.toolbuilder.service.ClpSerializer;
import org.lrc.liferay.toolbuilder.service.WrapperStepDefDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class WrapperStepDefDBEClp extends BaseModelImpl<WrapperStepDefDBE>
	implements WrapperStepDefDBE {
	public WrapperStepDefDBEClp() {
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
	public long getPrimaryKey() {
		return _wrapperStepDefDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWrapperStepDefDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wrapperStepDefDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getWrapperStepDefDBEId() {
		return _wrapperStepDefDBEId;
	}

	@Override
	public void setWrapperStepDefDBEId(long wrapperStepDefDBEId) {
		_wrapperStepDefDBEId = wrapperStepDefDBEId;

		if (_wrapperStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setWrapperStepDefDBEId",
						long.class);

				method.invoke(_wrapperStepDefDBERemoteModel, wrapperStepDefDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStepsNumber() {
		return _stepsNumber;
	}

	@Override
	public void setStepsNumber(int stepsNumber) {
		_stepsNumber = stepsNumber;

		if (_wrapperStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepsNumber", int.class);

				method.invoke(_wrapperStepDefDBERemoteModel, stepsNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getSequential() {
		return _sequential;
	}

	@Override
	public boolean isSequential() {
		return _sequential;
	}

	@Override
	public void setSequential(boolean sequential) {
		_sequential = sequential;

		if (_wrapperStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setSequential", boolean.class);

				method.invoke(_wrapperStepDefDBERemoteModel, sequential);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDepth() {
		return _depth;
	}

	@Override
	public void setDepth(int depth) {
		_depth = depth;

		if (_wrapperStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setDepth", int.class);

				method.invoke(_wrapperStepDefDBERemoteModel, depth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWrapperStepDefDBERemoteModel() {
		return _wrapperStepDefDBERemoteModel;
	}

	public void setWrapperStepDefDBERemoteModel(
		BaseModel<?> wrapperStepDefDBERemoteModel) {
		_wrapperStepDefDBERemoteModel = wrapperStepDefDBERemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _wrapperStepDefDBERemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_wrapperStepDefDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WrapperStepDefDBELocalServiceUtil.addWrapperStepDefDBE(this);
		}
		else {
			WrapperStepDefDBELocalServiceUtil.updateWrapperStepDefDBE(this);
		}
	}

	@Override
	public WrapperStepDefDBE toEscapedModel() {
		return (WrapperStepDefDBE)ProxyUtil.newProxyInstance(WrapperStepDefDBE.class.getClassLoader(),
			new Class[] { WrapperStepDefDBE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WrapperStepDefDBEClp clone = new WrapperStepDefDBEClp();

		clone.setWrapperStepDefDBEId(getWrapperStepDefDBEId());
		clone.setStepsNumber(getStepsNumber());
		clone.setSequential(getSequential());
		clone.setDepth(getDepth());

		return clone;
	}

	@Override
	public int compareTo(WrapperStepDefDBE wrapperStepDefDBE) {
		long primaryKey = wrapperStepDefDBE.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof WrapperStepDefDBEClp)) {
			return false;
		}

		WrapperStepDefDBEClp wrapperStepDefDBE = (WrapperStepDefDBEClp)obj;

		long primaryKey = wrapperStepDefDBE.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{wrapperStepDefDBEId=");
		sb.append(getWrapperStepDefDBEId());
		sb.append(", stepsNumber=");
		sb.append(getStepsNumber());
		sb.append(", sequential=");
		sb.append(getSequential());
		sb.append(", depth=");
		sb.append(getDepth());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.WrapperStepDefDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wrapperStepDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getWrapperStepDefDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepsNumber</column-name><column-value><![CDATA[");
		sb.append(getStepsNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequential</column-name><column-value><![CDATA[");
		sb.append(getSequential());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>depth</column-name><column-value><![CDATA[");
		sb.append(getDepth());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wrapperStepDefDBEId;
	private int _stepsNumber;
	private boolean _sequential;
	private int _depth;
	private BaseModel<?> _wrapperStepDefDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}