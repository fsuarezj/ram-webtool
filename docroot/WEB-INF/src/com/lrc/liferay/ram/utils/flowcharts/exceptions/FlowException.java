package com.lrc.liferay.ram.utils.flowcharts.exceptions;

public class FlowException extends Throwable {
	public static final int NO_EXISTING_EDGES = 1;
	public static final int NO_EDGES_FOR_CONDITION = 2;
	public static final int MODIFIED_FLOWCHART = 3;

	private Integer type;

	public FlowException() {
		super();
	}

	public FlowException(String msg) {
		super(msg);
	}

	public FlowException(String msg, int type) {
		super(msg);
		this.type = type;
	}

	public FlowException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public FlowException(Throwable cause) {
		super(cause);
	}

	public Integer getType() {
		return this.type;
	}
}
