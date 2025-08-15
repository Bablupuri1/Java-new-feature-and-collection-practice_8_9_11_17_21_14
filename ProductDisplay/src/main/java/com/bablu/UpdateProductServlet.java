package com.bablu;

import java.io.IOException;
import java.io.PrintWriter;

import ProductBean.Product;
import ProductDAO.ProductDto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Step 1: Read parameters from the form
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pprice = request.getParameter("pprice");
		String pqty = request.getParameter("pqty");

		try {

			double price = Double.parseDouble(pprice);
			int qty = Integer.parseInt(pqty);

			// Step 2: Set values in Product bean
			Product product = new Product();
			product.setCode(pid);
			product.setName(pname);
			product.setPrice(price);
			product.setQty(qty);

			PrintWriter writer = response.getWriter();
			// Step 3: Call DAO to update in DB
			ProductDto pdto = new ProductDto();
			int result = pdto.updateProduct(product);

			if (result > 0) {
				response.sendRedirect("DisplayAllProduct.jsp");

			} else {

				writer.println("Product Not Updated Due to some reason...");

				RequestDispatcher rd = request.getRequestDispatcher("DisplayAllProduct.jsp");
				rd.include(request, response);
			}

		} catch (Exception e) {
			out.println("<h2 style='color:red;'>❌ Error: " + e.getMessage() + "</h2>");
			e.printStackTrace(out);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayAllProduct.jsp");
			rd.include(request, response);
		}

		out.println("<br><a href='viewAll.jsp' style='color:cyan;'>🔙 Back to Product List</a>");
	}
}
