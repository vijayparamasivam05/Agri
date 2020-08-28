package com.agri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

		public static Connection getConnection() {
			Connection connection = null;
			try {
				// 1.load the class
				Class.forName("com.mysql.jdbc.Driver");  
				// 2.get the connection
				String url = "jdbc:mysql://localhost:3306/Agri";
				connection = DriverManager.getConnection(url, "root", "");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}

		public static void close(Connection conn, PreparedStatement pstmt,ResultSet rs) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}
}
