package com.springbootjpahibernate.listaPedidos.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springbootjpahibernate.listaPedidos.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StardardError> database(ResourceNotFoundException e,HttpServletRequest request ){
		String error = "Database Error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StardardError err = new StardardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());

	return ResponseEntity.status(status).body(err);
	
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StardardError> resourceNotFound(DatabaseException e,HttpServletRequest request ){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StardardError err = new StardardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());

	return ResponseEntity.status(status).body(err);
	
	}

}
