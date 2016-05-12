package integration;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;
import com.lrc.liferay.ram.bean.RamSession;
import com.lrc.liferay.ram.model.Assessment;
import com.lrc.liferay.ram.service.AssessmentLocalServiceUtil;

@RunWith(Arquillian.class)
public class PruebaIntegTest {

//	@Deployment
//	public static WebArchive createDeployment() {
//		return WebArchiveBuilder.build();
//	}
	
//	@Deployment
//	public static WebArchive createDeployment() {
//		return ShrinkWrap.create(WebArchive.class, "holita.war");
//	}
	
	@Test
	public void pruebaTest() throws SystemException {
//		List<Assessment> assessments = AssessmentLocalServiceUtil.getAssessments(10181);
//		assertFalse("Non empty list", assessments.isEmpty());

//		User user = UserLocalServiceUtil.createUser(CounterLocalServiceUtil.increment());
//		if (Validator.isNotNull(user))
//			assert(true);
//		else
//			assert(false);
		
		int count = AssessmentLocalServiceUtil.getAssessmentsCount();
		
		assertEquals(5, count);
	}

	@Test
	public void pruebaTest2() throws SystemException {
//		List<Assessment> assessments = AssessmentLocalServiceUtil.getAssessments(10181);
//		assertFalse("Non empty list", assessments.isEmpty());

//		User user = UserLocalServiceUtil.createUser(CounterLocalServiceUtil.increment());
//		if (Validator.isNotNull(user))
//			assert(true);
//		else
//			assert(false);
		
		LiferayFacesContext liferayFacesContext = LiferayFacesContext.getInstance();
		System.out.println("LiferayFacesContext.getInstance() es " + liferayFacesContext);
		
		long groupId = liferayFacesContext.getScopeGroupId();
		System.out.println(groupId);
		
//		RamSession ramSession = new RamSession();
//		
//		List<Assessment> assessments = ramSession.getAssessments();
//		
//		assertEquals(5, assessments.size());
	}

}
