package com.capgemini.storemanagement.service.impl;

import com.capgemini.storemanagement.dao.impl.AdminDaoImpl;
import com.capgemini.storemanagement.dto.UserInformation;
import com.capgemini.storemanagement.exception.UserNotFoundException;
import com.capgemini.storemanagement.service.AdminService;
import com.capgemini.storemanagement.validation.ValidateCheck;
import com.capgemini.storemanager.util.PasswordEncoder;

public class AdminServiceImpl implements AdminService {
	AdminDaoImpl dao = new AdminDaoImpl();
	
	public void addManufacturer(UserInformation user) {
		dao.addManufacturer(user);	
	}
	
	public boolean login(String name, String password, int id) throws UserNotFoundException {
		boolean result = dao.login(name, password,id);
		return result;
	}

	public boolean modifyManufacturer(int userId,UserInformation user) {
		boolean result = dao.modifyManufacturer(userId,user);
		return result;
	}

	public boolean deleteManufacturer(int userId) {
		return dao.deleteManufacturer(userId);
	}

	public String showManufacturer() {
		String result = dao.showManufacturer();
		return result;
	}

	public boolean passwordValidate(String passWord) {
		boolean flag = ValidateCheck.validPassword(passWord);
		return flag;
	}

	public boolean contactValidate(String phn_no) {
		boolean flag = ValidateCheck.validContact(phn_no);
		return flag;
	}

	public boolean emailValidate(String email_id) {
		boolean flag = ValidateCheck.emailValidation(email_id);
		return flag;
	}

	public String generatePassword(String passWord) {
		String hashPassword = PasswordEncoder.passwordEncoder(passWord);
		return hashPassword;
	}
	
}
