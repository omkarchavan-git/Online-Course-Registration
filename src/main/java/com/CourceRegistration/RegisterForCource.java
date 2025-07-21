package com.CourceRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cource.Entity.SetStudents;
import patient.Utility.HibernateUtility;

public class RegisterForCource {
	
	public void courceRegistration() {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transction = session.beginTransaction();
		
		
		SetStudents s = new SetStudents();
		
		System.out.println("Add new Student Registration : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter New Student ID : ");
		s.setId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Student Name : ");
		s.setStudentName(sc.nextLine());
		
		System.out.println("Enter Course Name : ");
		s.setCourseName(sc.nextLine());
		
		System.out.println("enter registration date : ");
		s.setRegdate(sc.nextLine());
		
		System.out.println("Enter fees paid ");
		s.setFeesPaid(sc.nextInt());
		
		
		System.out.println("Data Added Successfully : ");
		s.toString();
		
		
		session.persist(s);
		transction.commit();
		session.close();
	}

}
