package com.ooad.hungrybellies.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="RestaurantUser")
@EntityListeners(AuditingEntityListener.class)
public class RestaurantUser extends User{

	@OneToMany
	private List<Restaurant> restaurants;

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	
	
	
}
