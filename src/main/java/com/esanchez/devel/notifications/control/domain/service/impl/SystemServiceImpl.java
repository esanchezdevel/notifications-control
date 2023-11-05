package com.esanchez.devel.notifications.control.domain.service.impl;

import org.springframework.stereotype.Service;

import com.esanchez.devel.notifications.control.domain.entity.System;
import com.esanchez.devel.notifications.control.domain.exception.ServerException;
import com.esanchez.devel.notifications.control.domain.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {

	@Override
	public void register(System system) throws ServerException {
		java.lang.System.out.println("System to be saved: " + system);
	}
}
