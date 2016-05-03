package com.lrc.liferay.ram.utils.flowcharts.exceptions;

public class FlowException extends Throwable {

	public FlowException() {
		super();
	}

	public FlowException(String msg) {
		super(msg);
	}

	public FlowException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public FlowException(Throwable cause) {
		super(cause);
	}
}
