package integration;

import static org.junit.Assert.assertEquals;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lrc.liferay.toolbuilder.service.ToolInstanceLocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

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
//		List<Instance> instances = InstanceLocalServiceUtil.getInstances(10181);
//		assertFalse("Non empty list", instances.isEmpty());

//		User user = UserLocalServiceUtil.createUser(CounterLocalServiceUtil.increment());
//		if (Validator.isNotNull(user))
//			assert(true);
//		else
//			assert(false);
		
		int count = ToolInstanceLocalServiceUtil.getToolInstancesCount();
		
		assertEquals(5, count);
	}

	@Test
	public void pruebaTest2() throws SystemException {
//		List<Instance> instances = InstanceLocalServiceUtil.getInstances(10181);
//		assertFalse("Non empty list", instances.isEmpty());

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
//		List<Instance> instances = ramSession.getInstances();
//		
//		assertEquals(5, instances.size());
	}

}
