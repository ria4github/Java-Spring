package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.koushik.javabrains.dto.Address;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		Address addr=new Address();
		addr.setCity("City");
		addr.setLog("Log");
		addr.setPincode("Pincode");
		addr.setStreet("street");
		
		Address addr2=new Address();
		addr2.setCity("Second City");
		addr2.setLog("Second Log");
		addr2.setPincode("Second Pincode");
		addr2.setStreet("Second street");
		
		user.setUserName("First User");
		
		user.getListOfAddresses().add(addr);
		user.getListOfAddresses().add(addr2);
		
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		session.close();
		
		//user=null;
		
		session=sessionFactory.openSession();
		//session.beginTransaction();
		user=(UserDetails) session.get(UserDetails.class, 1); //second argument is PK
		//System.out.println("The user retrieved is : "+user.getDescription());
		session.close();
		System.out.println("The size of the list : "+user.getListOfAddresses().size());
		
		
	}

}
