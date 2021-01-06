package com.springbootjpahibernate.listaPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpahibernate.listaPedidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	

}
