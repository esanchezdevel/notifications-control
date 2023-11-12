package com.esanchez.devel.notifications.control.domain.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.esanchez.devel.notifications.control.domain.entity.System;
import com.esanchez.devel.notifications.control.domain.exception.ServerException;
import com.esanchez.devel.notifications.control.domain.service.SystemService;
import com.esanchez.devel.notifications.control.infrastructure.persistence.MemoryObjects;

@Service
public class SystemServiceImpl implements SystemService {

	private static final Logger logger = LogManager.getLogger(SystemServiceImpl.class);
	
	@Override
	public void register(System system) throws ServerException {
		logger.info("System to be saved: {}", system);
		
		if (MemoryObjects.getSessionSystem() == null) {
			synchronized(this) {
				MemoryObjects.setSessionSystem(system);
			}
		} else {
			throw new ServerException(HttpStatus.BAD_REQUEST.value(), "The session system already exists");
		}
	}
}
