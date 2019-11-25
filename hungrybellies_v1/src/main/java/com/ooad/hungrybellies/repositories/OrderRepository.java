package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ooad.hungrybellies.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
