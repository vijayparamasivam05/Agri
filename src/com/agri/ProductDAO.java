package com.agri;
import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	public void addProduct(Product product) throws Exception {
				
		try {
			System.out.println(connection);
			String sql = "insert into Product(product_name,product_details,unit,price,seller_name) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getProduct_name());
			preparedStatement.setString(2, product.getProduct_details());
			preparedStatement.setInt(3, product.getUnit());
			preparedStatement.setInt(4, product.getPrice());
			preparedStatement.setString(5, product.getSeller_name());
			System.out.println("value of Seller:"+ product.getSeller_name());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
/*	public boolean checkProduct(String product_name) throws SQLException {
		// TODO Auto-generated method stub
		boolean b = false;
		String sql = "select * from Product where product_name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, product_name);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) { b=true;}
			else {b=false;}
		}catch (Exception e) 
		{ e.printStackTrace();}
		return b;
	}
	public Product getProduct(String product_name) throws SQLException {
		// TODO Auto-generated method stub
		Product product= new Product();
		String sql = "select * from Product where product_name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, product_name);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) { 
				product.setProduct_name(resultSet.getString(1));
				product.setProduct_details(resultSet.getString(2));
				product.setUnit(resultSet.getInt(3));
				product.setPrice(resultSet.getInt(4));
				product.setSeller_name(resultSet.getString(5));
			}
		}catch (Exception e) 
		{ e.printStackTrace();}
		return product;
	}
	*/
	public ArrayList<Product> getProductList(String product_name) throws SQLException {
		ArrayList<Product> product_list = new ArrayList<Product>();
		String sql = "select * from Product where product_name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, product_name);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) { 
				Product product= new Product();
				product.setProduct_name(resultSet.getString(1));
				product.setProduct_details(resultSet.getString(2));
				product.setUnit(resultSet.getInt(3));
				product.setPrice(resultSet.getInt(4));
				product.setSeller_name(resultSet.getString(5));
				product_list.add(product);
			}
		}catch (Exception e) 
		{ e.printStackTrace();}
		return product_list;
		
	}

}
