package com.cms.deloitte.client;

import java.util.Scanner;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp()
	{
		System.out.println("####welcome to customer App#####");
		System.out.println("####1 ) Add customer App#####");
		System.out.println("####2 ) update customer #####");
		System.out.println("####3 ) to customer App#####");
		System.out.println("####welcome to customer App#####");
	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice(1-6)");
	int choice=scanner.nextInt();
	if(choice==1)
	{
	
		Customer customer = new Customer();
		customer.acceptCustomerDetails();
		CustomerDAOImpl impl=new CustomerDAOImpl();
		boolean result=impl.addCustomer(customer);
		System.out.println(result);
	}
	if(choice==6)
	{
	System.out.println("thank you for using");
	System.exit(0);
		
	}
	}
	
}



