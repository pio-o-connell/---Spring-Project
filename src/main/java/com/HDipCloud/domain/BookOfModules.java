package com.HDipCloud.domain;


public class BookOfModules {
	String module_ID;
	String module_code;
	String module_description;
	
	
	
	public BookOfModules(String module_ID,String module_code,String module_description){
		this.module_ID = module_ID;
		this.module_code = module_code;
		this.module_description = module_description;
	}
	public String getModule_ID() {
		return module_ID;
	}
	public void setModule_ID(String module_ID) {
		this.module_ID = module_ID;
	}
	public String getModule_code() {
		return module_code;
	}
	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}
	public String getModule_description() {
		return module_description;
	}
	public void setModule_description(String module_description) {
		this.module_description = module_description;
	}	
}
