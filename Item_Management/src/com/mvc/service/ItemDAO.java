package com.mvc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mvc.model.Item;
import com.mvc.util.CommonConstants;
import com.mvc.util.DBConnectionUtil;
import com.mvc.util.QueryUtil;

/**
 * Contract for the implementation of ItemDAO Service .
 */

public class ItemDAO implements ItemDAOInterface {

	/** Initialize logger */
	public static final Logger logger = Logger.getLogger(ItemDAO.class.getName());

	private static Connection connection;

	private PreparedStatement preparedStatement;

	/**
	 * Add set of items for as a batch from the selected item List
	 * 
	 * @throws SQLException - Thrown when database access error occurs or this
	 *                      method is called on a closed connection
	 */

	@Override
	public int add(Item item) {

		int status = 0;

		try {

			connection = DBConnectionUtil.createConnection();

			/*
			 * Query is available in QueryUtil.java file
			 */
			preparedStatement = connection.prepareStatement(QueryUtil.ADD_NEW_ITEM);

			connection.setAutoCommit(false);

			// Generate item IDs
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, item.getItemID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, item.getItemName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_THREE, item.getType());
			preparedStatement.setDouble(CommonConstants.COLUMN_INDEX_FOUR, item.getQuantity());
			preparedStatement.setDouble(CommonConstants.COLUMN_INDEX_FIVE, item.getUnitPrice());
			preparedStatement.setInt(CommonConstants.COLUMN_INDEX_SIX, item.getSupplierID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SEVEN, item.getDate());

			// Add item
			status = preparedStatement.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		} catch (Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}

		return status;
	}

	/**
	 * Get the updated item
	 * 
	 * @return return the Item object
	 * 
	 * @throws SQLException - Thrown when database access error occurs or this
	 *                      method is called on a closed connection
	 */
	@Override
	public int update(Item item) {

		int status = 0;

		try {

			connection = DBConnectionUtil.createConnection();

			preparedStatement = connection.prepareStatement(QueryUtil.UPDATE_ITEM);

			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, item.getItemName());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_TWO, item.getType());
			preparedStatement.setDouble(CommonConstants.COLUMN_INDEX_THREE, item.getQuantity());
			preparedStatement.setDouble(CommonConstants.COLUMN_INDEX_FOUR, item.getUnitPrice());
			preparedStatement.setInt(CommonConstants.COLUMN_INDEX_FIVE, item.getSupplierID());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SIX, item.getDate());
			preparedStatement.setString(CommonConstants.COLUMN_INDEX_SEVEN, item.getItemID());

			status = preparedStatement.executeUpdate();

			connection.close();

		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		} catch (Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}

		return status;
	}

	/**
	 * This method delete an item based on the provided ID
	 * 
	 * @param itemID - Delete item according to the filtered item details
	 * @throws SQLException - Thrown when database access error occurs or this
	 *                      method is called on a closed connection
	 */
	@Override
	public int delete(String itemID) {

		int status = 0;

		// Before deleting check whether item ID is available
		if (itemID != null && !itemID.isEmpty()) {

			/*
			 * Remove item query will be retrieved from QueryUtil.java
			 */

			try {

				connection = DBConnectionUtil.createConnection();

				preparedStatement = connection.prepareStatement(QueryUtil.DELETE_ITEM);

				preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, itemID);

				status = preparedStatement.executeUpdate();

				connection.close();

			} catch (SQLException e) {
				logger.log(Level.SEVERE, e.getMessage());
			} catch (Exception e) {
				logger.log(Level.SEVERE, e.getMessage());
			} finally {
				/*
				 * Close prepared statement and database connectivity at the end of transaction
				 */
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}

		}
		return status;
	}

	/**
	 * Item details can be retrieved based on the provided item ID
	 * 
	 * @param itemID - Item details are filtered based on the ID
	 * @throws SQLException - Thrown when database access error occurs or this
	 *                      method is called on a closed connection
	 */
	@Override
	public Item getItemById(String itemID) {

		Item item = new Item();

		try {

			connection = DBConnectionUtil.createConnection();

			preparedStatement = connection.prepareStatement(QueryUtil.GET_ITEM_BY_ID);

			preparedStatement.setString(CommonConstants.COLUMN_INDEX_ONE, itemID);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				item.setItemID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				item.setItemName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				item.setType(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				item.setQuantity(resultSet.getDouble(CommonConstants.COLUMN_INDEX_FOUR));
				item.setUnitPrice(resultSet.getDouble(CommonConstants.COLUMN_INDEX_FIVE));
				item.setSupplierID(resultSet.getInt(CommonConstants.COLUMN_INDEX_SIX));
				item.setDate(resultSet.getString(CommonConstants.COLUMN_INDEX_SEVEN));
			}

			connection.close();

		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}

		catch (Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}

		return item;
	}

	/**
	 * Get all list of items
	 * 
	 * @return List<Item>
	 * @throws SQLException - Thrown when database access error occurs or this
	 *                      method is called on a closed connection
	 */
	@Override
	public List<Item> getAllItems() {

		List<Item> list = new ArrayList<Item>();

		try {

			connection = DBConnectionUtil.createConnection();

			preparedStatement = connection.prepareStatement(QueryUtil.GET_ALL_ITEMS);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Item item = new Item();

				item.setItemID(resultSet.getString(CommonConstants.COLUMN_INDEX_ONE));
				item.setItemName(resultSet.getString(CommonConstants.COLUMN_INDEX_TWO));
				item.setType(resultSet.getString(CommonConstants.COLUMN_INDEX_THREE));
				item.setQuantity(resultSet.getDouble(CommonConstants.COLUMN_INDEX_FOUR));
				item.setUnitPrice(resultSet.getDouble(CommonConstants.COLUMN_INDEX_FIVE));
				item.setSupplierID(resultSet.getInt(CommonConstants.COLUMN_INDEX_SIX));
				item.setDate(resultSet.getString(CommonConstants.COLUMN_INDEX_SEVEN));

				list.add(item);
			}

			connection.close();

		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}

		return list;
	}

}
