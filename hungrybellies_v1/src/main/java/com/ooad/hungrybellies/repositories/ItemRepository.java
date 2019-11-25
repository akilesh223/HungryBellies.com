package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Item;


public interface ItemRepository extends JpaRepository<Item, Long>{

}
