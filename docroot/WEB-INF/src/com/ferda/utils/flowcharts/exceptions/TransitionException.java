package com.ferda.utils.flowcharts.exceptions;

public class TransitionException extends Throwable {

	public TransitionException() {
		super();
	}

	public TransitionException(String msg) {
		super(msg);
	}

	public TransitionException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public TransitionException(Throwable cause) {
		super(cause);
	}
}
