package org.lrc.liferay.toolbuilder.bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.lrc.liferay.toolbuilder.ToolDef;

@ManagedBean
@ApplicationScoped
public class FactoryBean extends AbstractBaseBean {
	private Map<String, ToolDef> toolDefs;

	public FactoryBean() {
		// TODO Auto-generated constructor stub

		toolDefs = new HashMap<String, ToolDef>();
	}

}
