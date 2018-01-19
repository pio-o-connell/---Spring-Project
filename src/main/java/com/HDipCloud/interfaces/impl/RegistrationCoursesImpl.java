package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.RegisteredModule;
import com.HDipCloud.interfaces.RegistrationCourses;

public class RegistrationCoursesImpl extends RegisteredModule implements RegistrationCourses {
	RegistrationCoursesImpl(String course_code,String actual_module_id,Integer semester_no,String student_ID){
		super(course_code,actual_module_id,semester_no,student_ID);
	}
}
