package com.ferda.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ferda.utils.flowcharts.exceptions.ModifiedFlowException;
import com.ferda.utils.flowcharts.exceptions.TransitionException;

public class BasicFlowChart<T,C extends Comparable<C>> {
	private List<BasicNode<T,C>> nodes = null;
	private Date lastEdit;
	
	public BasicFlowChart(BasicNode<T,C> node) {
		this.nodes = new ArrayList<BasicNode<T,C>>();
		this.nodes.add(0, node);
		this.lastEdit = new Date();
	}
	
	////// CONSTRUCTION METHODS //////
	private void changeEdgesIndex(Integer oldIndex, Integer newIndex) {
		for(BasicNode<T,C> node: this.nodes) {
			node.changeEdgesIndex(oldIndex, newIndex);
		}
	}

	public void addFirstNode(BasicNode<T,C> node) {
		BasicNode<T,C> lastBegin = this.nodes.get(0);
		this.nodes.add(lastBegin);
		this.nodes.add(0, node);
		Integer indexBegin = this.nodes.indexOf(lastBegin);
		this.changeEdgesIndex(0,indexBegin);
		this.lastEdit = new Date();
	}
	
	public void addNode(BasicNode<T,C> node) {
		this.nodes.add(node);
		this.lastEdit = new Date();
	}
	
	public void addEdge(BasicNode<T,C> node, C condition, BasicNode<T,C> destination) {
		Integer destIndex = this.nodes.indexOf(destination);
		// QA: Comprobar que si existe destination no lo crea again (equals)
		if (destIndex < 0) {
			this.nodes.add(destination);
			destIndex = this.nodes.indexOf(destination);
		}
		node.addEdge(condition, destIndex);
		this.lastEdit = new Date();
	}

	////// OPERATION METHODS //////
	public BasicNode<T,C> getNode(Integer index) {
		return this.nodes.get(index);
	}
	
	public Integer getNextState(Date startDate, Integer old, C condition)
			throws TransitionException, ModifiedFlowException {
		if (startDate.before(lastEdit))
			throw new ModifiedFlowException();
		Integer result = this.nodes.get(old).nextNode(condition);
		if (result == null)
			throw new TransitionException();
		else
			return result;
				
	}
}
