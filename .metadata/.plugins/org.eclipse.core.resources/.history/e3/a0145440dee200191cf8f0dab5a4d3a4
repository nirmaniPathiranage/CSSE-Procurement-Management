<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
<style>

.topnav a{
float:left;
color:#f2f2f2;
text-align:center;
padding:14px 16px;
text-decoration:none;
font-size:17px;
}

.topnav a:hover{
background-color:#ddd;
color:black;
}

.topnav a.active{
background-color:#4CAF50;
color:black;
}

footer {
   position:fixed;
   left:0px;
   bottom:0px;
   height:30px;
   width:100%;
   background:#999;
}

body{
	
	background:url('bg1.jpg'); 
	background-size: cover;
}


</style>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/Property Management System/WebContent/js/script.js"></script>
</head>
<body>

<div class = "topnav">
<a class = "active"  href="HomePage.jsp">Home</a>
			<a href="AboutUs.jsp">About Us</a>
			<a href="Search.jsp">Search</a>
			<a href="Login.jsp">Book Now!!!</a>
			<a href="AdminLogin.jsp">Inventory Control</a>
			<a href="ContactUs.jsp">Contact Us</a>
			<font align:right>
			<a href="AdminLogin.jsp">Admin Login</a>
			<a href="Login.jsp">Guest Login</a>
			</font>
</div>
	<form name="form" action="LoginServlet" method="post"
		onSubmit="return formValidate();">
		<center>
			<fieldset style="width: 500px">
				<legend> Login to Guest</legend>
				<table border="0" width="50%" cellpadding="5">
					<tr>
						<th colspan="2">Login Here</th>
					</tr>
					<tbody>
						<tr>
							<td>Username</td>
							<td><input type="text" name="username" value="" autofocus
								placeholder="Enter Username" autocomplete="off" required /></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="password" value=""
								placeholder="Enter Password" autocomplete="off" required /></td>
						</tr>
						<tr>
							<td><span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
						</tr>
						<tr>
							<td><input type="submit" value="Login"></input></td>
							<td><input type="reset" value="Reset"></input></td>
						</tr>
						<tr>
							<td colspan="2">Not Yet Registered !!! <a
								href="Register.jsp">Register Here</a></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</center>
	</form>
	<br><br><br>
<footer><div align="center" style ="background-color:#808080">All Rights Reserved@Hotel RoomPalace Pvt Ltd year 2018</footer>
</body>

</html>