package edu.mum.extra.dao;

import org.springframework.data.repository.CrudRepository;

import edu.mum.extra.entity.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
}
