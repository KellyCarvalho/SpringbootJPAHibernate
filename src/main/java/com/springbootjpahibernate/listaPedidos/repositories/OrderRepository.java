package com.springbootjpahibernate.listaPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.listaPedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
	

}
