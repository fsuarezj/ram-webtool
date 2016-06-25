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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.ToolDefDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.ToolDefDBEServiceSoap
 * @generated
 */
public class ToolDefDBESoap implements Serializable {
	public static ToolDefDBESoap toSoapModel(ToolDefDBE model) {
		ToolDefDBESoap soapModel = new ToolDefDBESoap();

		soapModel.setToolDefDBEId(model.getToolDefDBEId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setToolName(model.getToolName());
		soapModel.setCompositeStepDefDBEId(model.getCompositeStepDefDBEId());

		return soapModel;
	}

	public static ToolDefDBESoap[] toSoapModels(ToolDefDBE[] models) {
		ToolDefDBESoap[] soapModels = new ToolDefDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ToolDefDBESoap[][] toSoapModels(ToolDefDBE[][] models) {
		ToolDefDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ToolDefDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new ToolDefDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ToolDefDBESoap[] toSoapModels(List<ToolDefDBE> models) {
		List<ToolDefDBESoap> soapModels = new ArrayList<ToolDefDBESoap>(models.size());

		for (ToolDefDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ToolDefDBESoap[soapModels.size()]);
	}

	public ToolDefDBESoap() {
	}

	public long getPrimaryKey() {
		return _toolDefDBEId;
	}

	public void setPrimaryKey(long pk) {
		setToolDefDBEId(pk);
	}

	public long getToolDefDBEId() {
		return _toolDefDBEId;
	}

	public void setToolDefDBEId(long toolDefDBEId) {
		_toolDefDBEId = toolDefDBEId;
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

	public String getToolName() {
		return _toolName;
	}

	public void setToolName(String toolName) {
		_toolName = toolName;
	}

	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBEId;
	}

	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBEId = compositeStepDefDBEId;
	}

	private long _toolDefDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _toolName;
	private long _compositeStepDefDBEId;
}