package com.capgemini.service;

import com.capgemini.dao.CommonDAO;

public class CommonServiceImpl implements CommonService {
	CommonDAO dao;
	@Override
	public void login(String name, String password) {
		dao.login(name, password);
		
	}

}
