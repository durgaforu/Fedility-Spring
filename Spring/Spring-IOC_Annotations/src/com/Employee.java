package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private String empName;

	@Autowired
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void getInfo() {
		System.out.println("Hello "+empName);
		System.out.println("-- Information about Employee");
		dept.getData();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

}
