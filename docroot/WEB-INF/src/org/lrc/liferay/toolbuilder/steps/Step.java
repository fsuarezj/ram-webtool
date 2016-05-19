package org.lrc.liferay.toolbuilder.steps;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public interface Step extends StepDef {
	
	public String draw();
	
	public void save() throws SystemException;

	public void delete() throws PortalException, SystemException;
}
