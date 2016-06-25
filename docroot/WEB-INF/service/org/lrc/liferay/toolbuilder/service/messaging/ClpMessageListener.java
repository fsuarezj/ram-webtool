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

package org.lrc.liferay.toolbuilder.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import org.lrc.liferay.toolbuilder.service.ClpSerializer;
import org.lrc.liferay.toolbuilder.service.CompositeStepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.CompositeStepDBEServiceUtil;
import org.lrc.liferay.toolbuilder.service.CompositeStepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.CompositeStepDefDBEServiceUtil;
import org.lrc.liferay.toolbuilder.service.InstalledStepLocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.InstalledStepServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDBEServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.StepDefDBEServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolDefDBEServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBELocalServiceUtil;
import org.lrc.liferay.toolbuilder.service.ToolInstanceDBEServiceUtil;

/**
 * @author Fernando Suárez
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CompositeStepDBELocalServiceUtil.clearService();

			CompositeStepDBEServiceUtil.clearService();
			CompositeStepDefDBELocalServiceUtil.clearService();

			CompositeStepDefDBEServiceUtil.clearService();
			InstalledStepLocalServiceUtil.clearService();

			InstalledStepServiceUtil.clearService();
			StepDBELocalServiceUtil.clearService();

			StepDBEServiceUtil.clearService();
			StepDefDBELocalServiceUtil.clearService();

			StepDefDBEServiceUtil.clearService();
			ToolDefDBELocalServiceUtil.clearService();

			ToolDefDBEServiceUtil.clearService();
			ToolInstanceDBELocalServiceUtil.clearService();

			ToolInstanceDBEServiceUtil.clearService();
		}
	}
}