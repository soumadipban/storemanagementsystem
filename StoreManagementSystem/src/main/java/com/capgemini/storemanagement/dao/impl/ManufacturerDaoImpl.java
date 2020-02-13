package com.capgemini.storemanagement.dao.impl;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.storemanagement.dao.ManufacturerDao;
import com.capgemini.storemanagement.dto.ProductInformation;
import com.capgemini.storemanagement.dto.UserInformation;

public class ManufacturerDaoImpl implements ManufacturerDao {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	FileReader fileReader;
	Properties properties;

	public ManufacturerDaoImpl() {
		try {
			fileReader = new FileReader("user.properties");
			properties = new Properties();
			properties.load(fileReader);
			Class.forName(properties.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addDealerDetail(UserInformation user) {
		String str = "insert into user_info values(?,?,?,?,?,?,'dealer')";
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

	public boolean removeDealerDetail(int dealerId) {
		int count=0;
		boolean isDealerDetail = false;
		String sql = "delete from user_info where userid=? and usertype='dealer'";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, dealerId);
			count = ps.executeUpdate();
			if(count!=0) {
				isDealerDetail = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isDealerDetail;

	}

	public boolean updateDealerDetail(int dealerId, UserInformation user) {
		int count=0;
		boolean isUpdateDetail = false;
		String str = "UPDATE user_info SET username = ?,password = ?,phn_no = ?,address = ? WHERE userid = ?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getPhn_no());
			ps.setString(4, user.getAddress());
			ps.setInt(5, dealerId);
			count  = ps.executeUpdate();
			if(count!=0) {
				isUpdateDetail = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isUpdateDetail;

	}

	public String showDealerDetail() {
		String sql = "select * from user_info where usertype='dealer'";
		String result = " ";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				result = result + "\n" + "ID:" + rs.getInt("userid") + "\t\t" + "NAME:" + rs.getString("username")
						+ "\t\t" + "PHONE NUMBER:" + rs.getString("phn_no") + "\t\t" + "ADDRESS:"
						+ rs.getString("address") + "\t\t" + "EMAIL ID:" + rs.getString("email_id") + "\t\t";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void addProductDetail(ProductInformation product) {
		String str = "insert into product_info values(?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setString(3, product.getProductBrand());
			ps.setInt(4, product.getQuantity());
			ps.setInt(5, product.getCostPrice());
			ps.setInt(6, product.getSellingPrice());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean removeProductDetai(int productId) {
		int count = 0;
		boolean isDelete = false;
		String sql = "delete from product_info where product_id=?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, productId);
			count = ps.executeUpdate();
			if(count!=0) {
				isDelete = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDelete;
	}

	public boolean updateProductDetai(int productId, ProductInformation product) {
		int count = 0;
		boolean isUpdate = false;
		String str = "UPDATE product_info SET product_name=?,product_brand=?,quantity=?,cost_price=? WHERE product_id=?";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(str)) {
			ps.setString(1, product.getProductName());
			ps.setString(2, product.getProductBrand());
			ps.setInt(3, product.getQuantity());
			ps.setInt(4, product.getCostPrice());
			ps.setInt(5, productId);
			count = ps.executeUpdate();
			if(count!=0)
				isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isUpdate;

	}

	public String showProductDetai() {
		String result = " ";
		String sql = "select * from product_info";
		try (Connection con = DriverManager.getConnection(properties.getProperty("dburl"));
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				result = result + "\n" + "ID:" + rs.getInt("product_id") + "\t\t" + "PRODUCT NAME:"
						+ rs.getString("product_name") + "\t\t" + "PRODUCT BRAND:" + rs.getString("product_brand")
						+ "\t\t" + "QUANTITY:" + rs.getInt("quantity") + "\t\t" + "COST PRICE:"
						+ rs.getInt("cost_price") + "\t\t" + "SELLING PRICE:" + rs.getInt("selling_price");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}
}
