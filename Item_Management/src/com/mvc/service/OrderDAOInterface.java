package com.mvc.service;

import java.util.List;
import java.util.logging.Logger;

import com.mvc.model.Order;

/** Contract for the implementation of OrderDAO Service. */

public interface OrderDAOInterface {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(OrderDAOInterface.class.getName());

	/**
	 * Add orders for order table
	 * 
	 * @param order
	 */
	public int add(Order order);

	/**
	 * Update existing order
	 * 
	 * @param order
	 */
	public int update(Order order);

	/**
	 * Remove existing order
	 * 
	 * @param orderID
	 */
	public int delete(String orderID);

	/**
	 * Get a particular Order
	 * 
	 * @param orderID
	 * @return Order
	 */
	public Order getOrderById(String orderID);

	/**
	 * Get all list of orders
	 * 
	 * @return List<Order>
	 */
	public List<Order> getAllOrders();

}
