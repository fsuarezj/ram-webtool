package com.ferda.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ferda.utils.flowcharts.exceptions.ModifiedFlowException;
import com.ferda.utils.flowcharts.exceptions.TransitionException;

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
			return flowChart.getNode(flow.get(flow.size() - 1)).getContent();
		} catch (TransitionException e) {
			System.out.println("Transition does not exist");
			return null;
		} catch (ModifiedFlowException e) {
			System.out.println("Modified Flowchart, restarting flow");
			this.flow.clear();
			return null;
		}
	}
}
