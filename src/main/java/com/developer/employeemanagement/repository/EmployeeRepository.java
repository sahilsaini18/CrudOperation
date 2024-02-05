package com.developer.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.employeemanagement.model.Employee;

/**
 * Repository interface for accessing and managing Employee entities.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
