package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App  {

public static void main(String[] args) {
	
	
	

	
	Customer customer= new Customer();
	customer.setCustomerName("Himanshu");
	
	System.out.println(customer);
	
	
	
	
}
}
