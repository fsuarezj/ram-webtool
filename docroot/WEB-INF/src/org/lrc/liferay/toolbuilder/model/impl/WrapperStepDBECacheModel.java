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

package org.lrc.liferay.toolbuilder.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import org.lrc.liferay.toolbuilder.model.WrapperStepDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing WrapperStepDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see WrapperStepDBE
 * @generated
 */
public class WrapperStepDBECacheModel implements CacheModel<WrapperStepDBE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{wrapperStepDBEId=");
		sb.append(wrapperStepDBEId);
		sb.append(", currentStep=");
		sb.append(currentStep);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WrapperStepDBE toEntityModel() {
		WrapperStepDBEImpl wrapperStepDBEImpl = new WrapperStepDBEImpl();

		wrapperStepDBEImpl.setWrapperStepDBEId(wrapperStepDBEId);
		wrapperStepDBEImpl.setCurrentStep(currentStep);

		wrapperStepDBEImpl.resetOriginalValues();

		return wrapperStepDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wrapperStepDBEId = objectInput.readLong();
		currentStep = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(wrapperStepDBEId);
		objectOutput.writeInt(currentStep);
	}

	public long wrapperStepDBEId;
	public int currentStep;
}