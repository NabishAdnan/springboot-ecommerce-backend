package com.backend.e_commerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.e_commerce.Entity.CommercialSellerEntity;
import com.backend.e_commerce.Repository.CommercialSellerRepo;


@RestController
@RequestMapping("/v1/app/admin")
public class AdminController {
	
	@Autowired
	private CommercialSellerRepo comRepo;
	 @PutMapping("/approve/{id}")
	 public String approveCommercial(@PathVariable Long id) {

	        CommercialSellerEntity user = comRepo.findById(id).orElse(null);

	        if(user == null) {
	            return "User not found";
	        }

	        user.setActive(true);
	        comRepo.save(user);

	        return "Commercial Approved Successfully";
	    }
	}