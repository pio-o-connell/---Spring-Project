package com.HDipCloud;

/**
 * Hello world!
 *
 */
import java.util.List;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HDipCloud.interfaces.impl.studentImpl;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeBookOfModulesJbdcTemplate;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeCoursesJdbcTemplate;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeLecturerJdbcTemplate;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeModuleLecturerAssignmentsJdbcTemplate;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeRegistrationJdbcTemplate;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeStudentJdbcTemplate;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	//	HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
	//	helloWorld.sayHello();
		
		// Student Records
		CollegeStudentJdbcTemplate collegeStudentJdbcTemplate=(CollegeStudentJdbcTemplate) context.getBean("CollegeStudentJdbc");
		collegeStudentJdbcTemplate.createStudent("R00118177","Pio Joseph","O'Connell");
		collegeStudentJdbcTemplate.createStudent("R00338177","George","Bush");
	//	collegeStudentJdbcTemplate.deleteStudent("Pio Joseph","O'Connell");
	//	collegeStudentJdbcTemplate.deleteStudent("George","Bush");
	//	collegeStudentJdbcTemplate.createStudent("R00118177","Pio Joseph","O'Connell");
	//	collegeStudentJdbcTemplate.updateStudentNationality("Irish","R00118177");
	//	List<studentImpl> CollegeStudents = collegeStudentJdbcTemplate.listStudents();
	//	for (studentImpl record : CollegeStudents) {
	//		System.out.print("Firstname : " + record.getFirstname() );
	//		System.out.print(", Lastname : \n" + record.getLastname() );
	//	} 
		
		// StudentTransaction records
	//	collegeStudentJdbcTemplate.createStudentTransaction("R00118177","Pio Joseph","O'Connell");
		
		// Lecturer Records
	/*	CollegeLecturerJdbcTemplate collegeLecturerJdbcTemplate = (CollegeLecturerJdbcTemplate)context.getBean("CollegeLecturerJdbc");
		
		collegeLecturerJdbcTemplate.createLecturer("L00110002","Olivia", "Brickley");
		collegeLecturerJdbcTemplate.createLecturer("L00110010","Gerard", "MacSweeney");
		collegeLecturerJdbcTemplate.createLecturer("L00110005","Robert","Miller");
		collegeLecturerJdbcTemplate.createLecturer("L00110001","Oonagh", "O'Brien");
		collegeLecturerJdbcTemplate.createLecturer("L00110003","Yu Yang", "Jing");
		collegeLecturerJdbcTemplate.createLecturer("L00110004","Ted","Scully");*/
		// Module Records
		/*CollegeBookOfModulesJbdcTemplate collegeModuleJdbcTemplate=(CollegeBookOfModulesJbdcTemplate)context.getBean("CollegeModuleJdbc");
		collegeModuleJdbcTemplate.createModule("M001", "COMP6029 – CRN23057", "Networking Systems");
		collegeModuleJdbcTemplate.createModule("M002", "SOFT7017 – CRN23058", "Principles of Operating Systems");
		collegeModuleJdbcTemplate.createModule("M003", "SOFT7008 – CRN23067", "Server Side Web Development");
		collegeModuleJdbcTemplate.createModule("M004", "SOFT7004 – CRN2305", "Object Oriented Programming");
		collegeModuleJdbcTemplate.createModule("M005", "COMP7025 – CRN23112", "Database Systems");
		collegeModuleJdbcTemplate.createModule("M006", "SOFT7007 – CRN23056", "Requirements Engineering");*/
		
		// Module Lecturer Assignments
	/*	CollegeModuleLecturerAssignmentsJdbcTemplate collegeLAJT =(CollegeModuleLecturerAssignmentsJdbcTemplate) context.getBean("CollegeModuleLecturerJdbc");
	//	collegeLAJT.createModule("AMOO1","M001", "L00110002");
		collegeLAJT.createModule("AMOO2","M002", "L00110010");
		collegeLAJT.createModule("AMOO3","M003", "L00110005");
		collegeLAJT.createModule("AMOO4","M004", "L00110001");
		collegeLAJT.createModule("AMOO5","M005", "L00110003");
		collegeLAJT.createModule("AMOO6","M006", "L00110004");
		collegeLAJT.createModule("AMOO7","M007", "L007");
		*/
		
		// College Courses
		/*CollegeCoursesJdbcTemplate collegeLAJT = (CollegeCoursesJdbcTemplate)context.getBean("CollegeCoursesJdbc");
		
		collegeLAJT.createCourse("KCLDC_91_Y5","Cloud & Mobile Sept 2014");
		collegeLAJT.createCourse("KCLDC_92_Y5","Cloud & Mobile Sept 2015");
		collegeLAJT.createCourse("KCLDC_93_Y5","Cloud & Mobile Sept 2016");
		collegeLAJT.createCourse("KCLDC_94_Y5","Cloud & Mobile Sept 2017");
		collegeLAJT.createCourse("KCLDC_95_Y5","Cloud & Mobile Sept 2018");*/
		
	 // Registered Students by module
	//	CollegeRegistrationJdbcTemplate collegeRegLAJT = (CollegeRegistrationJdbcTemplate)context.getBean("CollegeRegisteredJdbc");
	//	collegeRegLAJT.createModule("KCLDC_91_Y5","AMOO1",1,"R00118177");
	//	collegeRegLAJT.createModule("KCLDC_92_Y5","AMOO1",2,"R00118177");
		
	}
}
