package com.robin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robin.Exception.EmailAlreadyExistsException;

import com.robin.entity.Employee;
import com.robin.repository.EmployeeRepository;
import com.robin.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	private Employee employee;
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
    @GetMapping
    public List<Employee> getEmployees(){
        return empService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@RequestParam int empId){
        return empService.getEmployee(empId);
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
    	
    	String email = employee.getEmail();
    	Employee emailExists = employeeRepo.findByEmail(email);
    	if(emailExists != null) {
    		throw new EmailAlreadyExistsException("Email already exist");
    	} else {
    		return empService.addEmployee(employee);
    	}
    			
        
    }
    @PutMapping("/{id}")
    public Employee addEmployee(@RequestParam int empId,@RequestBody Employee Employee){
        return empService.updateEmployee(empId,Employee);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@RequestParam int empId){
    	empService.deleteEmployee(empId);
    }
	
}
