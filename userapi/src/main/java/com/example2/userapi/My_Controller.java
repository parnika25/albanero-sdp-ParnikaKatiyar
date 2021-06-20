package com.example2.userapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/userapi")
public class My_Controller 
{
	@Autowired
	private user_Repository repository;
	
	@Autowired
	private My_Service service;
	
	@PostMapping(path="/add") 
	public user1 adduser(@RequestBody user1 user) 
	{
		repository.save(user);
		return user;
	}
	
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<user1> getAllUsers() 
	  {
	  
	    return repository.findAll();
	  }
	  
	  @PutMapping(path="/update/user/{username}")
		public String update(@PathVariable String username)
		{
			user1 u = service.update(username);
			return u.toString();
		}
	  
	  @DeleteMapping(path="/delete/user/{username}")
		public String delete(@PathVariable String username)
		{
			service.delete(username);
			return "Delete by username : " +username;
		
		}
			  
}

