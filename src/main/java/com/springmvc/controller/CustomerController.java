package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public ModelAndView getCustomers() {		
		return customerService.getCustomers();
	}
	
	 @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public ModelAndView showForm() {
	        return customerService.showForm();
	    }
	
	@PostMapping("/add")
	public ModelAndView addCustomer(HttpServletRequest req) {
		return customerService.addCustomer(req);
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {		
		return customerService.delete(id);
	}

	

}
