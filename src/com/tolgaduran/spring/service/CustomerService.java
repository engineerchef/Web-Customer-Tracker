package com.tolgaduran.spring.service;

import java.util.List;

import com.tolgaduran.spring.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
