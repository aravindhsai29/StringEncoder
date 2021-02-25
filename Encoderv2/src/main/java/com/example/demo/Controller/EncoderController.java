package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;






@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping()
public class EncoderController {

	
	
	@Autowired
	private Service service;
	
	@GetMapping("encode/{input}")
	public String getencoders(@PathVariable("input") String input)
	{
		return service.getResult(input);
	}
	
	
	
}
