package com.hibernate.Program1.models;
// Plain Old Java Object (POJO Class)

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;



@Entity
@Table (name="Customer") // If no name so it will take class name by default
public class Customer 
{
	@Id
	@Column
	int coustomerId;
	
	@Column
	String customerName;

	@Column 
	String mobNo;
	
	public Customer()
	{
		
	}

	public Customer(int coustomerId, String customerName, String mobNo) {
		super();
		this.coustomerId = coustomerId;
		this.customerName = customerName;
		this.mobNo = mobNo;
	}

	public int getCoustomerId() {
		return coustomerId;
	}

	public void setCoustomerId(int coustomerId) {
		this.coustomerId = coustomerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "Customer [coustomerId=" + coustomerId + ", customerName=" + customerName + ", mobNo=" + mobNo + "]";
	}
	
	
}
