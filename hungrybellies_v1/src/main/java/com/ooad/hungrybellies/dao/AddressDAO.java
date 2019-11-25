package com.ooad.hungrybellies.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ooad.hungrybellies.entities.Address;
import com.ooad.hungrybellies.entities.Order;
import com.ooad.hungrybellies.entities.User;
import com.ooad.hungrybellies.repositories.AddressRepository;
import com.ooad.hungrybellies.repositories.OrderRepository;
import com.ooad.hungrybellies.repositories.UserRepository;

@Service
public class AddressDAO {
	
	@Autowired
	AddressRepository addressRepository;
	
	/*to save an address*/
	
	public Address save(Address add) {
		return addressRepository.save(add);
	}
	
	
	/* search all Orders*/
	
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
	
	
	/*get an Order by id*/
	public Address findOne(Long addId) {
		return addressRepository.findOne(addId);
	}
	
	
	/*delete an Order*/
	
	public void delete(Address address) {
		addressRepository.delete(address);
	}
	

}
