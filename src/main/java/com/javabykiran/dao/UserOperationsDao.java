package com.javabykiran.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.hibernate.Downloads;
import com.javabykiran.hibernate.Links;
import com.javabykiran.hibernate.Operators;
import com.javabykiran.hibernate.State;
import com.javabykiran.hibernate.Users;

@Repository
public class UserOperationsDao 
{

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Users> getUserlistDao(int loginid, int page_id, int total) 
	{
		System.out.println("I am get Userlist Dao...>> "+loginid);		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Users.class);
		criteria.add(Restrictions.eq("idregistration", loginid));
		criteria.setFirstResult(page_id-1);
		criteria.setMaxResults(total);
		List<Users> list=(List<Users>)criteria.list();
		System.out.println(list);
		return list;
	}

	public boolean getAddUSerDao(Users user)
	{
		System.out.println("I am in Add User Dao");
		Session session = sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean getdeleteUserDao(int iduser) {
		System.out.println("I am in Delete User Dao");
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Users.class);
		criteria.add(Restrictions.eq("idusers", iduser));
		criteria.add(Restrictions.ne("isDefault", "Y"));
		List<Users> list=criteria.list();
		System.out.println("Dalete user list >> "+list);
		for(Users user:list)
		{
			Transaction tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Users> getUpdateDataDao(int iduser) {
		System.out.println("I am get Update data Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Users.class);
		criteria.add(Restrictions.eq("idusers", iduser));
		List<Users> list=criteria.list();
		return list;
	}

	public boolean getupdateUserDao(Users user) 
	{
		System.out.println("I am in Update User Dao");
		Session session = sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(user);
		tx.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<State> getStateListDao() 
	{
		System.out.println("I am get State data Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(State.class);
		List<State> list=criteria.list();
		System.out.println("list state >> "+list);
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Links> getLinklistDao() {
		System.out.println("I am get Links data Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Links.class);
		List<Links> list=criteria.list();
		System.out.println("Link list >> "+list);
		return list;
	}

	@SuppressWarnings("unchecked")
	public String getStatenameDao(int sid) {
		System.out.println("I am get Statename Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(State.class);
		criteria.add(Restrictions.eq("sid", sid));
		List<State> list=criteria.list();
		String statename=null;
		for(State st:list)
		{
			statename=st.getStatename();
		}
		System.out.println("Statename >> "+statename);
		return statename;
	}

	@SuppressWarnings("unchecked")
	public List<Operators> getOperatorListDao() 
	{
		System.out.println("I am get Operators data Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Operators.class);
		List<Operators> list=criteria.list();
		System.out.println("Operaotors list >> "+list);
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Downloads> getDownloadDao() 
	{
		System.out.println("I am get Download data Dao...");		
		Session session = sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Downloads.class);
		List<Downloads> list=criteria.list();
		System.out.println("Downloads list >> "+list); 
		return list;
	}
}
