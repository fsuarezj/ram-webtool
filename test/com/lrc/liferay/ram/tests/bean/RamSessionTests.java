package com.lrc.liferay.ram.tests.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;
import com.lrc.liferay.ram.bean.RamSession;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.AssessmentLocalServiceUtil;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Parameterized.class)
@PrepareForTest({AssessmentLocalServiceUtil.class, LiferayFacesContext.class})
public class RamSessionTests {
	private RamSession ramSession;
	private List<Assessment> assessments;
	private int size;
	private long groupId;
	private static List<Assessment> assessmentMocks = new ArrayList<Assessment>();
	
	@Before
	public void initTests() throws SystemException {
		
		PowerMockito.suppress(PowerMockito.constructor(LiferayFacesContext.class));
		PowerMockito.mockStatic(LiferayFacesContext.class);
		LiferayFacesContext mock = PowerMockito.mock(LiferayFacesContext.class);
		PowerMockito.when(LiferayFacesContext.getInstance()).thenReturn(mock);
		PowerMockito.when(mock.getScopeGroupId()).thenReturn(this.groupId);

		PowerMockito.mockStatic(AssessmentLocalServiceUtil.class);
		PowerMockito.when(AssessmentLocalServiceUtil.getAssessments(this.groupId)).
			thenReturn(this.assessments);

	}
	
//	public RamSessionTests() {
//		this.ramSession = new RamSession();
//	}
	
	public RamSessionTests(List<Assessment> assessments, int size, int groupId) {
		this.ramSession = new RamSession();
		this.assessments = assessments;
		this.size = size;
		this.groupId = groupId;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameters (name = "{index} assessments in the list, groupId = {2}")
	public static Collection assessments() {

		for (int i = 0; i < 4; i++) {
			assessmentMocks.add(PowerMockito.mock(Assessment.class));
			assessmentMocks.get(i).setAssessmentId(i);
			assessmentMocks.get(i).setName("Assessment" + ((Integer) i).toString());
			assessmentMocks.get(i).setStep(i);
		}

		return Arrays.asList(new Object [][] {
			{new ArrayList<Assessment>(), 0, 0},
			{Arrays.asList(new Assessment [] {
					assessmentMocks.get(1)
			}), 1, 1},
			{Arrays.asList(new Assessment [] {
					assessmentMocks.get(1),
					assessmentMocks.get(2)
			}), 2, 2},
			{Arrays.asList(new Assessment [] {
					assessmentMocks.get(1),
					assessmentMocks.get(2),
					assessmentMocks.get(3)
			}), 3, 3},
		});
	}

	@Test
	public void getAssessments() throws SystemException {

		List<Assessment> aux = this.ramSession.getAssessments();
		
		assertEquals("Test Assessments size", this.size, aux.size());
		assertFalse("Not working on assessment at the beginning", this.ramSession.isWorkingOnAssessment());
		assertEquals("Selected Assessment is null at the beginning", null, this.ramSession.getSelectedAssessment());
		this.ramSession.selectAssessment(assessmentMocks.get(1));
		assertTrue("It is working on assessment", ramSession.isWorkingOnAssessment());

		// If it has assessmentMocks[1] remove it
		PowerMockito.when(AssessmentLocalServiceUtil.deleteAssessment(this.ramSession.getSelectedAssessment())).
			thenReturn(this.ramSession.getSelectedAssessment());
		assertEquals("deleteAssessment correct", "mainView.xhtml", this.ramSession.deleteAssessment());
		aux = this.ramSession.getAssessments();
		assertEquals("Test Assessments size after deleting", this.size == 0? this.size: this.size - 1, aux.size());

		// Add assessmentMocks[0]
		this.ramSession.selectAssessment(assessmentMocks.get(0));
		PowerMockito.when(AssessmentLocalServiceUtil.addAssessment(this.ramSession.getSelectedAssessment())).
			thenReturn(this.ramSession.getSelectedAssessment());
		this.ramSession.saveAssessment();
		assertEquals("Test Assessments size", this.size == 0? 1: this.size, aux.size());
		
		PowerMockito.verifyStatic();

//		this.ramSession.selectAssessment(assessmentMocks.get(2));
//		PowerMockito.when(AssessmentLocalServiceUtil.updateAssessment(this.ramSession.getSelectedAssessment())).
//			thenReturn(this.ramSession.getSelectedAssessment());
//		this.ramSession.saveAssessment();
//		assertEquals("Test Assessments size", this.size, aux.size());
//		assertEquals("Selected Assessment is null at the beginning", 2, this.ramSession.getSelectedAssessment().getAssessmentId());
//		this.ramSession.saveAssessment();
//		assertEquals("Selected Assessment is null at the beginning", null, this.ramSession.getSelectedAssessment().getAssessmentId());
//
	}

}
