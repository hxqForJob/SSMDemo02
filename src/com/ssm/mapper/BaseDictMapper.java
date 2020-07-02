package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.BaseDict;

public interface BaseDictMapper {

	List<BaseDict> findByType(String typeCode);

}
