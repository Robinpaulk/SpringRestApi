package com.robin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robin.entity.Address;
import com.robin.entity.Employee;
import com.robin.repository.AddressRepository;
import com.robin.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	
    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }
    
    public Employee getEmployee(int empId){
        return employeeRepo.findById(empId).orElse(null);
    }
    public Employee addEmployee(Employee employee){
    	
        return employeeRepo.save(employee);
    }
    
    
    public Employee updateEmployee(int empId,Employee employee){
    	employee.setEmpId(empId);
        return employeeRepo.save(employee);
    }
    public void deleteEmployee(int empId){
    	employeeRepo.deleteById(empId);
    }
	
}
