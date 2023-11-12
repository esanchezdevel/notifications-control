package com.esanchez.devel.notifications.control.app.dto;

import java.util.List;

public class ListTenantsResponseDTO {

	private List<String> tenants;

	public List<String> getTenants() {
		return tenants;
	}

	public void setTenants(List<String> tenants) {
		this.tenants = tenants;
	}

	@Override
	public String toString() {
		return "ListTenantsResponseDTO [tenants=" + tenants + "]";
	}
}
