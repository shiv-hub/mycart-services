package com.mycartservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycartservices.model.ProductView;

public interface ProductViewRepository extends JpaRepository<ProductView, Long>{

}