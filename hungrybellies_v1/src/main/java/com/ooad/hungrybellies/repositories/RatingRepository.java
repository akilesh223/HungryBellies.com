package com.ooad.hungrybellies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ooad.hungrybellies.entities.Rating;


public interface RatingRepository extends JpaRepository<Rating, Long>{

}
