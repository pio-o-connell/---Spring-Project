package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CollegeUnregistrationModuleQueueJdbcTemplate {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	public void createModule(String course_code,String actual_module_id,Integer	semester_no,String student_ID,Date application_date) {
		String SQL = "insert into UnRegisteringQueue (course_code, actual_module_id, semester_no, student_ID,application_date) values (?,?,?,?,?)";
		jdbcTemplateObject.update(SQL, new Object[] {course_code, actual_module_id, semester_no, student_ID,application_date});
		System.out.println("Created Record Name = " + course_code);
		return;	
	}
	public void deleteModule(String course_code,String actual_module_id,Integer	semester_no,String student_ID,Date application_date){
		String SQL = "delete from UnRegisteringQueue "
							+ "where "
							+ "course_code = ?"
							+ "actual_module_id = ? "
							+ "and semester_no=? "
							+ "and student_ID=? "
							+ "and application_date=?"
							;
		jdbcTemplateObject.update(SQL, new Object[] {actual_module_id,semester_no,student_ID,application_date});
		System.out.println("Deleted Record with firstname = " + actual_module_id );
		return;
		
	}

}
