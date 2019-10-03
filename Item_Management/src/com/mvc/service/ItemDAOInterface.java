package com.mvc.service;

import java.util.List;
import java.util.logging.Logger;

import com.mvc.model.Item;

/** Contract for the implementation of ItemDAO Service. */

public interface ItemDAOInterface {

	/** Initialize logger */
	public static final Logger log = Logger.getLogger(ItemDAOInterface.class.getName());

	/**
	 * Add items for item table
	 * 
	 * @param item
	 */
	public int add(Item item);

	/**
	 * Update existing item
	 * 
	 * @param item
	 */
	public int update(Item item);

	/**
	 * Remove existing item
	 * 
	 * @param itemID
	 */
	public int delete(String itemID);

	/**
	 * Get a particular Item
	 * 
	 * @param itemID
	 * @return Item
	 */
	public Item getItemById(String itemID);

	/**
	 * Get all list of items
	 * 
	 * @return List<Item>
	 */
	public List<Item> getAllItems();

}
