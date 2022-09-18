package com.sonata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.sonata.intf.LoginInterface;
import com.sonata.intf.OrderInterface;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		OrderInterface placeOrder = (OrderInterface) factory.getBean("placeOrder");
		System.out.println( placeOrder.placeOrder("sahana", "root@2022", 7895));
		
	}

}
