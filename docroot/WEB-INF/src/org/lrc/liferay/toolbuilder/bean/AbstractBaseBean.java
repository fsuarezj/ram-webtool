package org.lrc.liferay.toolbuilder.bean;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

/**
 * @author Fernando Suárez
 * Abstract class to be heritated by the bean classes
 */
abstract class AbstractBaseBean {
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractBaseBean.class);
	
	protected static final String UNEXPECTED_ERROR_MSG_ID = "an-unexpected-error-ocurred";
	protected static final String SUCCESS_INFO_MSG_ID = "your-request-processed-successfully";
	
	/**
	 * Shows a global success info message
	 */
	public void addGlobalSuccessInfoMessage() {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		liferayFacesContext.addGlobalSuccessInfoMessage();
	}
	
	/**
	 * Shows a global unexpected error message
	 */
	public void addGlobalUnexpectedErrorMessage() {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		liferayFacesContext.addGlobalUnexpectedErrorMessage();
	}
	
	/**
	 * Shows an error message
	 * @param errorMessage is the error messaged to be shown
	 */
	public void addGlobalErrorMessage(String errorMessage) {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		liferayFacesContext.addGlobalErrorMessage(errorMessage);
	}

}
