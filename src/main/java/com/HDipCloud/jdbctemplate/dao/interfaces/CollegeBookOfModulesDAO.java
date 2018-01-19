package com.HDipCloud.jdbctemplate.dao.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface CollegeBookOfModulesDAO {

	public void createModule(String module_ID,String module_code, String module_description) ;
	public void deleteModule(String module_ID);
	public void deleteModulec(String module_code);
	public void updateModuleDecription(String module_ID,String module_code);
}