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
			
			User user1 = new User();
			user1.setName("bbb");
			user1.setEmailID("bbb@bbb.com");
			user1.setOrganization("CTS");
			user1.setScrum("Alpha");
			
			User user2 = new User();
			user2.setName("bbb");
			user2.setEmailID("bbb@bbb.com");
			user2.setOrganization("CTS");
			user2.setScrum("Alpha");
			
			User user3 = new User();
			user3.setName("bbb");
			user3.setEmailID("bbb@bbb.com");
			user3.setOrganization("CTS");
			user3.setScrum("Alpha");
			
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
