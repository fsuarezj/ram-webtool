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
import org.lrc.liferay.toolbuilder.ToolInstance;
import org.lrc.liferay.toolbuilder.bean.ToolSession;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Parameterized.class)
@PrepareForTest({ToolInstanceLocalServiceUtil.class, LiferayFacesContext.class})
public class ToolSessionTests {
	private ToolSession toolSession;
	private List<ToolInstance> toolInstances;
	private List<org.lrc.liferay.toolbuilder.model.ToolInstance> instances;
	private int size;
	private long groupId;
	private static List<ToolInstance> instanceMocks = new ArrayList<ToolInstance>();
	
	@Before
	public void initTests() throws SystemException {
		
		PowerMockito.suppress(PowerMockito.constructor(LiferayFacesContext.class));
		PowerMockito.mockStatic(LiferayFacesContext.class);
		LiferayFacesContext mock = PowerMockito.mock(LiferayFacesContext.class);
		PowerMockito.when(LiferayFacesContext.getInstance()).thenReturn(mock);
		PowerMockito.when(mock.getScopeGroupId()).thenReturn(this.groupId);

		PowerMockito.mockStatic(ToolInstanceLocalServiceUtil.class);
		PowerMockito.when(ToolInstanceLocalServiceUtil.getToolInstances(this.groupId)).
			thenReturn(this.instances);

	}
	
//	public RamSessionTests() {
//		this.ramSession = new RamSession();
//	}
	
	public ToolSessionTests(List<ToolInstance> toolInstances, int size, int groupId) {
		this.toolSession = new ToolSession();
		this.toolInstances = toolInstances;
		this.size = size;
		this.groupId = groupId;
	}
	
	@SuppressWarnings("rawtypes")
	@Parameters (name = "{index} instances in the list, groupId = {2}")
	public static Collection instances() {

		for (int i = 0; i < 4; i++) {
			instanceMocks.add(PowerMockito.mock(ToolInstance.class));
//			instanceMocks.get(i).setToolInstanceId(i);
//			instanceMocks.get(i).setName("ToolInstance" + ((Integer) i).toString());
//			instanceMocks.get(i).setStep(i);
		}

		return Arrays.asList(new Object [][] {
			{new ArrayList<ToolInstance>(), 0, 0},
			{Arrays.asList(new ToolInstance [] {
					instanceMocks.get(1)
			}), 1, 1},
			{Arrays.asList(new ToolInstance [] {
					instanceMocks.get(1),
					instanceMocks.get(2)
			}), 2, 2},
			{Arrays.asList(new ToolInstance [] {
					instanceMocks.get(1),
					instanceMocks.get(2),
					instanceMocks.get(3)
			}), 3, 3},
		});
	}

	@Test
	public void getToolInstances() throws SystemException, PortalException {

		List<ToolInstance> aux = this.toolSession.getToolInstances();
		
		assertEquals("Test ToolInstances size", this.size, aux.size());
		assertFalse("Not working on instance at the beginning", this.toolSession.isWorkingOnToolInstance());
		assertEquals("Selected ToolInstance is null at the beginning", null, this.toolSession.getSelectedToolInstance());
		this.toolSession.selectToolInstance(instanceMocks.get(1));
		assertTrue("It is working on instance", toolSession.isWorkingOnToolInstance());

		// If it has instanceMocks[1] remove it
		PowerMockito.when(ToolInstanceLocalServiceUtil.deleteToolInstance(this.toolSession.getSelectedToolInstance().getToolInstanceId())).thenReturn(this.toolSession.getSelectedToolInstance());
		assertEquals("deleteToolInstance correct", "mainView.xhtml", this.toolSession.deleteToolInstance());
		aux = this.toolSession.getToolInstances();
		assertEquals("Test ToolInstances size after deleting", this.size == 0? this.size: this.size - 1, aux.size());

		// Add instanceMocks[0]
		this.toolSession.selectToolInstance(instanceMocks.get(0));
		PowerMockito.when(ToolInstanceLocalServiceUtil.addToolInstance(this.toolSession.getSelectedToolInstance())).
			thenReturn(this.toolSession.getSelectedToolInstance());
		this.toolSession.saveToolInstance();
		assertEquals("Test ToolInstances size", this.size == 0? 1: this.size, aux.size());
		
		PowerMockito.verifyStatic();

//		this.ramSession.selectToolInstance(instanceMocks.get(2));
//		PowerMockito.when(ToolInstanceLocalServiceUtil.updateToolInstance(this.ramSession.getSelectedToolInstance())).
//			thenReturn(this.ramSession.getSelectedToolInstance());
//		this.ramSession.saveToolInstance();
//		assertEquals("Test ToolInstances size", this.size, aux.size());
//		assertEquals("Selected ToolInstance is null at the beginning", 2, this.ramSession.getSelectedToolInstance().getToolInstanceId());
//		this.ramSession.saveToolInstance();
//		assertEquals("Selected ToolInstance is null at the beginning", null, this.ramSession.getSelectedToolInstance().getToolInstanceId());
//
	}

}
