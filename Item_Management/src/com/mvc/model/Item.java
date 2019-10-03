package com.mvc.model;

/** This is the Item model class */

public class Item {

	private String itemID;

	private String itemName;

	private String type;

	private double quantity;

	private double unitPrice;

	private int supplierID;

	private String date;

	public Item() {
		super();
	}

	public Item(String itemID, String itemName, String type, double quantity, double unitPrice, int supplierID,
			String date) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.type = type;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.supplierID = supplierID;
		this.date = date;
	}

	/** @return the itemid */
	public String getItemID() {
		return itemID;
	}

	/** @param itemid the itemid to set */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	/** @return the itemname */
	public String getItemName() {
		return itemName;
	}

	/** @param itemname the itemname to set */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/** @return the itemtype */
	public String getType() {
		return type;
	}

	/** @param itemtype the itemtype to set */
	public void setType(String type) {
		this.type = type;
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

	/** @return the supplierid */
	public int getSupplierID() {
		return supplierID;
	}

	/** @param supplierid the supplierid to set */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	/** @return the date */
	public String getDate() {
		return date;
	}

	/** @param date the date to set */
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", type=" + type + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", supplierID=" + supplierID + ", date=" + date + "]";
	}

}
