package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value={"com"})
public class AppConfig {

/*	@Bean
	@Scope
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean(name = "c1")
	//@Primary
	public C1 getC1() {
		return new C1();
	}

	@Bean(name = "c2")
	//@Primary
	public C2 getC2() {
		return new C2();
	}

	
	@Bean
	public App getApp(){
		return new App();
	}*/
}
