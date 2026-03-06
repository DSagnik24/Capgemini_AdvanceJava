package com.hibernate2.Program2.modules;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer_Details 
{
	@Id
	@Column
	int id;
	
	@Column
	String mobile_no;
	
	@Column
	String address;
	
	@Column
	String email;
	
	@OneToOne(mappedBy ="customer_details" )
	private Customer customer;
	
	public Customer_Details()
	{
		
	}

	public Customer_Details(int id, String mobile_no, String address, String email) {
		super();
		this.id = id;
		this.mobile_no = mobile_no;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer_Details [id=" + id + ", mobile_no=" + mobile_no + ", address=" + address + ", email=" + email
				+ "]";
	}
	
}

