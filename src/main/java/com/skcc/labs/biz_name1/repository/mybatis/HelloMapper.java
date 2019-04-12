package com.skcc.labs.biz_name1.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {
	
	@Select("select msg from hello where locale=#{locale}")
	public String findByLocale(String locale);
	
}
