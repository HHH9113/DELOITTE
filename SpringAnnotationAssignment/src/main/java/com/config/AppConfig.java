package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ContactDetails;
import com.Customer;

@Configuration
public class AppConfig {

	@Bean
	public Customer getCustomer()
	{
		return new Customer();
		
	}
	
	@Bean
	public ContactDetails getContactDetails() {
		
		
		return new ContactDetails();
		
	}
}
