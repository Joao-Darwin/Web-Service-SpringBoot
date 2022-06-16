package com.empresaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaJava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
