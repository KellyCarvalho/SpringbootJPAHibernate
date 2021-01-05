package com.springbootjpahibernate.listaPedidos.resources;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpahibernate.listaPedidos.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
public ResponseEntity<User> findAll(){
	User u = new User(1L, "Júlia", "julia@gmail.com", "1235456", "1234");
	return ResponseEntity.ok().body(u);
	
}
}
