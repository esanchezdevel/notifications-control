package com.esanchez.devel.notifications.control.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esanchez.devel.notifications.control.app.dto.ApiResponseDTO;
import com.esanchez.devel.notifications.control.app.dto.SystemRegisterDTO;

@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping("/system/register")
	public ResponseEntity<ApiResponseDTO> systemRegister(@RequestBody SystemRegisterDTO request) {
		
		System.out.println("Request received: " + request);
		
		ApiResponseDTO response = new ApiResponseDTO();
		response.setCode(HttpStatus.OK.value());
		response.setMessage("OK");
		return ResponseEntity.ok(response);
	}
}
