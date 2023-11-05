package com.esanchez.devel.notifications.control.app.dto;

public class ApiResponseDTO {

	private int code;
	
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResponseDTO [code=" + code + ", message=" + message + "]";
	}
}
