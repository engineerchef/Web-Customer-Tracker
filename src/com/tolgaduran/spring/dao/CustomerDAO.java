package com.tolgaduran.spring.dao;

import java.util.List;

import com.tolgaduran.spring.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
