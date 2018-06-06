package com.tcs.ilp.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection(){
		Connection con=null;
		try {
			System.out.println("loading driver");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("creating connection");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Jyoti@1138");
			System.out.println("Connection created");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con){
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
