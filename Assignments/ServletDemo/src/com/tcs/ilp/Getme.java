package com.tcs.ilp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Getme extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("Hello Servlet1");
		RequestDispatcher rd=request.getRequestDispatcher("/servlet2");
		rd.forward(request, response);
		pw.print("Hello servlet2");
		pw.close();
	}

	

}
