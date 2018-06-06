package com.tcs.ilp.servlet.dao;

import java.sql.*;

import com.tcs.ilp.servlet.beans.CustomerBean;

public class CustomerDao {
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	Connection con=null;
	ResultSet rs=null;
	public int addCustomerDetails(CustomerBean customer){
		int custId=0;
		con=DBConnection.getConnection();
		try {
			ps1=con.prepareStatement("insert into customer values" +
					"(customer_sequence.nextval,?,?,?,?,?,?)");
			ps1.setString(1, customer.getName());
			ps1.setString(2, customer.getAge());
			ps1.setString(3, customer.getCountry());
			ps1.setString(4, customer.getAddress());
			ps1.setString(5, customer.getGender());
			ps1.setString(6, customer.getAreaofinterest());
			ps1.executeUpdate();
			
			ps2=con.prepareStatement("select customer_sequence.currval from dual");
			rs=ps2.executeQuery();
			while(rs.next()){
				custId=rs.getInt(1);
			}
			DBConnection.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return custId;
	}
}
