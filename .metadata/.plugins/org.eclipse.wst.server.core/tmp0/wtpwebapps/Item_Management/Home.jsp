<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
body{
	
	background:url('bg4.png'); 
	background-size: cover;
}
</style>
</head>
<body>
	<div style="text-align: right">
		<a href="LogoutServlet">Logout</a>
	</div>
	<center>
		<h1>
			<font style="color: blue">Login Successful !!!</font>
		</h1>
	</center>
	<center>
		<h1>
			Welcome
			<%=session.getAttribute("userName")%>
		</h1>
		</center>
<a href = "AddItem.jsp"><h2>Add Items</h2></a>
<a href = "PlaceOrder.jsp"><h2>Place An Order</h2></a>
<br><br><br><br><br><br>
</body>
</html>