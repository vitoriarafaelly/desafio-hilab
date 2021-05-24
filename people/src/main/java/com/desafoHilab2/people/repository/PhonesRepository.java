package com.desafoHilab2.people.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.desafoHilab2.people.model.Phones;
@Repository
public interface PhonesRepository extends MongoRepository<Phones, String>{

}
