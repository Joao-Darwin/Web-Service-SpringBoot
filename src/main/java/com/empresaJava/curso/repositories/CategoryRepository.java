package com.empresaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaJava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
