package com.eg2.string;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{

		@Autowired
			private Count c;
			
			@GetMapping("/string/{st}")
			public String get(@PathVariable(value="st")  String st) 
			{
				String s= c.counting(st);
				    return s;
			}

	}

