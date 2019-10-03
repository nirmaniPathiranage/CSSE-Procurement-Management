<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Place an Order</title>
<style>
body{
	
	background:url('back1.png'); 
	background-size: cover;
}
</style>
<script>
	function validate() {
		var orderid = document.form.orderid.value;
		var itemid = document.form.itemid.value;
		var quantity = document.form.quantity.value;
		var unitprice = document.form.unitprice.value;
		var requestedby = document.form.requestedby.value;
		var orderdate = document.form.orderdate.value;
		var requesteddate = document.form.requesteddate.value;

		if (orderid == null || orderid == "") {
			alert("Order ID can't be blank");
			return false;
		} else if (itemid == null || itemid == "") {
			alert("Item ID can't be blank");
			return false;
		}else if (quantity == null || quantity == "") {
			alert("Quantity can't be blank");
			return false;
		} else if (unitprice == null || unitprice == "") {
			alert("Unit Price can't be blank");
			return false;
		} else if (requestedby == null || requestedby == "") {
			alert("Requested Company can't be blank");
			return false;
		} else if (orderdate == null || orderdate == "") {
			alert("Ordered Date can't be blank");
			return false;
		} else if (requesteddate == null || requesteddate == "") {
			alert("Requested Date can't be blank");
			return false;
		}
	}
</script>
</head>
<body>
<div style="width:800px; margin:0 auto;" >

<center>
		<h1>Place a New Order Request</h1>
	</center>

	<form name="form" action="AddOrderServlet" method="post" onSubmit="return validate();">
	
	<center>
			<table cellpadding="3" style="width: 50%">

				<tr height="20">
					<td><p style="font-size: larger">Order ID:</td>
					<td><input type="text" name="orderid" placeholder="O001" autocomplete="off" required/></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">Item ID:</td>
					<td><input type="text" name="itemid"
						placeholder="I001" autocomplete="off" required /></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">Quantity (kg/l):</td>
					<td><input type="text" name="quantity" id="quantity" placeholder="1000" autocomplete="off" required/></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">Unit Price (Rs.):</td>
					<td><input type="text" name="unitprice" id="unitprice"
						placeholder="1000" autocomplete="off" required/></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">Requested Company:</td>
					<td><input type="text" name="requestedby"
						placeholder="Perera Constructions" autocomplete="off" required/></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">
							Current Date:</td>
					<td><input type="date" name="orderdate"
						placeholder="2019-09-30" autocomplete="off" required/></td>
				</tr>
				<tr height="20">
					<td><p style="font-size: larger">
							Requested Date:</td>
					<td><input type="date" name="requesteddate"
						placeholder="2019-09-30" autocomplete="off" required/></td>
				</tr>
				<br>
				<table align="center">
					<tr>
						<td colspan="2"><input type="submit" value="Place Order"/></td>
					</tr>
				</table>
			</table>
			  
		</center>
	</form>
	</div>
	<br />
		<center><a href="ListOrderServlet">View List of Placed Orders</a></center>  
	<br><br><br>
</body>
</html>