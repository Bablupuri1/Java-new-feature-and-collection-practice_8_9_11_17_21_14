<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, ProductBean.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body
{
background-color: black;
color:white;
}



</style>
</head>
<body>

	<%
	ArrayList<Product> productlist = (ArrayList<Product>) request.getAttribute("Productlist");

	if (productlist == null || productlist.isEmpty()) {
	%>
	<h3>Product Not Avaaiable:</h3>

	<%
	} else {
	%>

	<h3 style="color: green">Product List is Here............</h3>

	<table>
		<tr>
			<th>Product Id:</th>
			<th>Product Name:</th>
			<th>Product Price:</th>
			<th>Product Quantity:</th>

		</tr>

		<%
		for (Product p : productlist) {
		%>

		<tr>
			<td><%=p.getCode()%></td>
			<td><%=p.getName()%></td>
			<td><%=p.getPrice()%></td>
			<td><%=p.getQty()%></td>
			<!--//here we need  to add edit and delete product by id  -->

			<td><a href="editProduct.jsp?pid=<%=p.getCode()%>">Edit
					Product</a></td>
			<td><a href="deleteProduct?pid=<%=p.getCode()%>"
				onclick="return confirm('Are you sure you want to delete this product?');">Delete</a>
			</td>
		</tr>



		<%
		} //this close for for loop
		%>


	</table>

	//now close for else blcok

	<%
}
%>




</body>
</html>