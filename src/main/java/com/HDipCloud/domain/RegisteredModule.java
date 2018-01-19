package com.HDipCloud.domain;

public class RegisteredModule {
	
	String course_code ;
	String actual_module_id;  // reference stored internally under AM001...(not M001 as per BookOfModules) ,to assign lecturers
	Integer semester_no;
	String student_ID;
	
	public RegisteredModule(	String course_code,String actual_module_id,Integer semester_no,String student_ID){
		this.course_code = course_code;
		this.actual_module_id = actual_module_id;
		this.semester_no = semester_no;
		this.student_ID = student_ID;
	}
	
	
	public String getActual_module_id() {
		return actual_module_id;
	}


	public void setActual_module_id(String actual_module_id) {
		this.actual_module_id = actual_module_id;
	}


	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
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
	 

}
