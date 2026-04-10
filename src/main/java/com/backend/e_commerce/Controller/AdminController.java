package com.backend.e_commerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.e_commerce.DTO.AdminDto;
import com.backend.e_commerce.Service.AdminService;

@RestController
@RequestMapping("/v1/app/admin")
public class AdminController {
	
	
	@Autowired
	private AdminService oAdminService;

	@PostMapping("/login")								
	public ResponseEntity<AdminDto> adminLogin(@RequestBody AdminDto oAdminDto){
		
		
		AdminDto response =  oAdminService.adminLogin(oAdminDto);
		
		
		return null;
	}
}
