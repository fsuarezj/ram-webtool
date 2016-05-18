package org.lrc.liferay.toolbuilder.steps.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.model.WrapperStep;
import org.lrc.liferay.toolbuilder.service.WrapperStepLocalServiceUtil;
import org.lrc.liferay.toolbuilder.steps.Step;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 *
 */
public class WrapperStepInstance implements Step {
	final String view = "wrapperStepView.xhtml";
	
	private List<Step> steps;
	protected WrapperStep wrapperStep;
	private int depth;
	
	// BUILDING METHODS //
	
	//TODO: Delete, just for compiling before StepFactory is working
	public WrapperStepInstance() {
		
	}
	
	/**
	 * @param wrapperStep the model object
	 */
	public WrapperStepInstance(WrapperStep wrapperStep) {
		this.wrapperStep = wrapperStep;
		this.depth = 0;
		this.steps = new ArrayList<Step>();
		//TODO: Get steps from persistent layer
	}
	
	/**
	 * @param wrapperStep the model object
	 * @param depth the depth where is located the step
	 */
	public WrapperStepInstance(WrapperStep wrapperStep, int depth) {
		this.wrapperStep = wrapperStep;
		this.depth = depth;
		//TODO: Get steps from persistent layer
	}
	
	public void addStep(Step step) {
		this.steps.add(step);
	}
	
	// OPERATION METHODS
	
	/**
	 * @return the index of the next step. If it is the final step it returns the current step.
	 */
	public Integer stepForward() {
		if (this.wrapperStep.getCurrentStep() + 1 < this.steps.size())
			this.wrapperStep.setCurrentStep(this.wrapperStep.getCurrentStep() + 1);

		return this.wrapperStep.getCurrentStep();
	}
	
	/**
	 * @param newStep the index of the new step
	 * @return the index of the new step. If sequential will throw exception if newStep is not the next one
	 */
	public Integer setCurrentStep(Integer newStep) {
		if (this.wrapperStep.isSequential())
			if (this.wrapperStep.getCurrentStep() + 1 == newStep)
				return this.stepForward();
			else
				// TODO: Throw SequentialWrapperException
				return this.wrapperStep.getCurrentStep();
		else {
			if (newStep < this.steps.size()) {
				this.wrapperStep.setCurrentStep(newStep);
				return newStep;
			} else {
				// TODO: Throw OutOfRangeException
				return this.wrapperStep.getCurrentStep();
			}
		}
	}
	
	public Step getCurrentStep() {
		return this.steps.get(this.wrapperStep.getCurrentStep());
	}
	
	public Integer getCurrentStepNumber() {
		return this.wrapperStep.getCurrentStep() + 1;
	}
	
	public Integer getDepth() {
		return this.depth;
	}
	
	@Override
	public void save() throws SystemException {

		// If is not Sequential persistent current step will be always 0 it will never write again persistent layer
		if (this.wrapperStep.isSequential()) {
			if (this.wrapperStep.getWrapperStepId() == 0) 
				this.wrapperStep = WrapperStepLocalServiceUtil.addWrapperStep(this.wrapperStep);
			else
				this.wrapperStep = WrapperStepLocalServiceUtil.updateWrapperStep(this.wrapperStep);
		} else {
			if (this.wrapperStep.getWrapperStepId() == 0) 
				this.wrapperStep = WrapperStepLocalServiceUtil.addWrapperStep(this.wrapperStep);
		}
//		try {
//			// If the instance is being created goes to Step 1
//			if (this.selectedToolInstance.getCurrentStepIndex() == 0)
//				this.selectedToolInstance.stepForward();
//
//			// Persistence connection
//			if (this.selectedToolInstance.getInstanceId() == 0) {
//				this.selectedToolInstance = InstanceLocalServiceUtil.addInstance(this.selectedToolInstance);
//				// Include instance on list
//				this.instances.add(this.selectedToolInstance);
//			}
//			else
//				this.selectedToolInstance = InstanceLocalServiceUtil.updateInstance(this.selectedToolInstance);
//			
//
//		} catch (Exception e) {
//			this.addGlobalUnexpectedErrorMessage();
//			logger.error(e);
//		}
	}
	
	@Override
	public void delete() throws PortalException, SystemException {
		WrapperStepLocalServiceUtil.deleteWrapperStep(this.wrapperStep.getWrapperStepId());
		// TODO: Delete all contained steps
	}

	@Override
	public String draw() {
		return this.view;
	}

}
