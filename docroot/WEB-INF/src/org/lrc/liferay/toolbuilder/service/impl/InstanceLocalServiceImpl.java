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

import org.lrc.liferay.toolbuilder.model.Instance;
import org.lrc.liferay.toolbuilder.service.base.InstanceLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the instance local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.InstanceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.InstanceLocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.InstanceLocalServiceUtil
 */
public class InstanceLocalServiceImpl extends InstanceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.InstanceLocalServiceUtil} to access the instance local service.
	 */
	
	public List<Instance> getInstances(long groupId) throws SystemException {
		return instancePersistence.findByGroupId(groupId);
	}

	public List<Instance> getInstances(long groupId, int start, int end) throws SystemException {
		return instancePersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Instance> getInstances(long groupId, String name) throws SystemException {
		return instancePersistence.findByG_N(groupId, name);
	}
	
	public List<Instance> getInstances(long groupId, String name, int start, int end) throws SystemException {
		return instancePersistence.findByG_N(groupId, name, start, end);
	}

	public List<Instance> getInstancesByUser(long userId) throws SystemException {
		return instancePersistence.findByUserId(userId);
	}

	public List<Instance> getInstancesByUser(long userId, int start, int end) throws SystemException {
		return instancePersistence.findByGroupId(userId, start, end);
	}
	
	@Override
	public Instance addInstance(Instance instance) throws SystemException {
		long instanceId = counterLocalService.increment(Instance.class.getName());
		instance.setInstanceId(instanceId);
		
		return super.addInstance(instance);
	}
	
}