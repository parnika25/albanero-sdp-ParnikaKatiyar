package com.database.beans.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.database.beans.input.user1;
import com.database.beans.repo.user_Repository;

@Service
public class My_Service 
{
	@Autowired
	private user_Repository repository;
	
	public user1 getByusername (String username)
	{
		return repository.findByusername(username);
	}
	
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
