package com.backend.e_commerce.Repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.e_commerce.DTO.SignupRequest;
import com.backend.e_commerce.Entity.AdminEntity;
import com.backend.e_commerce.Entity.CommercialSellerEntity;
import com.backend.e_commerce.Entity.UserEntity;

public class AuthService {

	@Autowired
	private UserRepository endRepo;
	
	@Autowired
	private CommercialSellerRepo comRepo;
	
	@Autowired
	private AdminRepository adminRepo;
	
	public String signup(SignupRequest req) {

        String role = req.role;

        if(role == null) {
            return "Role is required!";
        }

        if(role.equalsIgnoreCase("END_USER")) {

            UserEntity user = new UserEntity();
            user.setUsername(req.username);
            user.setPassword(req.password);
            user.setEmail(req.email);
            user.setActive(true); 

            endRepo.save(user);

            return "End User Registered Successfully";
        }

        else if(role.equalsIgnoreCase("COMMERCIAL")) {

            CommercialSellerEntity user = new CommercialSellerEntity();
            user.setUsername(req.username);
            user.setPassword(req.password);
            user.setEmail(req.email);
            user.setActive(false); 

            comRepo.save(user);

            return "Commercial Registered. Waiting for Admin Approval";
        }

        else if(role.equalsIgnoreCase("ADMIN")) {

            AdminEntity user = new AdminEntity();
            user.setUsername(req.username);
            user.setPassword(req.password);
            user.setEmail(req.email);

            adminRepo.save(user);

            return "Admin Registered Successfully";
        }

        else {
            return "Invalid Role! Use END_USER / COMMERCIAL / ADMIN";
        }
    }
}