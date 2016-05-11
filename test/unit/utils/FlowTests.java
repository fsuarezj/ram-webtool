package unit.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.lrc.liferay.ram.utils.flowcharts.BasicFlowChart;
import com.lrc.liferay.ram.utils.flowcharts.Flow;
import com.lrc.liferay.ram.utils.flowcharts.PermissiveFlow;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.FlowException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeContentException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeException;

public class FlowTests {
	final String NODE1 = "Use local markets to buy or sell commodities?";
	final String NODE2 = "Physical able to access local markets?";
	final String NODE3 = "Stop the RAM, long term dev projects";
	final String NODE4 = "Require assistance to access commodities?";
	final String NODE5 = "Can aspect restricting access be overcome?";
	final String NODE6 = "Identify markets to be assessed";
	final String NODE7 = "Stop the RAM, other needs and assistance necessary";

	
	private BasicFlowChart createOneNodeFlowChart() throws NodeContentException {
		return new BasicFlowChart("Node 0");
	}

	private BasicFlowChart createStringFlowChart() throws NodeContentException, NodeException {
		BasicFlowChart<String,Boolean> flowChart = new BasicFlowChart(NODE1);
		flowChart.addEdge(NODE1, true, NODE2);
		flowChart.addNode(NODE3);
		flowChart.addEdge(NODE1, false, NODE3);
		flowChart.addEdge(NODE2, true, NODE4);
		flowChart.addEdge(NODE2, false, NODE5);
		flowChart.addEdge(NODE4, true, NODE6);
		flowChart.addEdge(NODE5, true, NODE6);
		flowChart.addEdge(NODE5, false, NODE7);
		
		return flowChart;
	}

	@Test
	public void OneNodeTests() throws NodeContentException, FlowException {
		PermissiveFlow pFlow = new PermissiveFlow(createOneNodeFlowChart());
		Flow flow = new Flow(createOneNodeFlowChart());

		assertEquals("Current step without begining flow must be 'Node 0'","Node 0", pFlow.getCurrentStep());
		assertEquals("Next step must be 'Node 0'","Node 0", pFlow.nextStep(true));
		assertEquals("Next step must be 'Node 0'","Node 0", pFlow.nextStep("hola"));
		try {
			assertEquals("Next step must be 'Node 0'","Node 0", flow.nextStep(true));
		} catch (FlowException e) {
			if (e.getType() == FlowException.NO_EXISTING_EDGES)
				assertEquals("Current step without begining flow must be 'Node 0'","Node 0", flow.getCurrentStep());
		}
		try {
			assertEquals("Next step must be 'Node 0'","Node 0", flow.nextStep("hola"));
		} catch (FlowException e) {
			if (e.getType() == FlowException.NO_EXISTING_EDGES)
				assertEquals("Current step without begining flow must be 'Node 0'","Node 0", flow.getCurrentStep());
		}
	}

	@Test
	public void nextStepTests() throws NodeContentException, NodeException, FlowException {
		Flow flow = new Flow(createStringFlowChart());
		
		assertEquals("Next step must be '" + NODE2 + "'", NODE2, flow.nextStep(true));
		assertEquals("Current step must be '" + NODE2 + "'", NODE2, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE5 + "'", NODE5, flow.nextStep(false));
		assertEquals("Current step must be '" + NODE5 + "'", NODE5, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE6 + "'", NODE6, flow.nextStep(true));
		assertEquals("Current step must be '" + NODE6 + "'", NODE6, flow.getCurrentStep());
		assertTrue("'" + NODE6 + "' is Final", flow.currentIsFinal());
	}

	public void nextStepTests2() throws NodeContentException, NodeException, FlowException {
		Flow flow = new Flow(createStringFlowChart());
		
		assertEquals("Next step must be '" + NODE3 + "'", NODE3, flow.nextStep(false));
		assertEquals("Current step must be '" + NODE3 + "'", NODE3, flow.getCurrentStep());
		assertTrue("'" + NODE3 + "' is Final", flow.currentIsFinal());
	}

	@Test
	public void nextStepRecursiveTests() throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = createStringFlowChart();
		flowChart.addEdge(NODE4, false, NODE4);
		Flow flow = new Flow(flowChart);
		
		assertEquals("Next step must be '" + NODE2 + "'", NODE2, flow.nextStep(true));
		assertEquals("Current step must be '" + NODE2 + "'", NODE2, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE4 + "'", NODE4, flow.nextStep(true));
		assertEquals("Current step must be '" + NODE4 + "'", NODE4, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE4 + "'", NODE4, flow.nextStep(false));
		assertEquals("Current step must be '" + NODE4 + "'", NODE4, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE4 + "'", NODE4, flow.nextStep(false));
		assertEquals("Current step must be '" + NODE4 + "'", NODE4, flow.getCurrentStep());
		assertEquals("Next step must be '" + NODE6 + "'", NODE6, flow.nextStep(true));
		assertEquals("Current step must be '" + NODE6 + "'", NODE6, flow.getCurrentStep());
		assertTrue("'" + NODE6 + "' is Final", flow.currentIsFinal());
	}

	@Test
	public void ProcessStepsTests() throws NodeContentException, NodeException, FlowException {
		Flow flow = new Flow(createStringFlowChart());
		Comparable[] conditions = {true, false, false};
		List<Boolean> conditions2 = Arrays.asList(true, false, false);

		assertEquals("Current step must be '" + NODE7 + "'", NODE7, flow.processSteps(conditions));
		flow.initFlow();
		assertEquals("Current step must be '" + NODE7 + "'", NODE7, flow.processSteps(conditions2));
	}

	@Test
	public void ProcessStepsRecursiveTests() throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = createStringFlowChart();
		flowChart.addEdge(NODE4, false, NODE4);
		Flow flow = new Flow(flowChart);
		List<Boolean> conditions = Arrays.asList(true, true, false, false, true);

		assertEquals("Current step must be '" + NODE6 + "'", NODE6, flow.processSteps(conditions));
		assertTrue("'" + NODE6 + "' is Final", flow.currentIsFinal());
	}
}
