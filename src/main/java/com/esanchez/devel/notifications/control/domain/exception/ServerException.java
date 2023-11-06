package com.esanchez.devel.notifications.control.domain.exception;

public class ServerException extends Exception {
	
	private static final long serialVersionUID = -3520047871448040082L;
	
	private final int code;
	
	public ServerException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "ServerException [code=" + code + ", message=" + getMessage() + "]";
	}
}
