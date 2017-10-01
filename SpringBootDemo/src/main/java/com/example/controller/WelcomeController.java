package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.WelcomeService;


@RestController
@ComponentScan("com.example.service")
public class WelcomeController {
	@Autowired
	private WelcomeService  service;
	
	@RequestMapping("/welcome")
	public String getWelcomeMsg(){
			return service.getWelcomeMsg();
	}
}
