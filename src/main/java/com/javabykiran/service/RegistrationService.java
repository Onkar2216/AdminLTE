package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.RegistrationDao;
import com.javabykiran.hibernate.Registration;
import com.javabykiran.model.RegistrationModel;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao rd;
	
	
	public String getRegisterService(RegistrationModel rm) {
		System.out.println("I am in Registration Service..");
		Registration registration=getRegisterData(rm);
		System.out.println(registration);
		String check=rd.getRegisterDao(registration);
		if(check.equals("success"))
			return "success";
		else
			return "fail";
	}

	private Registration getRegisterData(RegistrationModel rm) {
		System.out.println("I am in Get Registration Data Service..");
		Registration registration = new Registration();
		registration.setName(rm.getName());
		registration.setPhone(rm.getMobile());
		registration.setEmail(rm.getEmail());
		registration.setPassword(rm.getPassword());
		return registration;
	}

}
