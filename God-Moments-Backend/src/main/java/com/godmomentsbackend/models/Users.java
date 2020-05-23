package com.godmomentsbackend.models;

public class Users {

	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String emailAddress;
	private int phoneNumber;
	private String username;
	private String passsord;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssord() {
		return passsord;
	}
	public void setPasssord(String passsord) {
		this.passsord = passsord;
	}
	public int getPassword() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
