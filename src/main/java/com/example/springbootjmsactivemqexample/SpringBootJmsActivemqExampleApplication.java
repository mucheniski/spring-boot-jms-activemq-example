package com.example.springbootjmsactivemqexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringBootJmsActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsActivemqExampleApplication.class, args);
	}

}
