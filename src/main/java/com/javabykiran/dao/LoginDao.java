package com.javabykiran.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.hibernate.Registration;
import com.javabykiran.model.LoginModel;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;
		
	@SuppressWarnings({ "unchecked" })
	public boolean checkUserDao(LoginModel lm) 
	{
		
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("email", lm.getEmail()));
		List<Registration> list=criteria.list();
		if(!list.isEmpty())
		{
			System.out.println("login Successfully...");
			return true;
		}
		else
		{
			System.out.println("login UnSuccessfully...");
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public int getLoginIDDao(String email) {
		System.out.println("I am in get Login ID method in Login Dao");
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("email", email));
		List<Registration> list=criteria.list();
		int loginid=0;
		if(!list.isEmpty())
		{
			for(Registration r:list)
			{
				loginid=r.getIdregistration();
			}
		}
		return loginid;
	}

	@SuppressWarnings("unchecked")
	public String getLoginNameDao(String email) {
		System.out.println("I am In Get Login Name Dao");
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Registration.class);
		criteria.add(Restrictions.eq("email", email));
		List<Registration> list=criteria.list();
		String loginname="";
		if(!list.isEmpty())
		{
			for(Registration r:list)
			{
				loginname=r.getName();
			}
		}
		return loginname;
	}

}









