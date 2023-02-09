package com.karan51ngh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		 getting the data that was sent by being attached to the req 
		int k = (int)req.getAttribute("k");
		
		PrintWriter out = res.getWriter();
		out.println("Result is  "+k);
	}

}
