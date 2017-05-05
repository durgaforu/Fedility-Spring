package com;

import org.springframework.stereotype.Component;

@Component("c1")
public class C1 implements MyInter {
	@Override
	public void getInfo() {
		System.out.println("---- Info About C1");

	}

}
