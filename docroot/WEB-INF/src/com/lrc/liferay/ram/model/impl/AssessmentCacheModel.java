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

package com.lrc.liferay.ram.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lrc.liferay.ram.model.Assessment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Assessment in entity cache.
 *
 * @author fsuarezj
 * @see Assessment
 * @generated
 */
public class AssessmentCacheModel implements CacheModel<Assessment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{assessmentId=");
		sb.append(assessmentId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", step=");
		sb.append(step);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Assessment toEntityModel() {
		AssessmentImpl assessmentImpl = new AssessmentImpl();

		assessmentImpl.setAssessmentId(assessmentId);
		assessmentImpl.setGroupId(groupId);
		assessmentImpl.setCompanyId(companyId);
		assessmentImpl.setUserId(userId);

		if (userName == null) {
			assessmentImpl.setUserName(StringPool.BLANK);
		}
		else {
			assessmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			assessmentImpl.setCreateDate(null);
		}
		else {
			assessmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assessmentImpl.setModifiedDate(null);
		}
		else {
			assessmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			assessmentImpl.setName(StringPool.BLANK);
		}
		else {
			assessmentImpl.setName(name);
		}

		assessmentImpl.setStep(step);

		assessmentImpl.resetOriginalValues();

		return assessmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assessmentId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		step = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assessmentId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(step);
	}

	public long assessmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int step;
}