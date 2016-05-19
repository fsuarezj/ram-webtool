package org.lrc.liferay.toolbuilder.steps;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * Class to help in development
 *
 */
public class VoidStep implements Step {

	public VoidStep() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
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
		return "VOID";
	}

}
