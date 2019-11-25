package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Address;



public interface AddressRepository  extends JpaRepository<Address, Long>{

}
