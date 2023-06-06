package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeCredentialService {
	// Generate credentials
    String  generateUserEmail(String firstName, String lastName, String department);
    String generateUserPassword();
    // Display credentials
    void displayEmployeeDetails(Employee e1);
    
}
