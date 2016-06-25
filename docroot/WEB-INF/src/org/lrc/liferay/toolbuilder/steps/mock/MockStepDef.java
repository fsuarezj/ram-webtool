package org.lrc.liferay.toolbuilder.steps.mock;

import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * Class to help in development
 *
 */
public class MockStepDef extends StepDef {

	public MockStepDef() {
		// TODO Auto-generated constructor stub
		super("MOCK");
		this.stepDefDBE = null;
	}

	@Override
	public Step buildStep() throws SystemException {
		return new MockStep();
	}

	@Override
	public void save() throws SystemException {
		// Void for those steps not needing definition
	}
}
