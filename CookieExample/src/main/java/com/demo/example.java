package com.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login1")
public class example extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		//first of all we need to get  the name from  client which  is given from html input
		
		String name=req.getParameter("username");
	//	name=name.replace(' ', '_');
		name = name.replace(" ", "");

		
		/// so we need to create one cookie and session

		Cookie cookie = new Cookie("usernames",name);
		
		//now we need to set the cookie time
		
		cookie.setMaxAge(60*60);
		
		//now we neeed to add this cookie in browser
		
		resp.addCookie(cookie);
		
		
		HttpSession session = req.getSession();
		session.setAttribute("usernamesession", req.getParameter("username"));
		
		
		
		resp.sendRedirect("welcome1.jsp");

		
		
	}

}
