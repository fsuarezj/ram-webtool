package unit.org.lrc.liferay.toolbuilder.bean;

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
import org.lrc.liferay.toolbuilder.bean.RamSession;
import org.lrc.liferay.toolbuilder.model.Instance;
import org.lrc.liferay.toolbuilder.service.InstanceLocalServiceUtil;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Parameterized.class)
@PrepareForTest({InstanceLocalServiceUtil.class, LiferayFacesContext.class})
public class RamSessionTests {
	private RamSession ramSession;
	private List<Instance> instances;
	private int size;
	private long groupId;
	private static List<Instance> instanceMocks = new ArrayList<Instance>();
	
	@Before
	public void initTests() throws SystemException {
		
		PowerMockito.suppress(PowerMockito.constructor(LiferayFacesContext.class));
		PowerMockito.mockStatic(LiferayFacesContext.class);
		LiferayFacesContext mock = PowerMockito.mock(LiferayFacesContext.class);
		PowerMockito.when(LiferayFacesContext.getInstance()).thenReturn(mock);
		PowerMockito.when(mock.getScopeGroupId()).thenReturn(this.groupId);

		PowerMockito.mockStatic(InstanceLocalServiceUtil.class);
		PowerMockito.when(InstanceLocalServiceUtil.getInstances(this.groupId)).
			thenReturn(this.instances);

	}
	
//	public RamSessionTests() {
//		this.ramSession = new RamSession();
//	}
	
	public RamSessionTests(List<Instance> instances, int size, int groupId) {
		this.ramSession = new RamSession();
		this.instances = instances;
		this.size = size;
		this.groupId = groupId;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameters (name = "{index} instances in the list, groupId = {2}")
	public static Collection instances() {

		for (int i = 0; i < 4; i++) {
			instanceMocks.add(PowerMockito.mock(Instance.class));
//			instanceMocks.get(i).setInstanceId(i);
//			instanceMocks.get(i).setName("Instance" + ((Integer) i).toString());
//			instanceMocks.get(i).setStep(i);
		}

		return Arrays.asList(new Object [][] {
			{new ArrayList<Instance>(), 0, 0},
			{Arrays.asList(new Instance [] {
					instanceMocks.get(1)
			}), 1, 1},
			{Arrays.asList(new Instance [] {
					instanceMocks.get(1),
					instanceMocks.get(2)
			}), 2, 2},
			{Arrays.asList(new Instance [] {
					instanceMocks.get(1),
					instanceMocks.get(2),
					instanceMocks.get(3)
			}), 3, 3},
		});
	}

	@Test
	public void getInstances() throws SystemException {

		List<Instance> aux = this.ramSession.getInstances();
		
		assertEquals("Test Instances size", this.size, aux.size());
		assertFalse("Not working on instance at the beginning", this.ramSession.isWorkingOnInstance());
		assertEquals("Selected Instance is null at the beginning", null, this.ramSession.getSelectedInstance());
		this.ramSession.selectInstance(instanceMocks.get(1));
		assertTrue("It is working on instance", ramSession.isWorkingOnInstance());

		// If it has instanceMocks[1] remove it
		PowerMockito.when(InstanceLocalServiceUtil.deleteInstance(this.ramSession.getSelectedInstance())).
			thenReturn(this.ramSession.getSelectedInstance());
		assertEquals("deleteInstance correct", "mainView.xhtml", this.ramSession.deleteInstance());
		aux = this.ramSession.getInstances();
		assertEquals("Test Instances size after deleting", this.size == 0? this.size: this.size - 1, aux.size());

		// Add instanceMocks[0]
		this.ramSession.selectInstance(instanceMocks.get(0));
		PowerMockito.when(InstanceLocalServiceUtil.addInstance(this.ramSession.getSelectedInstance())).
			thenReturn(this.ramSession.getSelectedInstance());
		this.ramSession.saveInstance();
		assertEquals("Test Instances size", this.size == 0? 1: this.size, aux.size());
		
		PowerMockito.verifyStatic();

//		this.ramSession.selectInstance(instanceMocks.get(2));
//		PowerMockito.when(InstanceLocalServiceUtil.updateInstance(this.ramSession.getSelectedInstance())).
//			thenReturn(this.ramSession.getSelectedInstance());
//		this.ramSession.saveInstance();
//		assertEquals("Test Instances size", this.size, aux.size());
//		assertEquals("Selected Instance is null at the beginning", 2, this.ramSession.getSelectedInstance().getInstanceId());
//		this.ramSession.saveInstance();
//		assertEquals("Selected Instance is null at the beginning", null, this.ramSession.getSelectedInstance().getInstanceId());
//
	}

}
