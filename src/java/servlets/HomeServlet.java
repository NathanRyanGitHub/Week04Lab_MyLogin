
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
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
    /*
     * If the user attempts to access /login and the session object
     * username exists, redirect them to /home.  If the user attempts 
     * to access /home directly and the session object username does 
     * not exist, redirect them to /login.
     */
    
    getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    
  
    
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
