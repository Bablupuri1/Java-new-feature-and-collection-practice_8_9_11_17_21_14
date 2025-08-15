package bablu;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get the session, but don't create if it doesn't exist
        HttpSession session = request.getSession(false);
        

        if (session != null) {
            session.invalidate(); // Properly logs out the user
            System.out.println("User logged out. Session invalidated.");
            response.sendRedirect("welcome.jsp");
        } else {
            System.out.println("No active session found.");
        }

        
        
        
        // Clear any cookies if needed (Optional - Interview bonus)
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                cookie.setMaxAge(0);  // delete cookie
                cookie.setPath("/");  // required to properly delete
                response.addCookie(cookie);
            }
        }

        // Redirect to login page
        response.sendRedirect("login.jsp");
    }
}
