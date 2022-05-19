package com.springmvc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
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
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import com.springmvc.entity.Customer;
import com.springmvc.repo.CustomerRepo;

import junit.framework.Assert;
//import com.springmvc.service.impl.CustomerServiceImpl;



@SuppressWarnings("deprecation")
@DataJpaTest
class SpringMvcApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private CustomerRepo repository;
	
//	@Autowired
//	private CustomerServiceImpl service;
	
//	@SuppressWarnings("unchecked")
//	@Test
//	public void getCutomersTest() {
//		when(repository.findAll()).thenReturn(Stream.of(new Customer("Mayank","838403098","mayank@gmail.com"),new Customer("lakhan","8457490580","anshika@gmail.com")).collect(Collectors.toList()));
//		//int size = service.size();
//		
//     	int size = 2;
//		assertEquals(2,size);
//	}
	
	@Test
	
	public void testCreateCustomer() {
		Long id = 1l;
		Customer cust = new Customer("Anjum","85094580","Anjum@gmail.com");
		Customer customer = repository.save(cust);
		assertNotNull(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Long id = 1l;
		Customer cust = repository.getById(id);
		assertEquals(cust.getCustID(),id);
	}
	
//	@Test
//	@Rollback(false)
//	public void testDeleteProduct() {
//		Long id = 1l;
//		boolean isExistBeforeDelete = repository.findById(id).isPresent();
//		repository.deleteById(id);
//		
//		boolean notExistAfterDelete = repository.findById(id).isPresent();
//		
//		assertTrue(isExistBeforeDelete);
//		assertTrue(notExistAfterDelete);
//	}
	
//	@Test
//	
//	public void testListCustomer() {
//		List<Customer> customer = (List<Customer>)repository.findAll();
//		for(Customer cust: customer) {
//			System.out.println(cust);
//		}
//		
//		//Assert.assertThat(customer).size().isGreaterThan(0);
//		int size = customer.size();
//		assertTrue(size> 3);
//	}

}

