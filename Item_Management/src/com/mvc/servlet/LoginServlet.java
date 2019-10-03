package com.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.model.Login;
import com.mvc.service.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		/**
		 * Here username and password are the names which I have given in the input box
		 * in Login.jsp page. Here I am retrieving the values entered by the user and
		 * keeping in instance variables for further use.
		 */

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");

		/**
		 * creating object for Login class, which is a normal java class, contains just
		 * setters and getters. model classes are efficiently used in java to access
		 * user information wherever required in the application
		 */

		Login log = new Login();

		/**
		 * setting the username and password through the log object then only you can
		 * get it in future.
		 */

		log.setUserName(userName);
		log.setPassWord(passWord);

		// creating object for LoginDao. This class contains main logic of the
		// application.

		LoginDAO loginDao = new LoginDAO();

		// Calling authenticateUser function

		String userValidate = loginDao.authenticateUser(log);

		// If function returns success string then user will be rooted to Home page

		if (userValidate.equals("SUCCESS")) {

			HttpSession session = request.getSession();

			// with setAttribute() you can define a "key" and value pair so that you can get
			// it in future using getAttribute("key")

			session.setAttribute("userName", userName);
			request.getRequestDispatcher("/Home.jsp").forward(request, response); // RequestDispatcher is used to send
																					// the control to the invoked page.
		}

		else {

			request.setAttribute("errMessage", userValidate); // If authenticateUser() function returnsother than
																// SUCCESS string it will be sent to Login page again.
																// Here the error message returned from function has
																// been stored in a errMessage key.
			request.getRequestDispatcher("/Login.jsp").forward(request, response); // forwarding the request
		}
	}

}
