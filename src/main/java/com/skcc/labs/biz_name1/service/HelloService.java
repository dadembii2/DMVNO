package com.skcc.labs.biz_name1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.labs.biz_name1.repository.mybatis.HelloMapper;

@Service("helloService")
public class HelloService {
	
	private HelloMapper helloMapper;
	
	@Autowired
	public HelloService(HelloMapper helloMapper) {
		this.helloMapper = helloMapper;
	}
	
	public String getHelloMessage(String locale) {
		return helloMapper.findByLocale(locale);
	}

}
