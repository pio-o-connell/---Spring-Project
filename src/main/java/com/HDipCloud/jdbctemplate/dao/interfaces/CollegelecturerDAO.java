package com.HDipCloud.jdbctemplate.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.HDipCloud.interfaces.lecturer;
@Service
public interface CollegelecturerDAO {
	/** 
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource dataSource) ;
	
	/***
	 * 
	 * Constructor to create new record
	 * 
	 */
	public void createLecturer(String lecturer_ID,String lecturer_first_names, String lecturer_surname) ;
	
	/*
	 * Remove lecturer from lecturer database based on first and surnames
	 */
	
	public void deleteLecturer(String lecturer_first_names, String lecturer_surname);
	
	/*
	 * Remove lecturer from lecturer database based on id
	 */
	
	public void deleteLecturer(Integer lecturer_ID);
	
	
	/*
	 * updates the lecturers nationality based on their lecturer id
	 */
	public void updateLecturerNationality(String lecturer_nationality,Integer lecturer_ID);
	
	/*
	 * Updates the lecturers nationality based on their name and address
	 */
	
	public void updateLecturerNationality(String lecturer_first_names, String lecturer_surname,String lecturer_nationality);
	
	
	
}
