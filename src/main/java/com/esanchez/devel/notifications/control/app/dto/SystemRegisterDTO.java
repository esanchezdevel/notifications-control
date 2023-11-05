package com.esanchez.devel.notifications.control.app.dto;

public class SystemRegisterDTO {
	
	private SystemRegisterDTO() {}
	
	private String system;
	
	private String url;

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "SystemRegisterDTO [system=" + system + ", url=" + url + "]";
	}
}
