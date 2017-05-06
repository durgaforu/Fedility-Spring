package com.app.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.spring.config.AppConfig;
import com.app.spring.dao.UserDaoImpl;
import com.app.spring.entities.User;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user=new User();
		user.setUserName("U1");
		user.setPassword("12345");
		
		UserDaoImpl userDao=  ac.getBean("userDao",UserDaoImpl.class);
		userDao.saveUser(user);
		
		System.out.println("---- Done ----");

	}

}
