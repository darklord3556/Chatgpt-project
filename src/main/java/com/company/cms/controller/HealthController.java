package com.company.cms.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.cms.dto.ApiResponse;

@RestController
@RequestMapping("/api")
public class HealthController {

	@GetMapping("/health")
	public ResponseEntity<ApiResponse<Map<String,String>>> healthCheck()
	{
		Map<String, String> data = new HashMap<>();
		data.put("status","up");
		
		ApiResponse<Map<String,String>> response = new ApiResponse<>(true,"Application is running",data);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
