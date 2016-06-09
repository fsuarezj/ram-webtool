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
import com.liferay.portal.model.CacheModel;

import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

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
		StringBundler sb = new StringBundler(5);

		sb.append("{toolInstanceDBEId=");
		sb.append(toolInstanceDBEId);
		sb.append(", toolDefDBEId=");
		sb.append(toolDefDBEId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ToolInstanceDBE toEntityModel() {
		ToolInstanceDBEImpl toolInstanceDBEImpl = new ToolInstanceDBEImpl();

		toolInstanceDBEImpl.setToolInstanceDBEId(toolInstanceDBEId);
		toolInstanceDBEImpl.setToolDefDBEId(toolDefDBEId);

		toolInstanceDBEImpl.resetOriginalValues();

		return toolInstanceDBEImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		toolInstanceDBEId = objectInput.readLong();
		toolDefDBEId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(toolInstanceDBEId);
		objectOutput.writeLong(toolDefDBEId);
	}

	public long toolInstanceDBEId;
	public long toolDefDBEId;
}