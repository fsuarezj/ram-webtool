package org.lrc.liferay.toolbuilder.steps.decisionTree;

import java.util.ArrayList;
import java.util.List;

import org.lrc.liferay.toolbuilder.steps.Step;
import org.lrc.liferay.toolbuilder.utils.flowcharts.BasicFlowChart;
import org.lrc.liferay.toolbuilder.utils.flowcharts.Flow;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.FlowException;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.NodeContentException;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.NodeException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class DecisionTreeStep extends Step {
	static final String view = "decisionTreeStepView.xhtml";
	private Flow<String, Boolean> decisionTree;

	private List<String> nodes = new ArrayList<String>();

	public DecisionTreeStep() {
		super("DECISION_TREE");
	}

	public void setDecisionTree(BasicFlowChart<String, Boolean> flowChart) {
		this.decisionTree = new Flow<String, Boolean>(flowChart);
	}
	
	// Creating sample decision tree (RAM Tool 5)
	public void setDecisionTree() throws NodeContentException, NodeException {
		
		this.nodes.add(0, "Use local markets to buy or sell commodities?");
		this.nodes.add(1, "Physical able to access local markets?");
		this.nodes.add(2, "Stop the RAM, long term dev projects");
		this.nodes.add(3, "Require assistance to access commodities?");
		this.nodes.add(4, "Can aspect restricting access be overcome?");
		this.nodes.add(5, "Identify markets to be assessed");
		this.nodes.add(6, "Stop the RAM, other needs and assistance necessary");
		
		BasicFlowChart<String,Boolean> flowChart = new BasicFlowChart<String, Boolean>(this.nodes.get(0));
		flowChart.addEdge(this.nodes.get(0), true, this.nodes.get(1));
		flowChart.addNode(this.nodes.get(2));
		flowChart.addEdge(this.nodes.get(0), false, this.nodes.get(2));
		flowChart.addEdge(this.nodes.get(1), true, this.nodes.get(3));
		flowChart.addEdge(this.nodes.get(1), false, this.nodes.get(4));
		flowChart.addEdge(this.nodes.get(3), true, this.nodes.get(5));
		flowChart.addEdge(this.nodes.get(4), true, this.nodes.get(5));
		flowChart.addEdge(this.nodes.get(4), false, this.nodes.get(6));
		
		decisionTree = new Flow<String, Boolean>(flowChart);
	}

	@Override
	public String draw() {
		return view;
	}
	
	//////////////////////////////
	// Decision Tree Operations //
	//////////////////////////////
	
	public void cancel() {
		this.decisionTree.initFlow();
	}

	public String nextStep(Boolean condition) throws FlowException {
		return this.decisionTree.nextStep(condition);
	}
	
	public Boolean isFinal() {
		return this.decisionTree.currentIsFinal();
	}
	
	public String current() {
		return this.decisionTree.getCurrentStep();
	}
	
	public String stepBackward() {
		return this.decisionTree.stepBackward();
	}

	@Override
	public void save() throws SystemException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() throws PortalException, SystemException {
		// TODO Auto-generated method stub
		
	}

}
