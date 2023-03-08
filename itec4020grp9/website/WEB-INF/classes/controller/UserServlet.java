
import com.example.demo.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var id = req.getParameter("id");
        var pwd = req.getParameter("password");

        var event = UserService.userLogin(id, pwd);

        if (event.code == 0) {
            req.setAttribute("status","sucess");
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.sendRedirect("index.jsp");
        } else {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            req.setAttribute("loginEvent", 1);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
