package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.Person;
import com.HDipCloud.interfaces.student;

public class studentImpl extends Person implements student {
	
	String studentCollegeAddress1;
	String studentCollegeAddress2;
	

	public studentImpl(String firstname, String lastname){
		super(firstname, lastname);
			
	}
		
	public studentImpl(){
		super();
	}

	public String getStudentCollegeAddress1() {
		return studentCollegeAddress1;
	}

	public void setStudentCollegeAddress1(String studentCollegeAddress1) {
		this.studentCollegeAddress1 = studentCollegeAddress1;
	}

	public String getStudentCollegeAddress2() {
		return studentCollegeAddress2;
	}

	public void setStudentCollegeAddress2(String studentCollegeAddress2) {
		this.studentCollegeAddress2 = studentCollegeAddress2;
	}



}
