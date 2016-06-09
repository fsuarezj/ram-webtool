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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.InstalledStepsServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.InstalledStepsServiceSoap
 * @generated
 */
public class InstalledStepsSoap implements Serializable {
	public static InstalledStepsSoap toSoapModel(InstalledSteps model) {
		InstalledStepsSoap soapModel = new InstalledStepsSoap();

		soapModel.setType(model.getType());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNamespace(model.getNamespace());
		soapModel.setClassName(model.getClassName());

		return soapModel;
	}

	public static InstalledStepsSoap[] toSoapModels(InstalledSteps[] models) {
		InstalledStepsSoap[] soapModels = new InstalledStepsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstalledStepsSoap[][] toSoapModels(InstalledSteps[][] models) {
		InstalledStepsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstalledStepsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstalledStepsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstalledStepsSoap[] toSoapModels(List<InstalledSteps> models) {
		List<InstalledStepsSoap> soapModels = new ArrayList<InstalledStepsSoap>(models.size());

		for (InstalledSteps model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstalledStepsSoap[soapModels.size()]);
	}

	public InstalledStepsSoap() {
	}

	public String getPrimaryKey() {
		return _type;
	}

	public void setPrimaryKey(String pk) {
		setType(pk);
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
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

	public String getNamespace() {
		return _namespace;
	}

	public void setNamespace(String namespace) {
		_namespace = namespace;
	}

	public String getClassName() {
		return _className;
	}

	public void setClassName(String className) {
		_className = className;
	}

	private String _type;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _namespace;
	private String _className;
}