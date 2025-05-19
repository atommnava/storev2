package com.atom.storev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Storev2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Storev2Application.class, args);
		var orderService = context.getBean(OrderService.class);
		// Application content is our IOC container.
		// It's our storage for our object
		//var orderService = new OrderService();

		orderService.placeOrder();
	}

}
