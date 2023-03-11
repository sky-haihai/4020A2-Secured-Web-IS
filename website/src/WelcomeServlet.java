import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome Page</title>");
        out.println("<link rel=\"stylesheet\" href=\"css\\reset.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css\\defaultCursor.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css\\preventPrint.css\">");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>Welcome to Group 9!</h1>");
        out.println("<p>You have successfully logged in!</p>");
        out.println("<p><a href=\"logout\">Logout</a></p>");
        out.println("<p>Printing is disabled for this page</p>");
        out.println("</body>");
        out.println("<script src='js\\disableSelection.js'></script>");
        out.println("</html>");

    }
}
