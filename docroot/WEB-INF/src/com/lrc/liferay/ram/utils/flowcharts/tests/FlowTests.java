package com.lrc.liferay.ram.utils.flowcharts.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lrc.liferay.ram.utils.flowcharts.BasicFlowChart;
import com.lrc.liferay.ram.utils.flowcharts.Flow;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeContentException;

public class FlowTests {
	
	private BasicFlowChart createOneNodeFlowChart() throws NodeContentException {
		return new BasicFlowChart("Nodo 0");
	}

	@Test
	public void testFlow() throws NodeContentException {
		Flow<String,Boolean> flow = new Flow(createOneNodeFlowChart());
		assertEquals("Current step without begining flow must be 'Nodo 0'","Nodo 0", flow.getCurrentStep());
	}

}
