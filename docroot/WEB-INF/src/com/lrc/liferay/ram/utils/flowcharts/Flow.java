package com.lrc.liferay.ram.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lrc.liferay.ram.utils.flowcharts.exceptions.ModifiedFlowException;

public class Flow<T,C extends Comparable<C>> {
	private BasicFlowChart<T,C> flowChart;
	private List<Integer> flow = new ArrayList<Integer>();
	private Date startDate;
	
	public Flow(BasicFlowChart<T,C> flowChart) {
		this.flowChart = flowChart;
	}

	public T nextStep(C condition) {
		if (flow.isEmpty()) {
			startDate = new Date();
		}
		try {
			flow.add(this.flowChart.getNextState(startDate, 0, condition));
			return flowChart.getNodeContent(flow.get(flow.size() - 1));
		} catch (ModifiedFlowException e) {
			System.out.println("Modified Flowchart, restarting flow");
			this.flow.clear();
			return null;
		}
	}
	
	public T getCurrentStep() {
		if (flow.isEmpty()) {
			return flowChart.getNodeContent(0);
		} else {
			return flowChart.getNodeContent(flow.size() - 1);
		}
	}
}
