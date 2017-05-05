package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value={"com"})
public class AppLoader {

/*	@Bean(name="emp")
	@Scope(value="prototype")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	@Scope(value="prototype")
	public Department getDept(){
		return new Department();
	}
	*/

}
