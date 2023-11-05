package com.esanchez.devel.notifications.control.app.mapper;

import com.esanchez.devel.notifications.control.app.dto.SystemRegisterDTO;
import com.esanchez.devel.notifications.control.domain.entity.System;

public class SystemMapper {

	private SystemMapper() {};
	
	public static System dtoToEntity(SystemRegisterDTO dto) {
		return new System(dto.getSystem(), dto.getUrl());
	}
	
}
