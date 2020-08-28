package com.agri;
import java.sql.*;

public class UserDAO {
	ResultSet resultSet = null;
	Connection connection = ConnectionUtil.getConnection();
	public void addUser(User user) throws Exception {
		try {
			//Connection connection = ConnectionUtil.getConnection();
			System.out.println(connection);
			String sql = "insert into User(user_name,password,mobile_number,email_id) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUser_name());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setLong(3, user.getMobile_number());
			preparedStatement.setString(4, user.getEmail_id());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public boolean checkUser(String name, String password) throws SQLException{
		// TODO Auto-generated method stub
		boolean b = false;
		String sql = "select * from User where user_name=? and password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) { b=true;}
			else {b=false;}
		}catch (Exception e) 
		{ e.printStackTrace();}
		return b;
	}
	
	public User getUser(String name, String password) throws SQLException{
		// TODO Auto-generated method stub
		User user = new User();
		String sql = "select * from User where user_name=? and password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				user.setUser_name(resultSet.getString(1));
				user.setPassword(resultSet.getString(2));
				user.setMobile_number(resultSet.getLong(3));
				user.setEmail_id(resultSet.getString(4));
			}
			//else {b=false;}
		}catch (Exception e) 
		{ e.printStackTrace();}
		return user;
	}
}
