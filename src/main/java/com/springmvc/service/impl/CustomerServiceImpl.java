package com.springmvc.service.impl;

import java.util.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.Customer;
import com.springmvc.repo.CustomerRepo;
import com.springmvc.service.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepository;

	
	int s=0;
	@Override
	public ModelAndView getCustomers(){
		List<Customer> customers = customerRepository.findAll();
		HashMap<String, List<Customer>> model = new HashMap<>();
		model.put("list", customers);
		 s = customers.size();
		//return customers;
		return new ModelAndView("customerList", model);
	}
	public int size() {
		return s;
	}
	
	@Override
	    public ModelAndView showForm() {
	        return new ModelAndView("customerForm");
	    }


	
	 @Override
	public ModelAndView addCustomer(HttpServletRequest req) {
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("email");
		
		Customer c = new Customer(name,mobile,email);
		customerRepository.save(c);
		HashMap<String, Customer> model = new HashMap<>();
		model.put("c", c);
		return  new ModelAndView("success", model);
	}
	
	@Override
	public String delete(Long id) {
		customerRepository.findById(id).ifPresent(customerRepository::delete);
		return "redirect:/customer/";
	}



}
