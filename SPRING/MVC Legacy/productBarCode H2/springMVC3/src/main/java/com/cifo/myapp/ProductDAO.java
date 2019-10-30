package com.cifo.myapp;

import java.util.*;
import java.sql.*;

public class ProductDAO {

	public static Connection getConnection() {

		Connection conection = null;
		try {

			Class.forName("org.h2.Driver");
			conection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/PRODUCTS", "sa", "1234");
		} catch (Exception e) {
			System.out.println(e);
		}
		return conection;
	}

	/*
	 * public static int delete(String id) { int status = 0;
	 * 
	 * try {
	 * 
	 * Connection connection = ProductDAO.getConnection(); PreparedStatement
	 * prepareStatment =
	 * connection.prepareStatement("delete from PRODUCTS where id=?");
	 * 
	 * prepareStatment.setString(1, id); status = prepareStatment.executeUpdate();
	 * 
	 * connection.close(); } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return status; }
	 */



	public static Product getProductById(String id) {

		Product product = new Product();

		try {
			Connection connection = ProductDAO.getConnection();
			PreparedStatement preparedStatment = connection.prepareStatement("select * from PRODUCTS where id=?");
			preparedStatment.setString(1, id);

			ResultSet rs = preparedStatment.executeQuery();

			if (rs.next()) {
				product.setId(rs.getString(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));

			}
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return product;
	}

	public static List<Product> getAllProducts() {
		List<Product> list = new ArrayList<Product>();

		try {
			Connection con = ProductDAO.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from PRODUCTS");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getString(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				list.add(product);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * public Blob getPhotoById(String id) {
	 * 
	 * java.sql.Blob blob = null;
	 * 
	 * try { Connection con = ProductDAO.getConnection(); PreparedStatement ps =
	 * con.prepareStatement("select photo from PRODUCTS where id=?");
	 * ps.setString(1, id); ResultSet rs = ps.executeQuery();
	 * 
	 * rs.next(); blob = rs.getBlob(1);
	 * 
	 * con.close(); } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return blob;
	 * 
	 * }
	 */
}
