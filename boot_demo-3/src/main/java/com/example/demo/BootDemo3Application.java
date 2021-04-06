package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerRepository;

@SpringBootApplication
public class BootDemo3Application {

	private static final Logger log = LoggerFactory.getLogger(BootDemo3Application.class);

	public static void main(String[] args) {
		SpringApplication.run(BootDemo3Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		// 람다식표현
		return arg -> {
			// save = insert
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));
			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
		};// end of return
	}// end of CommandLineRunner
}// end of class
