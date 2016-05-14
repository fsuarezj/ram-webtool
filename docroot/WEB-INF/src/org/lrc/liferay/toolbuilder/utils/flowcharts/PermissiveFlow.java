package org.lrc.liferay.toolbuilder.utils.flowcharts;

import java.util.Date;

import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.FlowException;

public class PermissiveFlow<T, C extends Comparable<C>> extends Flow<T, C> {

	public PermissiveFlow(BasicFlowChart<T, C> flowChart) {
		super(flowChart);
	}

	@Override
	public T nextStep(C condition) throws FlowException {
		if (flow.isEmpty()) {
			startDate = new Date();
			flow.add(0);
		}
		flow.add(this.flowChart.getNextState(startDate, flow.get(flow.size() - 1), condition, true));
		return flowChart.getNodeContent(flow.get(flow.size() - 1));
	}
}
