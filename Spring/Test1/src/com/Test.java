package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		App a=ac.getBean("app",App.class);
		a.myData();
		
		
		
		
		/*Employee emp = ac.getBean(Employee.class);
		Employee emp1 = ac.getBean(Employee.class);
		System.out.println("Hello " + emp.getEmpName());
		System.out.println("HashCode: "+emp);
		System.out.println("HashCode: "+emp1);*/
		ac.close();

	}

}
