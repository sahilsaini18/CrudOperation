package com.developer.employeemanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing an employee.
 */
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gmail")
	private String email;

	/**
	 * Default constructor for Employee.
	 */
	public Employee() {
		super();
	}

	/**
	 * Constructor for Employee with parameters.
	 *
	 * @param firstName the first name of the employee.
	 * @param lastName  the last name of the employee.
	 * @param email     the email of the employee.
	 */
	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	/**
	 * Gets the ID of the employee.
	 *
	 * @return the ID of the employee.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the ID of the employee.
	 *
	 * @param id the ID of the employee.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the first name of the employee.
	 *
	 * @return the first name of the employee.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the employee.
	 *
	 * @param firstName the first name of the employee.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the employee.
	 *
	 * @return the last name of the employee.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the employee.
	 *
	 * @param lastName the last name of the employee.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the email of the employee.
	 *
	 * @return the email of the employee.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the employee.
	 *
	 * @param email the email of the employee.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
