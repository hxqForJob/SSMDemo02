package com.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.utils.PageBean;
import com.ssm.pojo.BaseDict;
import com.ssm.pojo.Customer;
import com.ssm.pojo.QueryItem;
import com.ssm.service.BaseDictService;
import com.ssm.service.CustomeService;

@Controller
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomeService cusService;
	
	@RequestMapping("/customer")
	public String list(QueryItem item,Model model)
	{
		//判断当前页是否为空和0
		if(item.getCurrentPage()==null||item.getCurrentPage()==0)
		{
			item.setCurrentPage(1);
		}
		//查询
		PageBean<Customer> cuses=	cusService.findCustomer(item);
		model.addAttribute("page", cuses);
		//下拉框
		List<BaseDict> cuSource= baseDictService.findByType("002");
		List<BaseDict> cuIndustry= baseDictService.findByType("001");
		List<BaseDict> cuLevel= baseDictService.findByType("006");
		Map<String,Object> attributeMap=new HashMap<>();
		attributeMap.put("sourceList", cuSource);
		attributeMap.put("industryList", cuIndustry);
		attributeMap.put("levelList", cuLevel);
		model.addAllAttributes(attributeMap);
		//回显
		model.addAttribute("custName", item.getCustName());
		model.addAttribute("custSource", item.getCustSource());
		model.addAttribute("custIndustry", item.getCustIndustry());
		model.addAttribute("custLevel", item.getCustLevel());
		return "customer";
	}
	
	
	@RequestMapping("/edit/{id}")
	@ResponseBody
	public Customer edit(@PathVariable("id")int id)
	{
		Customer customer= cusService.findCustomerById(id);
		return customer;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public boolean update(Customer cus)
	{
		 boolean flag;
		 try {
			 cusService.update(cus);
			 flag=true;
		} catch (Exception e) {
			flag=false;
		}
		
		return flag;
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public boolean delete(@PathVariable("id") int id)
	{
		 boolean flag;
		 try {
			 cusService.delete(id);
			 flag=true;
		} catch (Exception e) {
			flag=false;
		}
		
		return flag;
	}

	
}
