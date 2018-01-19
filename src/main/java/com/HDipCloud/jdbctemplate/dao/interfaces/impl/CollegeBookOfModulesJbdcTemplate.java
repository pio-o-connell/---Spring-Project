package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.HDipCloud.jdbctemplate.dao.interfaces.CollegeBookOfModulesDAO;

@Repository
public class CollegeBookOfModulesJbdcTemplate implements CollegeBookOfModulesDAO {
		@Autowired
		private DataSource dataSource;
		private JdbcTemplate jdbcTemplateObject;
		@Autowired
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		}
		

		public void createModule(String module_ID,String module_code, String module_description) {
			String SQL = "insert into Book_OF_Modules (module_ID,module_code, module_description) values (?,?, ?)";
			jdbcTemplateObject.update(SQL, new Object[] { module_ID,module_code, module_description});
			System.out.println("Created Record Name = " + module_ID);
			return;	
		}
		public void deleteModule(String module_ID){
			String SQL = "delete from Book_OF_Modules where module_ID = ?";
			jdbcTemplateObject.update(SQL, new Object[] {module_ID});
			System.out.println("Deleted Record with firstname = " + module_ID );
			return;
			
		}
		
		public void deleteModulec(String module_code){
			String SQL = "delete from Book_OF_Modules where module_code = ?";
			jdbcTemplateObject.update(SQL, new Object[] {module_code});
			System.out.println("Deleted Record with ID = " + module_code );
			return;
			
		}
		
		
		public void updateModuleDecription(String module_ID,String module_code){
			String SQL = "update Book_OF_Modules set module_ID = ? where module_code = ?";
			jdbcTemplateObject.update(SQL,  new Object[] { module_ID,module_code});
			System.out.println("Updated Record with ID = " + module_ID );
			return;		
		}
	}