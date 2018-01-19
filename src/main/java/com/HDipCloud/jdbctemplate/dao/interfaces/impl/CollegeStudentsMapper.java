package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.HDipCloud.interfaces.impl.studentImpl;


	public class CollegeStudentsMapper implements RowMapper{

		 public studentImpl mapRow(ResultSet rs, int rowNum) throws SQLException {
			  studentImpl student = new studentImpl();
		      student.setFirstname(rs.getString("student_first_names"));
		      student.setLastname(rs.getString("student_surname"));    
		      return student;
		   }

	 
}
