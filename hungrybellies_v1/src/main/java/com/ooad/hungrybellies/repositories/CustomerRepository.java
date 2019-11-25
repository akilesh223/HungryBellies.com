package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Customer;


public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
