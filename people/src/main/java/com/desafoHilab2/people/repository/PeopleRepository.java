package com.desafoHilab2.people.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.desafoHilab2.people.model.People;

@Repository
public interface PeopleRepository extends MongoRepository<People, String>{
	
	public List<People> findByName(String name);
}
