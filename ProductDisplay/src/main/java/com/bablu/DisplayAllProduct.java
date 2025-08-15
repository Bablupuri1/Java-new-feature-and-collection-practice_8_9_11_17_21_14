package com.bablu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import ProductBean.Product;
import ProductDAO.ProductDto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewallproduct")
public class DisplayAllProduct extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDto pdto = new ProductDto();

		try {
			ArrayList<Product> allProduct = pdto.getAllProduct();

			// Set product list in request
			req.setAttribute("Productlist", allProduct);

			// Forward to JSP
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("DisplayAllProduct.jsp");
			requestDispatcher.forward(req, resp);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
