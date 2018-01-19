package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.HDipCloud.jdbctemplate.dao.interfaces.CollegelecturerDAO;
@Repository
public class CollegeLecturerJdbcTemplate implements CollegelecturerDAO {
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	
	public void createLecturer(String lecturer_ID,String lecturer_first_names, String lecturer_surname) {
		String SQL = "insert into lecturer (lecturer_ID,lecturer_first_names, lecturer_surname) values (?,?, ?)";
		jdbcTemplateObject.update(SQL, new Object[] { lecturer_ID,lecturer_first_names, lecturer_surname});
		System.out.println("Created Record Name = " + lecturer_ID);
		return;	
	}
	public void deleteLecturer(String lecturer_first_names, String lecturer_surname){
		String SQL = "delete from lecturer where lecturer_first_names = ? and lecturer_surname = ?";
		jdbcTemplateObject.update(SQL, new Object[] {lecturer_first_names,lecturer_surname});
		System.out.println("Deleted Record with firstname = " + lecturer_first_names );
		return;
		
	}
	
	public void deleteLecturer(Integer lecturer_ID){
		String SQL = "delete from lecturer where lecturer_ID = ?";
		jdbcTemplateObject.update(SQL, new Object[] {lecturer_ID});
		System.out.println("Deleted Record with ID = " + lecturer_ID );
		return;
		
	}
	
	
	public void updateLecturerNationality(String lecturer_nationality,Integer lecturer_ID){
		String SQL = "update lecturer set lecturer_nationality = ? where lecturer_ID = ?";
		jdbcTemplateObject.update(SQL,  new Object[] { lecturer_ID,lecturer_nationality});
		System.out.println("Updated Record with ID = " + lecturer_ID );
		return;		
	}
	
	public void updateLecturerNationality(String lecturer_first_names, String lecturer_surname,String lecturer_nationality){
		String SQL = "update lecturer set lecturer_nationality = ? where lecturer_first_names = ? AND lecturer_surname=?";
		jdbcTemplateObject.update(SQL,  new Object[] { lecturer_first_names,lecturer_surname,lecturer_nationality});
		System.out.println("Updated Record with ID = " + lecturer_first_names );
		return;		
	}
	

}

	
