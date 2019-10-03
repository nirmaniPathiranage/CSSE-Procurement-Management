package com.mvc.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mvc.model.Login;
import com.mvc.service.LoginDAO;

public class LoginDAOTest {

	private Login login;

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}

	@Test
	public void ValidateLoginAction() {

		// pass
		System.out.println("Testing Login Class");

		login = new Login();

		login.setUserName("Kishan Fernando");
		login.setPassWord("a1!b2@c3#");

		LoginDAO loginDAO = new LoginDAO();

		String expected = "SUCCESS";
		String actual = loginDAO.authenticateUser(login);

		assertEquals(actual, expected);
	}

	@Test
	public void ValidateLoginAction2() {

		// fail
		System.out.println("Testing Login Class with invalid details");

		login = new Login();

		login.setUserName("");
		login.setPassWord("a1!b2@c3#");

		LoginDAO loginDAO = new LoginDAO();

		String expected = "SUCCESS";
		String actual = loginDAO.authenticateUser(login);

		assertEquals(actual, expected);
	}

	@Test
	public void ValidateLoginAction3() {

		// pass
		System.out.println("Testing Login Class with invalid details");

		login = new Login();

		login.setUserName("");
		login.setPassWord("a1!b2@c3#");

		LoginDAO loginDAO = new LoginDAO();

		String expected = "Invalid User Credentials !!! Try Again ...";
		String actual = loginDAO.authenticateUser(login);

		assertEquals(actual, expected);
	}

	@Test
	public void ValidateLoginAction4() {

		// fail
		System.out.println("Testing Login Class with invalid details");

		login = new Login();

		login.setUserName("");
		login.setPassWord("a1!b2@c3#");

		LoginDAO loginDAO = new LoginDAO();

		String expected = "SUCCESS";
		String actual = loginDAO.authenticateUser(login);

		assertEquals(actual, expected);
	}

}
