package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeCredentialServiceImpl implements EmployeeCredentialService{

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		
		return firstName + lastName + "@" + departmentName +"gl.com";
		
	}

	@Override
	public String generateUserPassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchars = "!@#$%^&*()";
		
		String combined = caps + lower + nums + splchars;
		System.out.println("Com" +combined.length());
		
		String genPass = ""; //p&C9
		Random random = new Random();
		
		// Generate characters
		for(int i = 1;i <= 8; i++) 
		{
			genPass=genPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return genPass;
	}

	@Override
	public void displayEmployeeDetails(Employee e1) {
		System.out.println("Employee first Name is: " + e1.getFirstname());
		System.out.println("Employee last Name is: " + e1.getLastname());
		System.out.println("Employee Email is: " + e1.getUseremail());
		System.out.println("Employee Password is: " + e1.getPassword());
		
		
	}
	public String generateUserEmail(Employee e1, String dept) {
		String genEmail=e1.getFirstname().toLowerCase() + e1.getLastname().toLowerCase()+"@"+ dept +".gl.com";
		return genEmail;
		
	}
}

