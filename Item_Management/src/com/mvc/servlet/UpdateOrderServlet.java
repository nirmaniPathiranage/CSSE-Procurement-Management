package com.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.Order;
import com.mvc.service.OrderDAO;
import com.mvc.service.OrderDAOInterface;

/**
 * Servlet implementation class UpdateOrderServlet
 */
@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateOrderServlet() {
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

		out.println("<h1>Update Order</h1>");

		String orderID = request.getParameter("orderid");

		OrderDAOInterface orderDAOInterface = new OrderDAO();
		Order order = orderDAOInterface.getOrderById(orderID);

		out.print("<form action='UpdateOrderServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Order ID:</td><td><input type='hidden' name='orderid' value='" + order.getOrderID()
				+ "'/></td></tr>");
		out.print("<tr><td>Item ID:</td><td><input type='text' name='itemid' value='" + order.getItemID()
				+ "'/></td></tr>");
		out.print("<tr><td>Quantity:</td><td><input type='text' name='quantity' value='" + order.getQuantity()
				+ "'/></td></tr>");
		out.print("<tr><td>Unit Price:</td><td><input type='text' name='unitprice' value='" + order.getUnitPrice()
				+ "'/></td></tr>");
		out.print("<tr><td>Requested Company:</td><td><input type='text' name='company' value='" + order.getCompany()
				+ "'/></td></tr>");
		out.print("<tr><td>Current Date:</td><td><input type='date' name='orderdate' value='" + order.getOrderDate()
				+ "'/></td></tr>");
		out.print("<tr><td>Requested Date:</td><td><input type='date' name='requesteddate' value='"
				+ order.getRequestedDate() + "'/></td></tr>");
		out.print("<tr><td>Total Cost:</td><td><input type='hidden' name='total' value='" + order.getTotal()
		+ "'/></td></tr>");

		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		out.print("</table>");
		out.print("</form>");

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
