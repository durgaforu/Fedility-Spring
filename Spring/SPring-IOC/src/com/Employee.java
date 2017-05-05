package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Repository
//@Controller
@Component
@Scope(value="singleton")
public class Employee {

	private int empId=100;
	private String empName="James";
	private double salary;

	@Autowired
	private Department dept;

	

	public Employee() {
		System.out.println("-- Employee Object Created with " + this.hashCode());
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		 System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept name: "+dept.getDeptName());
	}

}
