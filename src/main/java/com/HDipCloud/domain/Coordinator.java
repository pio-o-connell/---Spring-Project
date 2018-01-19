package com.HDipCloud.domain;

public class Coordinator {
	 String course_code;
	 Integer semester;
	 String lecturer_ID;
	
	 public Coordinator(String course_code,Integer semester,String lecturer_ID){
		 this.course_code = course_code;
		 this.semester = semester;
		 this.lecturer_ID = lecturer_ID;
	 }

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public String getLecturer_ID() {
		return lecturer_ID;
	}

	public void setLecturer_ID(String lecturer_ID) {
		this.lecturer_ID = lecturer_ID;
	}
}
