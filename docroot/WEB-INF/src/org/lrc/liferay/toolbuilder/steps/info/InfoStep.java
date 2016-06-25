package org.lrc.liferay.toolbuilder.steps.info;

import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class InfoStep extends Step {
	static final String view = "infoStepView.xhtml";

	public InfoStep() {
		super("INFO");
	}

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

}
