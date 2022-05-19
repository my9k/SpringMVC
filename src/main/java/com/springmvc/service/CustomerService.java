package com.springmvc.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.Customer;

import antlr.collections.List;

public interface CustomerService {
	
	//List<Customer> getCustomers();
	//ModelAndView getCustomers();
	ModelAndView showForm();
	ModelAndView addCustomer(HttpServletRequest req);
	String delete(Long id);
	//java.util.List<Customer> getCustomers();
	ModelAndView getCustomers();
	

}
