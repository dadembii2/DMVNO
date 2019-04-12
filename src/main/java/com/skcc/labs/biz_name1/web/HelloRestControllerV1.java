package com.skcc.labs.biz_name1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.skcc.labs.biz_name1.service.HelloService;

@RestController
@RequestMapping("/v1")
public class HelloRestControllerV1 {
	
	private HelloService helloService;
	
	@Autowired
	public HelloRestControllerV1(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@GetMapping("/{locale}/hello")
	public String getHelloMessage(@PathVariable String locale) {
		return helloService.getHelloMessage(locale);
	}

}
