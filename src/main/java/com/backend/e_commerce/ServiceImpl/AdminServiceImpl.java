package com.backend.e_commerce.ServiceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.e_commerce.DTO.AdminDto;
import com.backend.e_commerce.Entity.AdminEntity;
import com.backend.e_commerce.Repository.AdminRepository;
import com.backend.e_commerce.Service.AdminService;

@Service
public class AdminServiceImpl  implements AdminService{
	
	
	private AdminRepository oAdminRepository;

	@Override
	public AdminDto adminLogin(AdminDto oAdminDto) {
		// TODO Auto-generated method stub
		
		if(oAdminDto.getUsername() == null || oAdminDto.getPassword() == null) {
			throw new RuntimeException("Username & password should not null");
		}
		
		Optional<AdminEntity> adminData = oAdminRepository.findByUsername(oAdminDto.getUsername());
		
		AdminEntity data = adminData.get();
		
		if(!data.isActive()) {
			throw new RuntimeException("Username & password should not null");
		}
		
		// check user username password is match or not
		
		
		return null;
	}

}
