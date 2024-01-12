package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TestController 
{

	
	@GetMapping("/listGeethanjali2008")
	public List<String> getGeethanjaliStudents() {
		System.out.println("rest service");
		List<String>  userList =  new ArrayList<>();
		
		userList.add("Bhargav");
		userList.add("Shankar");
		userList.add("Hari");
		userList.add("John");
		userList.add("Ramesh");
		userList.add("Tata");
		
		return userList;
	}
	
	
}
