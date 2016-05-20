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

package org.lrc.liferay.toolbuilder.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.model.WrapperStepModel;
import org.lrc.liferay.toolbuilder.model.WrapperStepSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the WrapperStep service. Represents a row in the &quot;lrc_tb_WrapperStep&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.lrc.liferay.toolbuilder.model.WrapperStepModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WrapperStepImpl}.
 * </p>
 *
 * @author Fernando Suárez
 * @see WrapperStepImpl
 * @see org.lrc.liferay.toolbuilder.model.WrapperStep
 * @see org.lrc.liferay.toolbuilder.model.WrapperStepModel
 * @generated
 */
@JSON(strict = true)
public class WrapperStepModelImpl extends BaseModelImpl<WrapperStep>
	implements WrapperStepModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a wrapper step model instance should use the {@link org.lrc.liferay.toolbuilder.model.WrapperStep} interface instead.
	 */
	public static final String TABLE_NAME = "lrc_tb_WrapperStep";
	public static final Object[][] TABLE_COLUMNS = {
			{ "wrapperStepId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "currentStep", Types.INTEGER },
			{ "sequential", Types.BOOLEAN },
			{ "stepsNumber", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table lrc_tb_WrapperStep (wrapperStepId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,currentStep INTEGER,sequential BOOLEAN,stepsNumber INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table lrc_tb_WrapperStep";
	public static final String ORDER_BY_JPQL = " ORDER BY wrapperStep.wrapperStepId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY lrc_tb_WrapperStep.wrapperStepId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.lrc.liferay.toolbuilder.model.WrapperStep"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.lrc.liferay.toolbuilder.model.WrapperStep"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static WrapperStep toModel(WrapperStepSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		WrapperStep model = new WrapperStepImpl();

		model.setWrapperStepId(soapModel.getWrapperStepId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCurrentStep(soapModel.getCurrentStep());
		model.setSequential(soapModel.getSequential());
		model.setStepsNumber(soapModel.getStepsNumber());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<WrapperStep> toModels(WrapperStepSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<WrapperStep> models = new ArrayList<WrapperStep>(soapModels.length);

		for (WrapperStepSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.lrc.liferay.toolbuilder.model.WrapperStep"));

	public WrapperStepModelImpl() {
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
	public Class<?> getModelClass() {
		return WrapperStep.class;
	}

	@Override
	public String getModelClassName() {
		return WrapperStep.class.getName();
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
		attributes.put("stepsNumber", getStepsNumber());

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

		Integer stepsNumber = (Integer)attributes.get("stepsNumber");

		if (stepsNumber != null) {
			setStepsNumber(stepsNumber);
		}
	}

	@JSON
	@Override
	public long getWrapperStepId() {
		return _wrapperStepId;
	}

	@Override
	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStepId = wrapperStepId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getCurrentStep() {
		return _currentStep;
	}

	@Override
	public void setCurrentStep(int currentStep) {
		_currentStep = currentStep;
	}

	@JSON
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
	}

	@JSON
	@Override
	public int getStepsNumber() {
		return _stepsNumber;
	}

	@Override
	public void setStepsNumber(int stepsNumber) {
		_stepsNumber = stepsNumber;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			WrapperStep.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WrapperStep toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (WrapperStep)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WrapperStepImpl wrapperStepImpl = new WrapperStepImpl();

		wrapperStepImpl.setWrapperStepId(getWrapperStepId());
		wrapperStepImpl.setGroupId(getGroupId());
		wrapperStepImpl.setCompanyId(getCompanyId());
		wrapperStepImpl.setUserId(getUserId());
		wrapperStepImpl.setUserName(getUserName());
		wrapperStepImpl.setCreateDate(getCreateDate());
		wrapperStepImpl.setModifiedDate(getModifiedDate());
		wrapperStepImpl.setCurrentStep(getCurrentStep());
		wrapperStepImpl.setSequential(getSequential());
		wrapperStepImpl.setStepsNumber(getStepsNumber());

		wrapperStepImpl.resetOriginalValues();

		return wrapperStepImpl;
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

		if (!(obj instanceof WrapperStep)) {
			return false;
		}

		WrapperStep wrapperStep = (WrapperStep)obj;

		long primaryKey = wrapperStep.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<WrapperStep> toCacheModel() {
		WrapperStepCacheModel wrapperStepCacheModel = new WrapperStepCacheModel();

		wrapperStepCacheModel.wrapperStepId = getWrapperStepId();

		wrapperStepCacheModel.groupId = getGroupId();

		wrapperStepCacheModel.companyId = getCompanyId();

		wrapperStepCacheModel.userId = getUserId();

		wrapperStepCacheModel.userName = getUserName();

		String userName = wrapperStepCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			wrapperStepCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			wrapperStepCacheModel.createDate = createDate.getTime();
		}
		else {
			wrapperStepCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			wrapperStepCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			wrapperStepCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		wrapperStepCacheModel.currentStep = getCurrentStep();

		wrapperStepCacheModel.sequential = getSequential();

		wrapperStepCacheModel.stepsNumber = getStepsNumber();

		return wrapperStepCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

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
		sb.append(", stepsNumber=");
		sb.append(getStepsNumber());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

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
		sb.append(
			"<column><column-name>stepsNumber</column-name><column-value><![CDATA[");
		sb.append(getStepsNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = WrapperStep.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			WrapperStep.class
		};
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
	private int _stepsNumber;
	private WrapperStep _escapedModel;
}