package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.BaseDictMapper;
import com.ssm.pojo.BaseDict;
import com.ssm.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> findByType(String typeCode) {
		// TODO Auto-generated method stub
		return baseDictMapper.findByType(typeCode);
	}
	
	

}
