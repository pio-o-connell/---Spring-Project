package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.ModuleAssignments;
import com.HDipCloud.interfaces.CollegeModuleAssignments;

public class CollegeModuleAssignmentsImpl extends ModuleAssignments implements CollegeModuleAssignments{
	public CollegeModuleAssignmentsImpl(String module_ID,String module_code,String module_description ){
		super( module_ID, module_code,module_description);	
	}
}