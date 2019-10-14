package com.java.so;

/*
 * import java.io.IOException; import java.io.PrintWriter;
 * 
 * import javax.servlet.ServletConfig; import javax.servlet.ServletException;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * public class ServBook extends HttpServlet { private static final long
 * serialVersionUID = 1L;
 * 
 * // create static to share all petitions private int peticiones;
 * 
 * public ServBook() { super(); }
 * 
 * @Override public void init(ServletConfig config) throws ServletException {
 * 
 * // peticiones get this value peticiones =
 * Integer.parseInt(config.getInitParameter("inicio")); }
 * 
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * PrintWriter pw = response.getWriter();
 * pw.println("We are printing from Servlet BookForm");
 * pw.print("Request number: " + peticiones+ "     "); peticiones++; pw.
 * println("<input onClick=location=\"http://localhost:8080/bookForm/index.html\" type=\"button\" value=\"INICIO\" name=\"boton1\"\r\n"
 * +
 * "  style=\"BORDER: rgb(157,162,191) 1px groove ; FONT-SIZE: 13pt; FONT-FAMILY: Verdana; BACKGROUND-COLOR: rgb(240, 240, 240)\">\r\n"
 * + "");
 * 
 * pw.
 * println("<input onClick=location=\"http://localhost:8080/bookForm/ServBook\" type=\"button\" value=\"ACTUALIZAR\" name=\"boton2\"\r\n"
 * +
 * "  style=\"BORDER: rgb(157,162,191) 1px groove ; FONT-SIZE: 13pt; FONT-FAMILY: Verdana; BACKGROUND-COLOR: rgb(240, 240,150)\">\r\n"
 * + ""); pw.close(); }
 * 
 * 
 * }
 */



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println(request.getParameter("bookTitle"));
		pw.println(request.getParameter("author"));
		pw.println(request.getParameter("isbn"));
	
		pw.println(request.getParameter("lang"));

		String[] list = request.getParameterValues("typeBook");

		for (int j = 0; j < list.length; j++) {
			pw.println(list[j]);
		}

		pw.close();

	}
}


