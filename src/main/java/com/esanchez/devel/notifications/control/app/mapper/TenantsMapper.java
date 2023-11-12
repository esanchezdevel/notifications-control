package com.esanchez.devel.notifications.control.app.mapper;

import java.util.List;

import com.esanchez.devel.notifications.control.app.dto.ListTenantsResponseDTO;

public class TenantsMapper {

	private TenantsMapper() {}
	
	public static ListTenantsResponseDTO ListOfTenantsToDto(List<String> tenants) {
		ListTenantsResponseDTO dto = new ListTenantsResponseDTO();
		dto.setTenants(tenants);
		return dto;
	}
}
