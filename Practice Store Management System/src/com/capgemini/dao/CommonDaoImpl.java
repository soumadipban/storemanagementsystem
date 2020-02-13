package com.capgemini.dao;

import java.sql.*;

public class CommonDaoImpl implements CommonDAO {

	@Override
	public void login(String name, String password) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl = "jdbc:mysql://localhost:3306/store_management_system_db";
			con = DriverManager.getConnection(dburl, "root", "12345");
			String query = "insert into user_info values(?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, 8);
			ps.setString(2, "john");
			ps.setString(3, "qwerty098");
			ps.setString(4, "dealer");
			int count = ps.executeUpdate();
			System.out.println("The Number of rows affected:"+count);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void check() {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl = "jdbc:mysql://localhost:3306/store_management_system_db";
			con = DriverManager.getConnection(dburl, "root", "12345");
			String query = "insert into user_info values(?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, 8);
			ps.setString(2, "john");
			ps.setString(3, "qwerty098");
			ps.setString(4, "dealer");
			int count = ps.executeUpdate();
			System.out.println("The Number of rows affected:"+count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
