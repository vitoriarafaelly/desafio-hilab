package com.desafoHilab2.people.PeopleServiceImpl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.desafoHilab2.people.Service.PeopleService;
import com.desafoHilab2.people.model.People;
import com.desafoHilab2.people.repository.PeopleRepository;


@Service
public class PeopleServiceImpl implements PeopleService {
	
	@Autowired
	PeopleRepository peopleRepository;

	@Override
	public List<People> findAll() {
		return this.peopleRepository.findAll();
	}

	@Override
	public People findById(String id) {
		return this.peopleRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException());
	}

	@Override
	public People create(People people) {
		return this.peopleRepository.save(people);
	}

	@Override
	public ResponseEntity<People> update(@PathVariable("id") String id, @Valid @RequestBody People people) {
		Optional<People> peopleData = peopleRepository.findById(id);
		if(peopleData.isPresent()) {
			People peopleUp = peopleData.get();
			peopleUp.setId(people.getId());
			peopleUp.setStatus(people.getStatus());
			peopleUp.setGivenName(people.getGivenName());
			peopleUp.setFamilyName(people.getFamilyName());
			peopleUp.setBirthDate(people.getBirthDate());
			peopleUp.setAddress(people.getAddress());
			peopleUp.setPhones(people.getPhones());
			return new ResponseEntity<>(peopleRepository.save(peopleUp), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	@Override
	public void delete(People people) {
		this.peopleRepository.delete(people);
	}





}
