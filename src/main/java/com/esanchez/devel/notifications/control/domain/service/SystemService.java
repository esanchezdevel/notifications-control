package com.esanchez.devel.notifications.control.domain.service;

import com.esanchez.devel.notifications.control.domain.entity.System;
import com.esanchez.devel.notifications.control.domain.exception.ServerException;

public interface SystemService {

	/**
	 * Method to register the system that we want to monitor 
	 * in this session.
	 * This system data will be saved in memory, so it will
	 * be used only for the current session.
	 * 
	 * @param system Contains the system data needed to be saved
	 * @throws ServerException When some error occurs during the process
	 */
	void register(System system) throws ServerException;
}
