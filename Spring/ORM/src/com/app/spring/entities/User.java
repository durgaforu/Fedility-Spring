package com.app.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class User {
	
	public User() {
		System.out.println("---- user obj");
	}

	@Id
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
