package com.desafoHilab2.people.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.desafoHilab2.people.model.People;


public interface PeopleService {
	
	public List<People> findAll();
	public People findById(String id);
	public People create(People people);
	public ResponseEntity<People> update(String id, People people);
	public void delete(People people);
	public List<People> findByName(String name);
	
}
