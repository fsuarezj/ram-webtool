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
import org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class CompositeStepDefDBEClp extends BaseModelImpl<CompositeStepDefDBE>
	implements CompositeStepDefDBE {
	public CompositeStepDefDBEClp() {
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
	public long getPrimaryKey() {
		return _compositeStepDefDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompositeStepDefDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compositeStepDefDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBEId;
	}

	@Override
	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBEId = compositeStepDefDBEId;

		if (_compositeStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompositeStepDefDBEId",
						long.class);

				method.invoke(_compositeStepDefDBERemoteModel,
					compositeStepDefDBEId);
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

		if (_compositeStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepsNumber", int.class);

				method.invoke(_compositeStepDefDBERemoteModel, stepsNumber);
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

		if (_compositeStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setSequential", boolean.class);

				method.invoke(_compositeStepDefDBERemoteModel, sequential);
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

		if (_compositeStepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _compositeStepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setDepth", int.class);

				method.invoke(_compositeStepDefDBERemoteModel, depth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public void addStepDefDBE(
		org.lrc.liferay.toolbuilder.model.StepDefDBE stepDefDBE) {
		try {
			String methodName = "addStepDefDBE";

			Class<?>[] parameterTypes = new Class<?>[] {
					org.lrc.liferay.toolbuilder.model.StepDefDBE.class
				};

			Object[] parameterValues = new Object[] { stepDefDBE };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> getStepDefDBEs() {
		try {
			String methodName = "getStepDefDBEs";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE> returnObj =
				(java.util.List<org.lrc.liferay.toolbuilder.model.StepDefDBE>)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getCompositeStepDefDBERemoteModel() {
		return _compositeStepDefDBERemoteModel;
	}

	public void setCompositeStepDefDBERemoteModel(
		BaseModel<?> compositeStepDefDBERemoteModel) {
		_compositeStepDefDBERemoteModel = compositeStepDefDBERemoteModel;
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

		Class<?> remoteModelClass = _compositeStepDefDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_compositeStepDefDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CompositeStepDefDBELocalServiceUtil.addCompositeStepDefDBE(this);
		}
		else {
			CompositeStepDefDBELocalServiceUtil.updateCompositeStepDefDBE(this);
		}
	}

	@Override
	public CompositeStepDefDBE toEscapedModel() {
		return (CompositeStepDefDBE)ProxyUtil.newProxyInstance(CompositeStepDefDBE.class.getClassLoader(),
			new Class[] { CompositeStepDefDBE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CompositeStepDefDBEClp clone = new CompositeStepDefDBEClp();

		clone.setCompositeStepDefDBEId(getCompositeStepDefDBEId());
		clone.setStepsNumber(getStepsNumber());
		clone.setSequential(getSequential());
		clone.setDepth(getDepth());

		return clone;
	}

	@Override
	public int compareTo(CompositeStepDefDBE compositeStepDefDBE) {
		long primaryKey = compositeStepDefDBE.getPrimaryKey();

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

		if (!(obj instanceof CompositeStepDefDBEClp)) {
			return false;
		}

		CompositeStepDefDBEClp compositeStepDefDBE = (CompositeStepDefDBEClp)obj;

		long primaryKey = compositeStepDefDBE.getPrimaryKey();

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

		sb.append("{compositeStepDefDBEId=");
		sb.append(getCompositeStepDefDBEId());
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
		sb.append("org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>compositeStepDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getCompositeStepDefDBEId());
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

	private long _compositeStepDefDBEId;
	private int _stepsNumber;
	private boolean _sequential;
	private int _depth;
	private BaseModel<?> _compositeStepDefDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}