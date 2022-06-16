package com.empresaJava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresaJava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
