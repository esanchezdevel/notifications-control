package com.esanchez.devel.notifications.control.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esanchez.devel.notifications.control.domain.service.TenantsService;

@Service
public class TenantsServiceImpl implements TenantsService {

	@Override
	public List<String> getTenants() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean createTenant(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean removeTenant(String name) {
		// TODO Auto-generated method stub
		return false;
	}
}
