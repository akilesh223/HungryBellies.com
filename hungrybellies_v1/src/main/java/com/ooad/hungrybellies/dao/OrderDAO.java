package com.ooad.hungrybellies.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ooad.hungrybellies.entities.Order;
import com.ooad.hungrybellies.entities.User;
import com.ooad.hungrybellies.repositories.OrderRepository;
import com.ooad.hungrybellies.repositories.UserRepository;

@Service
public class OrderDAO {
	
	@Autowired
	OrderRepository orderRepository;
	
	/*to save an Order*/
	
	public Order save(Order order) {
		return orderRepository.save(order);
	}
	
	
	/* search all Orders*/
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	
	/*get an Order by id*/
	public Order findOne(Long orderId) {
		return orderRepository.findOne(orderId);
	}
	
	
	/*delete an Order*/
	
	public void delete(Order order) {
		orderRepository.delete(order);
	}
	

}
