package com.mferreira.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mferreira.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
