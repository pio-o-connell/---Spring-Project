package com.HDipCloud.domain;

import java.util.Date;

public class UnRegistrationModuleQueue {
    String course_code;
	String actual_module_no;
	Integer	semester_no;
	String	student_ID;
	Date application_date;
	
	
	public UnRegistrationModuleQueue(String course_code,String actual_module_no,Integer	semester_no,String student_ID,Date application_date){
		this.course_code = course_code;
		this.actual_module_no = actual_module_no;
		this.semester_no = semester_no;
		this.student_ID = student_ID;
		this.application_date= application_date;
	}


	public String getCourse_code() {
		return course_code;
	}


	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}


	public String getActual_module_no() {
		return actual_module_no;
	}


	public void setActual_module_no(String actual_module_no) {
		this.actual_module_no = actual_module_no;
	}


	public Integer getSemester_no() {
		return semester_no;
	}


	public void setSemester_no(Integer semester_no) {
		this.semester_no = semester_no;
	}


	public String getStudent_ID() {
		return student_ID;
	}


	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}


	public Date getApplication_date() {
		return application_date;
	}


	public void setApplication_date(Date application_date) {
		this.application_date = application_date;
	}
	
	
}
