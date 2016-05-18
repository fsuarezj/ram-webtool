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

import org.lrc.liferay.toolbuilder.model.ToolInstance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ToolInstance in entity cache.
 *
 * @author Fernando Suárez
 * @see ToolInstance
 * @generated
 */
public class ToolInstanceCacheModel implements CacheModel<ToolInstance>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{groupId=");
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
		sb.append(", toolInstanceId=");
		sb.append(toolInstanceId);
		sb.append(", wrapperStepId=");
		sb.append(wrapperStepId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ToolInstance toEntityModel() {
		ToolInstanceImpl toolInstanceImpl = new ToolInstanceImpl();

		toolInstanceImpl.setGroupId(groupId);
		toolInstanceImpl.setCompanyId(companyId);
		toolInstanceImpl.setUserId(userId);

		if (userName == null) {
			toolInstanceImpl.setUserName(StringPool.BLANK);
		}
		else {
			toolInstanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			toolInstanceImpl.setCreateDate(null);
		}
		else {
			toolInstanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			toolInstanceImpl.setModifiedDate(null);
		}
		else {
			toolInstanceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			toolInstanceImpl.setName(StringPool.BLANK);
		}
		else {
			toolInstanceImpl.setName(name);
		}

		toolInstanceImpl.setToolInstanceId(toolInstanceId);
		toolInstanceImpl.setWrapperStepId(wrapperStepId);

		toolInstanceImpl.resetOriginalValues();

		return toolInstanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		toolInstanceId = objectInput.readLong();
		wrapperStepId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
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

		objectOutput.writeLong(toolInstanceId);
		objectOutput.writeLong(wrapperStepId);
	}

	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long toolInstanceId;
	public long wrapperStepId;
}