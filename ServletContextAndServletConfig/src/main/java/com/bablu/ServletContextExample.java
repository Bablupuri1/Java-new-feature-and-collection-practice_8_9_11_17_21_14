package com.bablu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewServletContext")
public class ServletContextExample  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		System.out.println("ServletContextExample.doGet()");
		
        resp.setContentType("text/html");

		//now get the ServletContext value from web.xml
		
		ServletContext servletContext = getServletContext();
		String initParameter = servletContext.getInitParameter("name");
		System.out.println("Name:"+initParameter);
		
		PrintWriter writer = resp.getWriter();
		writer.println(initParameter);
		
	
	}

}
