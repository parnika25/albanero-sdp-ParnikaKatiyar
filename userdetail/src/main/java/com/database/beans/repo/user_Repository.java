package com.database.beans.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.database.beans.input.user1;

@Repository

public interface user_Repository extends CrudRepository<user1, String> 
{

	public user1 findByusername(String username);
}