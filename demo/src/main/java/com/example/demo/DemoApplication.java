package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.client.RestClient;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DemoApplication {
	

	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("started");
		RestClient r= new RestClient();
		r.getRequest();
	}

}
