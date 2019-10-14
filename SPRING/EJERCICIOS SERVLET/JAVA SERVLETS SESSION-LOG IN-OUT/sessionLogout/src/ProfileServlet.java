
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		if (session != null) {
			String name = (String) session.getAttribute("name");
			out.print("Hello, " + name + " Welcome to Profile");
			request.getRequestDispatcher("index.html").include(request, response);

		} else {

			out.println("<style> span {color:red;} </style>");
			out.print("<br><h3><center><span>Please login first</span></center></h3>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}
}