package com.capgemini.storemanagement.dao.impl;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.storemanagement.dao.AdminDao;
import com.capgemini.storemanagement.dto.UserInformation;
import com.capgemini.storemanagement.exception.UserNotFoundException;

public class AdminDaoImpl implements AdminDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	FileReader fileReader;
	Properties properties;

	public AdminDaoImpl() {
		try {
			fileReader = new FileReader("user.properties");
			properties = new Properties();
			properties.load(fileReader);
			Class.forName(properties.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean login(String name, String password, int id) {
		boolean isCheck = false;
		String str = "select username,password from user_info where userid=?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setInt(1, id);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
/*					String hashPassword = PasswordEncoder.passwordEncoder(password);
					boolean check = PasswordValidator.PasswordValidation(password, hashPassword);*/
					if (rs.getString("username").equals(name) && rs.getString("password").equals(password)) {
						isCheck = true;
						break;
					}else
						throw new UserNotFoundException("User not found");
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return isCheck;
	}

	public void addManufacturer(UserInformation user) {
		String str = "insert into user_info values(?,?,?,?,?,?,'manufacturer')";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getPhn_no());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getEmail_id());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean modifyManufacturer(int userId, UserInformation user) {
		boolean isUpdate = false;
		String str = "UPDATE user_info SET username = ?,password = ?,phn_no = ?,address = ? WHERE userid = ?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getPhn_no());
			ps.setString(4, user.getAddress());
			ps.setInt(5, userId);
			int count = ps.executeUpdate();
			if (count != 0)
				isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUpdate;

	}

	public boolean deleteManufacturer(int userId) {
		boolean isDeleted = false;
		String sql = "delete from user_info where userid=?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, userId);
			int count = ps.executeUpdate();
			if (count != 0)
				isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	public String showManufacturer() {
		String result = " ";
		String sql = "select * from user_info where usertype='manufacturer'";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				result = result + "\n" + "ID:" + rs.getInt("userid") + "\t\t" + "NAME:" + rs.getString("username")
						+ "\t\t" + "PHONE NUMBER:" + rs.getString("phn_no") + "\t\t" + "ADDRESS:"
						+ rs.getString("address") + "\t\t" + "EMAIL ID:" + rs.getString("email_id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
