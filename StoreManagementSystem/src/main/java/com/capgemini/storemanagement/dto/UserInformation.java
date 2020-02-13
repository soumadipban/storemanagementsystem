package com.capgemini.storemanagement.dto;

public class UserInformation {

	private int userId;
	private String userName;
	private String password;
	private String phn_no;
	private String address;
	private String email_id;
	private String usertype;

	public UserInformation() {
		super();
	}

	public UserInformation(int userId, String userName, String password, String phn_no, String address, String email_id,
			String usertype) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phn_no = phn_no;
		this.address = address;
		this.email_id = email_id;
		this.usertype = usertype;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

}
