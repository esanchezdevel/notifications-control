package com.esanchez.devel.notifications.control.domain.service;

import java.util.List;

public interface TenantsService {

	/**
	 * List all the tenants registered in the system that we are monitoring
	 * 
	 * @return A list of strings with the names of the tenants
	 */
	List<String> getTenants();

	/**
	 * Create a new tenant in the system that we are monitoring
	 * 
	 * @param name The name of the new tenant
	 * @return True if the tenant is created. False if any error happens
	 */
	boolean createTenant(String name);

	/**
	 * Delete a tenant in the system that we are monitoring
	 * 
	 * @param name The name of the tenant to be deleted
	 * @return True if the tenant is removed. False if any error happens
	 */
	boolean removeTenant(String name);
}
