package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	Employee e1;

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppLoader.class);
		/*
		 * Employee e1 = ac.getBean("emp", Employee.class); Employee e2 =
		 * ac.getBean("emp", Employee.class);
		 * 
		 * e1.setEmpName("Praveen");
		 * 
		 * e1.getInfo();
		 */
		Use u = ac.getBean(Use.class);
		u.getShape();

	}
}
