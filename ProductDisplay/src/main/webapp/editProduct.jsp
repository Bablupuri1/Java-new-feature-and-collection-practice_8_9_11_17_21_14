<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList, ProductBean.Product, ProductDAO.ProductDto"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>
<style>
body {
    background-color: black;
    color: white;
    font-family: Arial, sans-serif;
}

input, label {
    font-size: 1rem;
}
</style>
</head>
<body>

    <h1 style="color: yellow;">Edit Product</h1>

    <%
   		 String pid = request.getParameter("pid");

    		if (pid != null && !pid.trim().isEmpty())
   		 {
        			try 
        			{
           			 ProductDto pdto = new ProductDto();
           			 Product prod = pdto.getProductById(pid);

        if (prod != null)
        {
    %>

    <!-- HTML form shown only if product found -->
    
    <form action="updateProduct" method="post">
        <input type="hidden" name="pid" value="<%= prod.getCode() %>" />
        <label>Product Name:</label><br />
        <input type="text" name="pname" value="<%= prod.getName() %>" required /><br /><br />
        <label>Product Price:</label><br />
        <input type="number" step="0.01" name="pprice" value="<%= prod.getPrice() %>" required /><br /><br />
        <label>Product Quantity:</label><br />
        <input type="number" name="pqty" value="<%= prod.getQty() %>" required /><br /><br />
        <input type="submit" value="Update Product" />
    </form>

    <%
            }
            else 
            {
    %>
    
    
    <h3 style="color: red;"> ❌ No product found with ID: <%= pid %> </h3>
    
    <%
        } // end of if (prod != null)
        	
        	
        } 
        catch (NumberFormatException e) 
        {
    %>
    
    
    <h3 style="color: red;">❌ Invalid product ID format.</h3>
    
    
    <%
    
    } // end of try-catch
        
    }
    else
    {
    	
    	
    %>
    
    
    <h3 style="color: red;">❌ Product ID is missing.</h3>
    
    
    <%
    
    
    } // end of if (pid != null && !pid.trim().isEmpty())
    	
    	
    %>

</body>
</html>
