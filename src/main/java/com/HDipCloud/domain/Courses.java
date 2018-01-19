package com.HDipCloud.domain;

public class Courses {
	String course_ID;
	String course_description;
	
	public Courses(String course_ID,String course_description){
		this.course_ID = course_ID;
		this.course_description = course_description;
	}

	public String getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	
	
}
