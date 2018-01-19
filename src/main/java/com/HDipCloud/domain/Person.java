package com.HDipCloud.domain;

import java.util.Date;

public class Person {
	protected String id;
	protected String title;
	protected char	 sex;
	protected String firstname;
	protected String lastname;
	protected String home_address1;
	protected String home_address2;
	protected String email;
	protected String homeTelephone;
	protected String mobileTelephone;
	protected Date 	 dateOfBirth;
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String nationality;
	protected String ppsNumber;
	
	
	protected Person(){
		
	}
	
	protected Person(String firstname,String lastname){
	
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
