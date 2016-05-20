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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.lrc.liferay.toolbuilder.model.WrapperStep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WrapperStep in entity cache.
 *
 * @author Fernando Suárez
 * @see WrapperStep
 * @generated
 */
public class WrapperStepCacheModel implements CacheModel<WrapperStep>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{wrapperStepId=");
		sb.append(wrapperStepId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", currentStep=");
		sb.append(currentStep);
		sb.append(", sequential=");
		sb.append(sequential);
		sb.append(", stepsNumber=");
		sb.append(stepsNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WrapperStep toEntityModel() {
		WrapperStepImpl wrapperStepImpl = new WrapperStepImpl();

		wrapperStepImpl.setWrapperStepId(wrapperStepId);
		wrapperStepImpl.setGroupId(groupId);
		wrapperStepImpl.setCompanyId(companyId);
		wrapperStepImpl.setUserId(userId);

		if (userName == null) {
			wrapperStepImpl.setUserName(StringPool.BLANK);
		}
		else {
			wrapperStepImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wrapperStepImpl.setCreateDate(null);
		}
		else {
			wrapperStepImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wrapperStepImpl.setModifiedDate(null);
		}
		else {
			wrapperStepImpl.setModifiedDate(new Date(modifiedDate));
		}

		wrapperStepImpl.setCurrentStep(currentStep);
		wrapperStepImpl.setSequential(sequential);
		wrapperStepImpl.setStepsNumber(stepsNumber);

		wrapperStepImpl.resetOriginalValues();

		return wrapperStepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wrapperStepId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStep = objectInput.readInt();
		sequential = objectInput.readBoolean();
		stepsNumber = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(wrapperStepId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(currentStep);
		objectOutput.writeBoolean(sequential);
		objectOutput.writeInt(stepsNumber);
	}

	public long wrapperStepId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int currentStep;
	public boolean sequential;
	public int stepsNumber;
}