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
		StringBundler sb = new StringBundler(5);

		sb.append("{toolDefDBEId=");
		sb.append(toolDefDBEId);
		sb.append(", toolName=");
		sb.append(toolName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ToolDefDBE toEntityModel() {
		ToolDefDBEImpl toolDefDBEImpl = new ToolDefDBEImpl();

		toolDefDBEImpl.setToolDefDBEId(toolDefDBEId);

		if (toolName == null) {
			toolDefDBEImpl.setToolName(StringPool.BLANK);
		}
		else {
			toolDefDBEImpl.setToolName(toolName);
		}

		toolDefDBEImpl.resetOriginalValues();

		return toolDefDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		toolDefDBEId = objectInput.readLong();
		toolName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(toolDefDBEId);

		if (toolName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(toolName);
		}
	}

	public long toolDefDBEId;
	public String toolName;
}