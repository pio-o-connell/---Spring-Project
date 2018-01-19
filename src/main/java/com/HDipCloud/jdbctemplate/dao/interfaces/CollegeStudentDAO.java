package com.HDipCloud.jdbctemplate.dao.interfaces;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;

import com.HDipCloud.interfaces.student;
import com.HDipCloud.interfaces.impl.studentImpl;
import com.HDipCloud.jdbctemplate.dao.interfaces.impl.CollegeStudentsMapper;
@Service("CollegeStudentDAO")
public interface CollegeStudentDAO {
	/** 
	 * This is the method to be used to initialize
	 * database resources ie. connection.
	 */
	public void setDataSource(DataSource ds);
	/** 
	 * This is the method to be used to create
	 * a record in the Student table.
	 */
	public boolean createStudent(String student_ID,String student_first_names, String student_surname);
	/** 
	 * This is the method to be used to delete
	 * a record from the Student table corresponding
	 * to a passed Student firstname and lastname.
	 */
	public void createStudentTransaction(final String student_ID, final String student_first_names, final String student_surname);
	public void updateStudentNationality(String student_nationality,String student_ID);
	public String getStudentNationality(String student_id);
	/** 
	 * This is the method to be used to update
	 * a record into the Student table.
	 */
	public void updateStudentNationality(String student_first_names, String student_surname,String student_nationality);
	
	/** 
	 * This is the method to be used to delete
	 * a record from the Student table corresponding
	 * to a passed Student id.
	 */
	public void deleteStudent(String student_ID);
	/** 
	 * This is the method to be used to update
	 * a record into the Student table.
	 */
	public void deleteStudent(String student_first_names, String student_surname);
	/** 
	 * This is the method to be used to update
	 * a record into the Student table.
	 * 
	 */
	
	public studentImpl getCollegeStudent(String id) ;


	public List<studentImpl> listStudents();
	
	public int countRows();
	
	public int deleteAllRows();
}
