package com.robin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id" , referencedColumnName = "empId")
	private List<Address> address;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, String email, List<Address> address) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	//Getters and setters
	
	
	
	public int getEmpId() {
		return empId;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
