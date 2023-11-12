package com.esanchez.devel.notifications.control.domain.entity;

public class System {
	
	private String name;
	
	private String url;
	
	public System(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "System [name=" + name + ", url=" + url + "]";
	}
}
