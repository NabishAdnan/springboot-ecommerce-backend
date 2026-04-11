package com.backend.e_commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.e_commerce.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByUsername(String username);
}
