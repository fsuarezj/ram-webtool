package unit.com.lrc.liferay.ram.utils.flowcharts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.lrc.liferay.ram.utils.flowcharts.BasicFlowChart;
import com.lrc.liferay.ram.utils.flowcharts.Edge;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.FlowException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeContentException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeException;

public class BasicFlowChartTests {
	
	private BasicFlowChart<Integer,Boolean> buildDecisionTree() throws NodeContentException, NodeException {
		BasicFlowChart<Integer,Boolean> flowChart = new BasicFlowChart<Integer,Boolean>(0);
		flowChart.addNode(1);
		flowChart.addEdge(0, true, 1);
		flowChart.addNode(2);
		flowChart.addEdge(0, false, 2);
		flowChart.addNode(3);
		flowChart.addEdge(1, true, 3);
		return flowChart;
	}

	private BasicFlowChart<String,Boolean> buildStringDecisionTree() throws NodeContentException, NodeException {
		List<String> nodes = Arrays.asList("Zero", "One", "Two", "Three");
		List<Edge> edges = Arrays.asList(
				new Edge("Zero", true, "One"),
				new Edge("Zero", false, "True"),
				new Edge("One", true, "Three"));
		BasicFlowChart<String,Boolean> flowChart = new BasicFlowChart(nodes);
		return new BasicFlowChart(nodes, edges);
	}

	private BasicFlowChart<Integer,Boolean> buildErrorTree() throws NodeContentException, NodeException {
		BasicFlowChart<Integer,Boolean> flowChart = new BasicFlowChart(0);
		flowChart.addNode(1);
		flowChart.addNode(2);
		return flowChart;
	}

	@Test
	public void oneNodeTests() throws NodeContentException, NodeException {
		BasicFlowChart flowChart1 = new BasicFlowChart("Begin");
		BasicFlowChart<Boolean,Boolean> flowChart2 = new BasicFlowChart(true);
		
		assertEquals("Get String Node", "Begin", flowChart1.getNodeContent(0));
		assertTrue("Get Boolean Node", flowChart2.getNodeContent(0));
		assertEquals("Size", 1, flowChart2.size());
		assertTrue("Connected", flowChart1.isConnected());
		assertTrue("Connected", flowChart2.isConnected());
		flowChart1.addEdge("Begin", true, "Begin");
		assertTrue("Connected", flowChart1.isConnected());
	}

	@Test
	public void addFirstNodeTests()
			throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addFirstNode(4);
		flowChart.addEdge(4, true, 0);

