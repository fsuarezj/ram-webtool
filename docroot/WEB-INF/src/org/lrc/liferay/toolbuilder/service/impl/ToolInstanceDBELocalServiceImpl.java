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

import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.NoSuchToolInstanceDBEException;
import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.model.ToolInstanceDBE;
import org.lrc.liferay.toolbuilder.service.base.ToolInstanceDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.ToolInstanceDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;

/**
 * The implementation of the tool instance d b e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.ToolInstanceDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil
 */
public class ToolInstanceDBELocalServiceImpl
	extends ToolInstanceDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil} to access the tool instance d b e local service.
	 */
	
	private void validate(long toolDefDBEId) throws NoSuchToolDefDBEException, SystemException {
		toolDefDBEPersistence.findByPrimaryKey(toolDefDBEId);
	}

	public ToolInstanceDBE addToolInstanceDBE(long toolDefDBEId, long compositeStepDBEId, LiferayFacesContext liferayFacesContext) throws NoSuchUserException, SystemException, NoSuchToolDefDBEException {
		User user = userPersistence.findByPrimaryKey(liferayFacesContext.getUserId());
		
		long toolInstanceDBEId = counterLocalService.increment(ToolInstanceDBE.class.getName());

		validate(toolDefDBEId);

		ToolInstanceDBE toolInstanceDBE = ToolInstanceDBEUtil.create(toolInstanceDBEId);

		toolInstanceDBE.setUserId(liferayFacesContext.getUserId());
		toolInstanceDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		toolInstanceDBE.setCompanyId(liferayFacesContext.getCompanyId());
		toolInstanceDBE.setUserId(liferayFacesContext.getUserId());
		toolInstanceDBE.setUserName(user.getFullName());
		toolInstanceDBE.setToolDefDBEId(toolDefDBEId);
		
		return toolInstanceDBE;
	}
	
	public ToolInstanceDBE getToolInstanceDBE(long toolInstanceDBEId) throws NoSuchToolInstanceDBEException, SystemException {
		return toolInstanceDBEPersistence.findByPrimaryKey(toolInstanceDBEId);
	}
	
	public List<ToolInstanceDBE> getToolInstanceDBEs(long groupId, long toolDefDBEId) throws SystemException {
		return toolInstanceDBEPersistence.findByG_T(groupId, toolDefDBEId);
	}
	
	public void savePermissions(ToolInstanceDBE toolInstanceDBE) throws PortalException, SystemException {
		resourceLocalService.addResources(toolInstanceDBE.getCompanyId(), toolInstanceDBE.getGroupId(),
				toolInstanceDBE.getUserId(),
			    ToolInstance.class.getName(), toolInstanceDBE.getToolInstanceDBEId(), false, true, true);
	}
	
	@Override
	public ToolInstanceDBE addToolInstanceDBE(ToolInstanceDBE toolInstanceDBE) throws SystemException {
		long toolInstanceDBEId = counterLocalService.increment(ToolInstanceDBE.class.getName());
		toolInstanceDBE.setToolInstanceDBEId(toolInstanceDBEId);
		
		return super.addToolInstanceDBE(toolInstanceDBE);
	}
}