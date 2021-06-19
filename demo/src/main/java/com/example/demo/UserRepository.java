package com.example.demo;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

@SuppressWarnings("unused")
public interface UserRepository extends CrudRepository<User, Integer> {

}