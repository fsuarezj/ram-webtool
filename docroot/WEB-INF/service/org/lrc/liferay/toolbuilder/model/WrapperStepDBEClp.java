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
import org.lrc.liferay.toolbuilder.service.WrapperStepDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class WrapperStepDBEClp extends BaseModelImpl<WrapperStepDBE>
	implements WrapperStepDBE {
	public WrapperStepDBEClp() {
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
	public long getPrimaryKey() {
		return _wrapperStepDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWrapperStepDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wrapperStepDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getWrapperStepDBEId() {
		return _wrapperStepDBEId;
	}

	@Override
	public void setWrapperStepDBEId(long wrapperStepDBEId) {
		_wrapperStepDBEId = wrapperStepDBEId;

		if (_wrapperStepDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setWrapperStepDBEId",
						long.class);

				method.invoke(_wrapperStepDBERemoteModel, wrapperStepDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCurrentStep() {
		return _currentStep;
	}

	@Override
	public void setCurrentStep(int currentStep) {
		_currentStep = currentStep;

		if (_wrapperStepDBERemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentStep", int.class);

				method.invoke(_wrapperStepDBERemoteModel, currentStep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getWrapperStepDBERemoteModel() {
		return _wrapperStepDBERemoteModel;
	}

	public void setWrapperStepDBERemoteModel(
		BaseModel<?> wrapperStepDBERemoteModel) {
		_wrapperStepDBERemoteModel = wrapperStepDBERemoteModel;
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

		Class<?> remoteModelClass = _wrapperStepDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_wrapperStepDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WrapperStepDBELocalServiceUtil.addWrapperStepDBE(this);
		}
		else {
			WrapperStepDBELocalServiceUtil.updateWrapperStepDBE(this);
		}
	}

	@Override
	public WrapperStepDBE toEscapedModel() {
		return (WrapperStepDBE)ProxyUtil.newProxyInstance(WrapperStepDBE.class.getClassLoader(),
			new Class[] { WrapperStepDBE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WrapperStepDBEClp clone = new WrapperStepDBEClp();

		clone.setWrapperStepDBEId(getWrapperStepDBEId());
		clone.setCurrentStep(getCurrentStep());

		return clone;
	}

	@Override
	public int compareTo(WrapperStepDBE wrapperStepDBE) {
		long primaryKey = wrapperStepDBE.getPrimaryKey();

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

		if (!(obj instanceof WrapperStepDBEClp)) {
			return false;
		}

		WrapperStepDBEClp wrapperStepDBE = (WrapperStepDBEClp)obj;

		long primaryKey = wrapperStepDBE.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{wrapperStepDBEId=");
		sb.append(getWrapperStepDBEId());
		sb.append(", currentStep=");
		sb.append(getCurrentStep());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.WrapperStepDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wrapperStepDBEId</column-name><column-value><![CDATA[");
		sb.append(getWrapperStepDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentStep</column-name><column-value><![CDATA[");
		sb.append(getCurrentStep());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wrapperStepDBEId;
	private int _currentStep;
	private BaseModel<?> _wrapperStepDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}