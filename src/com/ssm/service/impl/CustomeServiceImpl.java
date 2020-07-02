package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.common.utils.PageBean;
import com.ssm.mapper.CustomerMapper;
import com.ssm.pojo.Customer;
import com.ssm.pojo.QueryItem;
import com.ssm.service.CustomeService;

@Service
public class CustomeServiceImpl implements CustomeService {

	@Autowired
	private CustomerMapper cusMapper;
	
	@Override
	public PageBean<Customer> findCustomer(QueryItem item) {
		PageBean<Customer> page =new PageBean<>();
		List<Customer> list= cusMapper.findCustomer(item);	
		int count=cusMapper.findCustomerCount(item);
		page.setCurrentPage(item.getCurrentPage()); 
		page.setList(list);
		page.setTotalCount(count);
		page.setPageSize(item.getPageSize());
		return page;
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		return cusMapper.findCustomerById(id);
	}

	@Override
	public void update(Customer cus) {
		// TODO Auto-generated method stub
		cusMapper.update(cus);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cusMapper.delete(id);
	}

	

}
