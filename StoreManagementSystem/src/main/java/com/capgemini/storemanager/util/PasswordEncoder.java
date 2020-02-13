package com.capgemini.storemanager.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {
	public static String passwordEncoder(String pwd) {
		return BCrypt.hashpw(pwd, BCrypt.gensalt());//2nd arg is generated some salt
		
	}	
}
