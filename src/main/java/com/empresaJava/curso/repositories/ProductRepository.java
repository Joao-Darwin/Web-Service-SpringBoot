package com.empresaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaJava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
