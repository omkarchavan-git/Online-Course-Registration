package com.CourceRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cource.Entity.SetStudents;
import patient.Utility.HibernateUtility;

public class DeleteByID {
	
	public void deleteByID() {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		System.out.println("Enter Student ID to remove : ");
		Scanner sc = new Scanner(System.in);
		int StudentID = sc.nextInt();
		
		
		SetStudents StudId = session.find(SetStudents.class, StudentID);
		session.remove(StudId);
		
		transaction.commit();
		session.close();
		
	}

}
