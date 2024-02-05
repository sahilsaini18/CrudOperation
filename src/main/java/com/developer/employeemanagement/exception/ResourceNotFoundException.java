package com.developer.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception to represent a resource not found error.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new ResourceNotFoundException with the specified detail message.
	 *
	 * @param message the detail message.
	 */
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
