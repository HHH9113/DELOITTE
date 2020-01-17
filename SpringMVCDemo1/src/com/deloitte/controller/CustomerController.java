package com.deloitte.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;
import com.cms.deloitte.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("customerSave")
	public ModelAndView saveCustomerDetails(Customer customer) {
		System.out.println(customer);
		customerService.addCustomer(customer);
		customerService.updateCustomer(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		view.addObject("custo", customer);
		return view;
	}

	@RequestMapping("CustomerDetails")
	public ModelAndView customerDetails(HttpSession session) {

		ModelAndView view = new ModelAndView();
		view.setViewName("allCustomerRecords2");
		List<Customer> allCustomers = customerService.listCustomers();

		session.setAttribute("allCust", allCustomers);
		return view;
	}

	@RequestMapping("updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) {

		ModelAndView view = new ModelAndView();
		view.addObject("custo", customer);
		if (customerService.isCustomerExists(customer.getCustomerId())) {
			customerService.updateCustomer(customer);
			view.setViewName("result");

		} else {
			view.setViewName("error");
		}

		return view;
	}

}
