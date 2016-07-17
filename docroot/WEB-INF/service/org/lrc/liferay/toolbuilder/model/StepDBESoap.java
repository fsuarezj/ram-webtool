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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.StepDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.StepDBEServiceSoap
 * @generated
 */
public class StepDBESoap implements Serializable {
	public static StepDBESoap toSoapModel(StepDBE model) {
		StepDBESoap soapModel = new StepDBESoap();

		soapModel.setStepDBEId(model.getStepDBEId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStepType(model.getStepType());
		soapModel.setStepTypeId(model.getStepTypeId());

		return soapModel;
	}

	public static StepDBESoap[] toSoapModels(StepDBE[] models) {
		StepDBESoap[] soapModels = new StepDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StepDBESoap[][] toSoapModels(StepDBE[][] models) {
		StepDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StepDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new StepDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StepDBESoap[] toSoapModels(List<StepDBE> models) {
		List<StepDBESoap> soapModels = new ArrayList<StepDBESoap>(models.size());

		for (StepDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StepDBESoap[soapModels.size()]);
	}

	public StepDBESoap() {
	}

	public long getPrimaryKey() {
		return _stepDBEId;
	}

	public void setPrimaryKey(long pk) {
		setStepDBEId(pk);
	}

	public long getStepDBEId() {
		return _stepDBEId;
	}

	public void setStepDBEId(long stepDBEId) {
		_stepDBEId = stepDBEId;
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

	public String getStepType() {
		return _stepType;
	}

	public void setStepType(String stepType) {
		_stepType = stepType;
	}

	public long getStepTypeId() {
		return _stepTypeId;
	}

	public void setStepTypeId(long stepTypeId) {
		_stepTypeId = stepTypeId;
	}

	private long _stepDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _stepType;
	private long _stepTypeId;
}