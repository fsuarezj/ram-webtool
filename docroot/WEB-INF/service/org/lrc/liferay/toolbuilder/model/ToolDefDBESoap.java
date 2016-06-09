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
		soapModel.setToolName(model.getToolName());

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

	public String getToolName() {
		return _toolName;
	}

	public void setToolName(String toolName) {
		_toolName = toolName;
	}

	private long _toolDefDBEId;
	private String _toolName;
}