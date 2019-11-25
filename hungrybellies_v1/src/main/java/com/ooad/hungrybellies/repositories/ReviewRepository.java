package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Review;


public interface ReviewRepository extends JpaRepository<Review, Long>{

}
