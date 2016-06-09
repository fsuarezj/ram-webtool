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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.WrapperStepDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.WrapperStepDBEServiceSoap
 * @generated
 */
public class WrapperStepDBESoap implements Serializable {
	public static WrapperStepDBESoap toSoapModel(WrapperStepDBE model) {
		WrapperStepDBESoap soapModel = new WrapperStepDBESoap();

		soapModel.setWrapperStepDBEId(model.getWrapperStepDBEId());
		soapModel.setCurrentStep(model.getCurrentStep());

		return soapModel;
	}

	public static WrapperStepDBESoap[] toSoapModels(WrapperStepDBE[] models) {
		WrapperStepDBESoap[] soapModels = new WrapperStepDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepDBESoap[][] toSoapModels(WrapperStepDBE[][] models) {
		WrapperStepDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new WrapperStepDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new WrapperStepDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static WrapperStepDBESoap[] toSoapModels(List<WrapperStepDBE> models) {
		List<WrapperStepDBESoap> soapModels = new ArrayList<WrapperStepDBESoap>(models.size());

		for (WrapperStepDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new WrapperStepDBESoap[soapModels.size()]);
	}

	public WrapperStepDBESoap() {
	}

	public long getPrimaryKey() {
		return _wrapperStepDBEId;
	}

	public void setPrimaryKey(long pk) {
		setWrapperStepDBEId(pk);
	}

	public long getWrapperStepDBEId() {
		return _wrapperStepDBEId;
	}

	public void setWrapperStepDBEId(long wrapperStepDBEId) {
		_wrapperStepDBEId = wrapperStepDBEId;
	}

	public int getCurrentStep() {
		return _currentStep;
	}

	public void setCurrentStep(int currentStep) {
		_currentStep = currentStep;
	}

	private long _wrapperStepDBEId;
	private int _currentStep;
}