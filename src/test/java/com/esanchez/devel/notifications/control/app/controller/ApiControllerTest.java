package com.esanchez.devel.notifications.control.app.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.esanchez.devel.notifications.control.app.dto.ApiResponseDTO;
import com.esanchez.devel.notifications.control.app.dto.SystemRegisterDTO;
import com.esanchez.devel.notifications.control.domain.entity.System;
import com.esanchez.devel.notifications.control.domain.exception.ServerException;
import com.esanchez.devel.notifications.control.domain.service.SystemService;

@ExtendWith(MockitoExtension.class)
public class ApiControllerTest {

	@Mock
	private SystemService systemService;
	
	@InjectMocks
	private ApiController apiController;
	
	@Test
	void givenSystemRegisterDtoThenRegisterTheSystem() throws ServerException {
		
		SystemRegisterDTO request = new SystemRegisterDTO();
		request.setSystem("test");
		request.setUrl("http://127.0.0.1:8080");
		
		doNothing().when(systemService).register(any(System.class));
		
		ResponseEntity<ApiResponseDTO> response = apiController.systemRegister(request);
		
		assertNotNull(response);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());
		assertEquals(200, response.getBody().getCode());
		assertEquals("OK", response.getBody().getMessage());
	}
}
