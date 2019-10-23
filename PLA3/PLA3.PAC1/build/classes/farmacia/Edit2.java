package farmacia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Edit2")
public class Edit2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sid = request.getParameter("id");
	    //int id = Integer.parseInt(sid);
	    
		String name = request.getParameter("name");
		String descripcion = request.getParameter("descripcion");

		String sprecio = request.getParameter("precio");
		double precio = Double.parseDouble(sprecio);
		
		String categoria=request.getParameter("categoria");
		
		String stock=request.getParameter("stockCantidad");
		int stockCantidad=Integer.parseInt(stock);

		Medicamentos medicamentos = new Medicamentos();

		medicamentos.setIdMedicamento(sid);
		medicamentos.setName(name);
		medicamentos.setDescripcion(descripcion);
		medicamentos.setPrecio(precio);
		medicamentos.setCategoria(categoria);
		medicamentos.setStockCantidad(stockCantidad);

		int status = FarmaciaDao.update(medicamentos);

		if (status > 0) {
			response.sendRedirect("View");
	
		} else {
			out.println("Sorry! unable to update record");
		}
		out.close();
	}

}
