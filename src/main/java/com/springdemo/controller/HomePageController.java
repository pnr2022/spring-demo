package com.springdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.model.Books;

@RestController
public class HomePageController {
	
	
	@RequestMapping("/hello")
	public String sayHello(){
		System.out.println("BBBBBBB");
		return "Hello";
	}
	
	
	/**
	@RequestMapping("/books")
	//@GetMapping("/books")
	public List<Books> getAllBooks() {
		System.out.println("BBBBBBB");
		return Arrays.asList(new Books(1, "Java", "Raju"));
	}
	
	**/

}

