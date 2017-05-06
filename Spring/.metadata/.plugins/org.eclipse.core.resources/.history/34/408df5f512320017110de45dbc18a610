package com.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shop.config.AppConfig;
import com.shop.service.BillingImpl;

public class Test {

	public static void main(String[] args) {
		String cart1[] = { "P01", "P02" };
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		BillingImpl bill = ac.getBean(BillingImpl.class);
		double tot = bill.getCartTotal(cart1);

		System.out.println("Total: " + tot);

	}

}
