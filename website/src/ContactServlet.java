import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ImageHelper;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
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
        out.println("<link rel=\"stylesheet\" href=\"css/contact.css\">");

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

        out.println("<div class='contentbox' style='width: 600px; height: 550px;'>");

        out.println("<div class=\"container\">");
        out.println("<form action=\"\">");
        out.println("<label for=\"firstName\">First Name</label>");
        out.println("<input type=\"text\" id=\"firstName\" name=\"firstname\" placeholder=\"Enter Your Name\">");

        out.println("<label for=\"lastName\">Last Name</label>");
        out.println("<input type=\"text\" id=\"lastName\" name=\"lastname\" placeholder=\"Enter your last name\">");

        out.println("<label for=\"emailAdd\">Email Address</label>");
        out.println("<input type=\"text\" id=\"emailAdd\" name=\"emailAdd\" placeholder=\"Enter your email address\">");

        out.println("<label for=\"phoneNumer\">Phone Number</label>");
        out.println(
                "<input type=\"text\" id=\"phoneNumer\" name=\"phoneNumer\" placeholder=\"Enter your phone number\">");

        out.println("<label for=\"subject\">Subject</label>");
        out.println(
                "<textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>");

        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
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