package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/one")
	public ModelAndView m1() {

		ModelAndView mav = new ModelAndView();
		String empName = "James";
		
		mav.addObject("ename", empName);
		mav.setViewName("disp");
		

		System.out.println("---- MyController m1 executed");
		return mav;
	}

	@RequestMapping(value = "/two.htm")
	public void m2() {
		System.out.println("---- MyController m2 executed");
	}

}
