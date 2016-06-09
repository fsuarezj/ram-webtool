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

import org.lrc.liferay.toolbuilder.model.InstalledStep;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InstalledStep in entity cache.
 *
 * @author Fernando Suárez
 * @see InstalledStep
 * @generated
 */
public class InstalledStepCacheModel implements CacheModel<InstalledStep>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{stepType=");
		sb.append(stepType);
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
		sb.append(", namespace=");
		sb.append(namespace);
		sb.append(", className=");
		sb.append(className);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InstalledStep toEntityModel() {
		InstalledStepImpl installedStepImpl = new InstalledStepImpl();

		if (stepType == null) {
			installedStepImpl.setStepType(StringPool.BLANK);
		}
		else {
			installedStepImpl.setStepType(stepType);
		}

		installedStepImpl.setGroupId(groupId);
		installedStepImpl.setCompanyId(companyId);
		installedStepImpl.setUserId(userId);

		if (userName == null) {
			installedStepImpl.setUserName(StringPool.BLANK);
		}
		else {
			installedStepImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			installedStepImpl.setCreateDate(null);
		}
		else {
			installedStepImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			installedStepImpl.setModifiedDate(null);
		}
		else {
			installedStepImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (namespace == null) {
			installedStepImpl.setNamespace(StringPool.BLANK);
		}
		else {
			installedStepImpl.setNamespace(namespace);
		}

		if (className == null) {
			installedStepImpl.setClassName(StringPool.BLANK);
		}
		else {
			installedStepImpl.setClassName(className);
		}

		installedStepImpl.resetOriginalValues();

		return installedStepImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		stepType = objectInput.readUTF();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		namespace = objectInput.readUTF();
		className = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (stepType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stepType);
		}

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

		if (namespace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(namespace);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}
	}

	public String stepType;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String namespace;
	public String className;
}