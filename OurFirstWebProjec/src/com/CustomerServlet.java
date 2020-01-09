package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubint customerId =Integer.parseInt( request.getParameter("customerId"));
		int customerId= Integer.parseInt(request.getParameter("customerId"));
		
		String customerName = request.getParameter("customerName");
		String customerAddress= request.getParameter("customerAddress");
		int billAmount= Integer.parseInt(request.getParameter("billAmount"));
	
		
		Customer customer =new Customer(customerId,customerName,customerAddress,billAmount);

		CustomerDAO customerDAO =new CustomerDAOImpl();
		
		if(customerDAO.isCustomerExists(customerId))
		
		{
			response.getWriter().println("allready exists" + customerId);
				
		}
		else
		{
			customerDAO.addCustomer(customer);
			response.getWriter().print(customerName + "saved Successfuly");
			
		}
			
			
		response.getWriter().println("<h3>Customer ID : " + customerId);
		response.getWriter().println("<h3>Customer Name : " + customerName);
		response.getWriter().println("<h3>Customer Address : " + customerAddress);
		response.getWriter().println("<h3>bill : " + billAmount);
		
	}
	}


