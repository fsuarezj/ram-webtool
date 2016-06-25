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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.ToolInstanceDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.ToolInstanceDBEServiceSoap
 * @generated
 */
public class ToolInstanceDBESoap implements Serializable {
	public static ToolInstanceDBESoap toSoapModel(ToolInstanceDBE model) {
		ToolInstanceDBESoap soapModel = new ToolInstanceDBESoap();

		soapModel.setToolInstanceDBEId(model.getToolInstanceDBEId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setToolDefDBEId(model.getToolDefDBEId());
		soapModel.setCompositeStepDBEId(model.getCompositeStepDBEId());
		soapModel.setToolTitle(model.getToolTitle());

		return soapModel;
	}

	public static ToolInstanceDBESoap[] toSoapModels(ToolInstanceDBE[] models) {
		ToolInstanceDBESoap[] soapModels = new ToolInstanceDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ToolInstanceDBESoap[][] toSoapModels(
		ToolInstanceDBE[][] models) {
		ToolInstanceDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ToolInstanceDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new ToolInstanceDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ToolInstanceDBESoap[] toSoapModels(
		List<ToolInstanceDBE> models) {
		List<ToolInstanceDBESoap> soapModels = new ArrayList<ToolInstanceDBESoap>(models.size());

		for (ToolInstanceDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ToolInstanceDBESoap[soapModels.size()]);
	}

	public ToolInstanceDBESoap() {
	}

	public long getPrimaryKey() {
		return _toolInstanceDBEId;
	}

	public void setPrimaryKey(long pk) {
		setToolInstanceDBEId(pk);
	}

	public long getToolInstanceDBEId() {
		return _toolInstanceDBEId;
	}

	public void setToolInstanceDBEId(long toolInstanceDBEId) {
		_toolInstanceDBEId = toolInstanceDBEId;
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

	public long getToolDefDBEId() {
		return _toolDefDBEId;
	}

	public void setToolDefDBEId(long toolDefDBEId) {
		_toolDefDBEId = toolDefDBEId;
	}

	public long getCompositeStepDBEId() {
		return _compositeStepDBEId;
	}

	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_compositeStepDBEId = compositeStepDBEId;
	}

	public String getToolTitle() {
		return _toolTitle;
	}

	public void setToolTitle(String toolTitle) {
		_toolTitle = toolTitle;
	}

	private long _toolInstanceDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _toolDefDBEId;
	private long _compositeStepDBEId;
	private String _toolTitle;
}