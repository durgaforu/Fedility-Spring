package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.dao.EmployeeDaoImpl;
import com.product.dao.ProductDao;
import com.product.entities.Bank;
import com.product.entities.Employee;
import com.product.entities.Product;
import com.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		// create Spring container
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	//	ProductService productService = ac.getBean("productServiceImpl",ProductService.class);

		/*// Transient State
		Product prod = new Product();

		prod.setProdName("Pen");
		prod.setPrice(37.65);
		
		// Persistent State
		//productService.saveProduct(prod); saves only Product Object
		
		Bank b=new Bank();
		
		b.setCustName("Praveen");
		productService.genericSaveDao(b); // Saves/updates any kind of Object
		productService.genericSaveDao(prod);
		
		Product obj= (Product) productService.search(1); 
		System.out.println("Name: "+obj.getProdName());
		obj.setProdName("Spring-ORM");
		productService.genericSaveDao(obj);
		*/

		EmployeeDaoImpl empDao=ac.getBean("emp",EmployeeDaoImpl.class);
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(644646);
		
		
		emp.setDeptId(1000);
		emp.setDeptName("HR");

		empDao.saveEmployee(emp);
		
		System.out.println("--- Done ---");
	}

}
