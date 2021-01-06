package com.springbootjpahibernate.listaPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.listaPedidos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
