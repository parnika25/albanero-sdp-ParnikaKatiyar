package com.example2.userapi;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example2.userapi.user1;

@SuppressWarnings("unused")
@Repository

public interface user_Repository extends CrudRepository<user1, String> 
{

	public user1 findByusername(String username);
}

