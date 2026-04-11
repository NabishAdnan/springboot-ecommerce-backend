package com.backend.e_commerce.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.e_commerce.Entity.RoleEntity;

public interface RoleRepository  extends JpaRepository<RoleEntity, Long>{

	Optional<RoleEntity> findByRoleName(String string);

	boolean existsByRoleName(String string);

}
