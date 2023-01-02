package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext is used for dependency injection
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjection1Application.class, args);
		//using this we can configure object of customers class. this is what handling objects at runtime mean
		//spring is injecting Customers object into our application
		Customers c1=context.getBean(Customers.class);//c1 is not normal java object but spring object
		c1.display();
	}

}
