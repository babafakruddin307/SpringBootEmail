package com.email.cofig.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.email.cofig.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
