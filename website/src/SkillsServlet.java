import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/skills")
public class SkillsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Disable caching
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");

        out.println("<head>");
        out.println("<title>Skills</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/reset.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/useDefaultCursor.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/preventPrint.css\">");
        out.println("</head>");

        out.println("<body>");

        //nav
        out.println("<div class=\"nav\">");
        out.println("<a href=\"aboutme\">About Me</a>");
        out.println("<a href=\"skills\">Skills</a>");
        out.println("<a href=\"contact\">Contact</a>");
        out.println("</div>");

        out.println("<h1>Skills</h1>");
        
        out.println("<p><a href=\"logout\">Logout</a></p>");

        out.println("<div class='credit'>");
        out.println("Copying and Printing is disabled for this page");
        out.println("</div>");

        out.println("</body>");

        out.println("<script src='js/disableSelection.js'></script>");

        out.println("</html>");
    }
}
