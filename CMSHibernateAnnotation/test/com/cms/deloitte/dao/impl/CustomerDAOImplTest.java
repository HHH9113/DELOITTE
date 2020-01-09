package com.cms.deloitte.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.model.Customer;

class CustomerDAOImplTest {

	
	CustomerDAO customerDAO=new CustomerDAOImpl();
	
	@Test
	void testCustomerDAOImpl() {
		fail("Not yet implemented");
	}

	@Test
	void testAddCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	@Test
	void testListCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testFindCustomer() {
		Customer customer = new Customer(1006,"jayesh","pune",1000);
		customerDAO.addCustomer(customer);
		Customer customer2= customerDAO.findCustomer(customer.getCustomerId());
		assertEquals(customer, customer2);
				
		
		fail("Not yet implemented");
	}

	@Test
	void testIsCustomerExists() {
		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomerInt() {


		fail("Not yet implemented");
	}

	@Test
	void testFilterCustomerStringInt() {
		String customerAddress ="bg";
		int billAmount=1;
		List<Customer> allCustomers= customerDAO.filterCustomer(customerAddress, billAmount);
assertEquals(1, allCustomers.size());


			}

}
