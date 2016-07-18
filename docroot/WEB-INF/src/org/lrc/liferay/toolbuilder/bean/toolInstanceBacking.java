package org.lrc.liferay.toolbuilder.bean;

import java.lang.reflect.InvocationTargetException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lrc.liferay.toolbuilder.CompositeStepDBEException;
import org.lrc.liferay.toolbuilder.NoSuchInstalledStepException;
import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.StepDBEException;
import org.lrc.liferay.toolbuilder.StepDefDBEException;
import org.lrc.liferay.toolbuilder.ToolInstance;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Fernando Suárez
 * A request scoped bean to manage Tool Instances
 */
@ManagedBean
@RequestScoped
public class toolInstanceBacking extends AbstractBaseBean {

	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	protected ToolSession toolSession;
	
	/**
	 * Adds a new tool Instance to the tool session and sets it at configuring state
	 * @return a String with the view to show
	 */
	public String add() throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InstantiationException, NoSuchMethodException, SecurityException, InvocationTargetException, SystemException, NoSuchUserException, NoSuchInstalledStepException, StepDBEException, StepDefDBEException, CompositeStepDBEException, NoSuchToolDefDBEException {
		System.out.println("Adding a new Tool Instance");
		ToolInstance toolInstance = toolSession.createToolInstance();
		
		this.toolSession.setConfiguringInstance();
		return this.toolSession.selectToolInstance(toolInstance);
	}
	
	/**
	 * Gets the current Step number (> 0) of the tool instance
	 * @return A number > 0
	 */
	public int getStep() {
		return toolSession.getSelectedToolInstance().getCurrentStepNumber();
	}
	
	/**
	 * Sets the tool instance one step forward if it is not in its last step
	 * @throws SystemException
	 */
	public void stepForward() throws SystemException {
		toolSession.getSelectedToolInstance().stepForward();
		System.out.println("StepForward to " + toolSession.getSelectedToolInstance().getCurrentStepNumber());
		toolSession.saveExistingToolInstance();
	}

	/**
	 * Getter
	 * @return the tool session bean
	 */
	public ToolSession getToolSession() {
		return this.toolSession;
	}
	
	/**
	 * Setter
	 * @param toolSession the tool session bean
	 */
	public void setToolSession(ToolSession toolSession) {
		this.toolSession = toolSession;
	}
}
