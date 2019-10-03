package com.mvc.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/** This is the Database connection creation class. */

public class DBConnectionUtil {

	/** Initialize logger */
	public static final Logger logger = Logger.getLogger(DBConnectionUtil.class.getName());

	private static Connection connection = null;

	// This works according to singleton pattern
	private DBConnectionUtil() {
	}

	/**
	 * Create Database connection for the given URL, Username and Password
	 * 
	 * @return Connection this returns SQL connection for MySql Database
	 */

	public static Connection createConnection() {

		/**
		 * This creates new connection objects when connection is closed or it is null
		 */

		try {
			if (connection == null || connection.isClosed()) {
				try {
					Properties properties = new Properties();
					InputStream inputStream = DBConnectionUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE);
					properties.load(inputStream);

					/** Declaring the drivername, url, username and password */

					String driver = properties.getProperty(CommonConstants.DRIVER_NAME);
					String url = properties.getProperty(CommonConstants.URL);
					String username = properties.getProperty(CommonConstants.USERNAME);
					String password = properties.getProperty(CommonConstants.PASSWORD);

					Class.forName(driver); // loading mysql driver
					connection = DriverManager.getConnection(url, username, password);

				} catch (ClassNotFoundException e) {
					logger.log(Level.SEVERE, e.getMessage());
				} catch (SQLException e) {
					logger.log(Level.SEVERE, e.getMessage());
				} catch (FileNotFoundException e) {
					logger.log(Level.SEVERE, e.getMessage());
				} catch (IOException e) {
					logger.log(Level.SEVERE, e.getMessage());
				}
				return connection;
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		return connection;
	}
}