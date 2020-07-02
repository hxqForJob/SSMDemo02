package com.ssm.service;

import java.util.List;

import com.ssm.pojo.BaseDict;

public interface BaseDictService {

	List<BaseDict> findByType(String typeCode);

	

}
