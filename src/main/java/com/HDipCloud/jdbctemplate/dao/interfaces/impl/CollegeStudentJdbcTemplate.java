package com.HDipCloud.jdbctemplate.dao.interfaces.impl;

import java.sql.Types;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;



















import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.HDipCloud.interfaces.impl.studentImpl;
import com.HDipCloud.jdbctemplate.dao.interfaces.CollegeStudentDAO;
@Repository
@Component
public class CollegeStudentJdbcTemplate implements CollegeStudentDAO {
	

//	private static final Logger logger = Logger.getLogger("CollegeStudentJdbcTemplate.class");
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Autowired
	private TransactionTemplate transactionTemplate;
	
	@Autowired
	public void setDataSource(DataSource ds)  {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
//	public boolean createStudent(String student_ID,String student_first_names, String student_surname) {
	public boolean createStudent(@Value("${student_ID}") String student_ID,
								@Value("${student_first_names}") String student_first_names,
								@Value("${student_surname}") String student_surname) {	
		String SQL = "insert into student (student_ID,student_first_names, student_surname) values (?,?,?)";
		jdbcTemplateObject.update(SQL, new Object[] { student_ID,student_first_names, student_surname});
		System.out.println("Created Record Name = " + student_ID);
		return true ;	
	}
	
	public void createStudentTransaction(final String student_ID, final String student_first_names, final String student_surname) {
		
		transactionTemplate.execute(new TransactionCallback <Void>(){
			
			public Void doInTransaction(TransactionStatus txStatus) {
				try{
					String SQL = "insert into student (student_ID,student_first_names, student_surname) values (?, ?, ?)";
					PreparedStatementCreatorFactory psc=new PreparedStatementCreatorFactory(SQL);
					psc.addParameter(new SqlParameter("student_ID", Types.VARCHAR));
					psc.addParameter(new SqlParameter("student_first_names", Types.VARCHAR));
					psc.addParameter(new SqlParameter("student_surname", Types.VARCHAR));
					Object[] params=new Object[]{ student_ID, student_first_names, student_surname};
					KeyHolder holder = new GeneratedKeyHolder();
					jdbcTemplateObject.update(psc.newPreparedStatementCreator(params), holder);
					System.out.println("holder:"+holder.getKey().toString());
					System.out.println("Created Record Name = " + student_ID + " Surname = " + student_surname);
				}catch (Exception e){}
					return null;				
				}			
			});			
		} 
	@Override
	public void deleteStudent(String student_first_names, String student_surname){
		String SQL = "delete from student where student_first_names = ? and student_surname = ?";
		jdbcTemplateObject.update(SQL, new Object[] {student_first_names,student_surname});
		System.out.println("Deleted Record with firstname = " + student_first_names );
		return;
		
	}
	@Override
	public void deleteStudent(String student_ID){
		String SQL = "delete from student where student_ID = ?";
		jdbcTemplateObject.update(SQL, new Object[] {student_ID});
		System.out.println("Deleted Record with ID = " + student_ID );
		return;
		
	}

	@Override
	public void updateStudentNationality(String student_ID,String student_nationality){
		String SQL = "update student set student_nationality = ? where student_ID = ?";
		jdbcTemplateObject.update(SQL,  new Object[] { student_ID,student_nationality});
		System.out.println("Updated Record with ID = " + student_ID +"Nationality"+ student_nationality );
		return;		
	}
	
	@Override
	public void updateStudentNationality(String student_first_names, String student_surname,String student_nationality){
		String SQL = "update student set student_nationality = ? where student_first_names = ? AND student_surname=?";
		jdbcTemplateObject.update(SQL,  new Object[] { student_first_names,student_surname,student_nationality});
		System.out.println("Updated Record with Names = " + student_first_names );
		return;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public String getStudentNationality(String student_id){
		
		String SQL = "select student_nationality from student where student_ID = ?";
		studentImpl student = (studentImpl) jdbcTemplateObject.queryForObject(SQL, 
				new Object[]{student_id}, new CollegeStudentsMapper());
		System.out.println("Student Nationality = " + student.nationality );
		return student.nationality;
	}
	@Override
	public studentImpl getCollegeStudent(String id) {
		String SQL = "select * from student where student_ID = ?";
		studentImpl student = (studentImpl) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new CollegeStudentsMapper());
		return student;
	}

	@Override
	public List<studentImpl> listStudents() {
		String SQL = "select * from student";
		List<studentImpl> studentList = jdbcTemplateObject.query(SQL, 
						new CollegeStudentsMapper());
		return studentList;
	}
	
	@Override
	public int countRows(){
		String SQL = "select count(*) from student";
		int rows=jdbcTemplateObject.queryForObject(SQL, Integer.class);
		return rows; 
	}
	@Override
	public int deleteAllRows(){
		String SQL = "delete student from student";
		int rows=jdbcTemplateObject.queryForObject(SQL, Integer.class);
		return rows; 
	}
	
}
