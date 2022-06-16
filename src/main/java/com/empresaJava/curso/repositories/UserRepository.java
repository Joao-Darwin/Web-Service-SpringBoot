package com.empresaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaJava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
