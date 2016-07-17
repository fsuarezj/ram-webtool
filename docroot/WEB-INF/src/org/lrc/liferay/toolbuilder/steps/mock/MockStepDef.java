package org.lrc.liferay.toolbuilder.steps.mock;

import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.model.StepDefDBE;
import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * Class to help in development
 *
 */
public class MockStepDef extends StepDef {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763573849262579644L;

	public MockStepDef() throws NoSuchUserException, NoSuchInstalledStepException, StepDefDBEException, SystemException {
		// TODO Auto-generated constructor stub
		super("MOCK");
	}
	
	public MockStepDef(StepDefDBE stepDefDBE) {
		super(stepDefDBE);
	}

	@Override
	public Step buildStep() throws SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException {
		return new MockStep();
	}

	@Override
	public void save() throws SystemException {
		// Void for those steps not needing definition
		super.save();
	}
}
