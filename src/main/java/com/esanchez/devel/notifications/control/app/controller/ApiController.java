package com.esanchez.devel.notifications.control.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esanchez.devel.notifications.control.app.dto.ApiResponseDTO;
import com.esanchez.devel.notifications.control.app.dto.SystemRegisterDTO;
import com.esanchez.devel.notifications.control.app.mapper.SystemMapper;
import com.esanchez.devel.notifications.control.domain.exception.ServerException;
import com.esanchez.devel.notifications.control.domain.service.SystemService;

@RestController
@RequestMapping("/api")
public class ApiController {

	private static final Logger logger = LogManager.getLogger(ApiController.class);
	
	@Autowired
	private SystemService systemService;
	
	@PostMapping("/system/register")
	public ResponseEntity<ApiResponseDTO> systemRegister(@RequestBody SystemRegisterDTO request) {
		
		logger.info("Request received: {}", request);
		
		try {
			systemService.register(SystemMapper.dtoToEntity(request));
		} catch (ServerException e) {
			ApiResponseDTO response = new ApiResponseDTO();
			response.setCode(e.getCode());
			response.setMessage(e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.valueOf(e.getCode()));
		}
		
		ApiResponseDTO response = new ApiResponseDTO();
		response.setCode(HttpStatus.OK.value());
		response.setMessage("OK");
		return ResponseEntity.ok(response);
	}
}
