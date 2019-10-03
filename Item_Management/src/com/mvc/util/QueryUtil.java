package com.mvc.util;

/** This is the sql query file for Java Web project */

public class QueryUtil {

	/** Query for login */
	public static final String LOGIN_USER = "select userName,passWord from register";

	/** Query for register */
	public static final String REGISTER_USER = "insert into register(id,userName,passWord,fullName,NICno,emailAddress,streetAddress,contactNo,regDate) values (NULL,?,?,?,?,?,?,?,?)";

	/** Query for add a new item */
	public static final String ADD_NEW_ITEM = "insert into item(itemID, itemName, type, quantity, unitPrice, supplierID, date) values (?,?,?,?,?,?,?)";

	/** Query for update an item */
	public static final String UPDATE_ITEM = "update item set itemName=?, type=?, quantity=?, unitPrice=?, supplierID=?, date=? where itemID=?";

	/** Query for delete an item */
	public static final String DELETE_ITEM = "delete from item where itemID=?";

	/** Query for get an item by id */
	public static final String GET_ITEM_BY_ID = "select * from item where itemID=?";

	/** Query for get all items */
	public static final String GET_ALL_ITEMS = "select * from item";

	/** Query for add a new order */
	public static final String ADD_NEW_ORDER = "insert into ordertable(orderID, itemID, quantity, unitPrice, company, orderDate, requestedDate, totalCost) values (?,?,?,?,?,?,?,?)";

	/** Query for update an order */
	public static final String UPDATE_ORDER = "update ordertable set itemID=?, quantity=?, unitPrice=?, company=?, orderDate=?, requestedDate=?, totalCost=? where orderID=?";

	/** Query for delete an order */
	public static final String DELETE_ORDER = "delete from ordertable where orderID=?";

	/** Query for get an order by id */
	public static final String GET_ORDER_BY_ID = "select * from ordertable where orderID=?";

	/** Query for get all orders */
	public static final String GET_ALL_ORDERS = "select * from ordertable";

}
