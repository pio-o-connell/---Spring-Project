package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class CollegeModuleLecturerAssignmentsJdbcTemplate {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	public void createModule(String actual_module_id,String module_id, String lecturer_ID) {
		String SQL = "insert into Modules (actual_module_id,module_id, lecturer_ID) values (?,?, ?)";
		jdbcTemplateObject.update(SQL, new Object[] { actual_module_id,module_id, lecturer_ID});
		System.out.println("Created Record Name = " + actual_module_id);
		return;	
	}
	public void deleteModule(String actual_module_id){
		String SQL = "delete from Modules where actual_module_id = ?";
		jdbcTemplateObject.update(SQL, new Object[] {actual_module_id});
		System.out.println("Deleted Record with firstname = " + actual_module_id );
		return;
		
	}
	
	public void deleteModulec(String actual_module_id,String module_id){
		String SQL = "delete from Modules where actual_module_id = ? and module_code= ?";
		jdbcTemplateObject.update(SQL, new Object[] {actual_module_id,module_id});
		System.out.println("Deleted Record with ID = " + actual_module_id );
		return;
		
	}
	
	
	public void updateModuleDecription(String actual_module_id,String module_code,String lecturer_ID){
		String SQL = "update Modules set lecturer_ID = ? where actual_module_id = ? AND module_code= ? ";
		jdbcTemplateObject.update(SQL,  new Object[] { actual_module_id,module_code,lecturer_ID});
		System.out.println("Updated Record with ID = " + actual_module_id );
		return;		
	}
}
