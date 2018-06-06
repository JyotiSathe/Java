package com.tcs.ilp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getCurrentDate("13-06-1994");
		Date date=new Date(1994,06,13);
		System.out.println(date);
	}
	private static java.sql.Date getCurrentDate(String date) {

	    java.util.Date today;
	    java.sql.Date rv = null;
	    try {

	        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	        today = format.parse(date);
	        rv = new java.sql.Date(today.getTime());
	        System.out.println(rv.getTime());

	    } catch (Exception e) {
	        System.out.println("Exception: " + e.getMessage());
	    } finally {
	        return rv;
	    }

	}    

}
