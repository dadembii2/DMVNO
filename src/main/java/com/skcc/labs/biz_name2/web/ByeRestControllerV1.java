package com.skcc.labs.biz_name2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.skcc.labs.biz_name2.service.ByeService;

@RestController
@RequestMapping("/v1")
public class ByeRestControllerV1 {
	
	private ByeService byeService;
	
	@Autowired
	public ByeRestControllerV1(ByeService byeService) {
		this.byeService = byeService;
	}
	
	@GetMapping("/{locale}/bye")
	public String getHelloMessage(@PathVariable String locale) {
		return byeService.getByeMessage(locale);
	}

}
