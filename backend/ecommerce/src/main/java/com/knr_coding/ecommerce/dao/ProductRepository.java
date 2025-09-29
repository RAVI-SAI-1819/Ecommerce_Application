package com.knr_coding.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knr_coding.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
