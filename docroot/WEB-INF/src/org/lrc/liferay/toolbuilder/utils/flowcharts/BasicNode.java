package org.lrc.liferay.toolbuilder.utils.flowcharts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.FlowException;
import org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions.NodeContentException;

import java.util.TreeMap;

public class BasicNode<T,C extends Comparable<C>> {
	private T content;
	private TreeMap<C,Integer> edges = null;
	
	public BasicNode(T content) throws NodeContentException {
		if (content == null)
			throw new NodeContentException("BasicNode: null node content");
		this.content = content;
	}

	public BasicNode(T content, TreeMap<C,Integer> edges) throws NodeContentException {
		if (content == null)
			throw new NodeContentException("BasicNode: null node content");
		this.content = content;
		this.edges = edges;
	}

	public void addEdge(C condition, Integer node) {
		if (this.edges == null)
			this.edges = new TreeMap<C,Integer>();
		this.edges.put(condition, node);
	}
	
	public T getContent() {
		return this.content;
	}
	
	public void changeEdgesIndex(Integer oldIndex, Integer newIndex) {
		// if edge to oldIndex exists set it to newIndex
		if (this.edges != null) {
			if (this.edges.containsValue(oldIndex)) {
				for(Entry<C,Integer> edge: this.edges.entrySet()) {
					if (edge.getValue() == oldIndex) {
						this.edges.put(edge.getKey(), newIndex);
					}
				}
			}
		}
	}
	
	public void exchangeEdgesIndex(Integer index1, Integer index2) {
		// if edge to oldIndex exists set it to newIndex
		if (this.edges != null) {
			if (this.edges.containsValue(index1) || this.edges.containsValue(index2)) {
				for(Entry<C,Integer> edge: this.edges.entrySet()) {
					int oldIndex = edge.getValue();
					if (oldIndex == index1) {
						this.edges.put(edge.getKey(), index2);
					}
					if (oldIndex == index2) {
						this.edges.put(edge.getKey(), index1);
					}
				}
			}
		}
	}
	
	public void removeEdgeByCondition(C condition) {
		if (this.edges != null)
			this.edges.remove(condition);
	}
	
	public void removeEdgeByNode(Integer index) {
		if (this.edges != null) {
			if (this.edges.containsValue(index)) {
				List<C> temp = new ArrayList();
				for(Entry<C,Integer> edge: this.edges.entrySet()) {
					if (edge.getValue() == index) {
						temp.add(edge.getKey());
					}
				}
				for(C key: temp) {
					this.edges.remove(key);
				}
			}
		}
	}

	@Override
	public boolean equals(Object o) {
//		return true if content is the same
		if (this == o)
			return true;
		if (!(o instanceof BasicNode))
			return false;
		else {
			BasicNode auxNode = (BasicNode) o;
			return (this.content.equals(auxNode.getContent()));
			
		}
	}
	
	public Integer nextNode(C condition) throws FlowException {
		if (this.isFinal())
			throw new FlowException("BasicNode.nextNode: No edges for node '" + this.getContent() + "'", FlowException.NO_EXISTING_EDGES);
		try {
			Integer result =  this.edges.get(condition);
			if (result == null)
				throw new FlowException("BasicNode.nextNode: No edge with condition '" + condition + "' for node '" + this.getContent() + "'", FlowException.NO_EDGES_FOR_CONDITION);
			else
				return result;
		} catch (ClassCastException e) {
			throw new ClassCastException(" BasicNode.nextNode: " + e.getMessage());
		}
	}
	
	public Integer nextNode(C condition, boolean permissive) throws FlowException {
		if (!permissive)
			return this.nextNode(condition);
		if (this.edges == null)
			return null;
		return this.edges.get(condition);
	}
	
	public Integer edgesNumber() {
		return this.edges.size();
	}
	
	public List<Integer> connectsWith() {
		List<Integer> result = new ArrayList<Integer>();
		if (edges != null) {
			for(Entry<C,Integer> edge: this.edges.entrySet()) {
				result.add(edge.getValue());
			}
		}
		return result;
	}
	
	public Boolean isFinal() {
		if (this.edges == null)
			return true;
		else
			return this.edges.isEmpty();
	}
}