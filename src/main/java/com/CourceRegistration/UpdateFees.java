package com.CourceRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cource.Entity.SetStudents;
import patient.Utility.HibernateUtility;

public class UpdateFees {
	
	public void updateFees() {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter Student ID to update fees details");
		Scanner sc = new Scanner(System.in);
		int studID =  sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter updated Fees : ");
		int updatedFees = sc.nextInt();
		sc.nextLine();
		
		SetStudents s = session.find(SetStudents.class, studID);
		s.setFeesPaid(updatedFees);
	
		//session.persist(s);
		transaction.commit();
		session.close();
		
		
		
	}

}
