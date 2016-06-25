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

import org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CompositeStepDefDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see CompositeStepDefDBE
 * @generated
 */
public class CompositeStepDefDBECacheModel implements CacheModel<CompositeStepDefDBE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{compositeStepDefDBEId=");
		sb.append(compositeStepDefDBEId);
		sb.append(", stepsNumber=");
		sb.append(stepsNumber);
		sb.append(", sequential=");
		sb.append(sequential);
		sb.append(", depth=");
		sb.append(depth);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompositeStepDefDBE toEntityModel() {
		CompositeStepDefDBEImpl compositeStepDefDBEImpl = new CompositeStepDefDBEImpl();

		compositeStepDefDBEImpl.setCompositeStepDefDBEId(compositeStepDefDBEId);
		compositeStepDefDBEImpl.setStepsNumber(stepsNumber);
		compositeStepDefDBEImpl.setSequential(sequential);
		compositeStepDefDBEImpl.setDepth(depth);

		compositeStepDefDBEImpl.resetOriginalValues();

		return compositeStepDefDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		compositeStepDefDBEId = objectInput.readLong();
		stepsNumber = objectInput.readInt();
		sequential = objectInput.readBoolean();
		depth = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(compositeStepDefDBEId);
		objectOutput.writeInt(stepsNumber);
		objectOutput.writeBoolean(sequential);
		objectOutput.writeInt(depth);
	}

	public long compositeStepDefDBEId;
	public int stepsNumber;
	public boolean sequential;
	public int depth;
}