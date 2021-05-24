package com.desafoHilab2.people.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class People {
	@Id
	private String id;
	private String status;
	private String givenName;
	private String familyName;
	private String birthDate;
	@DBRef
	private Address address;
	@DBRef
	private Phones phones;
	
	public People(String id, String status, String givenName, String familyName, String birthDate, Address address, Phones phones) {
		super();
		this.setId(id);
		this.setStatus(status);
		this.setGivenName(givenName);
		this.setFamilyName(familyName);
		this.setBirthDate(birthDate);
		this.setAddress(address);
		this.setPhones(phones);	
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phones getPhones() {
		return phones;
	}

	public void setPhones(Phones phones) {
		this.phones = phones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
