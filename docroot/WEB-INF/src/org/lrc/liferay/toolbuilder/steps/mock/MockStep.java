package org.lrc.liferay.toolbuilder.steps.mock;

import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * Class to help in development
 *
 */
public class MockStep extends Step {

	public MockStep() {
		super("MOCK");
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save() throws SystemException {
		// Void for non-modifiable steps
	}
}
