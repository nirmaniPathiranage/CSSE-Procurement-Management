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
 * Servlet implementation class UpdateItemServlet2
 */
@WebServlet("/UpdateItemServlet2")
public class UpdateItemServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateItemServlet2() {
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
		PrintWriter out = response.getWriter();

		String itemID = request.getParameter("itemid");
		String itemName = request.getParameter("itemname");
		String type = request.getParameter("type");
		Double quantity = Double.parseDouble(request.getParameter("quantity"));
		Double unitprice = Double.parseDouble(request.getParameter("unitprice"));
		Integer supplierid = Integer.parseInt(request.getParameter("supplierid"));
		String date = request.getParameter("date");
		
		Item item = new Item();

		item.setItemID(itemID);
		item.setItemName(itemName);
		item.setType(type);
		item.setQuantity(quantity);
		item.setUnitPrice(unitprice);
		item.setSupplierID(supplierid);
		item.setDate(date);
		
		ItemDAOInterface itemDAOInterface = new ItemDAO();
		int status = itemDAOInterface.update(item);

		if (status > 0) {
			String msg = "Item has been updated succesfully! ";
			request.setAttribute("msg", msg);
			response.sendRedirect("ListItemServlet");

		} else {
			out.println("<p>Sorry! unable to update item!</p>");
		}

		out.close();
	}

}
