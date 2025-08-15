package com.bablu.DbConnetcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	Connection con = null;

	public Connection getConnection() {

		try {
			// Load Oracle JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Correct URL
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // change 'xe' to your DB name if different
			String username = "system"; // your DB username
			String password = "bablu2003"; // your DB password

			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;
	}



}
