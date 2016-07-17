package org.lrc.liferay.toolbuilder.steps.info;

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class InfoStep extends Step {
	static final String view = "infoStepView.xhtml";

	public InfoStep() throws NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, SystemException {
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
