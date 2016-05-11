package com.lrc.liferay.ram.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.AssessmentLocalServiceUtil;

@ManagedBean
@SessionScoped
public class RamSession extends AbstractBaseBean implements Serializable{
	
	private static final long serialVersionUID = 4205262693196822283L;
	private static final String mainView = "mainView.xhtml";
	private static final String assessmentView = "assessmentView.xhtml";
	
	Assessment selectedAssessment;
	List<Assessment> assessments;
	private boolean workingOnAssessment;

	private String auxText;
	
	@PostConstruct
	public void postConstruct() {
		this.workingOnAssessment = false;
		this.auxText = "Beginning";
	}
	
	public void saveAssessment() {

		try {
			// If the assessment is being created goes to Step 1
			if (this.selectedAssessment.getStep() == 0)
				this.selectedAssessment.stepForward();

			// Persistence connection
			if (this.selectedAssessment.getAssessmentId() == 0) {
				this.selectedAssessment = AssessmentLocalServiceUtil.addAssessment(this.selectedAssessment);
				// Include assessment on list
				this.assessments.add(this.selectedAssessment);
			}
			else
				this.selectedAssessment = AssessmentLocalServiceUtil.updateAssessment(this.selectedAssessment);
			

		} catch (Exception e) {
			this.addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
	}
	
	public String cancelAssessment() {
		this.selectedAssessment = null;
		this.workingOnAssessment = false;
		return RamSession.mainView;
	}
	
	public String deleteAssessment() {
		try {
			AssessmentLocalServiceUtil.deleteAssessment(this.selectedAssessment);
			this.assessments.remove(this.selectedAssessment);
		} catch (Exception e) {
			this.addGlobalUnexpectedErrorMessage();
			logger.error(e);
		}
		return RamSession.mainView;
	}
	
	public String selectAssessment(Assessment assessment) {
		this.auxText = "Assessment selected";
		this.workingOnAssessment = true;
		this.selectedAssessment = assessment;
		return RamSession.assessmentView;
	}
	
	public boolean isWorkingOnAssessment() {
		return this.workingOnAssessment;
	}

	public String getAuxText() {
		return this.auxText;
	}
	
	public Assessment getSelectedAssessment() {
		return this.selectedAssessment;
	}
	
	public List<Assessment> getAssessments() {
		// TODO: Mensajes entre SessionBeans cuando haya modificación del listado disponible para un usuario
		// TODO: Criterios de búsqueda (nombre del RAM, permisos, etc)
		if (this.assessments == null) {
			this.assessments = new ArrayList<Assessment>();
			long groupId = LiferayFacesContext.getInstance().getScopeGroupId();
			
			try {
				List<Assessment> list = AssessmentLocalServiceUtil.getAssessments(groupId);
				for (Assessment assessment : list)
					this.assessments.add(assessment);
			} catch (Exception e) {
				logger.error(e);
			}
		}
		return this.assessments;
	}
}
