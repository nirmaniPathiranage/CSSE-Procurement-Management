package com.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.Item;
import com.mvc.service.ItemDAO;
import com.mvc.service.ItemDAOInterface;

/**
 * Servlet implementation class UpdateItemServlet
 */
@WebServlet("/UpdateItemServlet")
public class UpdateItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateItemServlet() {
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

		out.println("<h1>Update Item</h1>");

		String itemID = request.getParameter("itemid");
		
		ItemDAOInterface itemDAOInterface = new ItemDAO();
		Item item = itemDAOInterface.getItemById(itemID);

		out.print("<form action='UpdateItemServlet2' method='post'>");
		out.print("<table>");
		out.print("<tr><td>Item ID:</td><td><input type='hidden' name='itemid' value='" + item.getItemID()
				+ "'/></td></tr>");
		out.print("<tr><td>Item Name:</td><td><input type='text' name='itemname' value='" + item.getItemName()
				+ "'/></td></tr>");
		out.print("<tr><td>Type:</td><td><input type='text' name='type' value='" + item.getType() + "'/></td></tr>");
		out.print(
				"<tr><td>Quantity:</td><td><input type='text' name='quantity' value='" + item.getQuantity() + "'/></td></tr>");
		out.print("<tr><td>Unit Price:</td><td><input type='text' name='unitprice' value='" + item.getUnitPrice()
				+ "'/></td></tr>");
		out.print("<tr><td>Supplier ID:</td><td><input type='text' name='supplierid' value='" + item.getSupplierID()
				+ "'/></td></tr>");
		out.print("<tr><td>Date:</td><td><input type='date' name='date' value='" + item.getDate() + "'/></td></tr>");

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
