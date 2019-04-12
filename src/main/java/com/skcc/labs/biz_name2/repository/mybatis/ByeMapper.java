package com.skcc.labs.biz_name2.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ByeMapper {
	
	@Select("select msg from bye where locale=#{locale}")
	public String findByLocale(String locale);
	
}
