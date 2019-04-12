package com.skcc.labs.biz_name2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.labs.biz_name2.repository.mybatis.ByeMapper;

@Service("byeService")
public class ByeService {
	
	private ByeMapper byeMapper;
	
	@Autowired
	public ByeService(ByeMapper byeMapper) {
		this.byeMapper = byeMapper;
	}
	
	public String getByeMessage(String locale) {
		return byeMapper.findByLocale(locale);
	}

}
