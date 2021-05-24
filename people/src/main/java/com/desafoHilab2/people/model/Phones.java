package com.desafoHilab2.people.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Phones {
	@Id
	private String id;
	private String[] number;
	
	public Phones(String id, String[] number) {
		this.id = id;
		this.number = number;
	}

	public String[] getNumber() {
		return number;
	}

	public void setNumber(String[] number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
