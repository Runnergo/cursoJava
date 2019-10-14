package exempleSession;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html"); 
			PrintWriter out = response.getWriter(); // out printara la respuesta

			String username = request.getParameter("userName"); 
			out.print("Welcome " + username);

			//inicia sesion y asigna una id de sesion y el nombre del usuario
			HttpSession session = request.getSession();
			session.setAttribute("IDsessionUsername", username);
			

			// crea un link al secondServlet desde la palabra visit
			out.print("<a href='SecondServlet'> visit</a>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
