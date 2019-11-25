package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Restaurant;


public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
