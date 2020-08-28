package com.agri;
import java.sql.*;

public class ProductDAO {
	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	public void addProduct(Product product) throws Exception {
		try {
			System.out.println(connection);
			String sql = "insert into Product(product_name,product_details,unit,price) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getProduct_name());
			preparedStatement.setString(2, product.getProduct_details());
			preparedStatement.setInt(3, product.getUnit());
			preparedStatement.setInt(4, product.getPrice());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
