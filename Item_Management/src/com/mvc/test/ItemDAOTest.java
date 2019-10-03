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

import com.mvc.model.Item;
import com.mvc.service.ItemDAO;
import com.mvc.service.ItemDAOInterface;

public class ItemDAOTest {

	private static ItemDAOInterface itemDAOInterface;
	private Item item;

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
	public void testAddItem() {

		System.out.println("Testing add item method");

		itemDAOInterface = new ItemDAO();
		item = new Item();

		item.setItemID("I004");
		item.setItemName("cement");
		item.setType("Raw Materials");
		item.setQuantity(1000);
		item.setUnitPrice(100);
		item.setSupplierID(1);
		item.setDate("2019/09/30");

		int expected = 0;
		int actual = itemDAOInterface.add(item);

		assertEquals(expected, actual);
	}

	@Test
	public void testUpdateItem() {

		System.out.println("Testing update item method");

		itemDAOInterface = new ItemDAO();
		item = new Item();

		item.setItemID("I001");
		item.setItemName("cement");
		item.setType("Raw Materials");
		item.setQuantity(2000);
		item.setUnitPrice(200);
		item.setSupplierID(1);
		item.setDate("2019/09/30");

		int expected = 0;
		int actual = itemDAOInterface.update(item);

		assertEquals(expected, actual);
	}

	@Test
	public void testDeleteItem() {

		System.out.println("Testing delete item method");

		itemDAOInterface = new ItemDAO();
		item = new Item();

		item.setItemID("I001");

		int expected = 1;
		int actual = itemDAOInterface.delete("I001");

		assertEquals(expected, actual);
	}

	@Test
	public void testViewItemByID() {

		System.out.println("Testing view item by ID method");

		itemDAOInterface = new ItemDAO();
		item = new Item();

		item.setItemID("I001");

		Item expected = item;
		Item actual = itemDAOInterface.getItemById("I001");

		assertEquals(expected, actual);
	}
}
