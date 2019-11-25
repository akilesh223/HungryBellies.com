package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Customer;
import com.ooad.hungrybellies.entities.User;


public interface UserRepository  extends JpaRepository<User, Long>{

}
