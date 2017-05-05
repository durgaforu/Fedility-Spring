package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("--- Drawing Rectangle");

	}
}
