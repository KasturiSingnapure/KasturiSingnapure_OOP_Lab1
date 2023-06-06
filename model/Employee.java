package com.greatlearning.model;

public class Employee {
	
	private String firstname;
	private String lastname;
	private String useremail;
	private String password;
	public Employee() {}
	public Employee(String firstname, String lastname, String useremail, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.useremail = useremail;
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
