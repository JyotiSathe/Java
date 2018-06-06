package com.tcs.ilp.servlet.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.ilp.servlet.beans.CustomerBean;
import com.tcs.ilp.servlet.services.CustomerService;;

public class CustomerController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String interest = "";

		String customerName = request.getParameter("name");
		String age = request.getParameter("age");
		String country = request.getParameter("country");
		System.out.println(country);
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String[] areaofinterest = request.getParameterValues("areaofinterest");
		for (String m : areaofinterest) {
			interest = interest + m + "";
		}
		CustomerBean customer=new CustomerBean();
		customer.setName(customerName);
		customer.setAge(age);
		customer.setCountry(country);
		customer.setAddress(address);
		customer.setGender(gender);
		customer.setAreaofinterest(interest);
		CustomerService customerservice=new CustomerService();
		int custId=customerservice.createCustomer(customer);
		PrintWriter pw=response.getWriter();
		pw.println("Generated Customer Id Is: "+custId);
	}

}
