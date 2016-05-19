package org.lrc.liferay.toolbuilder.utils.flowcharts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.FlowException;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.NodeContentException;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.NodeException;

public class BasicFlowChart<T,C extends Comparable<C>> {
	private List<BasicNode<T,C>> nodes = new ArrayList<BasicNode<T,C>>();
	private Date lastEdit;
	
	////// CONSTRUCTORS //////
	public BasicFlowChart(List<T> nodes) throws NodeContentException, NodeException {
		if (nodes.isEmpty())
			throw new NodeContentException("BasicFlowChart: null node content");
		for (T node: nodes) {
			this.addNode(node);
		}
	}
	
	public BasicFlowChart(T content) throws NodeContentException {
		this.nodes.add(0, new BasicNode<T,C>(content));
		this.lastEdit = new Date();
	}
	
	public BasicFlowChart(List<T> nodes, List<Edge<T,C>> edges) throws NodeContentException, NodeException {
		if (nodes.isEmpty())
			throw new NodeContentException("BasicFlowChart: null node content");
		for (T node: nodes) {
			this.addNode(node);
		}
		for (Edge<T,C> edge: edges) {
			this.addEdge(edge.getOrigin(), edge.getCondition(), edge.getDestination());
		}
	}
	
//	public BasicFlowChart(BasicNode<T,C> node) {
//		this.nodes = new ArrayList<BasicNode<T,C>>();
//		this.nodes.add(0, node);
//		this.lastEdit = new Date();
//	}
	
	////// PRIVATE METHODS //////
//	private void changeEdgesIndex(Integer oldIndex, Integer newIndex) {
//		for(BasicNode<T,C> node: this.nodes) {
//			node.changeEdgesIndex(oldIndex, newIndex);
//		}
//	}
	
	private void exchangeEdgesIndex(Integer index1, Integer index2) {
		for(BasicNode<T,C> node: this.nodes) {
			node.exchangeEdgesIndex(index1, index2);
		}
	}
	
	private int indexContaining(T content) throws NodeContentException {
		BasicNode<T,C> auxNode = new BasicNode<T,C>(content);
		return this.nodes.indexOf(auxNode);
	}
	
	private boolean isConnected(int index, List<Boolean> flags) {
		flags.set(index,true);
		for (Integer nodeIndex: this.nodes.get(index).connectsWith()) {
			if (!flags.get(nodeIndex)) {
				this.isConnected(nodeIndex,flags);
			}
		}
		Boolean result = new Boolean(true);
		for(Boolean flag: flags) {
			result = result && flag;
		}
		return result;
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
		BasicNode<T,C> auxNode = new BasicNode<T,C>(content);
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
	
	public void setFirstNode(T content) throws NodeException, NodeContentException {
		BasicNode<T,C> auxNode = new BasicNode<T,C>(content);
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
			if (!(this.nodes.isEmpty())) {
				if (!(content.getClass() == this.getNodeContent(0).getClass()))
					throw new NodeContentException("BasicFlowChart.addNode: Bad content type");
			}
			this.nodes.add(new BasicNode<T,C>(content));
			this.lastEdit = new Date();
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
			if (!(destination.getClass() == this.getNodeContent(0).getClass()))
				throw new NodeContentException("BasicFlowChart.addEdge: Bad content type");
			this.nodes.add(new BasicNode<T,C>(destination));
			destIndex = this.indexContaining(destination);
		}
		this.nodes.get(originIndex).addEdge(condition, destIndex);
		this.lastEdit = new Date();
	}
	
	public boolean isConnected() {
		// Makes and populates a List to store flags
		List<Boolean> flags = new ArrayList<Boolean>();
		for (int i = 0; i < this.nodes.size(); i++) {
			flags.add(false);
		}
		return this.isConnected(0, flags);
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
		if (this.lastEdit.after(startDate))
			throw new FlowException("BasicFlowChart.getNextState: FlowChart has been modified at " + this.lastEdit.getTime() + " after Flow startDate (at " + startDate.getTime() + ")", FlowException.MODIFIED_FLOWCHART);
		try {
			Integer result = this.nodes.get(old).nextNode(condition);
			if (result == null)
				return old;
			else
				return result;
		} catch (ClassCastException e) {
			throw new ClassCastException("BasicFlowChart.getNextState: Bad condition type -> " + e.getMessage());
		}
	}
	
	public Integer getNextState(Date startDate, Integer old, C condition, boolean permissive) throws FlowException {
		if (this.lastEdit.after(startDate))
			throw new FlowException("BasicFlowChart.getNextState: FlowChart has been modified at " + this.lastEdit.getTime() + " after Flow startDate (at " + startDate.getTime() + ")", FlowException.MODIFIED_FLOWCHART);
		try {
			Integer result = this.nodes.get(old).nextNode(condition, permissive);
			if (result == null)
				return old;
			else
				return result;
		} catch (ClassCastException e) {
			throw new ClassCastException("BasicFlowChart.getNextState: Bad condition type -> " + e.getMessage());
		}
	}
	
	public Boolean isFinalNode(Integer nodeIndex) {
		return this.nodes.get(nodeIndex).isFinal();
	}
}
