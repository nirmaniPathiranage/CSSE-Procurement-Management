package com.mvc.model;

/** This is the Order model class */

public class Order {

	private String orderID;

	private String itemID;

	private double quantity;

	private double unitPrice;

	private String company;

	private String orderDate;

	private String requestedDate;

	private double total;

	public Order() {
		super();
	}

	public Order(String orderID, String itemID, double quantity, double unitPrice, String company, String orderDate,
			String requestedDate, double total) {
		super();
		this.orderID = orderID;
		this.itemID = itemID;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.company = company;
		this.orderDate = orderDate;
		this.requestedDate = requestedDate;
		this.total = total;
	}

	/** @return the orderid */
	public String getOrderID() {
		return orderID;
	}

	/** @param orderid the orderid to set */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	/** @return the itemid */
	public String getItemID() {
		return itemID;
	}

	/** @param itemid the itemid to set */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	/** @return the quantity */
	public double getQuantity() {
		return quantity;
	}

	/** @param quantity the quantity to set */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/** @return the unitprice */
	public double getUnitPrice() {
		return unitPrice;
	}

	/** @param unitprice the unitprice to set */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/** @return the company */
	public String getCompany() {
		return company;
	}

	/** @param company the company to set */
	public void setCompany(String company) {
		this.company = company;
	}

	/** @return the orderDate */
	public String getOrderDate() {
		return orderDate;
	}

	/** @param orderDate the orderDate to set */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/** @return the requestedDate */
	public String getRequestedDate() {
		return requestedDate;
	}

	/** @param requestedDate the requestedDate to set */
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}

	/** @return the total */
	public double getTotal() {
		return total;
	}

	/** @param total the total to set */
	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", itemID=" + itemID + ", quantity=" + quantity + ", unitPrice="
				+ unitPrice + ", company=" + company + ", orderDate=" + orderDate + ", requestedDate=" + requestedDate
				+ ", total=" + total + "]";
	}

}
