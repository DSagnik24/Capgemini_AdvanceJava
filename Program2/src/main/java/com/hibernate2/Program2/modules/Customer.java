package com.hibernate2.Program2.modules;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
//@Table(name="Customer")
public class Customer 
{
	@Id
	@Column
	int Id;
	@Column
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Customer_Details customer_details;
	
	public Customer()
	{
		
	}
	public Customer(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + "]";
	}
	public Customer_Details getCustomer_details() {
		return customer_details;
	}
	public void setCustomer_details(Customer_Details customer_details) {
		this.customer_details = customer_details;
	}
	
	
	
}
