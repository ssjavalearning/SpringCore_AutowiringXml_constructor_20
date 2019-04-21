package com.suraj.spring.beans;

public class Person {

	private Integer personId;
	private String personName;
	private Passport passport;
	
	public Person(Integer personId, String personName, Passport passport) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.passport = passport;
	}

	public Integer getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public Passport getPassport() {
		return passport;
	}
}
