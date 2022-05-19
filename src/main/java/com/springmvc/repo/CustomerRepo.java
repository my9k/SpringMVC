package com.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.springmvc.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
