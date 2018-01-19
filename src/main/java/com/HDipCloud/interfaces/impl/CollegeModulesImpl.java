package com.HDipCloud.interfaces.impl;

import com.HDipCloud.domain.BookOfModules;
import com.HDipCloud.interfaces.CollegeModules;

public class CollegeModulesImpl extends BookOfModules implements CollegeModules{
	
	public CollegeModulesImpl(String module_ID, String module_code,String module_description ){
		super( module_ID, module_code,module_description);		
	}
}
