package com.esanchez.devel.notifications.control.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esanchez.devel.notifications.control.infrastructure.persistence.MemoryObjects;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {

	private static final Logger logger = LogManager.getLogger(TenantController.class);
	
	@GetMapping("/list")
	public ResponseEntity<?> list() {
		
		logger.info("List all tenants");
		
		return ResponseEntity.ok("The list of tenants for system: " + MemoryObjects.getSessionSystem());
	}
}
