package com.esanchez.devel.notifications.control.infrastructure.persistence;

import com.esanchez.devel.notifications.control.domain.entity.System;

public class MemoryObjects {

	private MemoryObjects() {}
	
	private static System sessionSystem;
	
	public static void setSessionSystem(System system) {
		sessionSystem = system;
	}
	
	public static System getSessionSystem() {
		return sessionSystem;
	}
}
