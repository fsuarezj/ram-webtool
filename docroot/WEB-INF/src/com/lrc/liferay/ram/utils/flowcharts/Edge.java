package com.lrc.liferay.ram.utils.flowcharts;

public class Edge<T, C extends Comparable<C>> {
	private T origin;
	private C condition;
	private T destination;

	public Edge(T origin, C condition, T destination) {
		this.origin = origin;
		this.condition = condition;
		this.destination = destination;
	}
	public T getOrigin() {
		return origin;
	}
	public void setOrigin(T origin) {
		this.origin = origin;
	}
	public C getCondition() {
		return condition;
	}
	public void setCondition(C condition) {
		this.condition = condition;
	}
	public T getDestination() {
		return destination;
	}
	public void setDestination(T destination) {
		this.destination = destination;
	}
}
