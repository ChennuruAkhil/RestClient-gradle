package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Person;

@Component
public class RestClient2 {
	public void getRequest(Person pn) {
		final String uri="http://localhost:8082/get2";
		RestTemplate rt=new RestTemplate();
		Person rp=rt.postForObject(uri, pn, Person.class);
		System.out.println("restclient2 "+rp.getName());
		System.out.println(rp);
	}

}
