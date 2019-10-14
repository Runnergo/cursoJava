package exempleSession;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			// abre la sesion sin crear una nueva(false)
			HttpSession session = request.getSession(false);
			
			// a username se le asigna la sesion de la id creada anteriormente
			String username = (String) session.getAttribute("IDsessionUsername");

			//printa saludo al usuario
			out.print("Hello " + username);
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}