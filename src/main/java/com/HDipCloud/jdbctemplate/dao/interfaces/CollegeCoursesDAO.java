package com.HDipCloud.jdbctemplate.dao.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface CollegeCoursesDAO {
	public void createCourse(String course_ID,String course_description);
	public void deleteCourse(String course_ID,String course_description);
	public void updateCourseDecription(String course_ID,String course_description);
}
