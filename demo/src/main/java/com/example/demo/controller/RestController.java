package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.client.RestClient2;
import com.example.demo.dto.Person;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	Person per;
	@Autowired
	RestClient2 r2;

	@PostMapping(value="/get",produces = MediaType.APPLICATION_JSON_VALUE)
private Person get(@RequestBody Person p) {
	System.out.println("In get1");
	//System.out.println(body.get("name"));
//	per.setId(1);
//	per.setName("Akhil");
//	per.setAddr("HYD");
	System.out.println("get1 "+p.getAddr());
	r2.getRequest(p);
	return p;
}
	
	@PostMapping(value="/get2",produces = MediaType.APPLICATION_JSON_VALUE)
private Person get2(@RequestBody Person p2) {
	System.out.println("In get2");
	//System.out.println(body.get("name"));
//	per.setId(1);
//	per.setName("Akhil");
//	per.setAddr("HYD");
	System.out.println("get2 "+p2.getAddr());
	return p2;
}
}
