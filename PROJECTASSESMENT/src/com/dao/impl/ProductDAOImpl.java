package com.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Product;
import com.dao.ProductDAO;

public class ProductDAOImpl extends ProductDAO
{

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	
	

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		
		
		
	}
	
	public boolean addProduct(Product product)
{
	return false;
	
}

public List<product> listProducts()
{
	
}
}
