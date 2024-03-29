package com.cts.ts.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.cts.ts.vo.User;

public class HibernateQueries {
	public void executeQueries() {
		Session session = null;
		try {
			
			/*  SessionFactory sessionFactory = new Configuration().configure()
			  .buildSessionFactory();*/
			 
			SessionFactory sessionFactory = new AnnotationConfiguration()
					.configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			System.out.println("CONNECTED TO DB.....");
			User user = new User();
			user.setName("bbb");
			user.setEmailID("bbb@bbb.com");
			user.setOrganization("CTS");
			user.setScrum("Alpha");
			session.save(user);
			System.out.println("INSERT SUCCESSFUL !!!!!");
			tx.commit();
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
}
