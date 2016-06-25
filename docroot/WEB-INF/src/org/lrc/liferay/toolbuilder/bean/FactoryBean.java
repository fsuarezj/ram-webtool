package org.lrc.liferay.toolbuilder.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.lrc.liferay.toolbuilder.StepFactory;

import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(eager = true)
@ApplicationScoped
public class FactoryBean extends AbstractBaseBean {

	public FactoryBean() throws SystemException {
		new StepFactory();
	}

}
