package org.lrc.liferay.toolbuilder.steps.mock;

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.model.StepDBE;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * Class to help in development
 *
 */
public class MockStep extends Step {

	public MockStep() throws NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, SystemException {
		super("MOCK");
	}

	public MockStep(StepDBE stepDBE) throws NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, SystemException {
		super(stepDBE);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save() throws SystemException {
		// Void for non-modifiable steps
		super.save();
	}
}
