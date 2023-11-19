package com.hexaware.customerapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Info")
public class Customer {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@SequenceGenerator(name="myseq") ---- not using autogenerated for bus passenger for all it will create 1 2 3 4 5
	private int customerId;
	private String customerName;
	private LocalDate dateOfBirth;
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, LocalDate dateOfBirth, int productId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.productId = productId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	private int productId;
	

}
