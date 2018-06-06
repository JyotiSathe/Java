package com.tcs.ilp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetComboServlet
 */
public class GetComboServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetComboServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
	    {
	     String selected_fruit = request.getParameter("fruit") ;
	     PrintWriter writer =  response.getWriter();
	     response.setContentType("text/html");
	     writer.println("<h4>Selected Fruit Is :</h4>");
	     writer.println("<br><font color=black>"+selected_fruit+"</font>");
	     writer.close();
	    }
	    catch(Exception exception)
	    {
	        exception.printStackTrace();    
	    }
	}

}
