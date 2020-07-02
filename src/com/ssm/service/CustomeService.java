package com.ssm.service;

import java.util.List;

import com.ssm.common.utils.PageBean;
import com.ssm.pojo.Customer;
import com.ssm.pojo.QueryItem;

public interface CustomeService {

	PageBean<Customer> findCustomer(QueryItem item);

	Customer findCustomerById(int id);

	void update(Customer cus);

	void delete(int id);

}
