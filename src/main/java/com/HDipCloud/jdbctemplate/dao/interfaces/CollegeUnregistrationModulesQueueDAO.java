package com.HDipCloud.jdbctemplate.dao.interfaces;

import java.util.Date;

import org.springframework.stereotype.Service;
@Service
public interface CollegeUnregistrationModulesQueueDAO {
	public void createModule(String course_code,String actual_module_id,Integer	semester_no,String student_ID,Date application_date) ;
	public void deleteModule(String course_code,String actual_module_id,Integer	semester_no,String student_ID,Date application_date);
}
