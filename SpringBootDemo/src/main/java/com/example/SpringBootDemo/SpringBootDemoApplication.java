package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("hello world");

		alean obj=context.getBean(alean.class);
		obj.code();

	}

}
