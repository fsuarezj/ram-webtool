package org.lrc.liferay.toolbuilder.steps;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class InfoStep implements Step {
	static final String view = "infoStepView.xhtml";

	@Override
	public String draw() {
		return view;
	}

	@Override
	public void save() throws SystemException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() throws PortalException, SystemException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStepName() {
		return "INFO";
	}

}
