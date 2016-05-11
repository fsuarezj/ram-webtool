package integration;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.liferay.ant.arquillian.WebArchiveBuilder;
import com.liferay.portal.kernel.exception.SystemException;
import com.lrc.liferay.ram.service.AssessmentLocalServiceUtil;

@RunWith(Arquillian.class)
public class PruebaIntegTest {

	@BeforeClass
	public static void initClass() {
		System.setProperty("java.io.tmpdir", "/home/ferda/tmp");
	}
		
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
		
		assertEquals(0, count);
	}

}
