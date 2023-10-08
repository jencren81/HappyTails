package com.example.happytails.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.happytails.model.Users;



public interface UserRepository extends CrudRepository<Users, Integer> {
	public Users findByUsernameAndPassword(String username, String password);

}
