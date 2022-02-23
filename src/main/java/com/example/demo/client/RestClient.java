package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Person;

@Component
public class RestClient {
public void getRequest() {
	final String uri="http://localhost:8082/get";
	System.out.println("rest client 1");
	Person pn=new Person();
	pn.setId(1);
	pn.setName("Akhil");
	pn.setAddr("HYD");
	RestTemplate rt=new RestTemplate();
	Person rp=rt.postForObject(uri, pn, Person.class);
//	System.out.println(rp.getName());
//	System.out.println(rp);
}
}
