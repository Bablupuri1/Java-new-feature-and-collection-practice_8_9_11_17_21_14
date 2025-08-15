package ProductDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bablu.DbConnetcion.DBConnection;

import ProductBean.Product;

public class ProductDto {

	public ArrayList<Product> getAllProduct() throws SQLException {
		ArrayList<Product> list = new ArrayList<>();

		// here we need to get the connection object and after that we ca
		// use that and prepared statement
//		and  add into the list one by one

		DBConnection con = new DBConnection();
		Connection connection = con.getConnection();

		PreparedStatement statement = connection.prepareStatement("select * from product72");

		ResultSet res = statement.executeQuery();

		int c = 0;
		while (res.next()) {
			// we need to load object ony by one into Product Bean Class
			// then add into the arraylist one by one
			Product p = new Product();
			p.setCode(res.getString(1));
			p.setName(res.getString(2));
			p.setPrice(res.getInt(3));
			p.setQty(res.getInt(4));

			// noe finally this p we can add one by one in ArrayList

			list.add(p);
			System.out.println("One Product Added In ArrayList:" + (c++));

		}

		return list;

	}

	public Product getProductById(String pid) {
		Product p = new Product();

		// now based on id select query

		// need to convert int to String


		DBConnection con = new DBConnection();
		Connection connection = con.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("select * from product72 where code=?");

			statement.setString(1, pid);

			ResultSet executeQuery = statement.executeQuery();

			while (executeQuery.next()) {
				p.setCode(executeQuery.getString(1));
				p.setName(executeQuery.getString(2));
				p.setPrice(executeQuery.getInt(3));
				p.setQty(executeQuery.getInt(4));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;

	}

	public int updateProduct(Product product) {
	    int status = 0;

		DBConnection con = new DBConnection();
		Connection connection = con.getConnection();
	    try {


	        String sql = "UPDATE product72 SET name = ?, price = ?, qty = ? WHERE code = ?";
	        PreparedStatement ps = connection.prepareStatement(sql);
	        ps.setString(1, product.getName());
	        ps.setDouble(2, product.getPrice());
	        ps.setInt(3, product.getQty());
	        ps.setString(4, product.getCode());

	        status = ps.executeUpdate();
	        System.out.println("Product Updated Succcessfully....");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return status;
	}

}
