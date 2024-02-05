package com.developer.employeemanagement.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Global exception handler for handling specific exceptions across all
 * controllers.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * Handles ResourceNotFoundException and returns a ResponseEntity with
	 * appropriate error details.
	 *
	 * @param ex      The ResourceNotFoundException instance.
	 * @param request The WebRequest associated with the request.
	 * @return A ResponseEntity containing error details and HTTP status code 404
	 *         (NOT_FOUND).
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	/**
	 * Handles generic Exception and returns a ResponseEntity with appropriate error
	 * details.
	 *
	 * @param ex      The Exception instance.
	 * @param request The WebRequest associated with the request.
	 * @return A ResponseEntity containing error details and HTTP status code 500
	 *         (INTERNAL_SERVER_ERROR).
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandler(Exception ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
