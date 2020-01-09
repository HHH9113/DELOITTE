package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;


public class CustomerDAOImpl implements CustomerDAO {

	
	Configuration configuration = new Configuration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	
	
	
	
 
	public boolean addCustomer(Customer customer) {
		
		// TODO Auto-generated method stub
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	session.save(customer);
	transaction.commit();
	
	session.close();	
		return false;
	}

 
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		session.update(customer);
		
		

		transaction.commit();
		
		session.close();	
			return false;
			}

 
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		

		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Customer customer= new Customer();
		customer.setCustomerId(customerId);
		
		
		session.delete(customer);
		transaction.commit();
		
		session.close();		
		return false;
	}

 
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		
Session session = factory.openSession();
		
		Query query = session.createQuery("from Customer");
		return query.list();
	}

 
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
	
		

		Session session = factory.openSession();
		
	Customer customer =	(Customer)session.get(Customer.class, customerId);

	session.close();
		
		
		return customer;
	}

	
	
	
	
	
	
	
	
	
	
	
	
 
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		
	Customer customer =	(Customer)session.get(Customer.class, customerId);

	session.close();
		if (customer==null)
		{
			
return false;
		}
		else 
		{
			
			return true;
		}
		
		
		}



}
