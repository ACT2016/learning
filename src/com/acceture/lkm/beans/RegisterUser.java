package com.acceture.lkm.beans;

public class RegisterUser {
	

    private String firstName="";

    private String lastName;

    private String email;
    
    private int cLevel;
    
    private String sName;

    private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getcLevel() {
		return cLevel;
	}

	public void setcLevel(int cLevel) {
		this.cLevel = cLevel;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}
