package com.lrc.liferay.ram.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lrc.liferay.ram.utils.flowcharts.exceptions.ExistingNodeException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.ModifiedFlowException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NonExistingNodeException;
import com.lrc.liferay.ram.utils.flowcharts.exceptions.NullNodeContentException;

public class BasicFlowChart<T,C extends Comparable<C>> {
	private List<BasicNode<T,C>> nodes = null;
	private Date lastEdit;
	
	////// CONSTRUCTOR //////
	public BasicFlowChart(T content) throws NullNodeContentException {
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
	
	private int indexContaining(T content) throws NullNodeContentException {
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
	public void addFirstNode(T content) throws NullNodeContentException, ExistingNodeException {
		BasicNode<T,C> auxNode = new BasicNode(content);
		if (!(this.nodes.get(0).equals(auxNode))) {
			if(this.nodes.indexOf(auxNode) < 0) {
				auxNode = this.nodes.set(0, auxNode);
				this.nodes.add(auxNode);
				Integer newIndex = this.nodes.indexOf(auxNode);
				this.exchangeEdgesIndex(0,newIndex);
				this.lastEdit = new Date();
			} else 
				throw new ExistingNodeException();
		}
	}
	
	public void setFirstNode(T content) throws NullNodeContentException, NonExistingNodeException {
		BasicNode<T,C> auxNode = new BasicNode(content);
		int oldIndex = this.nodes.indexOf(auxNode);
		if (oldIndex < 0)
			throw new NonExistingNodeException();
		auxNode = this.nodes.set(0, auxNode);
		this.nodes.set(oldIndex,auxNode);
		this.exchangeEdgesIndex(0, oldIndex);
		this.lastEdit = new Date();
	}
	
	public void addNode(T content) throws NullNodeContentException, ExistingNodeException {
		if (this.indexContaining(content) < 0) {
			this.nodes.add(new BasicNode<T,C>(content));
			this.lastEdit = new Date();
		} else {
			throw new ExistingNodeException();
		}
	}
	
	public void addEdge(T origin, C condition, T destination) throws NullNodeContentException, NonExistingNodeException {
		Integer originIndex = this.indexContaining(origin);
		Integer destIndex = this.indexContaining(destination);
		if (originIndex < 0) {
			throw new NonExistingNodeException();
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
	
	public Integer getNextState(Date startDate, Integer old, C condition) throws ModifiedFlowException {
		if (startDate.before(lastEdit))
			throw new ModifiedFlowException();
		Integer result = this.nodes.get(old).nextNode(condition);
		if (result == null)
			return old;
		else
			return result;
	}
}
