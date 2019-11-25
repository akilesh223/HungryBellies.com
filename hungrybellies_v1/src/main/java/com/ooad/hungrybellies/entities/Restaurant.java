package com.ooad.hungrybellies.entities;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Restaurant")
@EntityListeners(AuditingEntityListener.class)

public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String address;
	
	@OneToMany
	private List<Item> listOfItems;
	
	@OneToOne
	private Rating rating;
	
	@OneToMany
	private List<Review> reviews;
	
	private Timestamp openTime;
	
	
	private Timestamp closeTime;
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date createdAt;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public List<Item> getListOfItems() {
		return listOfItems;
	}



	public void setListOfItems(List<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}



	public Rating getRating() {
		return rating;
	}



	public void setRating(Rating rating) {
		this.rating = rating;
	}



	public List<Review> getReviews() {
		return reviews;
	}



	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}



	public Timestamp getOpenTime() {
		return openTime;
	}



	public void setOpenTime(Timestamp openTime) {
		this.openTime = openTime;
	}



	public Timestamp getCloseTime() {
		return closeTime;
	}



	public void setCloseTime(Timestamp closeTime) {
		this.closeTime = closeTime;
	}



	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	

}
