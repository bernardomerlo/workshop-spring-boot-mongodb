package com.bernardo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bernardo.workshopmongo.domain.User;

public interface UserRespository extends MongoRepository<User, String> {

}
