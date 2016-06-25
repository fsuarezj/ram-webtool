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

import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ToolInstanceDBE in entity cache.
 *
 * @author Fernando Suárez
 * @see ToolInstanceDBE
 * @generated
 */
public class ToolInstanceDBECacheModel implements CacheModel<ToolInstanceDBE>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{toolInstanceDBEId=");
		sb.append(toolInstanceDBEId);
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
		sb.append(", toolDefDBEId=");
		sb.append(toolDefDBEId);
		sb.append(", compositeStepDBEId=");
		sb.append(compositeStepDBEId);
		sb.append(", toolTitle=");
		sb.append(toolTitle);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ToolInstanceDBE toEntityModel() {
		ToolInstanceDBEImpl toolInstanceDBEImpl = new ToolInstanceDBEImpl();

		toolInstanceDBEImpl.setToolInstanceDBEId(toolInstanceDBEId);
		toolInstanceDBEImpl.setGroupId(groupId);
		toolInstanceDBEImpl.setCompanyId(companyId);
		toolInstanceDBEImpl.setUserId(userId);

		if (userName == null) {
			toolInstanceDBEImpl.setUserName(StringPool.BLANK);
		}
		else {
			toolInstanceDBEImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			toolInstanceDBEImpl.setCreateDate(null);
		}
		else {
			toolInstanceDBEImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			toolInstanceDBEImpl.setModifiedDate(null);
		}
		else {
			toolInstanceDBEImpl.setModifiedDate(new Date(modifiedDate));
		}

		toolInstanceDBEImpl.setToolDefDBEId(toolDefDBEId);
		toolInstanceDBEImpl.setCompositeStepDBEId(compositeStepDBEId);

		if (toolTitle == null) {
			toolInstanceDBEImpl.setToolTitle(StringPool.BLANK);
		}
		else {
			toolInstanceDBEImpl.setToolTitle(toolTitle);
		}

		toolInstanceDBEImpl.resetOriginalValues();

		return toolInstanceDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		toolInstanceDBEId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		toolDefDBEId = objectInput.readLong();
		compositeStepDBEId = objectInput.readLong();
		toolTitle = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(toolInstanceDBEId);
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
		objectOutput.writeLong(toolDefDBEId);
		objectOutput.writeLong(compositeStepDBEId);

		if (toolTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toolTitle);
		}
	}

	public long toolInstanceDBEId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long toolDefDBEId;
	public long compositeStepDBEId;
	public String toolTitle;
}