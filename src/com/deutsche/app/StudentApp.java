/**
 * 
 */
package com.deutsche.app;

import java.util.Scanner;

/**
 * @author sukhb
 *
 */
public class StudentApp {
	
	public void showStudentMenu(String username) {
		Scanner sc = new Scanner(System.in);

		int studentChoice = 0;
		while (studentChoice != 6) {
			System.out.println("\nEnter Choice\n1. Register for course\n2. Add course\n3. Drop course\n4. View grade card\n5. Pay fee\n6. Exit");
			studentChoice = sc.nextInt();
		    sc.nextLine();
		    System.out.println(studentChoice);
		}
		sc.close();
	}

}
