package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.lrc.liferay.toolbuilder.ToolDef;
import org.lrc.liferay.toolbuilder.steps.StepDef;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean
@ViewScoped
public class ToolDefBacking extends AbstractBaseBean implements Serializable {
	
	private static final long serialVersionUID = 7422248327006221303L;
	@ManagedProperty(name = "factoryBean", value = "#{factoryBean}")
	private FactoryBean factoryBean;
	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	private ToolSession toolSession;
	private ToolDef toolDef;
	private String toolDefName;
	private StepDef stepDef;

	public ToolDefBacking() {
		// TODO Auto-generated constructor stub
	}

	public String configToolDef() {
		return "toolDefConfig.xhtml";
	}
	
	public String saveToolDef() throws SystemException {
		this.toolDef.save(); 
		FactoryBean.removeToolDef(this.toolDefName);
		FactoryBean.putToolDef(this.toolDef.getToolDefName());
		System.out.println("Salvada");
		return "adminView.xhtml";
	}
	
	public void setToolDefName(String toolDefName) {
		if (this.toolDef != null) {
			this.toolDefName = this.toolDef.getToolDefName();
			System.out.println("Saving old toolDefName as " + this.toolDefName);
			this.toolDef.setToolDefName(toolDefName);
		} else {
			this.toolDefName = toolDefName;
		}
	}
	
	public String getToolDefName() {
		if (this.toolDef != null)
			this.toolDefName = this.toolDef.getToolDefName();
		return this.toolDefName;
	}

	public void setToolDef() throws SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, PortalException {
		System.out.println("Setting toolDef as " + this.toolDefName);
		this.toolDef = FactoryBean.getToolDef(this.toolDefName);
		this.stepDef = this.toolDef.getCompositeStepDef();
	}
	
	public ToolDef getToolDef() {
		System.out.println("Jurjur");
		return this.toolDef;
	}
	
	public FactoryBean getFactoryBean() {
		return factoryBean;
	}

	public void setFactoryBean(FactoryBean factoryBean) {
		this.factoryBean = factoryBean;
	}

	public ToolSession getToolSession() {
		return toolSession;
	}

	public void setToolSession(ToolSession toolSession) {
		this.toolSession = toolSession;
	}
	
	public StepDef getStepDef() {
		return this.stepDef;
	}
	
	public void setStepDef(StepDef stepDef) {
		this.stepDef = stepDef;
	}
}
