package com.backend.e_commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.backend.e_commerce.Entity.RoleEntity;
import com.backend.e_commerce.Repository.RoleRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class ECommerceApplication {

	@Autowired
	private RoleRepository oRoleRepository;
	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner initialzeRoles() {
		return args ->{
			if(!oRoleRepository.existsByRoleName("USER")) {
				RoleEntity role = new RoleEntity();
				role.setRoleName("USER");
				oRoleRepository.save(role);
			}
			if(!oRoleRepository.existsByRoleName("ADMIN")) {

				RoleEntity role = new RoleEntity();
				role.setRoleName("ADMIN");
				oRoleRepository.save(role);
			}
			if(!oRoleRepository.existsByRoleName("COMMERCIAL")) {
				RoleEntity role = new RoleEntity();
				role.setRoleName("COMMERCIAL");
				oRoleRepository.save(role);
			}
		};
	}
}
