/**
 * 
 */
package com.deutsche.app;

import java.util.Scanner;

/**
 * @author sukhb
 *
 */
public class ProfessorApp {
	
	public void showProfessorMenu (String username) {
		Scanner sc = new Scanner(System.in);
		int profChoice = 0;
		while (profChoice != 3) {
			System.out.println("\nEnter Choice\n1. Add Grades\n2. View Enrolled Students\n3. Exit");
			profChoice = sc.nextInt();
		    sc.nextLine();
		    
		    switch (profChoice) {
		    case 1:
		    	System.out.println("\nEnter student id");
		    	String studentId = sc.nextLine();
		    	System.out.println("\nEnter course name");
		    	String courseName = sc.nextLine();
		    	System.out.println("\nEnter grade assigned");
		    	String grade = sc.nextLine();
		    case 2:
		    	System.out.println("The following students are enrolled in your courses: ");
//		    	get professor object from username
//		    	ProfessorService profService = new ProfessorService();
//		    	 profService.viewEnrolledStudents(professor);
		    	
		    }
		    
		    
		}
		sc.close();
	}

}
