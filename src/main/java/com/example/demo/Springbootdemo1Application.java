package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Springbootdemo1Application {
	public static Logger logger=LoggerFactory.getLogger(Springbootdemo1Application.class);

	@PostConstruct
	public void init()
	{
		logger.info("Application Started......");
		logger.info("init method...................................");
	}

	public static void main(String[] args) {
		logger.info("main method...................................");
System.out.println("main method ***********");
		SpringApplication.run(Springbootdemo1Application.class, args);
	}

}
