package com.mvc.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.Register;
import com.mvc.service.RegisterDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
	}

	private int j = 0;

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

		/**
		 * Getting the attributes from the registration form Copying all the input
		 * parameters in to local variables
		 */

		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String fullName = request.getParameter("fullname");
		String NICno = request.getParameter("nicno");
		String emailAddress = request.getParameter("emailaddress");
		String streetAddress = request.getParameter("streetaddress");
		String contactNo = request.getParameter("contactno");
		String regDate = request.getParameter("regdate");

		Register reg = new Register();

		// Using Java model class

		reg.setUserName(userName);
		reg.setPassWord(passWord);
		reg.setFullName(fullName);
		reg.setNICno(NICno);
		reg.setEmailAddress(emailAddress);
		reg.setStreetAddress(streetAddress);
		reg.setContactNo(contactNo);
		reg.setRegDate(regDate);

		while (j == 0) {

			if (userName.equals(null) || userName == "" || passWord.equals(null) || passWord == ""
					|| fullName.equals(null) || fullName == "" || NICno.equals(null) || NICno == ""
					|| emailAddress.equals(null) || emailAddress == "" || streetAddress.equals(null)
					|| streetAddress == "" || contactNo.equals(null) || contactNo == "" || regDate.equals(null)
					|| regDate == "") {
				request.setAttribute("msg", "Fields cannot be empty!");

				RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
				rd.forward(request, response);
			}

			RegisterDAO regdao = new RegisterDAO();

			// The core Logic of the Registration application is present here. We are going
			// to insert user data in to the database.

			String userRegistered = regdao.registerUser(reg);

			if (userRegistered.equals("SUCCESS")) { // On success, you can display a message to user on Home page
				request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}

			else // On Failure, display a meaningful message to the User.

			{
				request.setAttribute("errMessage", userRegistered);
				request.getRequestDispatcher("/Register.jsp").forward(request, response);
			}

		}
		String msg = "Guest ID is already registered in the System! ";
		request.setAttribute("msg", msg);

		RequestDispatcher rd = request.getRequestDispatcher("/Register.jsp");
		rd.forward(request, response);

	}

}
