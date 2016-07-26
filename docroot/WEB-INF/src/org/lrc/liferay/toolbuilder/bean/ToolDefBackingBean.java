package org.lrc.liferay.toolbuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ToolDefBackingBean extends AbstractBaseBean {
	
	@ManagedProperty(name = "factoryBean", value = "#{factoryBean}")
	private FactoryBean factoryBean;
	@ManagedProperty(name = "toolSession", value = "#{toolSession}")
	private ToolSession toolSession;

	public ToolDefBackingBean() {
		// TODO Auto-generated constructor stub
	}

}
