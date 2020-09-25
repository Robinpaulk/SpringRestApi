package com.robin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robin.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Employee findByEmail(String email);
}
