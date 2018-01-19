package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CollegeCourseCoordinatorAssignmentsJdbcTemplate {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	public void createCourseAssignment(String course_code,Integer semester,String lecturer_ID) {
		String SQL = "insert into Coordinator (course_code, semester, lecturer_ID) values (?,?,?)";
		jdbcTemplateObject.update(SQL, new Object[] {course_code, semester, lecturer_ID});
		System.out.println("Created Record Name = " + course_code);
		return;	
	}
	public void deleteCourseAssignment(String course_code,Integer semester,String lecturer_ID){
		String SQL = "delete from Coordinator "
							+ "where "
							+ "semester = ?"
							+ "lecturer_ID = ? "
							;
		jdbcTemplateObject.update(SQL, new Object[] {course_code,semester,lecturer_ID});
		System.out.println("Deleted Record with firstname = " + course_code );
		return;
	}
		
	public void modifyCourseAssignment(String course_code,Integer semester,String lecturer_ID){
			String SQL = "update Coordinator set lecturer_ID = ? where semester = ? AND module_code= ? ";
			jdbcTemplateObject.update(SQL,  new Object[] { course_code,semester,lecturer_ID});
			System.out.println("Updated Record with ID = " + course_code );
			return;	
		}
}