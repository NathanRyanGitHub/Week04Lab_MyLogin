
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nathan Ryan
 * -- Login Servlet handles all authentication 
 * -- and creation/destruction of sessions.
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    /*
    * Displays a login form (login.jsp) to the user that can also show messages.
    * Also responsible for logging out the user. If the parameter "logout" exists,
    * invalidate the session and display a message that the user has successfully
    * logged out. 
    */
    // Create a session, 
    HttpSession session = request.getSession();

    if (session.isNew()) {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    else {
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").include(request, response);
    }
    
    // Logout the user
    if (request.getAttribute("logout") != null) {
        session.invalidate();
        // Display message that user has successfully logged out.
    }
        
    //getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Validate that the username and password are not null/empty.
        String username = (String) request.getAttribute("username");
        String password = (String) request.getAttribute("password");
        
        if( username == null || username.equals("") 
                && password == null || password.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
    }

}
