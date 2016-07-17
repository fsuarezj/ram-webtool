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
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class StepDefDBEClp extends BaseModelImpl<StepDefDBE>
	implements StepDefDBE {
	public StepDefDBEClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StepDefDBE.class;
	}

	@Override
	public String getModelClassName() {
		return StepDefDBE.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _stepDefDBEId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStepDefDBEId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stepDefDBEId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepDefDBEId", getStepDefDBEId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("stepType", getStepType());
		attributes.put("stepTypeId", getStepTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepDefDBEId = (Long)attributes.get("stepDefDBEId");

		if (stepDefDBEId != null) {
			setStepDefDBEId(stepDefDBEId);
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

		String stepType = (String)attributes.get("stepType");

		if (stepType != null) {
			setStepType(stepType);
		}

		Long stepTypeId = (Long)attributes.get("stepTypeId");

		if (stepTypeId != null) {
			setStepTypeId(stepTypeId);
		}
	}

	@Override
	public long getStepDefDBEId() {
		return _stepDefDBEId;
	}

	@Override
	public void setStepDefDBEId(long stepDefDBEId) {
		_stepDefDBEId = stepDefDBEId;

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepDefDBEId", long.class);

				method.invoke(_stepDefDBERemoteModel, stepDefDBEId);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_stepDefDBERemoteModel, groupId);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_stepDefDBERemoteModel, companyId);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_stepDefDBERemoteModel, userId);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_stepDefDBERemoteModel, userName);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_stepDefDBERemoteModel, createDate);
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

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_stepDefDBERemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStepType() {
		return _stepType;
	}

	@Override
	public void setStepType(String stepType) {
		_stepType = stepType;

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepType", String.class);

				method.invoke(_stepDefDBERemoteModel, stepType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStepTypeId() {
		return _stepTypeId;
	}

	@Override
	public void setStepTypeId(long stepTypeId) {
		_stepTypeId = stepTypeId;

		if (_stepDefDBERemoteModel != null) {
			try {
				Class<?> clazz = _stepDefDBERemoteModel.getClass();

				Method method = clazz.getMethod("setStepTypeId", long.class);

				method.invoke(_stepDefDBERemoteModel, stepTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStepDefDBERemoteModel() {
		return _stepDefDBERemoteModel;
	}

	public void setStepDefDBERemoteModel(BaseModel<?> stepDefDBERemoteModel) {
		_stepDefDBERemoteModel = stepDefDBERemoteModel;
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

		Class<?> remoteModelClass = _stepDefDBERemoteModel.getClass();

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

		Object returnValue = method.invoke(_stepDefDBERemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StepDefDBELocalServiceUtil.addStepDefDBE(this);
		}
		else {
			StepDefDBELocalServiceUtil.updateStepDefDBE(this);
		}
	}

	@Override
	public StepDefDBE toEscapedModel() {
		return (StepDefDBE)ProxyUtil.newProxyInstance(StepDefDBE.class.getClassLoader(),
			new Class[] { StepDefDBE.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StepDefDBEClp clone = new StepDefDBEClp();

		clone.setStepDefDBEId(getStepDefDBEId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setStepType(getStepType());
		clone.setStepTypeId(getStepTypeId());

		return clone;
	}

	@Override
	public int compareTo(StepDefDBE stepDefDBE) {
		long primaryKey = stepDefDBE.getPrimaryKey();

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

		if (!(obj instanceof StepDefDBEClp)) {
			return false;
		}

		StepDefDBEClp stepDefDBE = (StepDefDBEClp)obj;

		long primaryKey = stepDefDBE.getPrimaryKey();

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

		sb.append("{stepDefDBEId=");
		sb.append(getStepDefDBEId());
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
		sb.append(", stepType=");
		sb.append(getStepType());
		sb.append(", stepTypeId=");
		sb.append(getStepTypeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.StepDefDBE");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stepDefDBEId</column-name><column-value><![CDATA[");
		sb.append(getStepDefDBEId());
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
			"<column><column-name>stepType</column-name><column-value><![CDATA[");
		sb.append(getStepType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepTypeId</column-name><column-value><![CDATA[");
		sb.append(getStepTypeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _stepDefDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _stepType;
	private long _stepTypeId;
	private BaseModel<?> _stepDefDBERemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}