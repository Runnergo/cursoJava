package com.java.so;


import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String userName=request.getParameter("userName");  
    String userPass=request.getParameter("userPass");  
          
    if(userName.equals("natalia")&&userPass.equals("1234")){  
        RequestDispatcher requestdisapcher = request.getRequestDispatcher("servlet2");  
        requestdisapcher.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher requestdisapcher=request.getRequestDispatcher("/index.html");  
        requestdisapcher.include(request, response);  
                      
        }  
    }  
  
}

