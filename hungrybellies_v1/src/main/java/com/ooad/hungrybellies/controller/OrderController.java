package com.ooad.hungrybellies.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ooad.hungrybellies.dao.OrderDAO;

import com.ooad.hungrybellies.entities.Order;

@RestController
@RequestMapping("/company")
public class OrderController {
	
	@Autowired
	OrderDAO orderDAO;
	
	/* to save an Order*/
	@PostMapping("/orders")
	public Order createEmployee(@Valid @RequestBody Order order) {
		//System.out.println("coming here");
		
		return orderDAO.save(order);
	}
	
	/*get all Orders*/
	@GetMapping("/orders")
	public List<Order> getAllOrders(){
		return orderDAO.findAll();
	}
	
	/*get employee by empid*/
	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable(value="id") Long orderid){
		
		Order order=orderDAO.findOne(orderid);
		
		if(orderid==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(order);
		
	}
	
	
	/*Delete an employee*/
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<Order> deleteOrder(@PathVariable(value="id") Long orderid){
		
		Order order=orderDAO.findOne(orderid);
		if(orderid==null) {
			return ResponseEntity.notFound().build();
		}
		orderDAO.delete(order);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	

}
