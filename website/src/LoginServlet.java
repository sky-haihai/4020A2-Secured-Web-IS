import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean hasInput = !username.isEmpty() && !password.isEmpty();
		boolean inputMatches = "admin".equals(username) && "admin".equals(password);
		boolean isLoggedIn = session != null && session.getAttribute("userId") != null;

		// id password ok
		if (inputMatches) {
			session.setAttribute("userId", "admin");

			response.sendRedirect("welcome");
			return;
		}

		// already logged in and no input given
		if (isLoggedIn && !hasInput) {
			response.sendRedirect("welcome");
			return;
		}

		session.removeAttribute("userId");
		response.sendRedirect("index.jsp");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
