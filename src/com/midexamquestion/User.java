package com.midexamquestion;

public class User {
	protected String name;
	protected String email;

	
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public User(User user) {
		this.name = user.name;
		this.email = user.name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	public void printDetails() {
            System.out.println("Name: " + name +" Email: " + email);
	}
	
	
	

}
