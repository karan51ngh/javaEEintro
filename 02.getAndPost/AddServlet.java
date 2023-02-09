package com.karan51ngh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	//	doPost, instead of service.
	//	this makes sure, that this will run only with POST requests
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
//		System.out.println("Result is " + k); //prints in the console
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}
}
