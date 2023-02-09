package com.karan51ngh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{

//	doPost, instead of service.
//	this makes sure, that this will run only with POST requests
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
//		System.out.println("Result is " + k); //prints in the console
		
		RequestDispatcher rd = req.getRequestDispatcher("sq"); 
		// forwarding request to SqServlet
		//	Added a new mapping to the web.xml file
		
		k = k*k;
		// session  management is used to share data between servlets
		//	another way to send data is to add data to req object which is being forwarded anyways
		req.setAttribute("k", k);
		rd.forward(req, res);
		
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}
}
