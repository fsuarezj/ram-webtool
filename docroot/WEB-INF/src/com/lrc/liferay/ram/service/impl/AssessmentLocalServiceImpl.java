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

package com.lrc.liferay.ram.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.base.AssessmentLocalServiceBaseImpl;

/**
 * The implementation of the assessment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lrc.liferay.ram.service.AssessmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author fsuarezj
 * @see com.lrc.liferay.ram.service.base.AssessmentLocalServiceBaseImpl
 * @see com.lrc.liferay.ram.service.AssessmentLocalServiceUtil
 */
public class AssessmentLocalServiceImpl extends AssessmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lrc.liferay.ram.service.AssessmentLocalServiceUtil} to access the assessment local service.
	 */
	
	public List<Assessment> getAssessments(long groupId) throws SystemException {
		return assessmentPersistence.findByGroupId(groupId);
	}

	public List<Assessment> getAssessments(long groupId, int start, int end) throws SystemException {
		return assessmentPersistence.findByGroupId(groupId, start, end);
	}
	
	public List<Assessment> getAssessments(long groupId, String name) throws SystemException {
		return assessmentPersistence.findByG_N(groupId, name);
	}
	
	public List<Assessment> getAssessments(long groupId, String name, int start, int end) throws SystemException {
		return assessmentPersistence.findByG_N(groupId, name, start, end);
	}

	public List<Assessment> getAssessmentsByUser(long userId) throws SystemException {
		return assessmentPersistence.findByUserId(userId);
	}

	public List<Assessment> getAssessmentsByUser(long userId, int start, int end) throws SystemException {
		return assessmentPersistence.findByGroupId(userId, start, end);
	}
	
	@Override
	public Assessment addAssessment(Assessment assessment) throws SystemException {
		long assessmentId = counterLocalService.increment(Assessment.class.getName());
		assessment.setAssessmentId(assessmentId);
		
		return super.addAssessment(assessment);
	}
	
}