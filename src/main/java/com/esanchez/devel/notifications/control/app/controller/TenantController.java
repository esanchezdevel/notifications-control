package com.esanchez.devel.notifications.control.app.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esanchez.devel.notifications.control.app.dto.ListTenantsResponseDTO;
import com.esanchez.devel.notifications.control.app.mapper.TenantsMapper;
import com.esanchez.devel.notifications.control.domain.service.TenantsService;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {

	private static final Logger logger = LogManager.getLogger(TenantController.class);
	
	@Autowired
	private TenantsService tenantsService;
	
	@GetMapping("/list")
	public ResponseEntity<ListTenantsResponseDTO> list() {
		
		logger.info("List all tenants");
		
		List<String> tenants = tenantsService.getTenants();
		
		return ResponseEntity.ok(TenantsMapper.ListOfTenantsToDto(tenants));
	}
}
