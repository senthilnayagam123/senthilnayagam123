package com.config;

import org.springframework.stereotype.Component;

//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;

@Component
public class Manager implements Employee {


	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("manager office");
	}

}
