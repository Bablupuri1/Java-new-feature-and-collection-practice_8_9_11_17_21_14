<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.*, jakarta.servlet.*" %>

<%
    // Read cookie
    String cookieUser = "Not Found";


    Cookie[] cookies = request.getCookies();
    
    
    if (cookies != null) 
    {
        for (Cookie c : cookies) 
        {
            if ("userCookie".equals(c.getName())) 
            {
                cookieUser = c.getValue();
            }
        }
    }

    // Use existing implicit session object directly
    String sessionUser =
    
    (session != null && session.getAttribute("userSession") != null)
     ? (String) session.getAttribute("userSession")
    : "No Session Found";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style type="text/css">
    body
    {
    background-color: black;
    color:white;
    }
   </style>
</head>
<body>

    <h2>Cookie Value: <%= cookieUser %></h2>
    <h2>Session Value: <%= sessionUser %></h2>

    <p><a href="logout.jsp">Logout</a></p>

    <p>Inspect → Application → Cookies to see stored cookies in browser.</p>
</body>
</html>
