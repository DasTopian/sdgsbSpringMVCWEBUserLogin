package com.lti.training.springbootrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lti.training.controller","com.lti.training.service","com.lti.training.dao"})	//spring will create obj for classes in this package.usually done in xml but not here
@EntityScan("com.lti.training.entity")
public class SpringBootRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDemoApplication.class, args);
		
	}

}
