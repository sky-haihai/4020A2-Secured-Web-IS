import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private final String fakeUsername = "admin";

	private static final String userIdAttributeName = "userId";

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		// should not happen, but just in case
		if (session == null) {
			response.sendRedirect("index.jsp");
			return;
		}

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		boolean hasInput = !username.isEmpty() && !password.isEmpty();
		boolean inputMatches = fakeUsername.equals(username) && fakeUsername.equals(password);
		boolean isLoggedIn = session.getAttribute(userIdAttributeName) != null;

		// id password ok
		if (inputMatches) {
			session.setAttribute(userIdAttributeName, fakeUsername);

			response.sendRedirect("welcome");
			return;
		}

		// already logged in and no input given
		if (isLoggedIn && !hasInput) {
			response.sendRedirect("welcome");
			return;
		}

		session.removeAttribute(userIdAttributeName);
		response.sendRedirect("index.jsp");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
