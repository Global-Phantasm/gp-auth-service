package com.gp.pf.auth.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gp.pf.auth.service.model.Auth;

public interface AuthRepository extends MongoRepository<Auth, String>{

}
