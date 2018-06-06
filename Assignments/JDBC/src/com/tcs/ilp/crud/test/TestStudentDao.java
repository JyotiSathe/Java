package com.tcs.ilp.crud.test;

import java.sql.SQLException;

import com.tcs.ilp.crud.bean.Student;
import com.tcs.ilp.crud.dao.StudentDao;

public class TestStudentDao {
	public static void main(String[] args) {
		Student student=new Student();
		StudentDao studDao=new StudentDao();
		student.setStudentId(1);
		student.setStudentName("jyoti");
		student.setGender("female");
		student.setCourseName("java");
		student.setAddress("aurangabad, maharashtra");
		
		try {
			System.out.println(studDao.addStudent(student));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
