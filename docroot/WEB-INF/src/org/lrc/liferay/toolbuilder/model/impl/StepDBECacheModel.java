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

import org.lrc.liferay.toolbuilder.model.StepDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StepDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see StepDBE
 * @generated
 */
public class StepDBECacheModel implements CacheModel<StepDBE>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{stepDBEId=");
		sb.append(stepDBEId);
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
		sb.append(", StepDefDBEId=");
		sb.append(StepDefDBEId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StepDBE toEntityModel() {
		StepDBEImpl stepDBEImpl = new StepDBEImpl();

		stepDBEImpl.setStepDBEId(stepDBEId);
		stepDBEImpl.setGroupId(groupId);
		stepDBEImpl.setCompanyId(companyId);
		stepDBEImpl.setUserId(userId);

		if (userName == null) {
			stepDBEImpl.setUserName(StringPool.BLANK);
		}
		else {
			stepDBEImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			stepDBEImpl.setCreateDate(null);
		}
		else {
			stepDBEImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stepDBEImpl.setModifiedDate(null);
		}
		else {
			stepDBEImpl.setModifiedDate(new Date(modifiedDate));
		}

		stepDBEImpl.setStepDefDBEId(StepDefDBEId);

		stepDBEImpl.resetOriginalValues();

		return stepDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stepDBEId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		StepDefDBEId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(stepDBEId);
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
		objectOutput.writeLong(StepDefDBEId);
	}

	public long stepDBEId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long StepDefDBEId;
}