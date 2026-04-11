package com.backend.e_commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.e_commerce.Entity.CommercialSellerEntity;

public interface CommercialSellerRepo extends JpaRepository <CommercialSellerEntity, Long>  {

}
