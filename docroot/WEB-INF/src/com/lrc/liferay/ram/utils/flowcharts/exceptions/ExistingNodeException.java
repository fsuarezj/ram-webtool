package com.lrc.liferay.ram.utils.flowcharts.exceptions;

public class ExistingNodeException extends Throwable {
	
	public ExistingNodeException() {
		super();
	}

	public ExistingNodeException(String msg) {
		super(msg);
	}

	public ExistingNodeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ExistingNodeException(Throwable cause) {
		super(cause);
	}
}
