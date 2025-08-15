// src/com/demo/LoginServlet.java
package com.demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("username");

		// 1 Set Cookie (stored on client)
		Cookie ck = new Cookie("userCookie", user);
		
		
		
		ck.setMaxAge(60); // 1 hour
		response.addCookie(ck);

		
		
		
		// 2️ Set Session (stored on server)
		HttpSession session = request.getSession();
		session.setAttribute("userSession", user);

		// Redirect to welcome page
		response.sendRedirect("welcome.jsp");
	}
}
