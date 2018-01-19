package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.Coordinator;
import com.HDipCloud.interfaces.CollegeCoordinatorAssignments;

public class CollegeCoordinatorAssignmentsImpl extends Coordinator implements CollegeCoordinatorAssignments{

	public CollegeCoordinatorAssignmentsImpl(String course_code,Integer semester,String lecturer_ID) {
		super(course_code, semester, lecturer_ID);
		
	}

}
