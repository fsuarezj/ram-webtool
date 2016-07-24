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

import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.ToolDefDBEException;
import org.lrc.liferay.toolbuilder.bean.ToolSession;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.service.base.ToolDefDBELocalServiceBaseImpl;
import org.lrc.liferay.toolbuilder.service.persistence.ToolDefDBEUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;

/**
 * The implementation of the tool def d b e local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.service.ToolDefDBELocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Fernando Suárez
 * @see org.lrc.liferay.toolbuilder.service.base.ToolDefDBELocalServiceBaseImpl
 * @see org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil
 */
public class ToolDefDBELocalServiceImpl extends ToolDefDBELocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil} to access the tool def d b e local service.
	 */
	public ToolDefDBE getToolDefDBE(long toolDefDBEId) throws NoSuchToolDefDBEException, SystemException {
		return toolDefDBEPersistence.findByPrimaryKey(toolDefDBEId);
	}

	public ToolDefDBE getToolDefDBE(String toolName) throws NoSuchToolDefDBEException, SystemException {
		return toolDefDBEPersistence.findByToolName(toolName);
	}
	
	protected void validate(String toolName) throws ToolDefDBEException {
		if (Validator.isNull(toolName))
			throw new ToolDefDBEException();
	}

	public ToolDefDBE addToolDefDBE(String toolName, LiferayFacesContext liferayFacesContext) throws ToolDefDBEException, SystemException, NoSuchUserException {
		User user = userPersistence.findByPrimaryKey(liferayFacesContext.getUserId());
//		Date now = new Date();
		long toolDefDBEId = counterLocalService.increment(ToolDefDBE.class.getName());
		
		validate(toolName);

		ToolDefDBE toolDefDBE = ToolDefDBEUtil.create(toolDefDBEId);

		toolDefDBE.setGroupId(liferayFacesContext.getScopeGroupId());
		toolDefDBE.setCompanyId(user.getCompanyId());
		toolDefDBE.setUserId(liferayFacesContext.getUserId());
		toolDefDBE.setUserName(user.getFullName());
		toolDefDBE.setToolName(toolName);
		
//		toolDefDBEPersistence.update(toolDefDBE);
		
		return this.addToolDefDBE(toolDefDBE);
	}
	
	@Override
	public ToolDefDBE addToolDefDBE(ToolDefDBE toolDefDBE) throws SystemException {
//		long toolDefDBEId = counterLocalService.increment(ToolDefDBE.class.getName());
//		toolDefDBE.setToolDefDBEId(toolDefDBEId);
//		try {
//			resourceLocalService.addResources(toolDefDBE.getCompanyId(), toolDefDBE.getGroupId(), toolDefDBE.getUserId(),
//				       ToolSession.MODEL, toolDefDBE.getToolDefDBEId(), false, true, true);
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return super.addToolDefDBE(toolDefDBE);
	}
	
	@Override
	public ToolDefDBE deleteToolDefDBE(ToolDefDBE toolDefDBE) throws PortalException, SystemException {
		resourceLocalService.deleteResource(toolDefDBE.getCompanyId(), ToolSession.MODEL,
				ResourceConstants.SCOPE_INDIVIDUAL, toolDefDBE.getPrimaryKey());
		return super.deleteToolDefDBE(toolDefDBE);
	}
}