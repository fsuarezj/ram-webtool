package org.lrc.liferay.toolbuilder.bean;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.lrc.liferay.toolbuilder.NoSuchToolDefDBEException;
import org.lrc.liferay.toolbuilder.StepFactory;
import org.lrc.liferay.toolbuilder.ToolDef;
import org.lrc.liferay.toolbuilder.model.ToolDefDBE;
import org.lrc.liferay.toolbuilder.service.ToolDefDBELocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(eager = true)
//@ManagedBean(eager = true)
@ApplicationScoped
public class FactoryBean extends AbstractBaseBean implements Serializable {

	private static final long serialVersionUID = 7484141348342418895L;
	private static Map<String, ToolDef> toolDefs = new HashMap<String, ToolDef>();

	public FactoryBean() throws SystemException, PortalException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		new StepFactory();
		List<ToolDefDBE> toolDefDBEs = ToolDefDBELocalServiceUtil.getToolDefDBEs(com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS, com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
		for (ToolDefDBE toolDefDBE: toolDefDBEs) {
			toolDefs.put(toolDefDBE.getToolName(), new ToolDef(toolDefDBE));
		}
	}
	
	public static ToolDef getToolDef(String toolName) throws SystemException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, PortalException {
		ToolDef result;
		if (toolDefs.containsKey(toolName)) {
			System.out.println("Looking for the existing tool " + toolName);
			result = toolDefs.get(toolName);
		} else if (toolName.equals("Test Tool")) {
			result = new ToolDef("Test Tool");
			System.out.println("Creando Test Tool = " + result);
			toolDefs.put(toolName, result);
		} else {
			try {
				System.out.println("Va a buscar la tool def con nombre " + toolName);
				ToolDefDBE toolDefDBE = ToolDefDBELocalServiceUtil.getToolDefDBE(toolName);
				System.out.println("Ha encontrado la tool def con nombre " + toolName);
				result = new ToolDef(toolDefDBE);
			} catch (NoSuchToolDefDBEException e) {
				// TODO: Declare Specific Exception
				// throw new Exception("None tool with given name");
				System.out.println("No la encuentra");
				result = null;
			}
		}
		return result;
	}

}
