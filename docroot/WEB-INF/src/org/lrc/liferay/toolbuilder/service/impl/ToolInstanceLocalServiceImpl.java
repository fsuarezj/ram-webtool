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

package org.lrc.liferay.toolbuilder.service.impl;

import java.util.List;

import org.lrc.liferay.toolbuilder.model.ToolInstance;
import org.lrc.liferay.toolbuilder.service.base.ToolInstanceLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the tool instance local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.ToolInstanceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.ToolInstanceLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil
 */
public class ToolInstanceLocalServiceImpl
	extends ToolInstanceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil} to access the tool instance local service.
	 */
	public List<ToolInstance> getToolInstances(long groupId) throws SystemException {
		return toolInstancePersistence.findByGroupId(groupId);
	}

	public List<ToolInstance> getToolInstances(long groupId, int start, int end) throws SystemException {
		return toolInstancePersistence.findByGroupId(groupId, start, end);
	}
	
	public List<ToolInstance> getToolInstances(long groupId, String name) throws SystemException {
		return toolInstancePersistence.findByG_N(groupId, name);
	}
	
	public List<ToolInstance> getToolInstances(long groupId, String name, int start, int end) throws SystemException {
		return toolInstancePersistence.findByG_N(groupId, name, start, end);
	}

	public List<ToolInstance> getToolInstancesByUser(long userId) throws SystemException {
		return toolInstancePersistence.findByUserId(userId);
	}

	public List<ToolInstance> getToolInstancesByUser(long userId, int start, int end) throws SystemException {
		return toolInstancePersistence.findByGroupId(userId, start, end);
	}
	
	@Override
	public ToolInstance addToolInstance(ToolInstance toolInstance) throws SystemException {
		long toolInstanceId = counterLocalService.increment(ToolInstance.class.getName());
		toolInstance.setToolInstanceId(toolInstanceId);
		
		return super.addToolInstance(toolInstance);
	}
}