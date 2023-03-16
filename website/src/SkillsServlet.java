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

        /* DO NOT MODIFY ↓↓↓↓ */

        // check if user is logged in
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
        out.println("<link rel=\"stylesheet\" href=\"css/credit.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/profile.css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/skills.css\">");

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

        /* DO NOT MODIFY ↑↑↑↑ */

        /* Modify Here ↓↓↓↓ */

        // content
        out.println("<div class='content'>");

        out.println("<div class='contentbox' style='width: 600px; height: 500px;'>");

        out.println("<div class=\"skill-section\">");
        out.println("<div class=\"skill-section-head\"><h2>Skills</h2></div>");
        out.println("<table class=\"table\">");
        out.println("<tr><th>Language</th><th>Experience</th></tr>");
        out.println("<tr><td>Java</td><td>3 years</td></tr>");
        out.println("<tr><td>HTML</td><td>3 years</td></tr>");
        out.println("<tr><td>CSS</td><td>2 years</td></tr>");
        out.println("<tr><td>JavaScript</td><td>2 years</td></tr>");
        out.println("<tr><td>Visual Basic</td><td>5 years</td></tr>");
        out.println("<tr><td>Python</td><td>2 months</td></tr>");
        out.println("</table>");
        out.println("<div class=\"skill-par2\"><p class=\"paragraph\">I have experience in a few programming languages, they include Java, HTML, CSS, JavaScript, Visual Basic, Basic and a little bit of Python. Above, you'll see a table that shows each of the programming languages I use as well as how long I've been using each for. I learned Visual Basic and Python in high school and Java, HTML, CSS and JavaScript in university.</p></div>");
        out.println("</div>");

        out.println("</div>");

        out.println("</div>");

        /* Modify Here ↑↑↑↑ */

        /* DO NOT MODIFY ↓↓↓↓ */

        // credit
        out.println("<div class='credit'>");
        out.println("Copying and Printing is disabled for this page");
        out.println("</div>");

        out.println("</body>");

        out.println("<script src='js/disableSelection.js'></script>");
        out.println("<script src='js/disableSavingImg.js'></script>");
        out.println("<script src='js/disableDragging.js'></script>");

        out.println("</html>");
    }

    /* DO NOT MODIFY ↑↑↑↑ */
}
