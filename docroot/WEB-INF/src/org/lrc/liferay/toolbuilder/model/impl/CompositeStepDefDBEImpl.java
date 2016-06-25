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

import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model implementation for the CompositeStepDefDBE service. Represents a row in the &quot;lrc_tb_CompositeStepDefDBE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE} interface.
 * </p>
 *
 * @author Fernando Suárez
 */
public class CompositeStepDefDBEImpl extends CompositeStepDefDBEBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a composite step def d b e model instance should use the {@link org.lrc.liferay.toolbuilder.model.CompositeStepDefDBE} interface instead.
	 */
	private List<StepDefDBE> stepDefDBEs;

	public CompositeStepDefDBEImpl() {
		this.stepDefDBEs = new ArrayList<StepDefDBE>();
	}
	
//	public loadStepDefDBEs() {
//		this.stepDefDBEs = StepDefDBELocalServiceUtil.getCompositeStepDefDBEStepDefDBEs(this.getCompositeStepDefDBEId());
//	}
	
	public List<StepDefDBE> getStepDefDBEs() {
		return this.stepDefDBEs;
	}
	
	public void addStepDefDBEToList(StepDefDBE stepDefDBE) {
		this.stepDefDBEs.add(stepDefDBE);
	}
}