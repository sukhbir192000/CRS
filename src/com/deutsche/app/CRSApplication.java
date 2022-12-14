/**
 * 
 */
package com.deutsche.app;

import java.util.Scanner;

import com.deutsche.service.ProfessorService;

/**
 * @author sukhb
 *
 */
public class CRSApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CRM Application!\n");
		

		Scanner sc = new Scanner(System.in);
		
	    int homeChoice = 0;
	    while (homeChoice != 4) {
	    	System.out.println("\nEnter Choice\n1. Login\n2. Registration for student\n3. Update Password\n4. Exit");
	    	homeChoice = sc.nextInt();
	    	sc.nextLine();
	    	
	    	switch (homeChoice) {
			case 1:
				System.out.println("Please enter Username : ");
				String username = sc.nextLine();
				System.out.println("Please enter Password");
				String password = sc.nextLine();
				System.out.println("Please enter Role(student, professor or admin)");
				String role = sc.nextLine();
				
					switch (role) {
					case "professor":
						ProfessorApp profApp = new ProfessorApp();
						profApp.showProfessorMenu(username);
						break;
					    
						
					case "student":
						StudentApp studentApp = new StudentApp();
						studentApp.showStudentMenu(username);
						break;

						
						
					case "admin":
						int adminChoice = 0;
						while (adminChoice != 6) {
							System.out.println("\nEnter Choice\n1. Generate grade card\n2. Add professor\n3. Approve student registration\n4. Add course\n5. Remove course\n6. Exit");
							adminChoice = sc.nextInt();
						    sc.nextLine();
						}
					}
				
				break;
			case 2:
				System.out.println("Please enter username : ");
				String registrationUname = sc.nextLine();
				System.out.println("Please enter email : ");
				String registrationEmail = sc.nextLine();
				System.out.println("Please enter Password");
				String registrationPass = sc.nextLine();
				System.out.println("Please enter branch : ");
				String registrationBranch = sc.nextLine();
				System.out.println("Please enter department : ");
				String registrationDept = sc.nextLine();
				System.out.println("Please enter year");
				String registrationYear = sc.nextLine();

				break;
			case 3:
				System.out.println("\nUpdate password.\n");
				System.out.println("Please enter username : ");
				String passUpdationUname = sc.nextLine();
				System.out.println("Please enter Old Password");
				String oldPass = sc.nextLine();
				System.out.println("Please enter New Password");
				String newPass = sc.nextLine();
				break;
			case 4:
				System.out.println("Thanks for visit CRM application.");
				break;
			default:
				System.out.println("Invalid Choice.\nPlease Enter Choice Again.");
	    	}
	    
	    }
    	sc.close();
    	
    	
	    
	}

}
