package com.tcs.ilp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String str=request.getParameter("number1");
		double number1=Double.parseDouble(str);
		
		double number2=Double.parseDouble(request.getParameter("number2"));
		double result=number1*number2;
		pw.println("<html>" +
				"<head><title>Product Of Two Numbers</title></head>" +
				"<body><p>Your First Number is : " + number1 +
				"<br/> Your Second Number is : " + number2 +
				"<br/> Product is : " + result +
 				"</body></html>");
	}
}
