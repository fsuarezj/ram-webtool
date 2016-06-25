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
 * This class is used by SOAP remote services, specifically {@link org.lrc.liferay.toolbuilder.service.http.CompositeStepDefDBEServiceSoap}.
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.http.CompositeStepDefDBEServiceSoap
 * @generated
 */
public class CompositeStepDefDBESoap implements Serializable {
	public static CompositeStepDefDBESoap toSoapModel(CompositeStepDefDBE model) {
		CompositeStepDefDBESoap soapModel = new CompositeStepDefDBESoap();

		soapModel.setCompositeStepDefDBEId(model.getCompositeStepDefDBEId());
		soapModel.setStepsNumber(model.getStepsNumber());
		soapModel.setSequential(model.getSequential());
		soapModel.setDepth(model.getDepth());

		return soapModel;
	}

	public static CompositeStepDefDBESoap[] toSoapModels(
		CompositeStepDefDBE[] models) {
		CompositeStepDefDBESoap[] soapModels = new CompositeStepDefDBESoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CompositeStepDefDBESoap[][] toSoapModels(
		CompositeStepDefDBE[][] models) {
		CompositeStepDefDBESoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CompositeStepDefDBESoap[models.length][models[0].length];
		}
		else {
			soapModels = new CompositeStepDefDBESoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CompositeStepDefDBESoap[] toSoapModels(
		List<CompositeStepDefDBE> models) {
		List<CompositeStepDefDBESoap> soapModels = new ArrayList<CompositeStepDefDBESoap>(models.size());

		for (CompositeStepDefDBE model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CompositeStepDefDBESoap[soapModels.size()]);
	}

	public CompositeStepDefDBESoap() {
	}

	public long getPrimaryKey() {
		return _compositeStepDefDBEId;
	}

	public void setPrimaryKey(long pk) {
		setCompositeStepDefDBEId(pk);
	}

	public long getCompositeStepDefDBEId() {
		return _compositeStepDefDBEId;
	}

	public void setCompositeStepDefDBEId(long compositeStepDefDBEId) {
		_compositeStepDefDBEId = compositeStepDefDBEId;
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

	private long _compositeStepDefDBEId;
	private int _stepsNumber;
	private boolean _sequential;
	private int _depth;
}