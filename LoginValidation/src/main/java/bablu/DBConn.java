package bablu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	public static Connection getConnection() {
		Connection con = null;
		try {
			// Load Oracle JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// Correct URL
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // change 'xe' to your DB name if different
			String username = "system"; // your DB username
			String password = "bablu2003"; // your DB password

			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle JDBC Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		Connection conn = getConnection();
		System.out.println(conn);
	}
}
