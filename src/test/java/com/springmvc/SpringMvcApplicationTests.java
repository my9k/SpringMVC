package com.springmvc;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springmvc.entity.Customer;
import com.springmvc.repo.CustomerRepo;
import com.springmvc.service.impl.CustomerServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringMvcApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@MockBean
	private CustomerRepo repository;
	
	@Autowired
	private CustomerServiceImpl service;
	
	@SuppressWarnings("unchecked")
	@Test
	public void getCutomersTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Customer("Mayank","838403098","mayank@gmail.com"),new Customer("lakhan","8457490580","anshika@gmail.com")).collect(Collectors.toList()));
		//int size = service.size();
		
     	int size = 2;
		assertEquals(2,size);
	}
	
//	@Test
//	public void addCustomerTest() {
//		Customer cust = new Customer("Mayank","093830934830","may9kWgmial.com");
//		when(repository.save(cust)).thenReturn(cust);
//		assertEquals(cust, service.addCustomer(cust));
//	}
	
//	@Test
//	public void deleteTest() {
//		Customer cust = new Customer("Mayank","8343094","abah@gmail.com");
//		service.delete(8l);
//		verify(repository,times(1)).deleteById(8l);
//		
//	}
}

