package com.capgemini.storemanager.util;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordValidator {
	
	public static boolean PasswordValidation(String plainPassword,String hashPassword) {
		return BCrypt.checkpw(plainPassword,hashPassword);
	}
}
