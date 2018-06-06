package com.tcs.ilp.crud.test;

import com.tcs.ilp.crud.bean.Customer;
import com.tcs.ilp.crud.dao.CustomerDao;

import java.text.SimpleDateFormat;
public class TestCustomerDao {
	public static void main(String[] args) throws ClassNotFoundException {
		Customer customer=new Customer();
		CustomerDao custDao=new CustomerDao();
		customer.setCustomerId(1);
		customer.setCustomerName("jyoti");
		customer.setDateOfBirth(getCurrentDate("13-06-1994"));
		customer.setAddress("abad");
		
		System.out.println("main: "+customer);
		custDao.addCustomer(customer);
	}

	private static java.sql.Date getCurrentDate(String date) {

	    java.util.Date dob;
	    java.sql.Date rv = null;
	    try {

	        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	        dob = format.parse(date);
	        rv = new java.sql.Date(dob.getTime());
	        System.out.println(rv.getTime());

	    } catch (Exception e) {
	        System.out.println("Exception: " + e.getMessage());
	    } finally {
	        return rv;
	    }
	}
}
