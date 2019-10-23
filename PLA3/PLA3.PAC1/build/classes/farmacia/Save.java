package farmacia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Save")
public class Save extends HttpServlet{
	
	private static final long serialVersionUID = 1L;	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String descripcion = request.getParameter("descripcion");

		String sprecio = request.getParameter("precio");
		double precio = Double.parseDouble(sprecio);
		
		String categoria=request.getParameter("categoria");
		
		String sstockCantidad = request.getParameter("stockCantidad");
		int stockCantidad = Integer.parseInt(sstockCantidad);
		
		String sstockPorRegistrar = request.getParameter("stockPorRegistrar");
		long stockPorRegistrar =Long.parseLong(sstockPorRegistrar);
		
		String sactivo=request.getParameter("activo");
		boolean activo=Boolean.parseBoolean(sactivo);
		
		out.print(activo);

		Medicamentos medicamentos = new Medicamentos();

	
		medicamentos.setName(name);
		medicamentos.setDescripcion(descripcion);
		medicamentos.setPrecio(precio);
		medicamentos.setCategoria(categoria);
		medicamentos.setStockCantidad(stockCantidad);
		medicamentos.setStockPorRegistrar(stockPorRegistrar);
		medicamentos.setActivo(activo);
		

		int status = FarmaciaDao.save(medicamentos);

		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		} else {
			out.println("Sorry! unable to save record");
		}

		out.close();
	}
		
}
