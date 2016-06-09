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
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class ToolInstanceDBEClp extends BaseModelImpl<ToolInstanceDBE>
	implements ToolInstanceDBE {
	public ToolInstanceDBEClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ToolInstanceDBE.class;
	}

	@Override
	public String getModelClassName() {
		return ToolInstanceDBE.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _toolInstanceDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setToolInstanceDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _toolInstanceDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("toolInstanceDBEId", getToolInstanceDBEId());
		attributes.put("toolDefDBEId", getToolDefDBEId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long toolInstanceDBEId = (Long)attributes.get("toolInstanceDBEId");

		if (toolInstanceDBEId != null) {
			setToolInstanceDBEId(toolInstanceDBEId);
		}

		Long toolDefDBEId = (Long)attributes.get("toolDefDBEId");

		if (toolDefDBEId != null) {
			setToolDefDBEId(toolDefDBEId);
		}
	}

	@Override
	public long getToolInstanceDBEId() {
		return _toolInstanceDBEId;
	}

	@Override
	public void setToolInstanceDBEId(long toolInstanceDBEId) {
		_toolInstanceDBEId = toolInstanceDBEId;

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setToolInstanceDBEId",
						long.class);

				method.invoke(_toolInstanceDBERemoteModel, toolInstanceDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToolDefDBEId() {
		return _toolDefDBEId;
	}

	@Override
	public void setToolDefDBEId(long toolDefDBEId) {
		_toolDefDBEId = toolDefDBEId;

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setToolDefDBEId", long.class);

				method.invoke(_toolInstanceDBERemoteModel, toolDefDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getToolInstanceDBERemoteModel() {
		return _toolInstanceDBERemoteModel;
	}

	public void setToolInstanceDBERemoteModel(
		BaseModel<?> toolInstanceDBERemoteModel) {
		_toolInstanceDBERemoteModel = toolInstanceDBERemoteModel;
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

		Class<?> remoteModelClass = _toolInstanceDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_toolInstanceDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ToolInstanceDBELocalServiceUtil.addToolInstanceDBE(this);
		}
		else {
			ToolInstanceDBELocalServiceUtil.updateToolInstanceDBE(this);
		}
	}

	@Override
	public ToolInstanceDBE toEscapedModel() {
		return (ToolInstanceDBE)ProxyUtil.newProxyInstance(ToolInstanceDBE.class.getClassLoader(),
			new Class[] { ToolInstanceDBE.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ToolInstanceDBEClp clone = new ToolInstanceDBEClp();

		clone.setToolInstanceDBEId(getToolInstanceDBEId());
		clone.setToolDefDBEId(getToolDefDBEId());

		return clone;
	}

	@Override
	public int compareTo(ToolInstanceDBE toolInstanceDBE) {
		long primaryKey = toolInstanceDBE.getPrimaryKey();

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

		if (!(obj instanceof ToolInstanceDBEClp)) {
			return false;
		}

		ToolInstanceDBEClp toolInstanceDBE = (ToolInstanceDBEClp)obj;

		long primaryKey = toolInstanceDBE.getPrimaryKey();

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

		sb.append("{toolInstanceDBEId=");
		sb.append(getToolInstanceDBEId());
		sb.append(", toolDefDBEId=");
		sb.append(getToolDefDBEId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.ToolInstanceDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>toolInstanceDBEId</column-name><column-value><![CDATA[");
		sb.append(getToolInstanceDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toolDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getToolDefDBEId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _toolInstanceDBEId;
	private long _toolDefDBEId;
	private BaseModel<?> _toolInstanceDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}