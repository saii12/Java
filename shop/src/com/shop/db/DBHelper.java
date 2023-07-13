package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {

	// DB정보
		private final String HOST = "jdbc:mysql://127.0.0.1:3306/shop"; //이 정보는 부모 클래스에서만 쓰기때문에 protected 아닌 private
		private final String USER = "root";
		private final String PASS = "1234";
		
		
		
		// 자원
		protected Connection conn; //protected는 자식클래스가 부모클래스 속성 참조할 수 있는 접근권한
		protected PreparedStatement psmt;
		protected Statement stmt;
		protected ResultSet rs;
		
		
		protected Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(HOST, USER, PASS); 
		}
		
		
		protected void close() throws SQLException {
			
			if(rs != null) {
				rs.close();
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if(psmt != null) {
				psmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
}
