package com.neotech.lesson27;

public class Registration{
	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password.
	 * 
	 * Requirements: Valid email consider to be only yahoo! Valid userName and
	 * password cannot be empty and should be of length larger than 6 characters.
	 * Also valid password cannot contain userName.
	 */
	
	private String email;
	private String userName;
	private String passWord;
	
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
		if(email.contains("@yahoo"))
		{
			this.email=email;
		}
		else {
			System.out.println("You should get a yahoo mail adress");
		}}
		else {
			System.out.println("Email cannot be empty");
		}
		
	}
	
	public String getEmail() {
		return email;
	}
		
	public void setUsername(String userName) {
		if(!userName.isEmpty()) {
			if(userName.length()>6) {
				this.userName=userName;
			}else {
				System.out.println("Username must be bigger than 6 characters");
			}
		}else {
			System.out.println("Username cannot be empty!");
		}
	}
	
	public String getUsername() {
		return userName;
	}
	
	public void setPassword(String passWord) {
		if(!passWord.isEmpty()) {
			if(passWord.length()>6) {
				if(!passWord.contains(userName)) {
					this.passWord=passWord;
				}
					else {
						System.out.println("Password cannot contain username!");
					}
				
			}else {
				System.out.println("Password cannot be shorter than 6 characters!");
			}
		}else {
			System.out.println("Password cannot be empty!");
		}
	}
		
	public String getPassword() {
		return passWord;
	}
		
		
		
		
		

	
	
	

}
	

