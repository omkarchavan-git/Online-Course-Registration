package com.CourceRegistration;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Onliune Course registration System System! ");

		System.out.println("Choose an option: " 
		+ "\n1.Register For Course" 
				+ "\n2.Delete Student Registration By Id"
				+ "\n3.Update fees paid"
				+ "\n4.View all registrations :" 
				+ "\n5.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:
			RegisterForCource r = new RegisterForCource();
			r.courceRegistration();
			break;

		case 2:

			DeleteByID d =  new DeleteByID();
			d.deleteByID();
			break;

		case 3:
			UpdateFees u = new UpdateFees();
			u.updateFees();
			break;
			
		case 4:
			GetAllCources p  = new GetAllCources();
			p.getallCources();
			break;

		case 5:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		}
    }
}
