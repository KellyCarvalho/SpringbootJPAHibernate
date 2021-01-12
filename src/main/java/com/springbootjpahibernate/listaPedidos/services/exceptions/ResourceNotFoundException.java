package com.springbootjpahibernate.listaPedidos.services.exceptions;

import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	

	public ResourceNotFoundException(Object id) {
		super("Resource not found.  Id: "+id);
	}
	
}
