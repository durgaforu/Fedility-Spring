package com;

import org.springframework.stereotype.Component;

@Component("c2")
public class C2 implements MyInter{
	@Override
	public void getInfo() {
	System.out.println("---- Info About C2");
		
	}

}
