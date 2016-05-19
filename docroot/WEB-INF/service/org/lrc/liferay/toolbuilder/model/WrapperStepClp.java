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
import org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Suárez
 */
public class WrapperStepClp extends BaseModelImpl<WrapperStep>
	implements WrapperStep {
	public WrapperStepClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return WrapperStep.class;
	}

	@Override
	public String getModelClassName() {
		return WrapperStep.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _wrapperStepId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWrapperStepId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _wrapperStepId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("wrapperStepId", getWrapperStepId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("currentStep", getCurrentStep());
		attributes.put("sequential", getSequential());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long wrapperStepId = (Long)attributes.get("wrapperStepId");

		if (wrapperStepId != null) {
			setWrapperStepId(wrapperStepId);
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

		Integer currentStep = (Integer)attributes.get("currentStep");

		if (currentStep != null) {
			setCurrentStep(currentStep);
		}

		Boolean sequential = (Boolean)attributes.get("sequential");

		if (sequential != null) {
			setSequential(sequential);
		}
	}

	@Override
	public long getWrapperStepId() {
		return _wrapperStepId;
	}

	@Override
	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStepId = wrapperStepId;

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setWrapperStepId", long.class);

				method.invoke(_wrapperStepRemoteModel, wrapperStepId);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_wrapperStepRemoteModel, groupId);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_wrapperStepRemoteModel, companyId);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_wrapperStepRemoteModel, userId);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_wrapperStepRemoteModel, userName);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_wrapperStepRemoteModel, createDate);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_wrapperStepRemoteModel, modifiedDate);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentStep", int.class);

				method.invoke(_wrapperStepRemoteModel, currentStep);
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

		if (_wrapperStepRemoteModel != null) {
			try {
				Class<?> clazz = _wrapperStepRemoteModel.getClass();

				Method method = clazz.getMethod("setSequential", boolean.class);

				method.invoke(_wrapperStepRemoteModel, sequential);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public java.lang.Integer setCurrentStep(java.lang.Integer newStep) {
		try {
			String methodName = "setCurrentStep";

			Class<?>[] parameterTypes = new Class<?>[] { java.lang.Integer.class };

			Object[] parameterValues = new Object[] { newStep };

			java.lang.Integer returnObj = (java.lang.Integer)invokeOnRemoteModel(methodName,
					parameterTypes, parameterValues);

			return returnObj;
		}
		catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	@Override
	public java.lang.Integer getCurrentStepNumber() {
		try {
			String methodName = "getCurrentStepNumber";

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
	public void addStep(org.lrc.liferay.toolbuilder.steps.Step step) {
		try {
			String methodName = "addStep";

			Class<?>[] parameterTypes = new Class<?>[] {
					org.lrc.liferay.toolbuilder.steps.Step.class
				};

			Object[] parameterValues = new Object[] { step };

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

	public BaseModel<?> getWrapperStepRemoteModel() {
		return _wrapperStepRemoteModel;
	}

	public void setWrapperStepRemoteModel(BaseModel<?> wrapperStepRemoteModel) {
		_wrapperStepRemoteModel = wrapperStepRemoteModel;
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

		Class<?> remoteModelClass = _wrapperStepRemoteModel.getClass();

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

		Object returnValue = method.invoke(_wrapperStepRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			WrapperStepLocalServiceUtil.addWrapperStep(this);
		}
		else {
			WrapperStepLocalServiceUtil.updateWrapperStep(this);
		}
	}

	@Override
	public WrapperStep toEscapedModel() {
		return (WrapperStep)ProxyUtil.newProxyInstance(WrapperStep.class.getClassLoader(),
			new Class[] { WrapperStep.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		WrapperStepClp clone = new WrapperStepClp();

		clone.setWrapperStepId(getWrapperStepId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCurrentStep(getCurrentStep());
		clone.setSequential(getSequential());

		return clone;
	}

	@Override
	public int compareTo(WrapperStep wrapperStep) {
		long primaryKey = wrapperStep.getPrimaryKey();

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

		if (!(obj instanceof WrapperStepClp)) {
			return false;
		}

		WrapperStepClp wrapperStep = (WrapperStepClp)obj;

		long primaryKey = wrapperStep.getPrimaryKey();

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

		sb.append("{wrapperStepId=");
		sb.append(getWrapperStepId());
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
		sb.append(", currentStep=");
		sb.append(getCurrentStep());
		sb.append(", sequential=");
		sb.append(getSequential());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("org.lrc.liferay.toolbuilder.model.WrapperStep");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>wrapperStepId</column-name><column-value><![CDATA[");
		sb.append(getWrapperStepId());
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
			"<column><column-name>currentStep</column-name><column-value><![CDATA[");
		sb.append(getCurrentStep());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequential</column-name><column-value><![CDATA[");
		sb.append(getSequential());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _wrapperStepId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _currentStep;
	private boolean _sequential;
	private BaseModel<?> _wrapperStepRemoteModel;
	private Class<?> _clpSerializerClass = org.lrc.liferay.toolbuilder.service.ClpSerializer.class;
}