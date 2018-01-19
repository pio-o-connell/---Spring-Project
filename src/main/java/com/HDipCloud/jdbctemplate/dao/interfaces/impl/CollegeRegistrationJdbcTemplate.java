package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class CollegeRegistrationJdbcTemplate {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	public void createModule(String course_code,String actual_module_id,int semester_no,String student_ID) {
		String SQL = "insert into Registered (course_code,actual_module_id,semester_no, student_ID) values (?,?,?,?)";
		jdbcTemplateObject.update(SQL, new Object[] {course_code, actual_module_id, semester_no, student_ID});
		System.out.println("Created Record Name = " + course_code);
		return;	
	}
	public void deleteModule(String actual_module_id,String student_ID){
		String SQL = "delete from Registered where actual_module_id = ? and student_ID=?";
		jdbcTemplateObject.update(SQL, new Object[] {actual_module_id,student_ID});
		System.out.println("Deleted Record with firstname = " + actual_module_id );
		return;
		
	}

	
}
