package com.capgemini.storemanagement.dao;


import com.capgemini.storemanagement.dto.UserInformation;

public interface AdminDao {
	
	public void addManufacturer(UserInformation user);
	
	public boolean login(String name, String password,int id);
	
	
	public boolean modifyManufacturer(int userId,UserInformation user);
	
	public boolean deleteManufacturer(int userId);
	
	public String showManufacturer();


}
