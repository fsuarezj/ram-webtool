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

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;

/**
 * @author Fernando Suárez
 * A request scoped bean to manage Tool Instances
 */
@ManagedBean
@RequestScoped
public class ToolInstanceBacking extends AbstractBaseBean {
	
	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	private ToolSession toolSession;
	private Boolean hasAddPermission;
	
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
	 * @throws PortalException 
	 */
	public void stepForward() throws SystemException, PortalException {
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
	
	/////////////////////////
	// PERMISSIONS METHODS //
	/////////////////////////
	
	/**
	 * Getter
	 * @return true if the user has Add Tool Permission
	 */
	public Boolean getHasAddPermission() {
		if (this.hasAddPermission == null) {
			LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
			long scopeGroupId = liferayFacesContext.getScopeGroupId();
			PermissionChecker permissionChecker = liferayFacesContext.getThemeDisplay().getPermissionChecker();
			this.hasAddPermission = permissionChecker.hasPermission
					(scopeGroupId, ToolSession.MODEL, scopeGroupId, "ADD_TOOL_INSTANCE");
		}
		return this.hasAddPermission;
	}
	
	/**
	 * Sets the Add Permission
	 * @param hasAddPermission the new value of the Add Permission
	 */
	public void setHasAddPermission(Boolean hasAddPermission) {
		this.hasAddPermission = hasAddPermission;
	}

//	/**
//	 * Defines if the user has Edit Permissions for a given ToolInstance
//	 * @param toolInstance the ToolInstance to work with
//	 * @return false if the user has permissions to edit the ToolInstance
//	 */
//	public boolean hasNotEditInstancePermission(ToolInstance toolInstance) {
//		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
//		long scopeGroupId = liferayFacesContext.getScopeGroupId();
//		return !liferayFacesContext.getThemeDisplay().getPermissionChecker().hasPermission
//				(scopeGroupId, ToolInstanceDBE.class.getName(), toolInstance.getToolInstanceDBEId(), "EDIT");
//	}
//
}
