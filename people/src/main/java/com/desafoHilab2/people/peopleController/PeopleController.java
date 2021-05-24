package com.desafoHilab2.people.peopleController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.desafoHilab2.people.Service.PeopleService;
import com.desafoHilab2.people.model.People;


@RestController
@RequestMapping("/")
public class PeopleController {
	
	@Autowired
	private PeopleService peopleService;
	
	@PostMapping("/create")
	public People create(@Valid @RequestBody People people) {
		return this.peopleService.create(people);
	}

	@PutMapping("/update")
	public void update(String id, People people) {
		peopleService.update(id, people);
	}
	
	@DeleteMapping("/delete")
	public void delete(People people) {
		peopleService.delete(people);
	}
	@GetMapping("/findall")
	public List<People> findAll() {
		return this.peopleService.findAll();
	}
	
	@GetMapping("/{id}")
	public People findById(@Valid @PathVariable String id) {
		return this.peopleService.findById(id);
	
	}
	@GetMapping("byname")
	public List<People> findByName(@RequestParam("givenName") String name){
		return this.peopleService.findByName(name);
	}


}
