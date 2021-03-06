package com.exemForward.sc;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/forwardDemo")
public class ForwardDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Request:
	// http://localhost:8080/exempleForward/other/forwardDemo?forward=true
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get value of parameter on URL.
		String forward = request.getParameter("forward");

		if ("true".equals(forward)) {
			System.out.println("Forward to ShowServlet");

			// Set data to attribute of the request.
			request.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY, "Hi, I'm Natalia and I love Spring!");

			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/show");
			dispatcher.forward(request, response);

			return;
		}
		ServletOutputStream out = response.getOutputStream();
		out.println("<h3>Text of ForwardDemoServlet</h3>");
		out.println("- servletPath=" + request.getServletPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
