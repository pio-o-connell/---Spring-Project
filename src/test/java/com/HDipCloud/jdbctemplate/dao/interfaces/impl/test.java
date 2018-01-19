package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:configuration.xml"})
@Transactional
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
    DbUnitTestExecutionListener.class })

public class test {
	@Autowired
	ApplicationContext Context;
	
	
	@Test
	@DatabaseSetup(value="classpath:databaseEntries.xml", type=DatabaseOperation.CLEAN_INSERT)
	public void testCreateStudent() {
		
		
		
	/*	CollegeStudentJdbcTemplate collegeStudentJdbcTemplate=(CollegeStudentJdbcTemplate)Context.getBean("CollegeStudentJdbc");
		int nmrBeforeRows = collegeStudentJdbcTemplate.countRows();
		collegeStudentJdbcTemplate.createStudent("R008177","Pio Joseph","OConnell");
		collegeStudentJdbcTemplate.createStudent("R008177","George","Bush");
		int nmrAfterRows = collegeStudentJdbcTemplate.countRows();
		System.out.println("nmrRows"+nmrAfterRows);*/
	/*	
		//collegeStudentJdbcTemplate.deleteStudent("R00118177");
		//collegeStudentJdbcTemplate.deleteStudent("R00338177");
		System.out.println("rows after"+nmrAfterRows);
	//	assertSame("2 rows exactly added",nmrAfterRows,nmrBeforeRows+2);
	}*/}
}                                