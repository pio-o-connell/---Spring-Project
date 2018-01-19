package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class CollegeCoursesJdbcTemplate {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	public void createCourse(String course_ID,String course_description) {
		String SQL = "insert into Courses(course_ID,course_description) values (?,?)";
		jdbcTemplateObject.update(SQL, new Object[] { course_ID,course_description});
		System.out.println("Created Record Name = " + course_ID);
		return;	
	}
	public void deleteCourse(String course_ID,String course_description){
		String SQL = "delete from Courses where course_ID = ?";
		jdbcTemplateObject.update(SQL, new Object[] {course_ID, course_description});
		System.out.println("Deleted Record with firstname = " + course_ID );
		return;
		}
	public void updateCourseDecription(String course_ID,String course_description){
		String SQL = "update Courses set course_description = ? where course_ID = ? ";
		jdbcTemplateObject.update(SQL,  new Object[] { course_ID,course_description});
		System.out.println("Updated Record with ID = " + course_ID );
		return;		
	}
	
	
	
	
	
	
}
