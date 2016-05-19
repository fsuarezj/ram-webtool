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
import com.liferay.portal.util.PortalUtil;

import org.lrc.liferay.toolbuilder.service.ClpSerializer;
import org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class ToolInstanceClp extends BaseModelImpl<ToolInstance>
	implements ToolInstance {
	public ToolInstanceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ToolInstance.class;
	}

	@Override
	public String getModelClassName() {
		return ToolInstance.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _toolInstanceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setToolInstanceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _toolInstanceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("toolInstanceId", getToolInstanceId());
		attributes.put("wrapperStepId", getWrapperStepId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long toolInstanceId = (Long)attributes.get("toolInstanceId");

		if (toolInstanceId != null) {
			setToolInstanceId(toolInstanceId);
		}

		Long wrapperStepId = (Long)attributes.get("wrapperStepId");

		if (wrapperStepId != null) {
			setWrapperStepId(wrapperStepId);
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_toolInstanceRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_toolInstanceRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_toolInstanceRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_toolInstanceRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_toolInstanceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_toolInstanceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_toolInstanceRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getToolInstanceId() {
		return _toolInstanceId;
	}

	@Override
	public void setToolInstanceId(long toolInstanceId) {
		_toolInstanceId = toolInstanceId;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setToolInstanceId", long.class);

				method.invoke(_toolInstanceRemoteModel, toolInstanceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWrapperStepId() {
		return _wrapperStepId;
	}

	@Override
	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStepId = wrapperStepId;

		if (_toolInstanceRemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceRemoteModel.getClass();

				Method method = clazz.getMethod("setWrapperStepId", long.class);

				method.invoke(_toolInstanceRemoteModel, wrapperStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCurrentStepNumber() {
		try {
			String methodName = "getCurrentStepNumber";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			Integer returnObj = (Integer)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void save() {
		try {
			String methodName = "save";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.String getStepName() {
		try {
			String methodName = "getStepName";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.lang.String returnObj = (java.lang.String)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.String draw() {
		try {
			String methodName = "draw";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.lang.String returnObj = (java.lang.String)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void delete() {
		try {
			String methodName = "delete";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public void setWrapperStep(
		org.lrc.liferay.toolbuilder.model.WrapperStep wrapperStep) {
		try {
			String methodName = "setWrapperStep";

			Class<?>[] parameterTypes = new Class<?>[] {
					org.lrc.liferay.toolbuilder.model.WrapperStep.class
				};

			Object[] parameterValues = new Object[] { wrapperStep };

			invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.Integer stepForward() {
		try {
			String methodName = "stepForward";

			Class<?>[] parameterTypes = new Class<?>[] {  };

			Object[] parameterValues = new Object[] {  };

			java.lang.Integer returnObj = (java.lang.Integer)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public BaseModel<?> getToolInstanceRemoteModel() {
		return _toolInstanceRemoteModel;
	}

	public void setToolInstanceRemoteModel(BaseModel<?> toolInstanceRemoteModel) {
		_toolInstanceRemoteModel = toolInstanceRemoteModel;
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

		Class<?> remoteModelClass = _toolInstanceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_toolInstanceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ToolInstanceLocalServiceUtil.addToolInstance(this);
		}
		else {
			ToolInstanceLocalServiceUtil.updateToolInstance(this);
		}
	}

	@Override
	public ToolInstance toEscapedModel() {
		return (ToolInstance)ProxyUtil.newProxyInstance(ToolInstance.class.getClassLoader(),
			new Class[] { ToolInstance.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ToolInstanceClp clone = new ToolInstanceClp();

		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setToolInstanceId(getToolInstanceId());
		clone.setWrapperStepId(getWrapperStepId());

		return clone;
	}

	@Override
	public int compareTo(ToolInstance toolInstance) {
		long primaryKey = toolInstance.getPrimaryKey();

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

		if (!(obj instanceof ToolInstanceClp)) {
			return false;
		}

		ToolInstanceClp toolInstance = (ToolInstanceClp)obj;

		long primaryKey = toolInstance.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", toolInstanceId=");
		sb.append(getToolInstanceId());
		sb.append(", wrapperStepId=");
		sb.append(getWrapperStepId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.ToolInstance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toolInstanceId</column-name><column-value><![CDATA[");
		sb.append(getToolInstanceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wrapperStepId</column-name><column-value><![CDATA[");
		sb.append(getWrapperStepId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _toolInstanceId;
	private long _wrapperStepId;
	private BaseModel<?> _toolInstanceRemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}