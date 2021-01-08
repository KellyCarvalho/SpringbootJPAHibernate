package com.springbootjpahibernate.listaPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.listaPedidos.entities.OrderItem;

public interface OrderItemyRepository extends JpaRepository<OrderItem, Long> {

}
