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

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the CompositeStepDBE service. Represents a row in the &quot;lrc_tb_CompositeStepDBE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.model.CompositeStepDBE} interface.
 * </p>
 *
 * @author Fernando Suárez
 */
public class CompositeStepDBEImpl extends CompositeStepDBEBaseImpl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1861338934141581838L;
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a composite step d b e model instance should use the {@link org.lrc.liferay.toolbuilder.model.CompositeStepDBE} interface instead.
	 */
	private List<StepDBE> stepDBEs;

	public CompositeStepDBEImpl() {
		this.stepDBEs = new ArrayList<StepDBE>();
	}
	
//	public void loadStepDBEs() throws SystemException {
//		this.stepDBEs = StepDBELocalServiceUtil.getCompositeStepDBEStepDBEs(this.getCompositeStepDBEId());
//	}

	public List<StepDBE> getStepDBEs() {
		return this.stepDBEs;
	}
	
	public void addStepDBE(StepDBE stepDBE) throws SystemException {
		System.out.println("Saving relationship between steps " + stepDBE.getStepDBEId() + " and " + this.getCompositeStepDBEId());
		CompositeStepDBELocalServiceUtil.addStepDBECompositeStepDBE(stepDBE.getStepDBEId(), this.getCompositeStepDBEId());
		this.stepDBEs.add(stepDBE);
	}
}