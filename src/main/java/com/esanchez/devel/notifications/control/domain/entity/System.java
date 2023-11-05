package com.esanchez.devel.notifications.control.domain.entity;

public class System {
	
	private String system;
	
	private String url;
	
	public System(String system, String url) {
		this.system = system;
		this.url = url;
	}

	public String getSystem() {
		return system;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "System [system=" + system + ", url=" + url + "]";
	}
}
