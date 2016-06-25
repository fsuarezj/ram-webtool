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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.CompositeStepDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.CompositeStepDBEServiceSoap
 * @generated
 */
public class CompositeStepDBESoap implements Serializable {
	public static CompositeStepDBESoap toSoapModel(CompositeStepDBE model) {
		CompositeStepDBESoap soapModel = new CompositeStepDBESoap();

		soapModel.setCompositeStepDBEId(model.getCompositeStepDBEId());
		soapModel.setCurrentStep(model.getCurrentStep());
		soapModel.setCompositeStepDefDBEId(model.getCompositeStepDefDBEId());

		return soapModel;
	}

	public static CompositeStepDBESoap[] toSoapModels(CompositeStepDBE[] models) {
		CompositeStepDBESoap[] soapModels = new CompositeStepDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompositeStepDBESoap[][] toSoapModels(
		CompositeStepDBE[][] models) {
		CompositeStepDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompositeStepDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompositeStepDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompositeStepDBESoap[] toSoapModels(
		List<CompositeStepDBE> models) {
		List<CompositeStepDBESoap> soapModels = new ArrayList<CompositeStepDBESoap>(models.size());

		for (CompositeStepDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompositeStepDBESoap[soapModels.size()]);
	}

	public CompositeStepDBESoap() {
	}

	public long getPrimaryKey() {
		return _compositeStepDBEId;
	}

	public void setPrimaryKey(long pk) {
		setCompositeStepDBEId(pk);
	}

	public long getCompositeStepDBEId() {
		return _compositeStepDBEId;
	}

	public void setCompositeStepDBEId(long compositeStepDBEId) {
		_compositeStepDBEId = compositeStepDBEId;
	}

	public int getCurrentStep() {
		return _currentStep;
	}

	public void setCurrentStep(int currentStep) {
		_currentStep = currentStep;
	}

	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBEId;
	}

	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBEId = compositeStepDefDBEId;
	}

	private long _compositeStepDBEId;
	private int _currentStep;
	private long _compositeStepDefDBEId;
}