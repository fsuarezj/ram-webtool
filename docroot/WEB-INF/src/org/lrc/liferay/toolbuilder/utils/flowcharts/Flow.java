package org.lrc.liferay.toolbuilder.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.FlowException;

public class Flow<T,C extends Comparable<C>> {
	protected BasicFlowChart<T,C> flowChart;
	protected List<Integer> flow = new ArrayList<Integer>();
	protected Date startDate;
	
	public Flow(BasicFlowChart<T,C> flowChart) {
		this.flowChart = flowChart;
	}
	
	public void initFlow() {
		this.flow.clear();
	}

	public T nextStep(C condition) throws FlowException {
		if (flow.isEmpty()) {
			startDate = new Date();
			flow.add(0);
		}
		try {
			flow.add(this.flowChart.getNextState(startDate, flow.get(flow.size() - 1), condition));
			return flowChart.getNodeContent(flow.get(flow.size() - 1));
		} catch (FlowException e) {
			throw e;
		}
	}
	
	public T getCurrentStep() {
		if (flow.isEmpty()) {
			return flowChart.getNodeContent(0);
		} else {
			return flowChart.getNodeContent(flow.get(flow.size() - 1));
		}
	}
	
	public Boolean currentIsFinal() {
		if (flow.isEmpty()) {
			return flowChart.isFinalNode(0);
		} else {
			return flowChart.isFinalNode(flow.get(flow.size() - 1));
		}
	}
	
	public T processSteps(C[] conditions) throws FlowException {
		T result = null;
		for (int i = 0; i < conditions.length; i++) {
			result = this.nextStep(conditions[i]);
		}
		return result;
	}
	
	public T processSteps(List<C> conditions) throws FlowException {
		T result = null;
		for (C condition: conditions) {
			result = this.nextStep(condition);
		}
		return result;
	}
	
	public T stepBackward() {
		if (flow.size() > 0)
			flow.remove(flow.size()-1);
		return this.getCurrentStep();
	}
}
