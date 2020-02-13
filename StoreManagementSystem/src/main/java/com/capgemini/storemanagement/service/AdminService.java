package com.capgemini.storemanagement.service;

import com.capgemini.storemanagement.dto.UserInformation;

public interface AdminService {

	public void addManufacturer(UserInformation user);
	public boolean login(String name, String password,int id);
	public boolean modifyManufacturer(int userId,UserInformation user);
	public boolean deleteManufacturer(int userId);
	public String showManufacturer();
	public boolean passwordValidate(String passWord);
	public boolean contactValidate(String phn_no);
	public boolean emailValidate(String email_id);
	public String generatePassword(String passWord);

}
