package com.HDipCloud.domain;

public class ModuleAssignments {
	String actual_module_id ;
    String module_id ;
	String lecturer_ID;
	
	
	public ModuleAssignments(String actual_module_id,String module_id,String lecturer_ID){
		this.actual_module_id = actual_module_id;
		this.module_id = module_id;
		this.lecturer_ID = lecturer_ID;
	}
	
	
	
	public String getActual_module_id() {
		return actual_module_id;
	}
	public void setActual_module_id(String actual_module_id) {
		this.actual_module_id = actual_module_id;
	}
	public String getModule_id() {
		return module_id;
	}
	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}
	public String getLecturer_ID() {
		return lecturer_ID;
	}
	public void setLecturer_ID(String lecturer_ID) {
		this.lecturer_ID = lecturer_ID;
	}
}
