package com.karan51ngh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k =0;
		Cookie[] cookies = req.getCookies(); // cookies not cookie, therefore it will be an array
		
		for(javax.servlet.http.Cookie c: cookies)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		k = k*k;
		PrintWriter out = res.getWriter();
		out.println("Result is  "+k);
		
		System.out.println("Sq called");
	}

}
