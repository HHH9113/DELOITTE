package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	
	@RequestMapping("/customer")
	public String pp()
	{
		return "cust";
	}
	
	@RequestMapping("/employee")
	public String emp()
	{
		return "employee";
	}
	
	
	@RequestMapping("/product")
	public String pr()
	{
		return "product";
	}
	@RequestMapping("/guest")
	public String guest()
	{
		return "guest";
	}
	
	
}
