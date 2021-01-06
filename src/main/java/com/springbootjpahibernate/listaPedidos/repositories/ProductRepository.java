package com.springbootjpahibernate.listaPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.listaPedidos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
