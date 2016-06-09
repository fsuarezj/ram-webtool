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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.StepDefDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.StepDefDBEServiceSoap
 * @generated
 */
public class StepDefDBESoap implements Serializable {
	public static StepDefDBESoap toSoapModel(StepDefDBE model) {
		StepDefDBESoap soapModel = new StepDefDBESoap();

		soapModel.setStepDefDBEId(model.getStepDefDBEId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStepType(model.getStepType());

		return soapModel;
	}

	public static StepDefDBESoap[] toSoapModels(StepDefDBE[] models) {
		StepDefDBESoap[] soapModels = new StepDefDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StepDefDBESoap[][] toSoapModels(StepDefDBE[][] models) {
		StepDefDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StepDefDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new StepDefDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StepDefDBESoap[] toSoapModels(List<StepDefDBE> models) {
		List<StepDefDBESoap> soapModels = new ArrayList<StepDefDBESoap>(models.size());

		for (StepDefDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StepDefDBESoap[soapModels.size()]);
	}

	public StepDefDBESoap() {
	}

	public long getPrimaryKey() {
		return _stepDefDBEId;
	}

	public void setPrimaryKey(long pk) {
		setStepDefDBEId(pk);
	}

	public long getStepDefDBEId() {
		return _stepDefDBEId;
	}

	public void setStepDefDBEId(long stepDefDBEId) {
		_stepDefDBEId = stepDefDBEId;
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

	private long _stepDefDBEId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _stepType;
}