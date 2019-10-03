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

import com.mvc.model.Order;
import com.mvc.service.OrderDAO;
import com.mvc.service.OrderDAOInterface;

public class OrderDAOTest {

	private static OrderDAOInterface orderDAOInterface;
	private Order order;

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
	public void testOrderItem() {

		System.out.println("Testing add order method");

		orderDAOInterface = new OrderDAO();
		order = new Order();

		order.setOrderDate("O005");
		order.setItemID("I002");
		order.setQuantity(1000);
		order.setUnitPrice(100);
		order.setCompany("Perera Constructions");
		order.setOrderDate("2019/09/30");
		order.setRequestedDate("2019/09/27");

		int expected = 0;
		int actual = orderDAOInterface.add(order);

		assertEquals(expected, actual);
	}

	@Test
	public void testUpdateOrder() {

		System.out.println("Testing update order method");

		orderDAOInterface = new OrderDAO();
		order = new Order();

		order.setOrderDate("O005");
		order.setItemID("I002");
		order.setQuantity(100);
		order.setUnitPrice(100);
		order.setCompany("Perera Constructions");
		order.setOrderDate("2019/09/30");
		order.setRequestedDate("2019/09/27");

		int expected = 0;
		int actual = orderDAOInterface.update(order);

		assertEquals(expected, actual);
	}

	@Test
	public void testDeleteOrder() {

		System.out.println("Testing delete order method");

		orderDAOInterface = new OrderDAO();
		order = new Order();

		order.setOrderID("O090");

		int expected = 1;
		int actual = orderDAOInterface.delete("OO90");

		assertEquals(expected, actual);
	}

	@Test
	public void testViewOrderByID() {

		System.out.println("Testing order item by ID method");

		orderDAOInterface = new OrderDAO();
		order = new Order();

		order.setOrderID("O090");

		Order expected = order;
		Order actual = orderDAOInterface.getOrderById("O090");

		assertEquals(expected, actual);
	}
}
