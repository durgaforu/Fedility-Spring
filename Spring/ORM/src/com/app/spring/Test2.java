package com.app.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.config.AppConfig;
import com.app.spring.dao.TransactionTest;
import com.app.spring.dao.UserDaoImpl;
import com.app.spring.entities.Catalog;
import com.app.spring.entities.Department;
import com.app.spring.entities.Employee;
import com.app.spring.entities.User;

public class Test2 {

	public static void main(String[] args) throws Exception {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		TransactionTest t=ac.getBean("txn1",TransactionTest.class);
		
		Catalog cc=new Catalog();
		cc.setItemCode(1);
		cc.setItemName("Pen");
		
		t.wareHouseReadUncomitted(cc);
		
		
	}
}
