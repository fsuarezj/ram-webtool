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
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
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
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("toolDefDBEId", getToolDefDBEId());
		attributes.put("compositeStepDBEId", getCompositeStepDBEId());
		attributes.put("toolTitle", getToolTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long toolInstanceDBEId = (Long)attributes.get("toolInstanceDBEId");

		if (toolInstanceDBEId != null) {
			setToolInstanceDBEId(toolInstanceDBEId);
		}

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

		Long toolDefDBEId = (Long)attributes.get("toolDefDBEId");

		if (toolDefDBEId != null) {
			setToolDefDBEId(toolDefDBEId);
		}

		Long compositeStepDBEId = (Long)attributes.get("compositeStepDBEId");

		if (compositeStepDBEId != null) {
			setCompositeStepDBEId(compositeStepDBEId);
		}

		String toolTitle = (String)attributes.get("toolTitle");

		if (toolTitle != null) {
			setToolTitle(toolTitle);
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
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_toolInstanceDBERemoteModel, groupId);
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

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_toolInstanceDBERemoteModel, companyId);
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

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_toolInstanceDBERemoteModel, userId);
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

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_toolInstanceDBERemoteModel, userName);
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

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_toolInstanceDBERemoteModel, createDate);
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

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_toolInstanceDBERemoteModel, modifiedDate);
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

	@Override
	public long getCompositeStepDBEId() {
		return _compositeStepDBEId;
	}

	@Override
	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_compositeStepDBEId = compositeStepDBEId;

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompositeStepDBEId",
						long.class);

				method.invoke(_toolInstanceDBERemoteModel, compositeStepDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getToolTitle() {
		return _toolTitle;
	}

	@Override
	public void setToolTitle(String toolTitle) {
		_toolTitle = toolTitle;

		if (_toolInstanceDBERemoteModel != null) {
			try {
				Class<?> clazz = _toolInstanceDBERemoteModel.getClass();

				Method method = clazz.getMethod("setToolTitle", String.class);

				method.invoke(_toolInstanceDBERemoteModel, toolTitle);
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
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setToolDefDBEId(getToolDefDBEId());
		clone.setCompositeStepDBEId(getCompositeStepDBEId());
		clone.setToolTitle(getToolTitle());

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
		StringBundler sb = new StringBundler(21);

		sb.append("{toolInstanceDBEId=");
		sb.append(getToolInstanceDBEId());
		sb.append(", groupId=");
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
		sb.append(", toolDefDBEId=");
		sb.append(getToolDefDBEId());
		sb.append(", compositeStepDBEId=");
		sb.append(getCompositeStepDBEId());
		sb.append(", toolTitle=");
		sb.append(getToolTitle());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.ToolInstanceDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>toolInstanceDBEId</column-name><column-value><![CDATA[");
		sb.append(getToolInstanceDBEId());
		sb.append("]]></column-value></column>");
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
			"<column><column-name>toolDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getToolDefDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compositeStepDBEId</column-name><column-value><![CDATA[");
		sb.append(getCompositeStepDBEId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toolTitle</column-name><column-value><![CDATA[");
		sb.append(getToolTitle());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _toolInstanceDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _toolDefDBEId;
	private long _compositeStepDBEId;
	private String _toolTitle;
	private BaseModel<?> _toolInstanceDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}