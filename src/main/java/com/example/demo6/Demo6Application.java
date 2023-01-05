package com.example.demo6;

import com.example.demo6.service.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo6Application.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(Demo6Application.class, args);
//		OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);
//		orderService.execute();

	}
}
