package farmacia;

import java.io.IOException;  
import java.io.PrintWriter;   
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Edit")  
public class Edit extends HttpServlet{
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		 
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("Update Medicamento");
	        
	        String sid = request.getParameter("id");  
	        int id =Integer.parseInt(sid);  
	         out.print(id); 
	       Medicamentos e=FarmaciaDao.getMedicamentoById(id);  
	          
	        out.print("<form action='Edit2' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getIdMedicamento()+"'/></td></tr>");  
	        out.print("<tr><td>Nombre:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
	        out.print("<tr><td>Descripcion:</td><td><input type='text' name='descripcion' value='"+e.getDescripcion()+"'/></td></tr>"); 
	        out.print("<tr><td>Categoria:</td><td><input type='text' name='categoria' value='"+e.getCategoria()+"'/></td></tr>"); 
	        out.print("<tr><td>Precio:</td><td><input type='number' step='any' name='precio' value='"+e.getPrecio()+"'/></td></tr>");  
	        out.print("<tr><td>Stock:</td><td><input type='number' name='stockCantidad' value='"+e.getStockCantidad()+"'/></td></tr>");  
	        out.print("</tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	          
	        out.close();  
	    }  

}
