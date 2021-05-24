package com.desafoHilab2.people.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.desafoHilab2.people.model.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String>{

}
