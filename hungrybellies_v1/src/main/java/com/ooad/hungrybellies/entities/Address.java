package com.ooad.hungrybellies.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Address")
@EntityListeners(AuditingEntityListener.class)

public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String steetLine1;
	
	@Column
	private String steetLine2;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String pinCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSteetLine1() {
		return steetLine1;
	}

	public void setSteetLine1(String steetLine1) {
		this.steetLine1 = steetLine1;
	}

	public String getSteetLine2() {
		return steetLine2;
	}

	public void setSteetLine2(String steetLine2) {
		this.steetLine2 = steetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	

}
