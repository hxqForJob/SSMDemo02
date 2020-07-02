package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.Customer;
import com.ssm.pojo.QueryItem;

public interface CustomerMapper {

	List<Customer> findCustomer(QueryItem item);
	
	int findCustomerCount(QueryItem item);

	Customer findCustomerById(int id);

	void update(Customer cus);

	void delete(int id);

	

}
