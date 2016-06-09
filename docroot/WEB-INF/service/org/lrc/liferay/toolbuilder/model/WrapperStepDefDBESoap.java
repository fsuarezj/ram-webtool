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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.WrapperStepDefDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.WrapperStepDefDBEServiceSoap
 * @generated
 */
public class WrapperStepDefDBESoap implements Serializable {
	public static WrapperStepDefDBESoap toSoapModel(WrapperStepDefDBE model) {
		WrapperStepDefDBESoap soapModel = new WrapperStepDefDBESoap();

		soapModel.setWrapperStepDefDBEId(model.getWrapperStepDefDBEId());
		soapModel.setStepsNumber(model.getStepsNumber());
		soapModel.setSequential(model.getSequential());
		soapModel.setDepth(model.getDepth());

		return soapModel;
	}

	public static WrapperStepDefDBESoap[] toSoapModels(
		WrapperStepDefDBE[] models) {
		WrapperStepDefDBESoap[] soapModels = new WrapperStepDefDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepDefDBESoap[][] toSoapModels(
		WrapperStepDefDBE[][] models) {
		WrapperStepDefDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WrapperStepDefDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new WrapperStepDefDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepDefDBESoap[] toSoapModels(
		List<WrapperStepDefDBE> models) {
		List<WrapperStepDefDBESoap> soapModels = new ArrayList<WrapperStepDefDBESoap>(models.size());

		for (WrapperStepDefDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WrapperStepDefDBESoap[soapModels.size()]);
	}

	public WrapperStepDefDBESoap() {
	}

	public long getPrimaryKey() {
		return _wrapperStepDefDBEId;
	}

	public void setPrimaryKey(long pk) {
		setWrapperStepDefDBEId(pk);
	}

	public long getWrapperStepDefDBEId() {
		return _wrapperStepDefDBEId;
	}

	public void setWrapperStepDefDBEId(long wrapperStepDefDBEId) {
		_wrapperStepDefDBEId = wrapperStepDefDBEId;
	}

	public int getStepsNumber() {
		return _stepsNumber;
	}

	public void setStepsNumber(int stepsNumber) {
		_stepsNumber = stepsNumber;
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

	public int getDepth() {
		return _depth;
	}

	public void setDepth(int depth) {
		_depth = depth;
	}

	private long _wrapperStepDefDBEId;
	private int _stepsNumber;
	private boolean _sequential;
	private int _depth;
}