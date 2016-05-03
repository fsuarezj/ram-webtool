package com.lrc.liferay.ram.utils.flowcharts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.TreeMap;

import org.junit.Test;

import com.lrc.liferay.ram.utils.flowcharts.BasicNode;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeContentException;

public class BasicNodeTests {
	
	@Test (expected = NodeContentException.class)
	public void throwNullNodeContent() throws NodeContentException {
		BasicNode nodeNull = new BasicNode(null);
		assertEquals("Content = null","This does not execute",nodeNull.nextNode(1));
	}

	@Test
	public void nextNodeTest() throws NodeContentException {
		TreeMap nullEdges = null;
		TreeMap emptyEdges = new TreeMap();
		TreeMap edges = new TreeMap();
		edges.put(1,0);
		edges.put(2,0);

		BasicNode node1 = new BasicNode(123);
		BasicNode node2 = new BasicNode(123,nullEdges);
		BasicNode node3 = new BasicNode(123,emptyEdges);
		BasicNode node4 = new BasicNode(123,edges);
		
		assertEquals("Edges are undefined",null,node1.nextNode(1));
		assertEquals("Edges are 'null'",null,node2.nextNode(1));
		assertEquals("Edges are empty",null,node3.nextNode(1));
		assertEquals("Next edge of 1 does not exists",null,node4.nextNode(3));
		assertEquals("Next edge of 1 is 0",(Integer) 0,node4.nextNode(1));
	}

	@Test
	public void addEdgeTest() throws NodeContentException {
		BasicNode node = new BasicNode("Node 0");
		
		node.addEdge(true, 3);
		node.addEdge(false, 2);
		assertEquals("Next edge for true is 3",(Integer) 3,node.nextNode(true));
		
		node.addEdge(true, 1);
		assertEquals("Next edge for true is 3",(Integer) 1,node.nextNode(true));
	}
	
	@Test
	public void edgesOpsTest() throws NodeContentException {
		BasicNode node = new BasicNode("Node 0");
		BasicNode node2 = new BasicNode("Node 0");
		
		node.addEdge("Uno", 1);
		node.addEdge("Dos", 2);
		node.addEdge("Tres", 3);
		
		assertEquals("Next edge ",(Integer) 1,node.nextNode("Uno"));
		node.changeEdgesIndex(1, 5);
		assertEquals("Edges size ",(Integer) 3,node.edgesNumber());
		assertEquals("changeEdgesIndex ",(Integer) 5,node.nextNode("Uno"));
		node.removeEdgeByCondition("Dos");
		assertEquals("Remove edge ",null,node.nextNode("Dos"));
		node.addEdge("Dos", 5);
		node.removeEdgeByNode(5);
		assertEquals("Add edge ",null,node.nextNode("Uno"));
		assertEquals("Add edge ",null,node.nextNode("Dos"));
		node.addEdge("Tres",4);
		assertEquals("Add edge ",(Integer) 4,node.nextNode("Tres"));
		assertEquals("Edges size ",(Integer) 1,node.edgesNumber());
		assertTrue("Equals",node.equals(node2));
	}
}
