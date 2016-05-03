package com.lrc.liferay.ram.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lrc.liferay.ram.utils.flowcharts.exceptions.FlowException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeContentException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NodeException;

public class BasicFlowChart<T,C extends Comparable<C>> {
	private List<BasicNode<T,C>> nodes = null;
	private Date lastEdit;
	
	////// CONSTRUCTOR //////
	public BasicFlowChart(T content) throws NodeContentException {
		this.nodes = new ArrayList<BasicNode<T,C>>();
		this.nodes.add(0, new BasicNode<T,C>(content));
		this.lastEdit = new Date();
	}
	
//	public BasicFlowChart(BasicNode<T,C> node) {
//		this.nodes = new ArrayList<BasicNode<T,C>>();
//		this.nodes.add(0, node);
//		this.lastEdit = new Date();
//	}
	
	////// PRIVATE METHODS //////
	private void changeEdgesIndex(Integer oldIndex, Integer newIndex) {
		for(BasicNode<T,C> node: this.nodes) {
			node.changeEdgesIndex(oldIndex, newIndex);
		}
	}
	
	private void exchangeEdgesIndex(Integer index1, Integer index2) {
		for(BasicNode<T,C> node: this.nodes) {
			node.exchangeEdgesIndex(index1, index2);
		}
	}
	
	private int indexContaining(T content) throws NodeContentException {
		BasicNode<T,C> auxNode = new BasicNode(content);
		return this.nodes.indexOf(auxNode);
	}
	
//	private BasicNode<T,C> getNode(T content) {
//		for(BasicNode<T,C> node: this.nodes) {
//			if (content.equals(node.getContent()))
//				return node;
//		}
//		return null;
//	}

	////// CONSTRUCTION METHODS //////
	public void addFirstNode(T content) throws NodeContentException, NodeException {
		BasicNode<T,C> auxNode = new BasicNode(content);
		if (!(this.nodes.get(0).equals(auxNode))) {
			if(this.nodes.indexOf(auxNode) < 0) {
				auxNode = this.nodes.set(0, auxNode);
				this.nodes.add(auxNode);
				Integer newIndex = this.nodes.indexOf(auxNode);
				this.exchangeEdgesIndex(0,newIndex);
				this.lastEdit = new Date();
			} else 
				throw new NodeException("BasicFlowChart.addFirstNode: Existing node");
		}
	}
	
	/**
	 * @param content
	 * @throws NodeException
	 * @throws NodeContentException 
	 */
	public void setFirstNode(T content) throws NodeException, NodeContentException {
		BasicNode<T,C> auxNode = new BasicNode(content);
		int oldIndex = this.nodes.indexOf(auxNode);
		if (oldIndex < 0)
			throw new NodeException("BasicFlowChart.setFirstNode: Non existing node");
		auxNode = this.nodes.set(0, this.nodes.get(oldIndex));
		this.nodes.set(oldIndex,auxNode);
		this.exchangeEdgesIndex(0, oldIndex);
		this.lastEdit = new Date();
	}
	
	public void addNode(T content) throws NodeContentException, NodeException {
		if (this.indexContaining(content) < 0) {
			if (!(content.getClass() == this.getNodeContent(0).getClass()))
				throw new NodeContentException("BasicFlowChart.addNode: Bad content type");
			this.nodes.add(new BasicNode<T,C>(content));
			this.lastEdit = new Date();
			Class hola = Date.class;
		} else {
			throw new NodeException("BasicFlowChart.addNode: Existing node");
		}
	}
	
	public void addEdge(T origin, C condition, T destination) throws NodeContentException, NodeException {
		Integer originIndex = this.indexContaining(origin);
		Integer destIndex = this.indexContaining(destination);
		if (originIndex < 0) {
			throw new NodeException("BasicFlowChart.addEdge: Non existing node");
		}
		if (destIndex < 0) {
			this.nodes.add(new BasicNode<T,C>(destination));
			destIndex = this.indexContaining(destination);
		}
		this.nodes.get(originIndex).addEdge(condition, destIndex);
		this.lastEdit = new Date();
	}
	// TODO: public void removeNode(T content);

	////// OPERATION METHODS //////
	public T getNodeContent(Integer index) {
		return this.nodes.get(index).getContent();
	}
	
	public int size() {
		return this.nodes.size();
	}
	
	public Integer getNextState(Date startDate, Integer old, C condition) throws FlowException {
		if (startDate.before(lastEdit))
			throw new FlowException("BasicFlowChart.getNextState: FlowChart has been modified after Flow startDate");
		Integer result = this.nodes.get(old).nextNode(condition);
		if (result == null)
			return old;
		else
			return result;
	}
}
