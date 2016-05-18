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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.WrapperStepServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.WrapperStepServiceSoap
 * @generated
 */
public class WrapperStepSoap implements Serializable {
	public static WrapperStepSoap toSoapModel(WrapperStep model) {
		WrapperStepSoap soapModel = new WrapperStepSoap();

		soapModel.setWrapperStepId(model.getWrapperStepId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCurrentStep(model.getCurrentStep());
		soapModel.setSequential(model.getSequential());

		return soapModel;
	}

	public static WrapperStepSoap[] toSoapModels(WrapperStep[] models) {
		WrapperStepSoap[] soapModels = new WrapperStepSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepSoap[][] toSoapModels(WrapperStep[][] models) {
		WrapperStepSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WrapperStepSoap[models.length][models[0].length];
		}
		else {
			soapModels = new WrapperStepSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepSoap[] toSoapModels(List<WrapperStep> models) {
		List<WrapperStepSoap> soapModels = new ArrayList<WrapperStepSoap>(models.size());

		for (WrapperStep model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WrapperStepSoap[soapModels.size()]);
	}

	public WrapperStepSoap() {
	}

	public long getPrimaryKey() {
		return _wrapperStepId;
	}

	public void setPrimaryKey(long pk) {
		setWrapperStepId(pk);
	}

	public long getWrapperStepId() {
		return _wrapperStepId;
	}

	public void setWrapperStepId(long wrapperStepId) {
		_wrapperStepId = wrapperStepId;
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

	public int getCurrentStep() {
		return _currentStep;
	}

	public void setCurrentStep(int currentStep) {
		_currentStep = currentStep;
	}

	public boolean getSequential() {
		return _sequential;
	}

	public boolean isSequential() {
		return _sequential;
	}

	public void setSequential(boolean sequential) {
		_sequential = sequential;
	}

	private long _wrapperStepId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _currentStep;
	private boolean _sequential;
}