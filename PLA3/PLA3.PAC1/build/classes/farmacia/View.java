package farmacia;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/View")
public class View extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Lista medicamentos");
		List<Medicamentos> list = FarmaciaDao.getAllMedicamentos();
		

		out.print("<table id='customers'");
		out.print("<br><br>");
		out.print("<tr><th>Id</th><th>name</th><th>descripcion</th><th>categoria</th><th>precio</th><th>Stock</th><th>Edit</th><th>Delete</th></tr>");
		
		for (Medicamentos medicamento:list) {
			out.print("<tr><td>" +medicamento.getIdMedicamento()+"</td><td>"+medicamento.getName()
			+"</td><td>"+medicamento.getDescripcion()+"</td><td>"+medicamento.getCategoria()
			+"</td><td>"+medicamento.getPrecio()+"</td><td>"+medicamento.getStockCantidad()
			+"</td><td><a href='Edit?id="+medicamento.getIdMedicamento()
			+"'>edit</a></td> <td><a href='Delete?id="+medicamento.getIdMedicamento() + "'>delete</a></td></tr>");

			
		}
		out.print("</table>");

		out.println("<a href='index.html'>Añadir nuevo medicamento</a>");

		out.close();
	}
}
