package org.lrc.liferay.toolbuilder.utils.flowcharts.exceptions;

public class NodeException extends Throwable {

	private static final long serialVersionUID = 8085647531632526734L;

	public NodeException() {
		super();
	}

	public NodeException(String msg) {
		super(msg);
	}

	public NodeException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NodeException(Throwable cause) {
		super(cause);
	}
}
