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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.ToolInstanceServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.ToolInstanceServiceSoap
 * @generated
 */
public class ToolInstanceSoap implements Serializable {
	public static ToolInstanceSoap toSoapModel(ToolInstance model) {
		ToolInstanceSoap soapModel = new ToolInstanceSoap();

		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setToolInstanceId(model.getToolInstanceId());
		soapModel.setWrapperStepId(model.getWrapperStepId());

		return soapModel;
	}

	public static ToolInstanceSoap[] toSoapModels(ToolInstance[] models) {
		ToolInstanceSoap[] soapModels = new ToolInstanceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ToolInstanceSoap[][] toSoapModels(ToolInstance[][] models) {
		ToolInstanceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ToolInstanceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ToolInstanceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ToolInstanceSoap[] toSoapModels(List<ToolInstance> models) {
		List<ToolInstanceSoap> soapModels = new ArrayList<ToolInstanceSoap>(models.size());

		for (ToolInstance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ToolInstanceSoap[soapModels.size()]);
	}

	public ToolInstanceSoap() {
	}

	public long getPrimaryKey() {
		return _toolInstanceId;
	}

	public void setPrimaryKey(long pk) {
		setToolInstanceId(pk);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getToolInstanceId() {
		return _toolInstanceId;
	}

	public void setToolInstanceId(long toolInstanceId) {
		_toolInstanceId = toolInstanceId;
	}

	public long getWrapperStepId() {
		return _wrapperStepId;
	}

	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStepId = wrapperStepId;
	}

	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _toolInstanceId;
	private long _wrapperStepId;
}