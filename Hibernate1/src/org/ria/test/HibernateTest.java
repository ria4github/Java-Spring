package org.ria.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ria.dto.Address;
import org.ria.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user1=new UserDetails();
		Address add=new Address();
		add.setCity("Kolkata");
		add.setPincode(700084);
		add.setStreet("SS");
		add.setState("WB");
		
		//user1.setAddress("Adress1");
		user1.setJoinedDate(new Date());
		user1.setDescription("Rias description");
		user1.setAddress(add);
		
		/*UserDetails user2=new UserDetails();
		user2.setUserDetails("Lorainne");
		user2.setAddress("Adress2");
		user2.setJoinedDate(new Date());
		user2.setDescription("Lorraines's description");*/
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		
		/*
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user2);
		session.getTransaction().commit();
	     */
		
		//user1=null;
		//session=sessionFactory.openSession();
		//session.beginTransaction();
		//user1=session.get(UserDetails.class, 1);
		//System.out.println("User Name Retrieved :"+user1.getUserDetails());
		
	}

}
