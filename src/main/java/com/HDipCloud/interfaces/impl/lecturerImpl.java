package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.Person;
import com.HDipCloud.interfaces.lecturer;

public class lecturerImpl extends Person implements lecturer{
	
	public lecturerImpl(String firstname, String lastname){
		super(firstname, lastname);
			
	}

	public lecturerImpl(){
		super();
	}


}
