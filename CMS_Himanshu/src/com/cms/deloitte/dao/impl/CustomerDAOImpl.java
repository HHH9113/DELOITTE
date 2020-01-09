package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String INSERT_CUSTOMER_QUERY ="insert into hr.customer values(?,?,?,?) ";
	
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int result=0;
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement Statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			Statement.setInt(1, customer.getCustomerId());
			Statement.setString(2, customer.getCustomerName());
			Statement.setString(3, customer.getCustomerAddress());
				Statement.setInt(4, customer.getBillAmount());
				result=Statement.executeUpdate();

		} 
		catch(SQLException e)
		{
			e.printStackTrace();
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		if(result==0)
		return false;
		else
			return true;
		
		
		
		
		
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
