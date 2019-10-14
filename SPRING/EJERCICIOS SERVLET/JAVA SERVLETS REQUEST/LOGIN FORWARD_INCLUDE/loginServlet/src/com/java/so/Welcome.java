package com.java.so;


import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Welcome extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String userName = request.getParameter("userName");  
    out.print("Welcome "+ userName);  
    }  
  
} 
