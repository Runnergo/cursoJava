
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");

		if (userName.equals("natalia@gmail.com") && userPass.equals("1234")) {

			out.print("Welcome, " + userName);
			request.getRequestDispatcher("index.html").include(request, response);
			HttpSession session = request.getSession();
			session.setAttribute("name", userName);

		} else {

			out.println("<style> span {color:red;} </style>");
			out.print("<br><h3><center><span>Sorry, username or password error!</span></center></h3>");
			request.getRequestDispatcher("login.html").include(request, response);
		
		}
		
		out.close();
	}
}
