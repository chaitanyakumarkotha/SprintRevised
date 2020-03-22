package com.capgemini.onlinebookingsystem.dto;

public class Customer {
	Integer customerId;
	String customerName;
	public Customer(Integer id ,String name)
	{
		this.customerId=id;
		this.customerName=name;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

}
