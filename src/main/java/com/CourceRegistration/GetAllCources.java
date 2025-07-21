package com.CourceRegistration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cource.Entity.SetStudents;
import patient.Utility.HibernateUtility;

public class GetAllCources {

	public void getallCources() {
		
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transction = session.beginTransaction();
		
		// get all cource details
		List<SetStudents> Courselist = session.createQuery("Select s from SetStudents s", SetStudents.class).getResultList();
		
		Courselist.stream().forEach(k -> System.out.println(k.toString()));
		
		transction.commit();
		session.close();
	}
	
}
