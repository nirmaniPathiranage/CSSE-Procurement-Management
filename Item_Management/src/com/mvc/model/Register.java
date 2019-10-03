package com.mvc.model;

/** This is the Register model class */

public class Register {

	private String userName;

	private String passWord;

	private String fullName;

	private String NICno;

	private String emailAddress;

	private String streetAddress;

	private String contactNo;

	private String regDate;

	public Register() {
		super();
	}

	public Register(String userName, String passWord, String fullName, String nICno, String emailAddress,
			String streetAddress, String contactNo, String regDate) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		NICno = nICno;
		this.emailAddress = emailAddress;
		this.streetAddress = streetAddress;
		this.contactNo = contactNo;
		this.regDate = regDate;
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

	/** @return the fullname */
	public String getFullName() {
		return fullName;
	}

	/** @param fullName the fullName to set */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/** @return the nic */
	public String getNICno() {
		return NICno;
	}

	/** @param nic the nic to set */
	public void setNICno(String nICno) {
		NICno = nICno;
	}

	/** @return the email */
	public String getEmailAddress() {
		return emailAddress;
	}

	/** @param email the email to set */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/** @return the address */
	public String getStreetAddress() {
		return streetAddress;
	}

	/** @param address the address to set */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/** @return the contact */
	public String getContactNo() {
		return contactNo;
	}

	/** @param contact the contact to set */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/** @return the regdate */
	public String getRegDate() {
		return regDate;
	}

	/** @param regdate the regdate to set */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Register [userName=" + userName + ", passWord=" + passWord + ", fullName=" + fullName + ", NICno="
				+ NICno + ", emailAddress=" + emailAddress + ", streetAddress=" + streetAddress + ", contactNo="
				+ contactNo + ", regDate=" + regDate + "]";
	}

}
