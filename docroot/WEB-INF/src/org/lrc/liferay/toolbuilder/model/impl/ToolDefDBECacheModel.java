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

import org.lrc.liferay.toolbuilder.model.ToolDefDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ToolDefDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see ToolDefDBE
 * @generated
 */
public class ToolDefDBECacheModel implements CacheModel<ToolDefDBE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{toolDefDBEId=");
		sb.append(toolDefDBEId);
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
		sb.append(", toolName=");
		sb.append(toolName);
		sb.append(", compositeStepDefDBEId=");
		sb.append(compositeStepDefDBEId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ToolDefDBE toEntityModel() {
		ToolDefDBEImpl toolDefDBEImpl = new ToolDefDBEImpl();

		toolDefDBEImpl.setToolDefDBEId(toolDefDBEId);
		toolDefDBEImpl.setGroupId(groupId);
		toolDefDBEImpl.setCompanyId(companyId);
		toolDefDBEImpl.setUserId(userId);

		if (userName == null) {
			toolDefDBEImpl.setUserName(StringPool.BLANK);
		}
		else {
			toolDefDBEImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			toolDefDBEImpl.setCreateDate(null);
		}
		else {
			toolDefDBEImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			toolDefDBEImpl.setModifiedDate(null);
		}
		else {
			toolDefDBEImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (toolName == null) {
			toolDefDBEImpl.setToolName(StringPool.BLANK);
		}
		else {
			toolDefDBEImpl.setToolName(toolName);
		}

		toolDefDBEImpl.setCompositeStepDefDBEId(compositeStepDefDBEId);

		toolDefDBEImpl.resetOriginalValues();

		return toolDefDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		toolDefDBEId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		toolName = objectInput.readUTF();
		compositeStepDefDBEId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(toolDefDBEId);
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

		if (toolName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toolName);
		}

		objectOutput.writeLong(compositeStepDefDBEId);
	}

	public long toolDefDBEId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String toolName;
	public long compositeStepDefDBEId;
}