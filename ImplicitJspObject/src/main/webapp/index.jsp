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

request.setAttribute("request_name", "Bablu Giri");

session.setAttribute("name", "Anjali Puri");



%>

<h3>  
requestScope used for access  which is set by request.setAttribute()

 </h3>

<h3> ${requestScope.request_name} </h3>


<h4>we do not need to access session scope data using session object we can write directly inside ${session_name}<b></b></h4>

<h1>${name}</h1>


<h1>Welcome</h1>


<form action="output.jsp" method="get">


<input  type="text" name="name1">

<input type="submit">


</form>


</body>
</html>