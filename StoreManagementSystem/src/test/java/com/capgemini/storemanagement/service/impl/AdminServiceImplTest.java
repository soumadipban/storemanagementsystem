package com.capgemini.storemanagement.service.impl;

import org.junit.Test;

import com.capgemini.storemanagement.dto.UserInformation;
import com.capgemini.storemanager.util.PasswordEncoder;

import junit.framework.TestCase;

public class AdminServiceImplTest extends TestCase {
	AdminServiceImpl service = new AdminServiceImpl();
	
	
	
	@Test
	public void test() {
		service.showManufacturer();
	}
	
	@Test
	public void test1() {
		String password = PasswordEncoder.passwordEncoder("soumadip@123Ban");
		service.addManufacturer(new UserInformation(5,"john",password,"8017740294","Kolkata","soumadipban111@gmail.com","dealer"));
	}
	
	@Test
	public void test2() {
		service.deleteManufacturer(5);
	}
	
	@Test
	public void test3() {
		String password1 = PasswordEncoder.passwordEncoder("soumadip@123Ban");
		service.modifyManufacturer(4,new UserInformation(4,"john",password1,"8017740294","Kolkata","soumadipban111@gmail.com","dealer"));
	}
	
	@Test
	public void test4() {
		service.login("soumadip", "qwertyBan@123", 1);
	}

}
