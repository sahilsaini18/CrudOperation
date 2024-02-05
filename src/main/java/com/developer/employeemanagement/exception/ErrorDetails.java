package com.developer.employeemanagement.exception;

import java.util.Date;

/**
 * Represents details of an error response.
 */
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;

	/**
	 * Constructs an instance of ErrorDetails.
	 *
	 * @param timestamp The timestamp when the error occurred.
	 * @param message   A brief description of the error.
	 * @param details   Additional details or information about the error.
	 */
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	/**
	 * Gets the timestamp of when the error occurred.
	 *
	 * @return The timestamp.
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp of when the error occurred.
	 *
	 * @param timestamp The timestamp to set.
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the brief description of the error.
	 *
	 * @return The error message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the brief description of the error.
	 *
	 * @param message The error message to set.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets additional details or information about the error.
	 *
	 * @return The error details.
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets additional details or information about the error.
	 *
	 * @param details The error details to set.
	 */
	public void setDetails(String details) {
		this.details = details;
	}
}
