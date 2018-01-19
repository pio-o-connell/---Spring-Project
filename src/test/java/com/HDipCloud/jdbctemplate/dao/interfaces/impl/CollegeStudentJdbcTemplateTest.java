package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HDipCloud.interfaces.impl.studentImpl;
@RunWith(SpringJUnit4ClassRunner.class) @ContextConfiguration({"classpath:configuration.xml"}) 
public class CollegeStudentJdbcTemplateTest {
	@Autowired
	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	CollegeStudentJdbcTemplate collegeStudentJdbcTemplate=(CollegeStudentJdbcTemplate) context.getBean("CollegeStudentJdbc");

	
	/*	@Test
	public void testCreateStudent() {
		
		
		int nmrBeforeRows = collegeStudentJdbcTemplate.countRows();
		collegeStudentJdbcTemplate.createStudent("R00118177","Pio Joseph","O'Connell");
		collegeStudentJdbcTemplate.createStudent("R00338177","George","Bush");
		int nmrAfterRows = collegeStudentJdbcTemplate.countRows();
		assertSame("2 rows exactly added",nmrAfterRows,nmrBeforeRows+2);
		collegeStudentJdbcTemplate.deleteStudent("R00118177");
		collegeStudentJdbcTemplate.deleteStudent("R00338177");
	}

	@Test
	public void testCreateStudentTransaction() {
		int nmrBeforeRows = collegeStudentJdbcTemplate.countRows();
		collegeStudentJdbcTemplate.createStudentTransaction("R00228177","John","Murphy");
		int nmrAfterRows = collegeStudentJdbcTemplate.countRows();
		assertSame("1 rows exactly added",nmrAfterRows,nmrBeforeRows+1);
		collegeStudentJdbcTemplate.deleteStudent("R00228177");
	}

	@Test
	public void testDeleteStudentStringString() {
		
		
		collegeStudentJdbcTemplate.createStudent("R00228177","John","Murphy");
		int nmrBeforeRows = collegeStudentJdbcTemplate.countRows();
		collegeStudentJdbcTemplate.deleteStudent("John","Murphy");
		int nmrAfterRows = collegeStudentJdbcTemplate.countRows();
		assertSame("1 rows exactly less",nmrAfterRows,nmrBeforeRows-1);
	}

	@Test
	public void testDeleteStudentInteger() {
		collegeStudentJdbcTemplate.createStudent("R00228177","John","Murphy");
		int nmrBeforeRows = collegeStudentJdbcTemplate.countRows();
		collegeStudentJdbcTemplate.deleteStudent("R00228177");
		int nmrAfterRows = collegeStudentJdbcTemplate.countRows();
		assertSame("1 rows exactly less",nmrAfterRows,nmrBeforeRows-1);
	}
	
*/
/*	@Test
	public void testUpdateStudentNationalityString() {
		collegeStudentJdbcTemplate.createStudent("R00338177","George","Bush");
		collegeStudentJdbcTemplate.updateStudentNationality("Texan","R00338177");
		String result = collegeStudentJdbcTemplate.getStudentNationality("R00338177");
	//	assertSame("Set Bush from Texas","Texan",result);
	}
*/

	@Test
	public void testGetCollegeStudent() {
		collegeStudentJdbcTemplate.createStudent("R00338177","George","Bush");
		studentImpl student= collegeStudentJdbcTemplate.getCollegeStudent("R00338177");
		System.out.println("Student id"+student.getFirstname());
		assertEquals(student.getFirstname(),"George");
		
		
	}

/*	@Test
	public void testListStudents() {
		collegeStudentJdbcTemplate.createStudent("R00118177","Pio Joseph","O'Connell");
		collegeStudentJdbcTemplate.createStudent("R00338177","George","Bush");
		List<studentImpl> studentList= collegeStudentJdbcTemplate.listStudents();
		for (int i=0; i< studentList.size();i++){
			System.out.println("\n student_id"+ studentList.get(i).getFirstname());
			
		}
		int rowsinlist= studentList.size();
		assertSame("2 rows exactly added",rowsinlist,2);
	
	}
/*	@Test
	public void testCountRows() {
		fail("Not yet implemented");
	}*/


}