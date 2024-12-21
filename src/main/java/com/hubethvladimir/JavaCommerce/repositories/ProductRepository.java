package com.hubethvladimir.JavaCommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hubethvladimir.JavaCommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
