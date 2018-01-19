package com.HDipCloud.jdbctemplate.dao.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface CollegeRegistrationDAO {

	public void createModule(String course_code,String actual_module_id,int semester_no,String student_ID) ;
	public void deleteModule(String actual_module_id,String student_ID);
}
