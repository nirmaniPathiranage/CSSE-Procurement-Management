package com.mvc.model;

/** This is the Login model class */

public class Login {

	private String userName;

	private String passWord;

	public Login() {
		super();
	}

	public Login(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	/** @return the username */
	public String getUserName() {
		return userName;
	}

	/** @param username the username to set */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** @return the password */
	public String getPassWord() {
		return passWord;
	}

	/** @param password the password to set */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {

		return "Login [userName=" + userName + ", passWord=" + passWord + "]";
	}
}