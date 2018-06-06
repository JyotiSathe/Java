package com.tcs.ilp.crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.tcs.ilp.crud.bean.Customer;

public class CustomerDao {
	public int addCustomer(Customer customer) throws ClassNotFoundException {
		int numberOfRowsAdded = 0;
		Connection con = null;
		PreparedStatement ps = null;
		System.out.println("entering value...");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Jyoti@1138");
			ps=con.prepareStatement("insert into tbl_1238234_customer values(?,?,?,?)");
			ps.setInt(1, customer.getCustomerId());
			ps.setString(2, customer.getCustomerName());
			ps.setDate(3,(Date) customer.getDateOfBirth());
			//ps.setDate(3, getCurrentDate("13-06-1994"));
			ps.setString(4, customer.getAddress());
			
			numberOfRowsAdded=ps.executeUpdate();
			System.out.println(numberOfRowsAdded);
			System.out.println("row added");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numberOfRowsAdded;
	}
}