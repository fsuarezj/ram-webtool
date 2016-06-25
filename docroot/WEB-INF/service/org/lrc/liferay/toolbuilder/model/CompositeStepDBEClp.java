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
import org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class CompositeStepDBEClp extends BaseModelImpl<CompositeStepDBE>
	implements CompositeStepDBE {
	public CompositeStepDBEClp() {
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
	public long getPrimaryKey() {
		return _compositeStepDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompositeStepDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compositeStepDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCompositeStepDBEId() {
		return _compositeStepDBEId;
	}

	@Override
	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_compositeStepDBEId = compositeStepDBEId;

		if (_compositeStepDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompositeStepDBEId",
						long.class);

				method.invoke(_compositeStepDBERemoteModel, compositeStepDBEId);
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

		if (_compositeStepDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentStep", int.class);

				method.invoke(_compositeStepDBERemoteModel, currentStep);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBEId;
	}

	@Override
	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBEId = compositeStepDefDBEId;

		if (_compositeStepDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompositeStepDefDBEId",
						long.class);

				method.invoke(_compositeStepDBERemoteModel,
					compositeStepDefDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> getStepDBEs() {
		try {
			String methodName = "getStepDBEs";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE> returnObj = (java.util.List<org.lrc.liferay.toolbuilder.model.StepDBE>)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void addStepDBEToList(
		org.lrc.liferay.toolbuilder.model.StepDBE stepDBE) {
		try {
			String methodName = "addStepDBEToList";

			Class<?>[] parameterTypes = new Class<?>[] {
					org.lrc.liferay.toolbuilder.model.StepDBE.class
				};

			Object[] parameterValues = new Object[] { stepDBE };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getCompositeStepDBERemoteModel() {
		return _compositeStepDBERemoteModel;
	}

	public void setCompositeStepDBERemoteModel(
		BaseModel<?> compositeStepDBERemoteModel) {
		_compositeStepDBERemoteModel = compositeStepDBERemoteModel;
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

		Class<?> remoteModelClass = _compositeStepDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_compositeStepDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CompositeStepDBELocalServiceUtil.addCompositeStepDBE(this);
		}
		else {
			CompositeStepDBELocalServiceUtil.updateCompositeStepDBE(this);
		}
	}

	@Override
	public CompositeStepDBE toEscapedModel() {
		return (CompositeStepDBE)ProxyUtil.newProxyInstance(CompositeStepDBE.class.getClassLoader(),
			new Class[] { CompositeStepDBE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CompositeStepDBEClp clone = new CompositeStepDBEClp();

		clone.setCompositeStepDBEId(getCompositeStepDBEId());
		clone.setCurrentStep(getCurrentStep());
		clone.setCompositeStepDefDBEId(getCompositeStepDefDBEId());

		return clone;
	}

	@Override
	public int compareTo(CompositeStepDBE compositeStepDBE) {
		long primaryKey = compositeStepDBE.getPrimaryKey();

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

		if (!(obj instanceof CompositeStepDBEClp)) {
			return false;
		}

		CompositeStepDBEClp compositeStepDBE = (CompositeStepDBEClp)obj;

		long primaryKey = compositeStepDBE.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{compositeStepDBEId=");
		sb.append(getCompositeStepDBEId());
		sb.append(", currentStep=");
		sb.append(getCurrentStep());
		sb.append(", compositeStepDefDBEId=");
		sb.append(getCompositeStepDefDBEId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.CompositeStepDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>compositeStepDBEId</column-name><column-value><![CDATA[");
		sb.append(getCompositeStepDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentStep</column-name><column-value><![CDATA[");
		sb.append(getCurrentStep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compositeStepDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getCompositeStepDefDBEId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _compositeStepDBEId;
	private int _currentStep;
	private long _compositeStepDefDBEId;
	private BaseModel<?> _compositeStepDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}