package com.backend.e_commerce.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.e_commerce.DTO.AdminDto;

@RestController
@RequestMapping("/v1/app/admin")
public class AdminController {

	@PostMapping("/login")								
	public ResponseEntity<AdminDto> adminLogin(){
		
		
		return null;
	}
}
