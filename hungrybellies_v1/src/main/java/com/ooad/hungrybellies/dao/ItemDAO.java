package com.ooad.hungrybellies.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ooad.hungrybellies.entities.Address;
import com.ooad.hungrybellies.entities.Item;
import com.ooad.hungrybellies.entities.Order;
import com.ooad.hungrybellies.entities.User;
import com.ooad.hungrybellies.repositories.AddressRepository;
import com.ooad.hungrybellies.repositories.ItemRepository;
import com.ooad.hungrybellies.repositories.OrderRepository;
import com.ooad.hungrybellies.repositories.UserRepository;

@Service
public class ItemDAO {
	
	@Autowired
	ItemRepository itemRepository;
	
	/*to save an Item*/
	
	public Item save(Item add) {
		return itemRepository.save(add);
	}
	
	
	/* search all Items*/
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	
	
	/*get an Item by id*/
	public Item findOne(Long itemId) {
		return itemRepository.findOne(itemId);
	}
	
	
	/*delete an Item*/
	
	public void delete(Item item) {
		itemRepository.delete(item);
	}
	

}
