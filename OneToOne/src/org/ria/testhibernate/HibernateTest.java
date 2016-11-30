package org.ria.testhibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.ria.hibernate.dto.UserDetails;
import org.ria.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		
		
		user.setUserName("First User");
		
	    Vehicle vehicle=new Vehicle();
	    vehicle.setVehicleName("Car");
		
	    user.setVehicle(vehicle);
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		
		session.getTransaction().commit();
		session.close();
		
		//user=null;
		
		//session=sessionFactory.openSession();
		//session.beginTransaction();
		//user=(UserDetails) session.get(UserDetails.class, 1); //second argument is PK
		//System.out.println("The user retrieved is : "+user.getDescription());
		//session.close();
		//System.out.println("The size of the list : "+user.getListOfAddresses().size());
		
		
	}

}
