package com.ferda.utils.flowcharts;

import java.util.Map.Entry;
import java.util.TreeMap;

public class BasicNode<T,C extends Comparable<C>> {
	private T content;
	private TreeMap<C,Integer> edges;

	public BasicNode(Integer index, T content, TreeMap<C,Integer> edges) {
		this.content = content;
		this.edges = edges;
	}

	public void addEdge(C condition, Integer node) {
		this.edges.put(condition, node);
	}
	
	public T getContent() {
		return this.content;
	}
	
	public void changeEdgesIndex(Integer oldIndex, Integer newIndex) {
		// if edge to oldIndex exists set it to newIndex
		if (edges.containsValue(oldIndex)) {
			for(Entry<C,Integer> edge: this.edges.entrySet()) {
				if (edge.getValue() == oldIndex) {
					this.edges.put(edge.getKey(), newIndex);
				}
			}
		}
	}
	
	public void removeEdgeByCondition(C condition) {
		this.edges.remove(condition);
	}
	
	public void removeEdgeByNode(Integer index) {
		if (edges.containsValue(index)) {
			for(Entry<C,Integer> edge: this.edges.entrySet()) {
				if (edge.getValue() == index) {
					this.edges.remove(edge.getKey());
				}
			}
		}
	}

	public boolean equals(BasicNode<T,C> node) {
//		return (content.equals(node.getContent()) && edges.equals(node.getEdges()));
		return (content.equals(node.getContent()));
	}
	
	public Integer nextNode(C condition) {
		return this.edges.get(condition);
	}
}