package com.mvc.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mvc.model.Login;
import com.mvc.util.DBConnectionUtil;
import com.mvc.util.QueryUtil;

public class LoginDAO {

	/** Initialize logger */
	public static final Logger logger = Logger.getLogger(LoginDAO.class.getName());

	public String authenticateUser(Login log) {

		// Keeping user entered values in temporary variables.

		String userName = log.getUserName();
		String passWord = log.getPassWord();

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";

		try {
			connection = DBConnectionUtil.createConnection(); // establishing connection
			statement = connection.createStatement(); // Statement is used to write queries. Read more about it.

			// Here table name is users and userName,password are columns. fetching all the
			// records and storing in a resultSet.

			resultSet = statement.executeQuery(QueryUtil.LOGIN_USER);

			while (resultSet.next()) { // Until next row is present otherwise it return false
				userNameDB = resultSet.getString("userName"); // fetch the values present in database
				passwordDB = resultSet.getString("passWord");

				if (userName.equals(userNameDB) && passWord.equals(passwordDB)) {

					return "SUCCESS"; // If the user entered values are already present in database, which means user
										// has already registered so I will return SUCCESS message.

				}
			}

		} catch (SQLException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}

		return "Invalid User Credentials !!! Try Again ..."; // Just returning appropriate message otherwise

	}

}
