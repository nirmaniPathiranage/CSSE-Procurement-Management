package com.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.service.OrderDAO;
import com.mvc.service.OrderDAOInterface;

/**
 * Servlet implementation class DeleteOrderServlet
 */
@WebServlet("/DeleteOrderServlet")
public class DeleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteOrderServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String orderID = request.getParameter("orderid");

		OrderDAOInterface orderDAOInterface = new OrderDAO();
		int i = orderDAOInterface.delete(orderID);

		if (i != 0) {
			String msg = "Order has been deleted successfully! ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListOrderServlet");
		} else {
			String msg = "Order has not been deleted... ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListOrderServlet");
		}

		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
