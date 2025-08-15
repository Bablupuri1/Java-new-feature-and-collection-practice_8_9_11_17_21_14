<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!

	int a=10;
	String name="Bablu Giri";
	int  square()
	{
		return a*a;
	}
	
	
	//we can not do
	//here we can not used loop here
	//here we can not  if else used
	
	
	//we can do
		//declare class 
		//declare method
		//create varibale
		
	
	

	
%>

<%

out.println("Name:"+name+"<br>");
out.println("Square:"+square()+"<br>");

int b=100;

if(b>100)
{
	
	out.println("ues b greater"+"<br>");
}
else
{
	out.println("b is not greater"+"<br>");
}


for(int i=0; i<=10; i++)
{
	out.println("iterate:"+i+"<br>");
}



%>


<h1>Using Expression Tag we can just put the vriable or method class or we can access request object etc</h1>


<%= name %>
<%= LocalDate.now() %>
<%= Math.random() %>




</body>
</html>