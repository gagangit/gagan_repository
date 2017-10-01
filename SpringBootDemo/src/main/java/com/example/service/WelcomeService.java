package com.example.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.example.service")
public class WelcomeService {
	public String getWelcomeMsg(){
		return "Welcome to springboot";
	}
}
