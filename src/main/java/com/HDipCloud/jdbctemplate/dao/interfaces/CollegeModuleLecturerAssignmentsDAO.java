package com.HDipCloud.jdbctemplate.dao.interfaces;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public interface CollegeModuleLecturerAssignmentsDAO {
	public void setDataSource(DataSource dataSource) ;
	public void createModule(String actual_module_id,String module_id, String lecturer_ID);
	public void deleteModule(String actual_module_id);
	
	public void deleteModulec(String actual_module_id,String module_id);
	
	public void updateModuleDecription(String actual_module_id,String module_code,String lecturer_ID);
}
