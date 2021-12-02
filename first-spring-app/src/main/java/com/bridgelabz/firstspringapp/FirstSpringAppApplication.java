package com.bridgelabz.firstspringapp;

import com.bridgelabz.firstspringapp.component.DemoBean;
import com.bridgelabz.firstspringapp.controller.HelloWebController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringAppApplication {
 public static final Logger logger = LoggerFactory.getLogger(FirstSpringAppApplication.class);

	public static void main(String[] args)
	{
		logger.debug("Welcome to Spring concept demo");
		ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloWebController.class));
	}
}