package com.HDipCloud.interfaces.impl;

import java.util.Date;

import com.HDipCloud.domain.UnRegistrationModuleQueue;
import com.HDipCloud.interfaces.CollegeUnregisteredModules;

public class UnregisteredModulesQueueImpl extends UnRegistrationModuleQueue implements CollegeUnregisteredModules {

	public UnregisteredModulesQueueImpl(String course_code,String actual_module_no,Integer	semester_no,String student_ID,Date application_date) {
		super(course_code, actual_module_no, semester_no, student_ID, application_date);
		
	}

}
