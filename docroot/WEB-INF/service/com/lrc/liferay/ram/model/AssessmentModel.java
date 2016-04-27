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

package com.lrc.liferay.ram.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Assessment service. Represents a row in the &quot;lrc_ram_Assessment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lrc.liferay.ram.model.impl.AssessmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lrc.liferay.ram.model.impl.AssessmentImpl}.
 * </p>
 *
 * @author fsuarezj
 * @see Assessment
 * @see com.lrc.liferay.ram.model.impl.AssessmentImpl
 * @see com.lrc.liferay.ram.model.impl.AssessmentModelImpl
 * @generated
 */
public interface AssessmentModel extends BaseModel<Assessment>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessment model instance should use the {@link Assessment} interface instead.
	 */

	/**
	 * Returns the primary key of this assessment.
	 *
	 * @return the primary key of this assessment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessment.
	 *
	 * @param primaryKey the primary key of this assessment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the assessment ID of this assessment.
	 *
	 * @return the assessment ID of this assessment
	 */
	public long getAssessmentId();

	/**
	 * Sets the assessment ID of this assessment.
	 *
	 * @param assessmentId the assessment ID of this assessment
	 */
	public void setAssessmentId(long assessmentId);

	/**
	 * Returns the group ID of this assessment.
	 *
	 * @return the group ID of this assessment
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this assessment.
	 *
	 * @param groupId the group ID of this assessment
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this assessment.
	 *
	 * @return the company ID of this assessment
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this assessment.
	 *
	 * @param companyId the company ID of this assessment
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this assessment.
	 *
	 * @return the user ID of this assessment
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this assessment.
	 *
	 * @param userId the user ID of this assessment
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this assessment.
	 *
	 * @return the user uuid of this assessment
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this assessment.
	 *
	 * @param userUuid the user uuid of this assessment
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this assessment.
	 *
	 * @return the user name of this assessment
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this assessment.
	 *
	 * @param userName the user name of this assessment
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this assessment.
	 *
	 * @return the create date of this assessment
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this assessment.
	 *
	 * @param createDate the create date of this assessment
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this assessment.
	 *
	 * @return the modified date of this assessment
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this assessment.
	 *
	 * @param modifiedDate the modified date of this assessment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this assessment.
	 *
	 * @return the name of this assessment
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this assessment.
	 *
	 * @param name the name of this assessment
	 */
	public void setName(String name);

	/**
	 * Returns the step of this assessment.
	 *
	 * @return the step of this assessment
	 */
	public int getStep();

	/**
	 * Sets the step of this assessment.
	 *
	 * @param step the step of this assessment
	 */
	public void setStep(int step);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.lrc.liferay.ram.model.Assessment assessment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.lrc.liferay.ram.model.Assessment> toCacheModel();

	@Override
	public com.lrc.liferay.ram.model.Assessment toEscapedModel();

	@Override
	public com.lrc.liferay.ram.model.Assessment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}