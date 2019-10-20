package farmacia;

import java.util.*;

import org.apache.jasper.tagplugins.jstl.core.Out;

import java.sql.*;
import farmacia.Medicamentos;
import farmacia.FarmaciaDao;



public class FarmaciaDao {

	public static Connection getConnection() {

		Connection conection = null;
		try {

			Class.forName("org.h2.Driver");
			conection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/medicamentos", "sa", "1234");
		
		} catch (Exception e) {
			System.out.println(e);
		}
		return conection;
	}
	
	public static int save(Medicamentos medicamento) {
		int status = 0;

		try {
			Connection connection = FarmaciaDao.getConnection();
			PreparedStatement preparedStatment = connection.prepareStatement
					("insert into MEDICAMENTOS (IdMedicamento,name,precio,descripcion,producer,categoria,stockCantidad,stockPorRegistrar,activo) values (?,?,?,?,?,?,?,?,?)");
	
			preparedStatment.setString(1, medicamento.getIdMedicamento());
			preparedStatment.setString(2, medicamento.getName());
			preparedStatment.setDouble(3, medicamento.getPrecio());
			preparedStatment.setString(4, medicamento.getDescripcion());
			preparedStatment.setString(5, medicamento.getProducer());
			preparedStatment.setString(6, medicamento.getCategoria());
			preparedStatment.setInt(7, medicamento.getStockCantidad());
			preparedStatment.setLong(8, medicamento.getStockPorRegistrar());
			preparedStatment.setBoolean(9, medicamento.isActivo());
			
			status = preparedStatment.executeUpdate();

			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
	
	public static int update(Medicamentos medicamento) {

		int status = 0;
		try {
			Connection connection = FarmaciaDao.getConnection();
			PreparedStatement preparedStatment = connection.prepareStatement
					("update MEDICAMENTOS set name=?,precio=?,descripcion=?,categoria=?, stockCantidad=? where IdMedicamento=?");
			
			preparedStatment.setString(6, medicamento.getIdMedicamento());
			preparedStatment.setString(1, medicamento.getName());
			preparedStatment.setDouble(2, medicamento.getPrecio());
			preparedStatment.setString(3, medicamento.getDescripcion());
			//preparedStatment.setString(5, medicamento.getProducer());
			preparedStatment.setString(4, medicamento.getCategoria());
		    preparedStatment.setInt(5, medicamento.getStockCantidad());
			//preparedStatment.setLong(8, medicamento.getStockPorRegistrar());
			//preparedStatment.setBoolean(9, medicamento.isActivo());
			
			status = preparedStatment.executeUpdate();
		
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return status;
	}
	
	public static int delete(int id) {
		int status = 0;

		try {
			Connection connection = FarmaciaDao.getConnection();
			PreparedStatement preparedStatment = connection.prepareStatement("delete from MEDICAMENTOS where IdMedicamento=?");
			preparedStatment.setInt(1, id);
			status = preparedStatment.executeUpdate();

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}
	public static Medicamentos getMedicamentoById(int id) {
		
		Medicamentos medicamento =new Medicamentos();
		
		try {
			Connection connection = FarmaciaDao.getConnection();
			PreparedStatement preparedStatment = connection.prepareStatement("select * from MEDICAMENTOS where IdMedicamento=?");
			preparedStatment.setInt(1, id);
			
			ResultSet rs = preparedStatment.executeQuery();
			if (rs.next()) {
				
			medicamento.setIdMedicamento(rs.getString(1));
			medicamento.setName(rs.getString(2));
		    medicamento.setPrecio(rs.getDouble(3));
			medicamento.setDescripcion(rs.getString(4));
			medicamento.setProducer(rs.getString(5));
			medicamento.setCategoria(rs.getString(6));
			medicamento.setStockCantidad(rs.getInt(7));
			medicamento.setStockPorRegistrar(rs.getLong(8));
			medicamento.setActivo(rs.getBoolean(9));
			}
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return medicamento;
	}
	
	public static List<Medicamentos> getAllMedicamentos() {
		List<Medicamentos> list = new ArrayList<Medicamentos>();
	
		try {
			Connection connnection = FarmaciaDao.getConnection();
			PreparedStatement preparedStatment = connnection.prepareStatement("select * from MEDICAMENTOS");
			
			ResultSet rs = preparedStatment.executeQuery();
			while (rs.next()) {
				
				Medicamentos medicamento =new Medicamentos();
				
				medicamento.setIdMedicamento(rs.getString(1));
				medicamento.setName(rs.getString(2));
			    medicamento.setPrecio(rs.getDouble(3));
				medicamento.setDescripcion(rs.getString(4));
				medicamento.setProducer(rs.getString(5));
				medicamento.setCategoria(rs.getString(6));
				medicamento.setStockCantidad(rs.getInt(7));
				medicamento.setStockPorRegistrar(rs.getLong(8));
				medicamento.setActivo(rs.getBoolean(9));
				list.add(medicamento);
				
			}
			connnection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
			
}
