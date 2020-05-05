package com.javabykiran.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.LoginDao;
import com.javabykiran.model.LoginModel;

@Service // @Component//@Cpnfiguration

public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public boolean checkLoginService(LoginModel lm) {
		System.out.println("I am in Login Service.");
		Boolean check= loginDao.checkUserDao(lm);
		if (check) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}

	public int getLoginIDService(String email) {
		System.out.println("I am in Get Login ID Service..");
		return loginDao.getLoginIDDao(email);
	}

	public String getLoginNameService(String email) {
		System.out.println("I am in get Login Name Service..");
		return loginDao.getLoginNameDao(email);
	}

}
