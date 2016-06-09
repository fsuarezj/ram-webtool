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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.lrc.liferay.toolbuilder.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class ToolDefDBEClp extends BaseModelImpl<ToolDefDBE>
	implements ToolDefDBE {
	public ToolDefDBEClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ToolDefDBE.class;
	}

	@Override
	public String getModelClassName() {
		return ToolDefDBE.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _toolDefDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setToolDefDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _toolDefDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("toolDefDBEId", getToolDefDBEId());
		attributes.put("toolName", getToolName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long toolDefDBEId = (Long)attributes.get("toolDefDBEId");

		if (toolDefDBEId != null) {
			setToolDefDBEId(toolDefDBEId);
		}

		String toolName = (String)attributes.get("toolName");

		if (toolName != null) {
			setToolName(toolName);
		}
	}

	@Override
	public long getToolDefDBEId() {
		return _toolDefDBEId;
	}

	@Override
	public void setToolDefDBEId(long toolDefDBEId) {
		_toolDefDBEId = toolDefDBEId;

		if (_toolDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setToolDefDBEId", long.class);

				method.invoke(_toolDefDBERemoteModel, toolDefDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToolName() {
		return _toolName;
	}

	@Override
	public void setToolName(String toolName) {
		_toolName = toolName;

		if (_toolDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setToolName", String.class);

				method.invoke(_toolDefDBERemoteModel, toolName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getToolDefDBERemoteModel() {
		return _toolDefDBERemoteModel;
	}

	public void setToolDefDBERemoteModel(BaseModel<?> toolDefDBERemoteModel) {
		_toolDefDBERemoteModel = toolDefDBERemoteModel;
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

		Class<?> remoteModelClass = _toolDefDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_toolDefDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public ToolDefDBE toEscapedModel() {
		return (ToolDefDBE)ProxyUtil.newProxyInstance(ToolDefDBE.class.getClassLoader(),
			new Class[] { ToolDefDBE.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ToolDefDBEClp clone = new ToolDefDBEClp();

		clone.setToolDefDBEId(getToolDefDBEId());
		clone.setToolName(getToolName());

		return clone;
	}

	@Override
	public int compareTo(ToolDefDBE toolDefDBE) {
		long primaryKey = toolDefDBE.getPrimaryKey();

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

		if (!(obj instanceof ToolDefDBEClp)) {
			return false;
		}

		ToolDefDBEClp toolDefDBE = (ToolDefDBEClp)obj;

		long primaryKey = toolDefDBE.getPrimaryKey();

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

		sb.append("{toolDefDBEId=");
		sb.append(getToolDefDBEId());
		sb.append(", toolName=");
		sb.append(getToolName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.ToolDefDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>toolDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getToolDefDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toolName</column-name><column-value><![CDATA[");
		sb.append(getToolName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _toolDefDBEId;
	private String _toolName;
	private BaseModel<?> _toolDefDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}