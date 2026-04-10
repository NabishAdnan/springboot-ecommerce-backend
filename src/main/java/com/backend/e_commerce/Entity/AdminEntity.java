package com.backend.e_commerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class AdminEntity {

	
	private long adminId;
	private String username;
	private String password;
	private boolean isActive;
	
	
}
