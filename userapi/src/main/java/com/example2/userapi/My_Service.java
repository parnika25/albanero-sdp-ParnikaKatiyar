package com.example2.userapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class My_Service 
{
	@Autowired
	private user_Repository repository;
	
	public user1 update(String username) 
	{
		user1 u= repository.findByusername(username);
		String str = u.full_name;
		str = str.replaceAll("[AEIOUaeiou]" , "#");
		u.full_name = str;
		return repository.save(u);
	}
	
	public void delete(String username)
	{
		user1 u =repository.findByusername(username);
		repository.delete(u);
	}
	
	
}


