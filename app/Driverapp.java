package com.greatlearning.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeCredentialServiceImpl;

public class Driverapp {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
			System.out.println("Enter your First Name");
			String fname = sc.next();
			System.out.println("Enter your Last Name");
			String lname = sc.next();
			// Create a new employee
			Employee e1=new Employee(fname,lname, fname, lname);
			
			Employee e2=new Employee();
			e2.setFirstname(fname);
			e2.setLastname(lname);
			
			
			EmployeeCredentialServiceImpl ecs = new EmployeeCredentialServiceImpl();
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. HR");
			System.out.println("4. Legal");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			String gEmail = "";
			String gPassword = "";
			switch(choice)
            {
			case 1 : gEmail = ecs.generateUserEmail(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "Tech");
			    break;
			case 2 : gEmail = ecs.generateUserEmail(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "admin");
				break;
			case 3 : gEmail = ecs.generateUserEmail(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "hr");
				break;
			case 4 : gEmail = ecs.generateUserEmail(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(), "legal");
				break;
				
			default:
				System.out.println("Please enter valid choice");
				
			}
			gPassword = ecs.generateUserPassword();
			
			e1.setUseremail(gEmail);
			e1.setPassword(gPassword);
			
			ecs.displayEmployeeDetails(e1);
			
String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";
			
			Pattern p = Pattern.compile(regex);
			 Matcher m = p.matcher(gPassword);
			 if (m.matches())
			            System.out.println("Valid Password");
			        else
			            System.out.println("inValid Password");
		}
			
}


