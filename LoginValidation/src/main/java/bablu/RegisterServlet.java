package bablu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        PrintWriter out = response.getWriter();

        try {
            Connection conn = DBConn.getConnection();

            if (conn != null)
            {
                String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, pass);

                int rows = ps.executeUpdate();

                if (rows > 0) {
                    out.println(" User registered successfully: " + user);
                } else {
                    out.println("Registration failed.");
                }

                ps.close();
                conn.close();
            } else {
                out.println("❌ Database connection failed.");
            }
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
