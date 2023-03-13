import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ImageHelper;

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

        // get image
        String imageStr = ImageHelper.encodeImage(this, "/WEB-INF/images/user_icon.png");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");

        out.println("<head>");
        out.println("<title>Skills</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/reset.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/defaultCursor.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/preventPrint.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/credit.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/profile.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/aboutme.css\">");
        out.println("</head>");

        out.println("<body>");

        // title bar
        out.println("<div class='titlebar'>");
        out.println("<div class='pagetitle'>");
        out.println("My ePortfolio");
        out.println("</div>");
        out.println("<div class='welcome'>");
        out.println("Welcome, Admin");
        out.println("</div>");
        out.println("</div>");

        // nav
        out.println("<div class='nav'>");
        out.println("<a href='aboutme'>About Me</a>");
        out.println("<a href='skills'>Skills</a>");
        out.println("<a href='contact'>Contact</a>");

        out.println("<div class='logout'>");
        out.println("<a href='logout'>Logout</a>");
        out.println("</div>");

        out.println("</div>");

        // content
        out.println("<div class='content'>");

        out.println("<div class='contentbox' style='width: 600px; height: 400px;'>");

        out.println("<div class=\"profile-box\">");
        out.println("<img src='data:image/png;base64," + imageStr + "' />");
        out.println("<h1>Tomcat Admin</h1>");
        out.println("<h2>Student</h2>");
        out.println("<p>B.A. Information Technology</p>");
        out.println("</div>");

        out.println("</div>");

        out.println("</div>");

        // credit
        out.println("<div class='credit'>");
        out.println("Copying and Printing is disabled for this page");
        out.println("</div>");

        out.println("</body>");

        out.println("<script src='js/disableSelection.js'></script>");

        out.println("</html>");
    }
}