		assertEquals("addFirstNode", 4, flowChart.getNodeContent(0));
		assertEquals("addFirstNode", 0, flowChart.getNodeContent(4));
		assertEquals("Remove edges when change?", (Integer) 4, flowChart.getNextState(new Date(), 0, true));
	}

	@Test
	public void setFirstNodeTests()	throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = this.buildStringDecisionTree();
		assertEquals("From 1 to 3", (Integer) 3, flowChart.getNextState(new Date(), 1, true));
		flowChart.setFirstNode("One");
		assertEquals("From 1 to 3", (Integer) 3, flowChart.getNextState(new Date(), 0, true));
		flowChart.addEdge("One", false, "Zero");

		assertEquals("Node 0 is 1", "One", flowChart.getNodeContent(0));
		assertEquals("Node 1 is 0", "Zero", flowChart.getNodeContent(1));
		assertEquals("From 1 to 0", (Integer) 1, flowChart.getNextState(new Date(), 0, false));
		assertEquals("From 0 to 1", (Integer) 0, flowChart.getNextState(new Date(), 1, true));
		assertEquals("From 1 to 3", (Integer) 3, flowChart.getNextState(new Date(), 0, true));
	}

	@Test
	public void bulkConstructorTests() throws NodeContentException, NodeException {
		List<String> nodes = Arrays.asList("Zero", "One", "Two", "Three");
		List<Edge> edges = Arrays.asList(
				new Edge("Zero", true, "One"),
				new Edge("Zero", false, "True"),
				new Edge("One", true, "Three"));
		BasicFlowChart<String,Boolean> flowChart = new BasicFlowChart(nodes);
		flowChart = new BasicFlowChart(nodes, edges);
	}

	@Test
	public void addNodeTests() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addNode(4);

		assertEquals("addFirstNode", 4, flowChart.getNodeContent(4));
		assertEquals("addFirstNode", 0, flowChart.getNodeContent(0));
	}

	@Test
	public void addEdgeTests() throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge(2, true, 3);

		assertEquals("addEdgeTest", (Integer) 3, flowChart.getNextState(new Date(),2,true));
		assertEquals("addEdgeTest", (Integer) 2, flowChart.getNextState(new Date(),2,false, true));
		assertEquals("addEdgeTest", (Integer) 3, flowChart.getNextState(new Date(),1,true));
		flowChart.addEdge(1, true, 0);
		assertEquals("addEdgeTest", (Integer) 0, flowChart.getNextState(new Date(),1,true));
		flowChart.addEdge(2, false, 4);
		assertEquals("addEdgeTest", (Integer) 4, flowChart.getNextState(new Date(),2,false));
	}
	
	@Test
	public void isConnectedTests() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		
		assertTrue("isConnected ", flowChart.isConnected());
		flowChart.addEdge(2, true, 4);
		assertTrue("isConnected ", flowChart.isConnected());
		flowChart.addEdge(2, false, 2);
		assertTrue("isConnected ", flowChart.isConnected());
		flowChart.addNode(5);
		assertFalse("isConnected ", flowChart.isConnected());
	}

	@Test
	public void getNodeContentTests() throws NodeContentException, FlowException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		
		assertEquals("getNodeContent", (Integer) 3, flowChart.getNodeContent(3));
	}

	@Test
	public void getNextStateTests() throws NodeContentException, FlowException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		
		assertEquals("getNextState", (Integer) 3, flowChart.getNextState(new Date(),3,true, true));
		assertEquals("getNextState", (Integer) 3, flowChart.getNextState(new Date(),1,true));
		assertEquals("getNextState", (Integer) 2, flowChart.getNextState(new Date(),0,false));
	}

	@Test (expected = NodeContentException.class)
	public void addEdgeNullContentTests() throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge(2, true, null);

		assertEquals("addEdgeTest", (Integer) 3, flowChart.getNextState(new Date(),2,true, true));
		assertEquals("addEdgeTest", (Integer) null, flowChart.getNextState(new Date(),2,true));
	}

	@Test (expected = NullPointerException.class)
	public void addEdgeNullEdgeTests() throws NodeContentException, NodeException, FlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge(2, null, 3);

		assertEquals("addEdgeTest", (Integer) 3, flowChart.getNextState(new Date(),2,true, true));
		assertEquals("addEdgeTest", (Integer) null, flowChart.getNextState(new Date(),2,true));
	}

	@Test (expected = NullPointerException.class)
	public void throwNullNodeContent() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = new BasicFlowChart(null);
	}
		
	@Test (expected = NodeException.class)
	public void addNodeExistingNode() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addNode(2);
	}

	@Test (expected = NodeException.class)
	public void addFirstNodeExistingNode() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addFirstNode(2);
	}

	@Test (expected = NodeException.class)
	public void setFirstNodeNonExistingNode() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.setFirstNode("Four");
	}

	@Test (expected = NodeContentException.class)
	public void addNodeNullNodeContent() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildStringDecisionTree();
		flowChart.addNode(null);
	}

	@Test (expected = NodeContentException.class)
	public void addNodeBadType() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildStringDecisionTree();
		flowChart.addNode(5);
	}
	
	@Test (expected = NodeContentException.class)
	public void addNodeBadType2() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addNode("Hola");
	}

	@Test (expected = NodeException.class)
	public void addEdgeNodeException() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge(4, true, 3);
	}

	@Test (expected = NodeException.class)
	public void addEdgeNodeException2() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge("Jeje", true, 3);
	}

	@Test (expected = NodeContentException.class)
	public void addEdgeNodeException3() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addEdge(2, true, "Juju");
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void getNodeContentOutOfBoundsException() throws NodeContentException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		assertEquals("addFirstNode", (Integer) 5, flowChart.getNodeContent(5));
	}

	@Test (expected = FlowException.class)
	public void getNextStateFlowException() throws NodeContentException, FlowException, NodeException, InterruptedException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		assertEquals("getNextState", (Integer) 3, flowChart.getNextState(new Date(),3,false));
		flowChart.addEdge(3, false, 2);
		Thread.sleep(1);
		assertEquals("getNextState", (Integer) 2, flowChart.getNextState(new Date(),3,false));
	}

	@Test (expected = IndexOutOfBoundsException.class)
	public void getNextStateOutOfBoundsException() throws NodeContentException, FlowException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		assertEquals("getNextState", (Integer) 3, flowChart.getNextState(new Date(),4,false));
	}

	@Test (expected = ClassCastException.class)
	public void getNextStateBadConditionException() throws NodeContentException, FlowException, NodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		assertEquals("getNextState", (Integer) 3, flowChart.getNextState(new Date(),0,3));
	}
}
