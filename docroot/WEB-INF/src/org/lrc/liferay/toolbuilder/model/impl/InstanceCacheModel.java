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

import org.lrc.liferay.toolbuilder.model.Instance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Instance in entity cache.
 *
 * @author Fernando Suárez
 * @see Instance
 * @generated
 */
public class InstanceCacheModel implements CacheModel<Instance>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{instanceId=");
		sb.append(instanceId);
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
	public Instance toEntityModel() {
		InstanceImpl instanceImpl = new InstanceImpl();

		instanceImpl.setInstanceId(instanceId);
		instanceImpl.setGroupId(groupId);
		instanceImpl.setCompanyId(companyId);
		instanceImpl.setUserId(userId);

		if (userName == null) {
			instanceImpl.setUserName(StringPool.BLANK);
		}
		else {
			instanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			instanceImpl.setCreateDate(null);
		}
		else {
			instanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			instanceImpl.setModifiedDate(null);
		}
		else {
			instanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			instanceImpl.setName(StringPool.BLANK);
		}
		else {
			instanceImpl.setName(name);
		}

		instanceImpl.setStep(step);

		instanceImpl.resetOriginalValues();

		return instanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		instanceId = objectInput.readLong();
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
		objectOutput.writeLong(instanceId);
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

	public long instanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int step;
}