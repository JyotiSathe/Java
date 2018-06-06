package com.tcs.ilp.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tcs.ilp.crud.bean.*;

public class StudentDao {
	public int addStudent(Student student) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int numberOfRowsInserted=0;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Jyoti@1138");
			ps=con.prepareStatement("insert into TBL_1238234_STUDENT values(?,?,?,?,?)");
			ps.setInt(1, student.getStudentId());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getGender());
			ps.setString(4, student.getCourseName());
			ps.setString(5, student.getAddress());
			numberOfRowsInserted=ps.executeUpdate();
			System.out.println(numberOfRowsInserted+" row inserted");
		} finally{
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		}
		return numberOfRowsInserted;
	}
}
