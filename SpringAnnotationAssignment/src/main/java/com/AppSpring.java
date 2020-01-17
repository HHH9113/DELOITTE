package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.config.AppConfig;

public class AppSpring  {

public static void main(String[] args) {
	


ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);



	
Customer customer= context.getBean(Customer.class);

customer.setCustomerID(1001);
customer.setCustomerName("himanshu");
customer.setCustomerAddress("bg");

customer.setBillAmount(8500);




ContactDetails contactDetails= context.getBean(ContactDetails.class);



contactDetails.setMobileNumber("8607973620");
contactDetails.setEmailID("hhhmail.hk@gmail.com");

System.out.println(customer);
	
	
	
}
}
