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

import org.lrc.liferay.toolbuilder.model.StepDefDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StepDefDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see StepDefDBE
 * @generated
 */
public class StepDefDBECacheModel implements CacheModel<StepDefDBE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{stepDefDBEId=");
		sb.append(stepDefDBEId);
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
		sb.append(", stepType=");
		sb.append(stepType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StepDefDBE toEntityModel() {
		StepDefDBEImpl stepDefDBEImpl = new StepDefDBEImpl();

		stepDefDBEImpl.setStepDefDBEId(stepDefDBEId);
		stepDefDBEImpl.setGroupId(groupId);
		stepDefDBEImpl.setCompanyId(companyId);
		stepDefDBEImpl.setUserId(userId);

		if (userName == null) {
			stepDefDBEImpl.setUserName(StringPool.BLANK);
		}
		else {
			stepDefDBEImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			stepDefDBEImpl.setCreateDate(null);
		}
		else {
			stepDefDBEImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stepDefDBEImpl.setModifiedDate(null);
		}
		else {
			stepDefDBEImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stepType == null) {
			stepDefDBEImpl.setStepType(StringPool.BLANK);
		}
		else {
			stepDefDBEImpl.setStepType(stepType);
		}

		stepDefDBEImpl.resetOriginalValues();

		return stepDefDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stepDefDBEId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stepType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(stepDefDBEId);
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

		if (stepType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepType);
		}
	}

	public long stepDefDBEId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String stepType;
}