package com.bigmir.piatetskaya.polina;

public class NoFreeSpaceException extends Exception {
	private static final long serialVersionUID = 1L;
	private String userMessage;

	public NoFreeSpaceException() {
		super();
	}

	public NoFreeSpaceException(String userMessage) {
		super();
		this.userMessage = userMessage;
	}

	public String getUserMessage() {
		return userMessage;
	}

	@Override
	public String getMessage() {
		return userMessage;
	}
}
