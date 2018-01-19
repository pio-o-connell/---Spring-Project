package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.Courses;
import com.HDipCloud.interfaces.CollegeCourses;

public class CollegeCoursesImpl extends Courses implements CollegeCourses {

	public CollegeCoursesImpl( String course_ID,String course_description) {
		super(course_ID, course_description);	
	}

}
