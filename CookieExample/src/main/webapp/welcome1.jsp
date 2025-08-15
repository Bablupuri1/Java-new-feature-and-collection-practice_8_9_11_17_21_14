<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
	//here we need to get the cookie

	String cookies = "cookies not found";

	Cookie[] cook = request.getCookies();

	//now  iterte on cookie array and match and store and   display in web page

	for (Cookie c : cook) {

		if ("usernames".equals(c.getName())) {
			cookies = c.getValue();
			break;

		}
	}

	//now we need t get the session

	String sessions = (session != null && session.getAttribute("usernamesession") != null)
			? (String) session.getAttribute("usernamesession")
			: "No Sessionn Found";
	%>
	
	
	   <h2>Cookie Value: <%= cookies %></h2>
    <h2>Session Value: <%= sessions %></h2>

    <p><a href="logout.jsp">Logout</a></p>

    <p>Inspect → Application → Cookies to see stored cookies in browser.</p>

</body>
</html>