package com.lrc.liferay.ram.utils.flowcharts.tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.lrc.liferay.ram.utils.flowcharts.BasicFlowChart;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.ExistingNodeException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.ModifiedFlowException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NonExistingNodeException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NullNodeContentException;

public class BasicFlowChartTests {
	
	private BasicFlowChart<Integer,Boolean> buildDecisionTree() throws NullNodeContentException, ExistingNodeException, NonExistingNodeException {
		BasicFlowChart<Integer,Boolean> flowChart = new BasicFlowChart<Integer,Boolean>(0);
		flowChart.addNode(1);
		flowChart.addEdge(0, true, 1);
		flowChart.addNode(2);
		flowChart.addEdge(0, false, 2);
		flowChart.addNode(3);
		flowChart.addEdge(1, true, 3);
		return flowChart;
	}

	private BasicFlowChart<Integer,Boolean> buildErrorTree() throws NullNodeContentException, ExistingNodeException, NonExistingNodeException {
		BasicFlowChart<Integer,Boolean> flowChart = new BasicFlowChart(0);
		flowChart.addNode(1);
		flowChart.addNode(2);
		return flowChart;
	}

	@Test (expected = NullNodeContentException.class)
	public void throwNullNodeContent() throws NullNodeContentException {
		BasicFlowChart flowChart = new BasicFlowChart(null);
	}
	
	@Test
	public void oneNodeTests() throws NullNodeContentException {
		BasicFlowChart flowChart1 = new BasicFlowChart("Begin");
		BasicFlowChart<Boolean,Boolean> flowChart2 = new BasicFlowChart(true);
		
		assertTrue("Get Boolean Node", flowChart2.getNodeContent(0));
		assertEquals("Get String Node", "Begin", flowChart1.getNodeContent(0));
		assertEquals("Size", 1, flowChart2.size());
	}

	@Test (expected = ExistingNodeException.class)
	public void addNodeExistingNode() throws NullNodeContentException, ExistingNodeException, NonExistingNodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addNode(2);
	}

	@Test
	public void addFirstNodeTests()
			throws NullNodeContentException, ExistingNodeException, NonExistingNodeException, ModifiedFlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addFirstNode(4);
		flowChart.addEdge(4, true, 0);

		assertEquals("addFirstNode", 4, flowChart.getNodeContent(0));
		assertEquals("addFirstNode", 0, flowChart.getNodeContent(4));
		assertEquals("Remove edges when change?", (Integer) 4, flowChart.getNextState(new Date(), 0, true));
	}

	@Test (expected = ExistingNodeException.class)
	public void addFirstNodeExistingNode() throws NullNodeContentException, ExistingNodeException, NonExistingNodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.addFirstNode(2);
	}

	@Test
	public void setFirstNodeTests()
			throws NullNodeContentException, ExistingNodeException, NonExistingNodeException, ModifiedFlowException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.setFirstNode(1);
		flowChart.addEdge(1, false, 0);

		assertEquals("Node 0 is 1", 1, flowChart.getNodeContent(0));
		assertEquals("Node 1 is 0", 0, flowChart.getNodeContent(1));
		assertEquals("From 1 to 0", (Integer) 1, flowChart.getNextState(new Date(), 0, false));
		assertEquals("From 0 to 1", (Integer) 0, flowChart.getNextState(new Date(), 1, true));
		assertEquals("From 1 to 3", (Integer) 3, flowChart.getNextState(new Date(), 0, true));
	}

	@Test (expected = NonExistingNodeException.class)
	public void setFirstNodeNonExistingNode() throws NullNodeContentException, ExistingNodeException, NonExistingNodeException {
		BasicFlowChart flowChart = this.buildDecisionTree();
		flowChart.setFirstNode(4);
	}
}
