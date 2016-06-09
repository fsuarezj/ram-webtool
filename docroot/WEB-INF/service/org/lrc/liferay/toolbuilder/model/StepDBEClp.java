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
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class StepDBEClp extends BaseModelImpl<StepDBE> implements StepDBE {
	public StepDBEClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StepDBE.class;
	}

	@Override
	public String getModelClassName() {
		return StepDBE.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _stepDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStepDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stepDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepDBEId", getStepDBEId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("StepDefDBEId", getStepDefDBEId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepDBEId = (Long)attributes.get("stepDBEId");

		if (stepDBEId != null) {
			setStepDBEId(stepDBEId);
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

		Long StepDefDBEId = (Long)attributes.get("StepDefDBEId");

		if (StepDefDBEId != null) {
			setStepDefDBEId(StepDefDBEId);
		}
	}

	@Override
	public long getStepDBEId() {
		return _stepDBEId;
	}

	@Override
	public void setStepDBEId(long stepDBEId) {
		_stepDBEId = stepDBEId;

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepDBEId", long.class);

				method.invoke(_stepDBERemoteModel, stepDBEId);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_stepDBERemoteModel, groupId);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_stepDBERemoteModel, companyId);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_stepDBERemoteModel, userId);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_stepDBERemoteModel, userName);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_stepDBERemoteModel, createDate);
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

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_stepDBERemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStepDefDBEId() {
		return _StepDefDBEId;
	}

	@Override
	public void setStepDefDBEId(long StepDefDBEId) {
		_StepDefDBEId = StepDefDBEId;

		if (_stepDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepDefDBEId", long.class);

				method.invoke(_stepDBERemoteModel, StepDefDBEId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStepDBERemoteModel() {
		return _stepDBERemoteModel;
	}

	public void setStepDBERemoteModel(BaseModel<?> stepDBERemoteModel) {
		_stepDBERemoteModel = stepDBERemoteModel;
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

		Class<?> remoteModelClass = _stepDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_stepDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StepDBELocalServiceUtil.addStepDBE(this);
		}
		else {
			StepDBELocalServiceUtil.updateStepDBE(this);
		}
	}

	@Override
	public StepDBE toEscapedModel() {
		return (StepDBE)ProxyUtil.newProxyInstance(StepDBE.class.getClassLoader(),
			new Class[] { StepDBE.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StepDBEClp clone = new StepDBEClp();

		clone.setStepDBEId(getStepDBEId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setStepDefDBEId(getStepDefDBEId());

		return clone;
	}

	@Override
	public int compareTo(StepDBE stepDBE) {
		long primaryKey = stepDBE.getPrimaryKey();

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

		if (!(obj instanceof StepDBEClp)) {
			return false;
		}

		StepDBEClp stepDBE = (StepDBEClp)obj;

		long primaryKey = stepDBE.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{stepDBEId=");
		sb.append(getStepDBEId());
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
		sb.append(", StepDefDBEId=");
		sb.append(getStepDefDBEId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.StepDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stepDBEId</column-name><column-value><![CDATA[");
		sb.append(getStepDBEId());
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
			"<column><column-name>StepDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getStepDefDBEId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _stepDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _StepDefDBEId;
	private BaseModel<?> _stepDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}