package org.lrc.liferay.toolbuilder.bean;

import java.lang.reflect.InvocationTargetException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.lrc.liferay.toolbuilder.ToolInstance;

import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@RequestScoped
public class InstanceBacking extends AbstractBaseBean {

	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	protected ToolSession toolSession;
	
	public String add() throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InstantiationException, NoSuchMethodException, SecurityException, InvocationTargetException, SystemException {
		System.out.println("Adding a new Tool Instance");
		ToolInstance toolInstance = toolSession.createToolInstance();
		
		this.toolSession.setConfiguringInstance();
		return this.toolSession.selectToolInstance(toolInstance);
	}
	
	public int getStep() {
		return toolSession.getSelectedToolInstance().getCurrentStepNumber();
	}
	
	public void stepForward() throws SystemException {
		toolSession.getSelectedToolInstance().stepForward();
		System.out.println("StepForward to " + toolSession.getSelectedToolInstance().getCurrentStepNumber());
		toolSession.saveToolInstance();
	}

	public ToolSession getToolSession() {
		return this.toolSession;
	}
	
	public void setToolSession(ToolSession toolSession) {
		this.toolSession = toolSession;
	}
}
