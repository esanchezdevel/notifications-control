package com.esanchez.devel.notifications.control.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esanchez.devel.notifications.control.app.dto.SystemRegisterDTO;

@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping("/system/register")
	public ResponseEntity<?> systemRegister(@RequestBody SystemRegisterDTO request) {
		
		System.out.println("Request received: " + request);
		
		return ResponseEntity.ok("{\"result\": \"OK\"}");
	}
}
