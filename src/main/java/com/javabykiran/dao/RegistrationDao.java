package com.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javabykiran.hibernate.Registration;

@Repository
@Transactional
public class RegistrationDao 
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String getRegisterDao(Registration registration)
	{
		System.out.println("I am in Registration Dao..");
		System.out.println("Dao >> "+registration);
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(registration);
		tx.commit();
		System.out.println("registered successfully..");
		return "success";
	}
	
}
